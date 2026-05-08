package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qpa extends ta2 {
    public static final float[] d;
    public static final float[] e;
    public static final float[] f;
    public static final float[] g;

    static {
        float[] fArrF = ua2.f(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, ua2.b(da.b.a, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        d = fArrF;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        e = fArr;
        f = ua2.e(fArrF);
        g = ua2.e(fArr);
    }

    @Override // defpackage.ta2
    public final float[] a(float[] fArr) {
        ua2.g(d, fArr);
        fArr[0] = w74.j(fArr[0]);
        fArr[1] = w74.j(fArr[1]);
        fArr[2] = w74.j(fArr[2]);
        ua2.g(e, fArr);
        return fArr;
    }

    @Override // defpackage.ta2
    public final float b(int i) {
        return i == 0 ? 1.0f : 0.5f;
    }

    @Override // defpackage.ta2
    public final float c(int i) {
        return i == 0 ? 0.0f : -0.5f;
    }

    @Override // defpackage.ta2
    public final long e(float f2, float f3, float f4) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        if (f3 > 0.5f) {
            f3 = 0.5f;
        }
        if (f4 < -0.5f) {
            f4 = -0.5f;
        }
        float f5 = f4 <= 0.5f ? f4 : 0.5f;
        float[] fArr = g;
        float f6 = (fArr[6] * f5) + (fArr[3] * f3) + (fArr[0] * f2);
        float f7 = (fArr[7] * f5) + (fArr[4] * f3) + (fArr[1] * f2);
        float f8 = (fArr[8] * f5) + (fArr[5] * f3) + (fArr[2] * f2);
        float f9 = f6 * f6 * f6;
        float f10 = f7 * f7 * f7;
        float f11 = f8 * f8 * f8;
        float[] fArr2 = f;
        return (((long) Float.floatToRawIntBits((fArr2[6] * f11) + ((fArr2[3] * f10) + (fArr2[0] * f9)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits((fArr2[7] * f11) + (fArr2[4] * f10) + (fArr2[1] * f9))));
    }

    @Override // defpackage.ta2
    public final float[] f(float[] fArr) {
        float f2 = fArr[0];
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        fArr[0] = f2;
        float f3 = fArr[1];
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        if (f3 > 0.5f) {
            f3 = 0.5f;
        }
        fArr[1] = f3;
        float f4 = fArr[2];
        float f5 = f4 >= -0.5f ? f4 : -0.5f;
        fArr[2] = f5 <= 0.5f ? f5 : 0.5f;
        ua2.g(g, fArr);
        float f6 = fArr[0];
        fArr[0] = f6 * f6 * f6;
        float f7 = fArr[1];
        fArr[1] = f7 * f7 * f7;
        float f8 = fArr[2];
        fArr[2] = f8 * f8 * f8;
        ua2.g(f, fArr);
        return fArr;
    }

    @Override // defpackage.ta2
    public final float g(float f2, float f3, float f4) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        if (f3 > 0.5f) {
            f3 = 0.5f;
        }
        if (f4 < -0.5f) {
            f4 = -0.5f;
        }
        float f5 = f4 <= 0.5f ? f4 : 0.5f;
        float[] fArr = g;
        float f6 = (fArr[6] * f5) + (fArr[3] * f3) + (fArr[0] * f2);
        float f7 = (fArr[7] * f5) + (fArr[4] * f3) + (fArr[1] * f2);
        float f8 = (fArr[8] * f5) + (fArr[5] * f3) + (fArr[2] * f2);
        float f9 = f6 * f6 * f6;
        float f10 = f7 * f7 * f7;
        float f11 = f8 * f8 * f8;
        float[] fArr2 = f;
        return (fArr2[8] * f11) + (fArr2[5] * f10) + (fArr2[2] * f9);
    }

    @Override // defpackage.ta2
    public final long h(float f2, float f3, float f4, float f5, ta2 ta2Var) {
        float[] fArr = d;
        float f6 = (fArr[6] * f4) + (fArr[3] * f3) + (fArr[0] * f2);
        float f7 = (fArr[7] * f4) + (fArr[4] * f3) + (fArr[1] * f2);
        float f8 = (fArr[8] * f4) + (fArr[5] * f3) + (fArr[2] * f2);
        float fJ = w74.j(f6);
        float fJ2 = w74.j(f7);
        float fJ3 = w74.j(f8);
        float[] fArr2 = e;
        return pnb.b((fArr2[6] * fJ3) + (fArr2[3] * fJ2) + (fArr2[0] * fJ), (fArr2[7] * fJ3) + (fArr2[4] * fJ2) + (fArr2[1] * fJ), (fArr2[8] * fJ3) + (fArr2[5] * fJ2) + (fArr2[2] * fJ), f5, ta2Var);
    }
}
