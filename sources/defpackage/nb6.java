package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import defpackage.z91;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class nb6 implements vc4, z91.a, ks2 {
    public final boolean a;
    public final r59<LinearGradient> b = new r59<>();
    public final r59<RadialGradient> c = new r59<>();
    public final Path d;
    public final ij8 e;
    public final RectF f;
    public final ArrayList g;
    public final sb6 h;
    public final kb6 i;
    public final yh7 j;
    public final keb k;
    public final keb l;
    public final j79 m;
    public final int n;
    public final z91<Float, Float> o;
    public float p;

    public nb6(j79 j79Var, s69 s69Var, ba1 ba1Var, mb6 mb6Var) {
        Path path = new Path();
        this.d = path;
        this.e = new ij8(1);
        this.f = new RectF();
        this.g = new ArrayList();
        this.p = 0.0f;
        this.a = mb6Var.h;
        this.m = j79Var;
        this.h = mb6Var.a;
        path.setFillType(mb6Var.b);
        this.n = (int) (s69Var.b() / 32.0f);
        z91<ib6, ib6> z91VarT = mb6Var.c.t();
        this.i = (kb6) z91VarT;
        z91VarT.a(this);
        ba1Var.f(z91VarT);
        z91<Integer, Integer> z91VarT2 = mb6Var.d.t();
        this.j = (yh7) z91VarT2;
        z91VarT2.a(this);
        ba1Var.f(z91VarT2);
        z91<PointF, PointF> z91VarT3 = mb6Var.e.t();
        this.k = (keb) z91VarT3;
        z91VarT3.a(this);
        ba1Var.f(z91VarT3);
        z91<PointF, PointF> z91VarT4 = mb6Var.f.t();
        this.l = (keb) z91VarT4;
        z91VarT4.a(this);
        ba1Var.f(z91VarT4);
        if (ba1Var.l() != null) {
            di5 di5VarT = ((dc0) ba1Var.l().a).t();
            this.o = di5VarT;
            di5VarT.a(this);
            ba1Var.f(this.o);
        }
    }

    @Override // z91.a
    public final void a() {
        this.m.invalidateSelf();
    }

    @Override // defpackage.ks2
    public final void b(List<ks2> list, List<ks2> list2) {
        for (int i = 0; i < list2.size(); i++) {
            ks2 ks2Var = list2.get(i);
            if (ks2Var instanceof a6b) {
                this.g.add((a6b) ks2Var);
            }
        }
    }

    @Override // defpackage.vc4
    public final void e(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.d;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((a6b) arrayList.get(i)).c(), matrix);
                i++;
            }
        }
    }

    public final int f() {
        float f = this.k.d;
        float f2 = this.n;
        int iRound = Math.round(f * f2);
        int iRound2 = Math.round(this.l.d * f2);
        int iRound3 = Math.round(this.i.d * f2);
        int i = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }

    @Override // defpackage.vc4
    public final void h(Canvas canvas, Matrix matrix, int i, hd4 hd4Var) {
        float[] fArr;
        int[] iArr;
        LinearGradient linearGradientD;
        int[] iArr2;
        if (this.a) {
            return;
        }
        Path path = this.d;
        path.reset();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i2 >= arrayList.size()) {
                break;
            }
            path.addPath(((a6b) arrayList.get(i2)).c(), matrix);
            i2++;
        }
        path.computeBounds(this.f, false);
        sb6 sb6Var = this.h;
        sb6 sb6Var2 = sb6.a;
        kb6 kb6Var = this.i;
        keb kebVar = this.l;
        keb kebVar2 = this.k;
        if (sb6Var == sb6Var2) {
            long jF = f();
            r59<LinearGradient> r59Var = this.b;
            linearGradientD = r59Var.d(jF);
            if (linearGradientD == null) {
                PointF pointFE = kebVar2.e();
                PointF pointFE2 = kebVar.e();
                ib6 ib6VarE = kb6Var.e();
                int[] iArr3 = ib6VarE.b;
                float[] fArr2 = ib6VarE.a;
                if (iArr3.length < 2) {
                    fArr2 = new float[]{0.0f, 1.0f};
                    iArr2 = new int[]{iArr3[0], iArr3[0]};
                } else {
                    iArr2 = iArr3;
                }
                linearGradientD = new LinearGradient(pointFE.x, pointFE.y, pointFE2.x, pointFE2.y, iArr2, fArr2, Shader.TileMode.CLAMP);
                r59Var.h(linearGradientD, jF);
            }
        } else {
            long jF2 = f();
            r59<RadialGradient> r59Var2 = this.c;
            RadialGradient radialGradientD = r59Var2.d(jF2);
            if (radialGradientD != null) {
                linearGradientD = radialGradientD;
            } else {
                PointF pointFE3 = kebVar2.e();
                PointF pointFE4 = kebVar.e();
                ib6 ib6VarE2 = kb6Var.e();
                int[] iArr4 = ib6VarE2.b;
                float[] fArr3 = ib6VarE2.a;
                if (iArr4.length < 2) {
                    iArr = new int[]{iArr4[0], iArr4[0]};
                    fArr = new float[]{0.0f, 1.0f};
                } else {
                    fArr = fArr3;
                    iArr = iArr4;
                }
                float f = pointFE3.x;
                float f2 = pointFE3.y;
                float fHypot = (float) Math.hypot(pointFE4.x - f, pointFE4.y - f2);
                if (fHypot <= 0.0f) {
                    fHypot = 0.001f;
                }
                RadialGradient radialGradient = new RadialGradient(f, f2, fHypot, iArr, fArr, Shader.TileMode.CLAMP);
                r59Var2.h(radialGradient, jF2);
                linearGradientD = radialGradient;
            }
        }
        linearGradientD.setLocalMatrix(matrix);
        ij8 ij8Var = this.e;
        ij8Var.setShader(linearGradientD);
        z91<Float, Float> z91Var = this.o;
        if (z91Var != null) {
            float fFloatValue = z91Var.e().floatValue();
            if (fFloatValue == 0.0f) {
                ij8Var.setMaskFilter(null);
            } else if (fFloatValue != this.p) {
                ij8Var.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.p = fFloatValue;
        }
        float fIntValue = this.j.e().intValue() / 100.0f;
        ij8Var.setAlpha(du9.c((int) (i * fIntValue)));
        if (hd4Var != null) {
            hd4Var.a((int) (fIntValue * 255.0f), ij8Var);
        }
        canvas.drawPath(path, ij8Var);
    }
}
