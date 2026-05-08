package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class yz9 {
    public static float a(String[] strArr, int i) {
        float f = Float.parseFloat(strArr[i]);
        if (f >= 0.0f && f <= 1.0f) {
            return f;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f);
    }

    public static boolean b(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x012c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0127 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x010e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010f A[Catch: NumberFormatException -> 0x0123, LOOP:3: B:102:0x00d9->B:59:0x010f, LOOP_END, TryCatch #1 {NumberFormatException -> 0x0123, blocks: (B:40:0x00d9, B:42:0x00df, B:46:0x00eb, B:59:0x010f, B:61:0x0115, B:66:0x012c, B:70:0x0138, B:71:0x0142, B:72:0x0147, B:73:0x0148, B:74:0x014d), top: B:102:0x00d9 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0115 A[Catch: NumberFormatException -> 0x0123, TryCatch #1 {NumberFormatException -> 0x0123, blocks: (B:40:0x00d9, B:42:0x00df, B:46:0x00eb, B:59:0x010f, B:61:0x0115, B:66:0x012c, B:70:0x0138, B:71:0x0142, B:72:0x0147, B:73:0x0148, B:74:0x014d), top: B:102:0x00d9 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.animation.TimeInterpolator c(android.content.Context r20, android.animation.TimeInterpolator r21) {
        /*
            Method dump skipped, instruction units count: 460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yz9.c(android.content.Context, android.animation.TimeInterpolator):android.animation.TimeInterpolator");
    }
}
