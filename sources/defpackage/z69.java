package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import com.airbnb.lottie.parser.moshi.c;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import uqc.a;

/* JADX INFO: loaded from: classes.dex */
public final class z69 {
    public static final HashMap a = new HashMap();
    public static final HashSet b = new HashSet();
    public static final byte[] c = {80, 75, 3, 4};
    public static final byte[] d = {31, -117, 8};

    public static q79<s69> a(final String str, Callable<p79<s69>> callable, Runnable runnable) {
        s69 s69VarA = str == null ? null : t69.b.a(str);
        q79<s69> q79Var = s69VarA != null ? new q79<>(s69VarA) : null;
        HashMap map = a;
        if (str != null && map.containsKey(str)) {
            q79Var = (q79) map.get(str);
        }
        if (q79Var != null) {
            if (runnable != null) {
                runnable.run();
            }
            return q79Var;
        }
        q79<s69> q79Var2 = new q79<>(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            q79Var2.b(new o79() { // from class: x69
                @Override // defpackage.o79
                public final void onResult(Object obj) {
                    HashMap map2 = z69.a;
                    map2.remove(str);
                    atomicBoolean.set(true);
                    if (map2.size() == 0) {
                        z69.h(true);
                    }
                }
            });
            q79Var2.a(new o79() { // from class: y69
                @Override // defpackage.o79
                public final void onResult(Object obj) {
                    HashMap map2 = z69.a;
                    map2.remove(str);
                    atomicBoolean.set(true);
                    if (map2.size() == 0) {
                        z69.h(true);
                    }
                }
            });
            if (!atomicBoolean.get()) {
                map.put(str, q79Var2);
                if (map.size() == 1) {
                    h(false);
                }
            }
        }
        return q79Var2;
    }

    public static p79<s69> b(Context context, InputStream inputStream, String str) {
        s69 s69VarA = str == null ? null : t69.b.a(str);
        if (s69VarA != null) {
            return new p79<>(s69VarA);
        }
        try {
            uqc uqcVar = new uqc(c0h.S(inputStream));
            if (g(uqcVar, c).booleanValue()) {
                return e(context, new ZipInputStream(uqcVar.new a()), str);
            }
            if (g(uqcVar, d).booleanValue()) {
                return c(new GZIPInputStream(uqcVar.new a()), str);
            }
            String[] strArr = com.airbnb.lottie.parser.moshi.a.e;
            return d(new c(uqcVar), str, true);
        } catch (IOException e) {
            return new p79<>(e);
        }
    }

    public static p79<s69> c(InputStream inputStream, String str) {
        uqc uqcVar = new uqc(c0h.S(inputStream));
        String[] strArr = com.airbnb.lottie.parser.moshi.a.e;
        return d(new c(uqcVar), str, true);
    }

    public static p79 d(c cVar, String str, boolean z) {
        s69 s69VarA;
        try {
            if (str == null) {
                s69VarA = null;
            } else {
                try {
                    s69VarA = t69.b.a(str);
                } catch (Exception e) {
                    p79 p79Var = new p79(e);
                    if (z) {
                        ckg.b(cVar);
                    }
                    return p79Var;
                }
            }
            if (s69VarA != null) {
                p79 p79Var2 = new p79(s69VarA);
                if (z) {
                    ckg.b(cVar);
                }
                return p79Var2;
            }
            s69 s69VarA2 = a79.a(cVar);
            if (str != null) {
                t69.b.a.c(str, s69VarA2);
            }
            p79 p79Var3 = new p79(s69VarA2);
            if (z) {
                ckg.b(cVar);
            }
            return p79Var3;
        } catch (Throwable th) {
            if (z) {
                ckg.b(cVar);
            }
            throw th;
        }
    }

    public static p79<s69> e(Context context, ZipInputStream zipInputStream, String str) {
        try {
            return f(context, zipInputStream, str);
        } finally {
            ckg.b(zipInputStream);
        }
    }

