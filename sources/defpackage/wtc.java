package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import defpackage.z91;

/* JADX INFO: loaded from: classes.dex */
public final class wtc implements z91.a, ks2, a6b {
    public final boolean c;
    public final j79 d;
    public final z91<?, PointF> e;
    public final z91<?, PointF> f;
    public final di5 g;
    public boolean j;
    public final Path a = new Path();
    public final RectF b = new RectF();
    public final wm2 h = new wm2(0);
    public z91<Float, Float> i = null;

    public wtc(j79 j79Var, ba1 ba1Var, xtc xtcVar) {
        this.c = xtcVar.e;
        this.d = j79Var;
        z91<PointF, PointF> z91VarT = xtcVar.b.t();
        this.e = z91VarT;
        z91<PointF, PointF> z91VarT2 = xtcVar.c.t();
        this.f = z91VarT2;
        di5 di5VarT = xtcVar.d.t();
        this.g = di5VarT;
        ba1Var.f(z91VarT);
        ba1Var.f(z91VarT2);
        ba1Var.f(di5VarT);
        z91VarT.a(this);
        z91VarT2.a(this);
        di5VarT.a(this);
    }

    @Override // z91.a
    public final void a() {
        this.j = false;
        this.d.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    @Override // defpackage.ks2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.util.List<defpackage.ks2> r5, java.util.List<defpackage.ks2> r6) {
        /*
            r4 = this;
            r6 = 0
        L1:
            r0 = r5
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r0.size()
            if (r6 >= r1) goto L37
            java.lang.Object r0 = r0.get(r6)
            ks2 r0 = (defpackage.ks2) r0
            boolean r1 = r0 instanceof defpackage.juf
            if (r1 == 0) goto L2a
            r1 = r0
            juf r1 = (defpackage.juf) r1
            ade$a r2 = r1.c
            ade$a r3 = ade.a.a
            if (r2 != r3) goto L2a
            wm2 r0 = r4.h
            java.lang.Object r0 = r0.a
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r1)
            r1.f(r4)
            goto L34
        L2a:
            boolean r1 = r0 instanceof defpackage.jgd
            if (r1 == 0) goto L34
            jgd r0 = (defpackage.jgd) r0
            z91<java.lang.Float, java.lang.Float> r0 = r0.b
            r4.i = r0
        L34:
            int r6 = r6 + 1
            goto L1
        L37:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wtc.b(java.util.List, java.util.List):void");
    }

    @Override // defpackage.a6b
    public final Path c() {
        float f;
        z91<Float, Float> z91Var;
        boolean z = this.j;
        Path path = this.a;
        if (z) {
            return path;
        }
        path.reset();
        if (this.c) {
            this.j = true;
            return path;
        }
        PointF pointFE = this.f.e();
        float f2 = pointFE.x / 2.0f;
        float f3 = pointFE.y / 2.0f;
        di5 di5Var = this.g;
        float fJ = di5Var == null ? 0.0f : di5Var.j();
        if (fJ == 0.0f && (z91Var = this.i) != null) {
            fJ = Math.min(z91Var.e().floatValue(), Math.min(f2, f3));
        }
        float fMin = Math.min(f2, f3);
        if (fJ > fMin) {
            fJ = fMin;
        }
        PointF pointFE2 = this.e.e();
        path.moveTo(pointFE2.x + f2, (pointFE2.y - f3) + fJ);
        path.lineTo(pointFE2.x + f2, (pointFE2.y + f3) - fJ);
        RectF rectF = this.b;
        if (fJ > 0.0f) {
            float f4 = pointFE2.x + f2;
            float f5 = fJ * 2.0f;
            f = 2.0f;
            float f6 = pointFE2.y + f3;
            rectF.set(f4 - f5, f6 - f5, f4, f6);
            path.arcTo(rectF, 0.0f, 90.0f, false);
        } else {
            f = 2.0f;
        }
        path.lineTo((pointFE2.x - f2) + fJ, pointFE2.y + f3);
        if (fJ > 0.0f) {
            float f7 = pointFE2.x - f2;
            float f8 = pointFE2.y + f3;
            float f9 = fJ * f;
            rectF.set(f7, f8 - f9, f9 + f7, f8);
            path.arcTo(rectF, 90.0f, 90.0f, false);
        }
        path.lineTo(pointFE2.x - f2, (pointFE2.y - f3) + fJ);
        if (fJ > 0.0f) {
            float f10 = pointFE2.x - f2;
            float f11 = pointFE2.y - f3;
            float f12 = fJ * f;
            rectF.set(f10, f11, f10 + f12, f12 + f11);
            path.arcTo(rectF, 180.0f, 90.0f, false);
        }
        path.lineTo((pointFE2.x + f2) - fJ, pointFE2.y - f3);
        if (fJ > 0.0f) {
            float f13 = pointFE2.x + f2;
            float f14 = fJ * f;
            float f15 = pointFE2.y - f3;
            rectF.set(f13 - f14, f15, f13, f14 + f15);
            path.arcTo(rectF, 270.0f, 90.0f, false);
        }
        path.close();
        this.h.a(path);
        this.j = true;
        return path;
    }
}
