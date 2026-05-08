package defpackage;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes2.dex */
public final class kge implements Interpolator {
    public final float a;

    public kge(float f) {
        this.a = f;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        double dPow = Math.pow(2.0d, (-10.0f) * f);
        float f2 = this.a;
        return (float) ((Math.sin(((((double) (f - (f2 / 4.0f))) * 3.141592653589793d) * 2.0d) / ((double) f2)) * dPow) + 1.0d);
    }
}
