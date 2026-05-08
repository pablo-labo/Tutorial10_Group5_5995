package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import defpackage.z91;

/* JADX INFO: loaded from: classes.dex */
public final class lrf {
    public final Matrix a = new Matrix();
    public final Matrix b;
    public final Matrix c;
    public final Matrix d;
    public final float[] e;
    public final z91<PointF, PointF> f;
    public final z91<?, PointF> g;
    public final z91<bnd, bnd> h;
    public final z91<Float, Float> i;
    public final z91<Integer, Integer> j;
    public final di5 k;
    public final di5 l;
    public final z91<?, Float> m;
    public final z91<?, Float> n;
    public final boolean o;

    public lrf(rc0 rc0Var) {
        hc0 hc0Var = rc0Var.a;
        this.f = hc0Var == null ? null : hc0Var.t();
        tc0<PointF, PointF> tc0Var = rc0Var.b;
        this.g = tc0Var == null ? null : tc0Var.t();
        kc0 kc0Var = rc0Var.c;
        this.h = kc0Var == null ? null : kc0Var.t();
        dc0 dc0Var = rc0Var.d;
        this.i = dc0Var == null ? null : dc0Var.t();
        dc0 dc0Var2 = rc0Var.f;
        di5 di5VarT = dc0Var2 == null ? null : dc0Var2.t();
        this.k = di5VarT;
        this.o = rc0Var.j;
        if (di5VarT != null) {
            this.b = new Matrix();
            this.c = new Matrix();
            this.d = new Matrix();
            this.e = new float[9];
        } else {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
        }
        dc0 dc0Var3 = rc0Var.g;
        this.l = dc0Var3 == null ? null : dc0Var3.t();
        fc0 fc0Var = rc0Var.e;
        if (fc0Var != null) {
            this.j = fc0Var.t();
        }
        dc0 dc0Var4 = rc0Var.h;
        if (dc0Var4 != null) {
            this.m = dc0Var4.t();
        } else {
            this.m = null;
        }
        dc0 dc0Var5 = rc0Var.i;
        if (dc0Var5 != null) {
            this.n = dc0Var5.t();
        } else {
            this.n = null;
        }
    }

    public final void a(ba1 ba1Var) {
        ba1Var.f(this.j);
        ba1Var.f(this.m);
        ba1Var.f(this.n);
        ba1Var.f(this.f);
        ba1Var.f(this.g);
        ba1Var.f(this.h);
        ba1Var.f(this.i);
        ba1Var.f(this.k);
        ba1Var.f(this.l);
    }

    public final void b(z91.a aVar) {
        z91<Integer, Integer> z91Var = this.j;
        if (z91Var != null) {
            z91Var.a(aVar);
        }
        z91<?, Float> z91Var2 = this.m;
        if (z91Var2 != null) {
            z91Var2.a(aVar);
        }
        z91<?, Float> z91Var3 = this.n;
        if (z91Var3 != null) {
            z91Var3.a(aVar);
        }
        z91<PointF, PointF> z91Var4 = this.f;
        if (z91Var4 != null) {
            z91Var4.a(aVar);
        }
        z91<?, PointF> z91Var5 = this.g;
        if (z91Var5 != null) {
            z91Var5.a(aVar);
        }
        z91<bnd, bnd> z91Var6 = this.h;
        if (z91Var6 != null) {
            z91Var6.a(aVar);
        }
        z91<Float, Float> z91Var7 = this.i;
        if (z91Var7 != null) {
            z91Var7.a(aVar);
        }
        di5 di5Var = this.k;
        if (di5Var != null) {
            di5Var.a(aVar);
        }
        di5 di5Var2 = this.l;
        if (di5Var2 != null) {
            di5Var2.a(aVar);
        }
    }

    public final void c() {
        for (int i = 0; i < 9; i++) {
            this.e[i] = 0.0f;
        }
    }

