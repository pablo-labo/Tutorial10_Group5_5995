package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public final class qb6 extends za1 {
    public final boolean p;
    public final r59<LinearGradient> q;
    public final r59<RadialGradient> r;
    public final RectF s;
    public final sb6 t;
    public final int u;
    public final kb6 v;
    public final keb w;
    public final keb x;

    /* JADX WARN: Illegal instructions before constructor call */
    public qb6(j79 j79Var, ba1 ba1Var, pb6 pb6Var) {
        int iOrdinal = pb6Var.h.ordinal();
        Paint.Cap cap = iOrdinal != 0 ? iOrdinal != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int iOrdinal2 = pb6Var.i.ordinal();
        super(j79Var, ba1Var, cap, iOrdinal2 != 0 ? iOrdinal2 != 1 ? iOrdinal2 != 2 ? null : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER, pb6Var.j, pb6Var.d, pb6Var.g, pb6Var.k, pb6Var.l);
        this.q = new r59<>();
        this.r = new r59<>();
        this.s = new RectF();
        this.t = pb6Var.b;
        this.p = pb6Var.m;
        this.u = (int) (j79Var.a.b() / 32.0f);
        z91<ib6, ib6> z91VarT = pb6Var.c.t();
        this.v = (kb6) z91VarT;
        z91VarT.a(this);
        ba1Var.f(z91VarT);
        z91<PointF, PointF> z91VarT2 = pb6Var.e.t();
        this.w = (keb) z91VarT2;
        z91VarT2.a(this);
        ba1Var.f(z91VarT2);
        z91<PointF, PointF> z91VarT3 = pb6Var.f.t();
        this.x = (keb) z91VarT3;
        z91VarT3.a(this);
        ba1Var.f(z91VarT3);
    }

    public final int f() {
        float f = this.w.d;
        float f2 = this.u;
        int iRound = Math.round(f * f2);
        int iRound2 = Math.round(this.x.d * f2);
        int iRound3 = Math.round(this.v.d * f2);
        int i = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }

    @Override // defpackage.za1, defpackage.vc4
    public final void h(Canvas canvas, Matrix matrix, int i, hd4 hd4Var) {
        RadialGradient radialGradientD;
        if (this.p) {
            return;
        }
        e(this.s, matrix, false);
        sb6 sb6Var = this.t;
        sb6 sb6Var2 = sb6.a;
        kb6 kb6Var = this.v;
        keb kebVar = this.x;
        keb kebVar2 = this.w;
        if (sb6Var == sb6Var2) {
            long jF = f();
            r59<LinearGradient> r59Var = this.q;
            radialGradientD = r59Var.d(jF);
            if (radialGradientD == null) {
                PointF pointFE = kebVar2.e();
                PointF pointFE2 = kebVar.e();
                ib6 ib6VarE = kb6Var.e();
                radialGradientD = new LinearGradient(pointFE.x, pointFE.y, pointFE2.x, pointFE2.y, ib6VarE.b, ib6VarE.a, Shader.TileMode.CLAMP);
                r59Var.h(radialGradientD, jF);
            }
        } else {
            long jF2 = f();
            r59<RadialGradient> r59Var2 = this.r;
            radialGradientD = r59Var2.d(jF2);
            if (radialGradientD == null) {
                PointF pointFE3 = kebVar2.e();
                PointF pointFE4 = kebVar.e();
                ib6 ib6VarE2 = kb6Var.e();
                int[] iArr = ib6VarE2.b;
                float[] fArr = ib6VarE2.a;
                radialGradientD = new RadialGradient(pointFE3.x, pointFE3.y, (float) Math.hypot(pointFE4.x - r9, pointFE4.y - r10), iArr, fArr, Shader.TileMode.CLAMP);
                r59Var2.h(radialGradientD, jF2);
            }
        }
        this.i.setShader(radialGradientD);
        super.h(canvas, matrix, i, hd4Var);
    }
}