    public static p79<s69> f(Context context, ZipInputStream zipInputStream, String str) {
        s69 s69VarA;
        n79 n79Var;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (str == null) {
            s69VarA = null;
        } else {
            try {
                s69VarA = t69.b.a(str);
            } catch (IOException e) {
                return new p79<>(e);
            }
        }
        if (s69VarA != null) {
            return new p79<>(s69VarA);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        s69 s69Var = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                uqc uqcVar = new uqc(c0h.S(zipInputStream));
                String[] strArr = com.airbnb.lottie.parser.moshi.a.e;
                s69Var = d(new c(uqcVar), null, false).a;
            } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                String[] strArrSplit = name.split("/");
                map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
            } else if (name.contains(".ttf") || name.contains(".otf")) {
                String[] strArrSplit2 = name.split("/");
                String str2 = strArrSplit2[strArrSplit2.length - 1];
                String str3 = str2.split("\\.")[0];
                if (context == null) {
                    return new p79<>(new IllegalStateException("Unable to extract font " + str3 + " please pass a non-null Context parameter"));
                }
                File file = new File(context.getCacheDir(), str2);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int i = zipInputStream.read(bArr);
                                if (i == -1) {
                                    break;
                                }
                                fileOutputStream2.write(bArr, 0, i);
                            }
                            fileOutputStream2.flush();
                            fileOutputStream2.close();
                            fileOutputStream.close();
                        } catch (Throwable th) {
                            try {
                                fileOutputStream2.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } finally {
                    }
                } catch (Throwable th3) {
                    a49.c("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th3);
                }
                Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                if (!file.delete()) {
                    a49.b("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                }
                map2.put(str3, typefaceCreateFromFile);
            } else {
                zipInputStream.closeEntry();
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (s69Var == null) {
            return new p79<>(new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : map.entrySet()) {
            String str4 = (String) entry.getKey();
            Iterator it = ((HashMap) s69Var.c()).values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    n79Var = null;
                    break;
                }
                n79Var = (n79) it.next();
                if (n79Var.d.equals(str4)) {
                    break;
                }
            }
            if (n79Var != null) {
                n79Var.f = ckg.d((Bitmap) entry.getValue(), n79Var.a, n79Var.b);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            boolean z = false;
            for (kn5 kn5Var : s69Var.f.values()) {
                if (kn5Var.a.equals(entry2.getKey())) {
                    kn5Var.d = (Typeface) entry2.getValue();
                    z = true;
                }
            }
            if (!z) {
                a49.b("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (map.isEmpty()) {
            Iterator it2 = ((HashMap) s69Var.c()).entrySet().iterator();
            while (it2.hasNext()) {
                n79 n79Var2 = (n79) ((Map.Entry) it2.next()).getValue();
                if (n79Var2 == null) {
                    return null;
                }
                String str5 = n79Var2.d;
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                if (str5.startsWith("data:") && str5.indexOf("base64,") > 0) {
                    try {
                        byte[] bArrDecode = Base64.decode(str5.substring(str5.indexOf(44) + 1), 0);
                        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                        if (bitmapDecodeByteArray != null) {
                            n79Var2.f = ckg.d(bitmapDecodeByteArray, n79Var2.a, n79Var2.b);
                        }
                    } catch (IllegalArgumentException e2) {
                        a49.c("data URL did not have correct base64 format.", e2);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            t69.b.a.c(str, s69Var);
        }
        return new p79<>(s69Var);
    }

    public static Boolean g(uqc uqcVar, byte[] bArr) {
        try {
            uqc uqcVarPeek = uqcVar.peek();
            for (byte b2 : bArr) {
                if (uqcVarPeek.readByte() != b2) {
                    return Boolean.FALSE;
                }
            }
            uqcVarPeek.close();
            return Boolean.TRUE;
        } catch (Exception unused) {
            a49.a.getClass();
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused2) {
            return Boolean.FALSE;
        }
    }

    public static void h(boolean z) {
        ArrayList arrayList = new ArrayList(b);
        for (int i = 0; i < arrayList.size(); i++) {
            ((r79) arrayList.get(i)).a();
        }
    }
}
