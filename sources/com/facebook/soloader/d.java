package com.facebook.soloader;

import android.content.Context;
import com.facebook.soloader.SysUtil;
import com.facebook.soloader.g;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends g {
    public final File e;
    public final String f;

    public static final class a extends g.b implements Comparable<a> {
        public final ZipEntry c;
        public final int d;

        public a(String str, ZipEntry zipEntry, int i) {
            super(str, String.valueOf(zipEntry.getCrc()));
            this.c = zipEntry;
            this.d = i;
        }

        @Override // java.lang.Comparable
        public final int compareTo(a aVar) {
            return this.a.compareTo(aVar.a);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.c.equals(aVar.c) && this.d == aVar.d) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.d * 31);
        }
    }

    public class b extends g.d {
        public a[] a;
        public final ZipFile b;
        public final d c;

        public b(d dVar) {
            this.b = new ZipFile(d.this.e);
            this.c = dVar;
        }

        @Override // com.facebook.soloader.g.d, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            this.b.close();
        }

        @Override // com.facebook.soloader.g.d
        public final g.b[] h() {
            a[] aVarArr = this.a;
            if (aVarArr != null) {
                return aVarArr;
            }
            a[] aVarArrS = s();
            this.a = aVarArrS;
            return aVarArrS;
        }

        @Override // com.facebook.soloader.g.d
        public final void p(File file) throws IOException {
            a[] aVarArrS = this.a;
            if (aVarArrS == null) {
                aVarArrS = s();
                this.a = aVarArrS;
            }
            byte[] bArr = new byte[32768];
            for (a aVar : aVarArrS) {
                InputStream inputStream = this.b.getInputStream(aVar.c);
                try {
                    g.c cVar = new g.c(aVar, inputStream);
                    inputStream = null;
                    try {
                        g.d.a(cVar, bArr, file);
                        cVar.close();
                    } finally {
                    }
                } catch (Throwable th) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw th;
                }
            }
        }

        public final a[] s() {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            HashMap map = new HashMap();
            Pattern patternCompile = Pattern.compile(d.this.f);
            String[] supportedAbis = SysUtil.MarshmallowSysdeps.getSupportedAbis();
            Enumeration<? extends ZipEntry> enumerationEntries = this.b.entries();
            while (enumerationEntries.hasMoreElements()) {
                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                Matcher matcher = patternCompile.matcher(zipEntryNextElement.getName());
                if (matcher.matches()) {
                    int iGroupCount = matcher.groupCount();
                    String strGroup = matcher.group(iGroupCount - 1);
                    String strGroup2 = matcher.group(iGroupCount);
                    int i = 0;
                    while (true) {
                        if (i >= supportedAbis.length) {
                            i = -1;
                            break;
                        }
                        String str = supportedAbis[i];
                        if (str != null && strGroup.equals(str)) {
                            break;
                        }
                        i++;
                    }
                    if (i >= 0) {
                        linkedHashSet.add(strGroup);
                        a aVar = (a) map.get(strGroup2);
                        if (aVar == null || i < aVar.d) {
                            map.put(strGroup2, new a(strGroup2, zipEntryNextElement, i));
                        }
                    }
                }
            }
            this.c.getClass();
            a[] aVarArr = (a[]) map.values().toArray(new a[map.size()]);
            Arrays.sort(aVarArr);
            return aVarArr;
        }
    }

    public d(Context context, String str, File file) {
        super(context, str, true);
        this.e = file;
        this.f = "^lib/([^/]+)/([^/]+\\.so)$";
    }

    @Override // defpackage.p54, defpackage.ene
    public final String c() {
        return "ExtractFromZipSoSource";
    }

    @Override // com.facebook.soloader.g
    public final g.d h() {
        return new b(this);
    }

    @Override // defpackage.p54, defpackage.ene
    public final String toString() {
        File file = this.e;
        try {
            return file.getCanonicalPath();
        } catch (IOException unused) {
            return file.getName();
        }
    }
}
