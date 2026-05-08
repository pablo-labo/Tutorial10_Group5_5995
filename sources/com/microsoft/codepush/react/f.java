package com.microsoft.codepush.react;

import defpackage.l6;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes3.dex */
public final class f {
    public static final String a = System.getProperty("line.separator");

    public static void a(String str, String str2, ArrayList<String> arrayList) {
        for (File file : new File(str).listFiles()) {
            String name = file.getName();
            String absolutePath = file.getAbsolutePath();
            String strI = l6.i(new StringBuilder(), str2.isEmpty() ? "" : str2.concat("/"), name);
            if (!strI.startsWith("__MACOSX/") && !strI.equals(".DS_Store") && !strI.endsWith("/.DS_Store") && !strI.equals(".codepushrelease") && !strI.endsWith("/.codepushrelease")) {
                if (file.isDirectory()) {
                    a(absolutePath, strI, arrayList);
                } else {
                    try {
                        arrayList.add(strI + ":" + b(new FileInputStream(file)));
                    } catch (FileNotFoundException e) {
                        a.a("Unable to compute hash of update contents.", e);
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0020, code lost:
    
        r5.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0052 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b(java.io.InputStream r5) throws java.lang.Throwable {
        /*
            r0 = 0
            java.lang.String r1 = "SHA-256"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L42 java.security.NoSuchAlgorithmException -> L46
            java.security.DigestInputStream r2 = new java.security.DigestInputStream     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L42 java.security.NoSuchAlgorithmException -> L46
            r2.<init>(r5, r1)     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L42 java.security.NoSuchAlgorithmException -> L46
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a java.security.NoSuchAlgorithmException -> L3c
        L10:
            int r3 = r2.read(r0)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a java.security.NoSuchAlgorithmException -> L3c
            r4 = -1
            if (r3 == r4) goto L18
            goto L10
        L18:
            r2.close()     // Catch: java.io.IOException -> L1f
            r5.close()     // Catch: java.io.IOException -> L1f
            goto L23
        L1f:
            r5 = move-exception
            r5.printStackTrace()
        L23:
            byte[] r5 = r1.digest()
            java.math.BigInteger r0 = new java.math.BigInteger
            r1 = 1
            r0.<init>(r1, r5)
            java.lang.Object[] r5 = new java.lang.Object[]{r0}
            java.lang.String r0 = "%064x"
            java.lang.String r5 = java.lang.String.format(r0, r5)
            return r5
        L38:
            r0 = move-exception
            goto L50
        L3a:
            r0 = move-exception
            goto L48
        L3c:
            r0 = move-exception
            goto L48
        L3e:
            r1 = move-exception
            r2 = r0
            r0 = r1
            goto L50
        L42:
            r1 = move-exception
        L43:
            r2 = r0
            r0 = r1
            goto L48
        L46:
            r1 = move-exception
            goto L43
        L48:
            com.microsoft.codepush.react.CodePushUnknownException r1 = new com.microsoft.codepush.react.CodePushUnknownException     // Catch: java.lang.Throwable -> L38
            java.lang.String r3 = "Unable to compute hash of update contents."
            r1.<init>(r3, r0)     // Catch: java.lang.Throwable -> L38
            throw r1     // Catch: java.lang.Throwable -> L38
        L50:
            if (r2 == 0) goto L58
            r2.close()     // Catch: java.io.IOException -> L56
            goto L58
        L56:
            r5 = move-exception
            goto L5c
        L58:
            r5.close()     // Catch: java.io.IOException -> L56
            goto L5f
        L5c:
            r5.printStackTrace()
        L5f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.microsoft.codepush.react.f.b(java.io.InputStream):java.lang.String");
    }

    public static String c(String str, String str2) {
        for (File file : new File(str).listFiles()) {
            String strA = g.a(str, file.getName());
            if (file.isDirectory()) {
                String strC = c(strA, str2);
                if (strC != null) {
                    return g.a(file.getName(), strC);
                }
            } else {
                String name = file.getName();
                if (name.equals(str2)) {
                    return name;
                }
            }
        }
        return null;
    }

    public static void d(String str, String str2) throws Throwable {
        g.h("Verifying hash for folder path: " + str);
        ArrayList arrayList = new ArrayList();
        a(str, "", arrayList);
        Collections.sort(arrayList);
        JSONArray jSONArray = new JSONArray();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        String strReplace = jSONArray.toString().replace("\\/", "/");
        g.h("Manifest string: " + strReplace);
        String strB = b(new ByteArrayInputStream(strReplace.getBytes()));
        g.h("Expected hash: " + str2 + ", actual hash: " + strB);
        if (!str2.equals(strB)) {
            throw new CodePushInvalidUpdateException("The update contents failed the data integrity check.");
        }
        g.h("The update contents succeeded the data integrity check.");
    }
}
