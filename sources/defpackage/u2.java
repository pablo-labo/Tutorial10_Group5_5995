package defpackage;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.BaseInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public abstract class u2 {
    public static final Map<hj7, BaseInterpolator> e = lc9.a0(new Pair(hj7.b, new LinearInterpolator()), new Pair(hj7.c, new AccelerateInterpolator()), new Pair(hj7.d, new DecelerateInterpolator()), new Pair(hj7.e, new AccelerateDecelerateInterpolator()));
    public Interpolator a;
    public int b;
    public kd0 c;
    public int d;

    public final Animation a(View view, int i, int i2, int i3, int i4) {
        Animation animationB;
        if (!d() || (animationB = b(view, i, i2, i3, i4)) == null) {
            return null;
        }
        animationB.setDuration(this.d);
        animationB.setStartOffset(this.b);
        animationB.setInterpolator(this.a);
        return animationB;
    }

    public abstract Animation b(View view, int i, int i2, int i3, int i4);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(int r5, com.facebook.react.bridge.ReadableMap r6) {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u2.c(int, com.facebook.react.bridge.ReadableMap):void");
    }

    public abstract boolean d();
}
