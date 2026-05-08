package defpackage;

import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: loaded from: classes.dex */
public final class df4 {
    public static float a(EdgeEffect edgeEffect, float f, float f2, iy3 iy3Var) {
        float f3 = ef4.a;
        double density = iy3Var.getDensity() * 386.0878f * 160.0f * 0.84f;
        double dAbs = Math.abs(f) * 0.35f;
        double d = ((double) ef4.a) * density;
        float fExp = (float) (Math.exp((ef4.b / ef4.c) * Math.log(dAbs / d)) * d);
        int i = Build.VERSION.SDK_INT;
        if (fExp > (i >= 31 ? dg0.b(edgeEffect) : 0.0f) * f2) {
            return 0.0f;
        }
        int iB = gf9.b(f);
        if (i >= 31) {
            edgeEffect.onAbsorb(iB);
            return f;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(iB);
        }
        return f;
    }
}
