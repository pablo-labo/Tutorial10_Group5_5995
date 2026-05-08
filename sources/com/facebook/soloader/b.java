package com.facebook.soloader;

import android.content.Context;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.soloader.SysUtil;
import defpackage.ene;
import defpackage.h5;
import defpackage.l5;
import defpackage.mtc;
import defpackage.p39;
import defpackage.r6;
import defpackage.yp4;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends ene implements mtc {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashSet c;

    public b(Context context) {
        HashSet hashSet = new HashSet();
        String strI = i(context.getApplicationInfo().sourceDir);
        if (strI != null) {
            hashSet.add(strI);
        }
        if (context.getApplicationInfo().splitSourceDirs != null) {
            for (String str : context.getApplicationInfo().splitSourceDirs) {
                String strI2 = i(str);
                if (strI2 != null) {
                    hashSet.add(strI2);
                }
            }
        }
        this.c = hashSet;
    }

    public static String i(String str) {
        String[] supportedAbis = SysUtil.MarshmallowSysdeps.getSupportedAbis();
        if (str == null || str.isEmpty()) {
            Log.w("SoLoader", "Cannot compute fallback path, apk path is ".concat(str == null ? "null" : "empty"));
            return null;
        }
        if (supportedAbis == null || supportedAbis.length == 0) {
            Log.w("SoLoader", "Cannot compute fallback path, supportedAbis is ".concat(supportedAbis == null ? "null" : "empty"));
            return null;
        }
        StringBuilder sbG = h5.g(str, "!/lib/");
        sbG.append(supportedAbis[0]);
        return sbG.toString();
    }

    @Override // defpackage.mtc
    public final ene b(Context context) {
        b bVar = new b(context);
        try {
            bVar.j();
            return bVar;
        } catch (IOException e) {
            l5.r(e);
            return null;
        }
    }

    @Override // defpackage.ene
    public final String c() {
        return "DirectApkSoSource";
    }

    @Override // defpackage.ene
    public final int d(String str, int i, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        if (SoLoader.b == null) {
            r6.g("SoLoader.init() not yet called");
            return 0;
        }
        for (String str2 : this.c) {
            Set set = (Set) this.a.get(str2);
            if (TextUtils.isEmpty(str2) || set == null || !set.contains(str)) {
                p39.b("SoLoader", str + " not found on " + str2);
            } else {
                Set<String> setH = h(str2, str);
                if (setH == null) {
                    String strSubstring = str2.substring(0, str2.indexOf(33));
                    ZipFile zipFile = new ZipFile(strSubstring);
                    try {
                        String str3 = str2.substring(str2.indexOf(33) + 2) + File.separator + str;
                        ZipEntry entry = zipFile.getEntry(str3);
                        if (entry == null) {
                            Log.e("SoLoader", str3 + " not found in " + strSubstring);
                        } else {
                            yp4 yp4Var = new yp4(zipFile, entry);
                            try {
                                for (String str4 : f.a(str, yp4Var)) {
                                    if (!str4.startsWith("/")) {
                                        f(str2, str, str4);
                                    }
                                }
                                yp4Var.close();
                            } finally {
                            }
                        }
                        zipFile.close();
                        setH = h(str2, str);
                    } catch (Throwable th) {
                        try {
                            zipFile.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (setH != null) {
                    Iterator<String> it = setH.iterator();
                    while (it.hasNext()) {
                        SoLoader.k(it.next(), i, threadPolicy);
                    }
                }
                try {
                    i |= 4;
                    SoLoader.b.h(i, str2 + File.separator + str);
                    p39.a(str + " found on " + str2);
                    return 1;
                } catch (UnsatisfiedLinkError e) {
                    Log.w("SoLoader", str + " not found on " + str2 + " flag: " + i, e);
                }
            }
        }
        return 0;
    }

    @Override // defpackage.ene
    public final void e(int i) throws IOException {
        j();
    }

    public final void f(String str, String str2, String str3) {
        synchronized (this.b) {
            try {
                String str4 = str + str2;
                if (!this.b.containsKey(str4)) {
                    this.b.put(str4, new HashSet());
                }
                ((Set) this.b.get(str4)).add(str3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(String str, String str2) {
        synchronized (this.a) {
            try {
                if (!this.a.containsKey(str)) {
                    this.a.put(str, new HashSet());
                }
                ((Set) this.a.get(str)).add(str2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Set<String> h(String str, String str2) {
        Set<String> set;
        synchronized (this.b) {
            set = (Set) this.b.get(str + str2);
        }
        return set;
    }

    public final void j() throws IOException {
        int iIndexOf;
        int i;
        for (String str : this.c) {
            String strSubstring = (TextUtils.isEmpty(str) || (iIndexOf = str.indexOf(33)) < 0 || (i = iIndexOf + 2) >= str.length()) ? null : str.substring(i);
            if (!TextUtils.isEmpty(strSubstring)) {
                ZipFile zipFile = new ZipFile(str.substring(0, str.indexOf(33)));
                try {
                    Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                    while (enumerationEntries.hasMoreElements()) {
                        ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                        if (zipEntryNextElement != null && zipEntryNextElement.getMethod() == 0 && zipEntryNextElement.getName().startsWith(strSubstring) && zipEntryNextElement.getName().endsWith(".so")) {
                            g(str, zipEntryNextElement.getName().substring(strSubstring.length() + 1));
                        }
                    }
                    zipFile.close();
                } catch (Throwable th) {
                    try {
                        zipFile.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.ene
    public final String toString() {
        return "DirectApkSoSource[root = " + this.c.toString() + ']';
    }
}
