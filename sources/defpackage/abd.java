package defpackage;

import java.util.Arrays;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class abd extends ta2 {
    public static final r40 r = new r40(18);
    public final bzg d;
    public final float e;
    public final float f;
    public final hrf g;
    public final float[] h;
    public final float[] i;
    public final float[] j;
    public final v84 k;
    public final c l;
    public final ob3 m;
    public final v84 n;
    public final b o;
    public final yk3 p;
    public final boolean q;

    public static final class a {
        public static float a(float[] fArr) {
            if (fArr.length < 6) {
                return 0.0f;
            }
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            float f4 = fArr[3];
            float f5 = fArr[4];
            float f6 = fArr[5];
            float f7 = (((((f3 * f6) + ((f2 * f5) + (f * f4))) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
            return f7 < 0.0f ? -f7 : f7;
        }
    }

    public static final class b extends mj8 implements Function1<Double, Double> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Double invoke(Double d) {
            double dDoubleValue = d.doubleValue();
            return Double.valueOf(abd.this.n.f(nic.A(dDoubleValue, r6.e, r6.f)));
        }
    }

    public static final class c extends mj8 implements Function1<Double, Double> {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Double invoke(Double d) {
            double dF = abd.this.k.f(d.doubleValue());
            abd abdVar = abd.this;
            return Double.valueOf(nic.A(dF, abdVar.e, abdVar.f));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x025d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public abd(java.lang.String r35, float[] r36, defpackage.bzg r37, float[] r38, defpackage.v84 r39, defpackage.v84 r40, float r41, float r42, defpackage.hrf r43, int r44) {
        /*
            Method dump skipped, instruction units count: 630
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abd.<init>(java.lang.String, float[], bzg, float[], v84, v84, float, float, hrf, int):void");
    }

    @Override // defpackage.ta2
    public final float[] a(float[] fArr) {
        ua2.g(this.j, fArr);
        if (fArr.length < 3) {
            return fArr;
        }
        double d = fArr[0];
        ob3 ob3Var = this.m;
        fArr[0] = (float) ob3Var.f(d);
        fArr[1] = (float) ob3Var.f(fArr[1]);
        fArr[2] = (float) ob3Var.f(fArr[2]);
        return fArr;
    }

    @Override // defpackage.ta2
    public final float b(int i) {
        return this.f;
    }

    @Override // defpackage.ta2
    public final float c(int i) {
        return this.e;
    }

    @Override // defpackage.ta2
    public final boolean d() {
        return this.q;
    }

    @Override // defpackage.ta2
    public final long e(float f, float f2, float f3) {
        double d = f;
        yk3 yk3Var = this.p;
        float f4 = (float) yk3Var.f(d);
        float f5 = (float) yk3Var.f(f2);
        float f6 = (float) yk3Var.f(f3);
        float[] fArr = this.i;
        if (fArr.length < 9) {
            return 0L;
        }
        return (((long) Float.floatToRawIntBits((fArr[6] * f6) + ((fArr[3] * f5) + (fArr[0] * f4)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits((fArr[7] * f6) + (fArr[4] * f5) + (fArr[1] * f4))));
    }

    @Override // defpackage.ta2
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || abd.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        abd abdVar = (abd) obj;
        if (Float.compare(abdVar.e, this.e) != 0 || Float.compare(abdVar.f, this.f) != 0 || !wl7.b(this.d, abdVar.d) || !Arrays.equals(this.h, abdVar.h)) {
            return false;
        }
        hrf hrfVar = abdVar.g;
        hrf hrfVar2 = this.g;
        if (hrfVar2 != null) {
            return wl7.b(hrfVar2, hrfVar);
        }
        if (hrfVar == null) {
            return true;
        }
        if (wl7.b(this.k, abdVar.k)) {
            return wl7.b(this.n, abdVar.n);
        }
        return false;
    }

    @Override // defpackage.ta2
    public final float[] f(float[] fArr) {
        if (fArr.length < 3) {
            return fArr;
        }
        double d = fArr[0];
        yk3 yk3Var = this.p;
        fArr[0] = (float) yk3Var.f(d);
        fArr[1] = (float) yk3Var.f(fArr[1]);
        fArr[2] = (float) yk3Var.f(fArr[2]);
        ua2.g(this.i, fArr);
        return fArr;
    }

    @Override // defpackage.ta2
    public final float g(float f, float f2, float f3) {
        double d = f;
        yk3 yk3Var = this.p;
        float f4 = (float) yk3Var.f(d);
        float f5 = (float) yk3Var.f(f2);
        float f6 = (float) yk3Var.f(f3);
        float[] fArr = this.i;
        return (fArr[8] * f6) + (fArr[5] * f5) + (fArr[2] * f4);
    }

    @Override // defpackage.ta2
    public final long h(float f, float f2, float f3, float f4, ta2 ta2Var) {
        float[] fArr = this.j;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        ob3 ob3Var = this.m;
        return pnb.b((float) ob3Var.f(f5), (float) ob3Var.f(f6), (float) ob3Var.f(f7), f4, ta2Var);
    }

    @Override // defpackage.ta2
    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.h) + ((this.d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f = this.e;
        int iFloatToIntBits = (iHashCode + (f == 0.0f ? 0 : Float.floatToIntBits(f))) * 31;
        float f2 = this.f;
        int iFloatToIntBits2 = (iFloatToIntBits + (f2 == 0.0f ? 0 : Float.floatToIntBits(f2))) * 31;
        hrf hrfVar = this.g;
        int iHashCode2 = iFloatToIntBits2 + (hrfVar != null ? hrfVar.hashCode() : 0);
        if (hrfVar != null) {
            return iHashCode2;
        }
        return this.n.hashCode() + ((this.k.hashCode() + (iHashCode2 * 31)) * 31);
    }

    public abd(String str, float[] fArr, bzg bzgVar, hrf hrfVar, int i) {
        v84 g35Var;
        v84 r20Var;
        double d = hrfVar.a;
        boolean z = d == -3.0d;
        double d2 = hrfVar.g;
        double d3 = hrfVar.f;
        if (z) {
            g35Var = new a73(hrfVar, 6);
        } else if (d == -2.0d) {
            g35Var = new wk3(hrfVar, 7);
        } else if (d3 == 0.0d && d2 == 0.0d) {
            g35Var = new uh9(hrfVar, 4);
        } else {
            g35Var = new g35(hrfVar);
        }
        if (d == -3.0d) {
            r20Var = new r91(hrfVar);
        } else if (d == -2.0d) {
            r20Var = new p20(hrfVar);
        } else if (d3 == 0.0d && d2 == 0.0d) {
            r20Var = new q20(hrfVar, 11);
        } else {
            r20Var = new r20(hrfVar, 10);
        }
        this(str, fArr, bzgVar, null, g35Var, r20Var, 0.0f, 1.0f, hrfVar, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public abd(String str, float[] fArr, bzg bzgVar, final double d, float f, float f2, int i) {
        v84 v84Var = r;
        v84 v84Var2 = d == 1.0d ? v84Var : new v84() { // from class: yad
            @Override // defpackage.v84
            public final double f(double d2) {
                if (d2 < 0.0d) {
                    d2 = 0.0d;
                }
                return Math.pow(d2, 1.0d / d);
            }
        };
        this(str, fArr, bzgVar, null, v84Var2, d != 1.0d ? new v84() { // from class: zad
            @Override // defpackage.v84
            public final double f(double d2) {
                if (d2 < 0.0d) {
                    d2 = 0.0d;
                }
                return Math.pow(d2, d);
            }
        } : v84Var, f, f2, new hrf(d, 1.0d, 0.0d, 0.0d, 0.0d), i);
    }
}
