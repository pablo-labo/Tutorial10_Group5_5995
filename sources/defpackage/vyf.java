package defpackage;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import defpackage.g6d;

/* JADX INFO: loaded from: classes.dex */
public final class vyf {
    public static final bzf a;
    public static final a89<String, Typeface> b;

    public static class a extends c0h {
        public g6d.c q0;
    }

    static {
        Trace.beginSection(jpf.g("TypefaceCompat static init"));
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            a = new azf();
        } else if (i >= 28) {
            a = new zyf();
        } else {
            a = new yyf();
        }
        b = new a89<>(16);
        Trace.endSection();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface a(android.content.Context r16, ho5.a r17, android.content.res.Resources r18, int r19, java.lang.String r20, int r21, int r22, g6d.c r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 499
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vyf.a(android.content.Context, ho5$a, android.content.res.Resources, int, java.lang.String, int, int, g6d$c, boolean):android.graphics.Typeface");
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