    public final Matrix d() {
        PointF pointFE;
        bnd bndVarE;
        PointF pointFE2;
        Matrix matrix = this.a;
        matrix.reset();
        z91<?, PointF> z91Var = this.g;
        if (z91Var != null && (pointFE2 = z91Var.e()) != null) {
            float f = pointFE2.x;
            if (f != 0.0f || pointFE2.y != 0.0f) {
                matrix.preTranslate(f, pointFE2.y);
            }
        }
        if (!this.o) {
            z91<Float, Float> z91Var2 = this.i;
            if (z91Var2 != null) {
                float fFloatValue = z91Var2 instanceof flg ? z91Var2.e().floatValue() : ((di5) z91Var2).j();
                if (fFloatValue != 0.0f) {
                    matrix.preRotate(fFloatValue);
                }
            }
        } else if (z91Var != null) {
            float f2 = z91Var.d;
            PointF pointFE3 = z91Var.e();
            float f3 = pointFE3.x;
            float f4 = pointFE3.y;
            z91Var.h(1.0E-4f + f2);
            PointF pointFE4 = z91Var.e();
            z91Var.h(f2);
            matrix.preRotate((float) Math.toDegrees(Math.atan2(pointFE4.y - f4, pointFE4.x - f3)));
        }
        if (this.k != null) {
            di5 di5Var = this.l;
            float fCos = di5Var == null ? 0.0f : (float) Math.cos(Math.toRadians((-di5Var.j()) + 90.0f));
            float fSin = di5Var == null ? 1.0f : (float) Math.sin(Math.toRadians((-di5Var.j()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(r3.j()));
            c();
            float[] fArr = this.e;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f5 = -fSin;
            fArr[3] = f5;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            Matrix matrix2 = this.b;
            matrix2.setValues(fArr);
            c();
            fArr[0] = 1.0f;
            fArr[3] = fTan;
            fArr[4] = 1.0f;
            fArr[8] = 1.0f;
            Matrix matrix3 = this.c;
            matrix3.setValues(fArr);
            c();
            fArr[0] = fCos;
            fArr[1] = f5;
            fArr[3] = fSin;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            Matrix matrix4 = this.d;
            matrix4.setValues(fArr);
            matrix3.preConcat(matrix2);
            matrix4.preConcat(matrix3);
            matrix.preConcat(matrix4);
        }
        z91<bnd, bnd> z91Var3 = this.h;
        if (z91Var3 != null && (bndVarE = z91Var3.e()) != null) {
            float f6 = bndVarE.a;
            if (f6 != 1.0f || bndVarE.b != 1.0f) {
                matrix.preScale(f6, bndVarE.b);
            }
        }
        z91<PointF, PointF> z91Var4 = this.f;
        if (z91Var4 != null && (pointFE = z91Var4.e()) != null) {
            float f7 = pointFE.x;
            if (f7 != 0.0f || pointFE.y != 0.0f) {
                matrix.preTranslate(-f7, -pointFE.y);
            }
        }
        return matrix;
    }

    public final Matrix e(float f) {
        z91<?, PointF> z91Var = this.g;
        PointF pointFE = z91Var == null ? null : z91Var.e();
        z91<bnd, bnd> z91Var2 = this.h;
        bnd bndVarE = z91Var2 == null ? null : z91Var2.e();
        Matrix matrix = this.a;
        matrix.reset();
        if (pointFE != null) {
            matrix.preTranslate(pointFE.x * f, pointFE.y * f);
        }
        if (bndVarE != null) {
            double d = f;
            matrix.preScale((float) Math.pow(bndVarE.a, d), (float) Math.pow(bndVarE.b, d));
        }
        z91<Float, Float> z91Var3 = this.i;
        if (z91Var3 != null) {
            float fFloatValue = z91Var3.e().floatValue();
            z91<PointF, PointF> z91Var4 = this.f;
            PointF pointFE2 = z91Var4 != null ? z91Var4.e() : null;
            matrix.preRotate(fFloatValue * f, pointFE2 == null ? 0.0f : pointFE2.x, pointFE2 != null ? pointFE2.y : 0.0f);
        }
        return matrix;
    }
}
