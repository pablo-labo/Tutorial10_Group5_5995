package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.animation.BaseInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import com.airbnb.lottie.parser.moshi.a;

/* JADX INFO: loaded from: classes.dex */
public final class nh8 {
    public static final LinearInterpolator a = new LinearInterpolator();
    public static final a.C0108a b = a.C0108a.a("t", "s", "e", "o", "i", "h", "to", "ti");
    public static final a.C0108a c = a.C0108a.a("x", "y");

    public static BaseInterpolator a(PointF pointF, PointF pointF2) {
        pointF.x = du9.b(pointF.x, -1.0f, 1.0f);
        pointF.y = du9.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = du9.b(pointF2.x, -1.0f, 1.0f);
        float fB = du9.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fB;
        Matrix matrix = ckg.a;
        try {
            return new PathInterpolator(pointF.x, pointF.y, pointF2.x, fB);
        } catch (IllegalArgumentException e) {
            return "The Path cannot loop back on itself.".equals(e.getMessage()) ? new PathInterpolator(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0207 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> defpackage.lh8<T> b(com.airbnb.lottie.parser.moshi.a r24, defpackage.s69 r25, float r26, defpackage.tlg<T> r27, boolean r28, boolean r29) {
        /*
            Method dump skipped, instruction units count: 734
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nh8.b(com.airbnb.lottie.parser.moshi.a, s69, float, tlg, boolean, boolean):lh8");
    }
}
