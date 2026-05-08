package defpackage;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class ap7 {
    public static final Pattern a = Pattern.compile("\\b((?:seg-\\d+(?:_\\d+)?|\\d+)\\.js)");

    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String a(java.lang.String r7, com.facebook.react.bridge.ReadableArray r8) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r7)
            java.lang.String r7 = ", stack:\n"
            r0.append(r7)
            int r7 = r8.size()
            r1 = 0
        Lf:
            if (r1 >= r7) goto Lab
            com.facebook.react.bridge.ReadableMap r2 = r8.getMap(r1)
            if (r2 != 0) goto L19
            goto La7
        L19:
            java.lang.String r3 = "methodName"
            java.lang.String r3 = r2.getString(r3)
            r0.append(r3)
            java.lang.String r3 = "@"
            r0.append(r3)
            java.lang.String r3 = "file"
            boolean r4 = r2.hasKey(r3)
            java.lang.String r5 = ":"
            if (r4 == 0) goto L5b
            boolean r4 = r2.isNull(r3)
            if (r4 != 0) goto L5b
            com.facebook.react.bridge.ReadableType r4 = r2.getType(r3)
            com.facebook.react.bridge.ReadableType r6 = com.facebook.react.bridge.ReadableType.String
            if (r4 != r6) goto L5b
            java.lang.String r3 = r2.getString(r3)
            if (r3 == 0) goto L5b
            java.util.regex.Pattern r4 = defpackage.ap7.a
            java.util.regex.Matcher r3 = r4.matcher(r3)
            boolean r4 = r3.find()
            if (r4 == 0) goto L5b
            r4 = 1
            java.lang.String r3 = r3.group(r4)
            java.lang.String r3 = defpackage.t40.k(r3, r5)
            goto L5d
        L5b:
            java.lang.String r3 = ""
        L5d:
            r0.append(r3)
            java.lang.String r3 = "lineNumber"
            boolean r4 = r2.hasKey(r3)
            if (r4 == 0) goto L7e
            boolean r4 = r2.isNull(r3)
            if (r4 != 0) goto L7e
            com.facebook.react.bridge.ReadableType r4 = r2.getType(r3)
            com.facebook.react.bridge.ReadableType r6 = com.facebook.react.bridge.ReadableType.Number
            if (r4 != r6) goto L7e
            int r3 = r2.getInt(r3)
            r0.append(r3)
            goto L82
        L7e:
            r3 = -1
            r0.append(r3)
        L82:
            java.lang.String r3 = "column"
            boolean r4 = r2.hasKey(r3)
            if (r4 == 0) goto La2
            boolean r4 = r2.isNull(r3)
            if (r4 != 0) goto La2
            com.facebook.react.bridge.ReadableType r4 = r2.getType(r3)
            com.facebook.react.bridge.ReadableType r6 = com.facebook.react.bridge.ReadableType.Number
            if (r4 != r6) goto La2
            r0.append(r5)
            int r2 = r2.getInt(r3)
            r0.append(r2)
        La2:
            java.lang.String r2 = "\n"
            r0.append(r2)
        La7:
            int r1 = r1 + 1
            goto Lf
        Lab:
            java.lang.String r7 = r0.toString()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ap7.a(java.lang.String, com.facebook.react.bridge.ReadableArray):java.lang.String");
    }
}
