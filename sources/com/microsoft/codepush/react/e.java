package com.microsoft.codepush.react;

import android.content.Context;
import android.content.res.AssetManager;
import defpackage.c0h;
import defpackage.z3;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class e {
    public String a;
    public Context b;
    public String c;

    public static void a(AssetManager assetManager, String str, String str2) throws IOException {
        String[] list = assetManager.list(str);
        if (list != null && list.length != 0) {
            new File(str2).mkdirs();
            for (String str3 : list) {
                a(assetManager, z3.m(str, "/", str3), g.a(str2, str3));
            }
            return;
        }
        InputStream inputStreamOpen = assetManager.open(str);
        try {
            b(new File(str2), inputStreamOpen);
            inputStreamOpen.close();
        } catch (Throwable th) {
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static void b(File file, InputStream inputStream) throws IOException {
        file.getParentFile().mkdirs();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            byte[] bArr = new byte[262144];
            while (true) {
                int i = inputStream.read(bArr);
                if (i <= 0) {
                    fileOutputStream.close();
                    return;
                }
                fileOutputStream.write(bArr, 0, i);
            }
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static String e(File file) {
        String strE;
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return null;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isFile() && file2.getName().endsWith(".patch")) {
                return file2.getAbsolutePath();
            }
            if (file2.isDirectory() && (strE = e(file2)) != null) {
                return strE;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:185:0x0495 A[Catch: IOException -> 0x0491, TryCatch #7 {IOException -> 0x0491, blocks: (B:181:0x048d, B:185:0x0495, B:187:0x049a, B:189:0x049f), top: B:198:0x048d }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x049a A[Catch: IOException -> 0x0491, TryCatch #7 {IOException -> 0x0491, blocks: (B:181:0x048d, B:185:0x0495, B:187:0x049a, B:189:0x049f), top: B:198:0x048d }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x049f A[Catch: IOException -> 0x0491, TRY_LEAVE, TryCatch #7 {IOException -> 0x0491, blocks: (B:181:0x048d, B:185:0x0495, B:187:0x049a, B:189:0x049f), top: B:198:0x048d }] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x048d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(org.json.JSONObject r26, java.lang.String r27, com.microsoft.codepush.react.c r28, java.lang.String r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1192
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.microsoft.codepush.react.e.c(org.json.JSONObject, java.lang.String, com.microsoft.codepush.react.c, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x02c4 A[Catch: IOException -> 0x02c0, TryCatch #13 {IOException -> 0x02c0, blocks: (B:134:0x02bc, B:138:0x02c4, B:140:0x02c9, B:142:0x02ce), top: B:159:0x02bc }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02c9 A[Catch: IOException -> 0x02c0, TryCatch #13 {IOException -> 0x02c0, blocks: (B:134:0x02bc, B:138:0x02c4, B:140:0x02c9, B:142:0x02ce), top: B:159:0x02bc }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02ce A[Catch: IOException -> 0x02c0, TRY_LEAVE, TryCatch #13 {IOException -> 0x02c0, blocks: (B:134:0x02bc, B:138:0x02c4, B:140:0x02c9, B:142:0x02ce), top: B:159:0x02bc }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0175 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x017d A[Catch: IOException -> 0x0179, TryCatch #0 {IOException -> 0x0179, blocks: (B:64:0x0175, B:68:0x017d, B:70:0x0182), top: B:147:0x0175 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0182 A[Catch: IOException -> 0x0179, TRY_LEAVE, TryCatch #0 {IOException -> 0x0179, blocks: (B:64:0x0175, B:68:0x017d, B:70:0x0182), top: B:147:0x0175 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(org.json.JSONObject r25, java.lang.String r26, com.microsoft.codepush.react.c r27, java.lang.String r28) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 727
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.microsoft.codepush.react.e.d(org.json.JSONObject, java.lang.String, com.microsoft.codepush.react.c, java.lang.String):void");
    }

    public final String f() {
        return g.a(this.a, "CodePush");
    }

    public final JSONObject g() {
        String strOptString = i().optString("currentPackage", null);
        if (strOptString == null) {
            return null;
        }
        try {
            return g.f(g.a(j(strOptString), "app.json"));
        } catch (IOException unused) {
            return null;
        }
    }

    public final String h() {
        String strOptString = i().optString("currentPackage", null);
        if (strOptString == null) {
            return null;
        }
        return j(strOptString);
    }

    public final JSONObject i() {
        String strA = g.a(f(), "codepush.json");
        if (!c0h.x(strA)) {
            return new JSONObject();
        }
        try {
            return g.f(strA);
        } catch (IOException e) {
            a.a("Error getting current package info", e);
            return null;
        }
    }

    public final String j(String str) {
        return g.a(f(), str);
    }

    public final void k(JSONObject jSONObject, boolean z) throws Throwable {
        String strOptString = jSONObject.optString("packageHash", null);
        JSONObject jSONObjectI = i();
        String strOptString2 = jSONObjectI.optString("currentPackage", null);
        if (strOptString == null || !strOptString.equals(strOptString2)) {
            if (z) {
                String strH = h();
                if (strH != null) {
                    c0h.t(strH);
                }
            } else {
                String strOptString3 = i().optString("previousPackage", null);
                if (strOptString3 != null && !strOptString3.equals(strOptString)) {
                    c0h.t(j(strOptString3));
                }
                g.k(jSONObjectI, "previousPackage", jSONObjectI.optString("currentPackage", null));
            }
            g.k(jSONObjectI, "currentPackage", strOptString);
            try {
                g.l(jSONObjectI, g.a(f(), "codepush.json"));
            } catch (IOException e) {
                a.a("Error updating current package info", e);
            }
        }
    }
}
