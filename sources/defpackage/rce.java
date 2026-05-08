package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class rce extends ba1 {
    public final ts2 D;
    public final lm2 E;
    public final kd4 F;

    public rce(j79 j79Var, hl8 hl8Var, lm2 lm2Var, s69 s69Var) {
        super(j79Var, hl8Var);
        this.E = lm2Var;
        ts2 ts2Var = new ts2(j79Var, this, new nce("__container", hl8Var.a, false), s69Var);
        this.D = ts2Var;
        List<ks2> list = Collections.EMPTY_LIST;
        ts2Var.b(list, list);
        id4 id4Var = this.p.x;
        if (id4Var != null) {
            this.F = new kd4(this, this, id4Var);
        }
    }

    @Override // defpackage.ba1, defpackage.vc4
    public final void e(RectF rectF, Matrix matrix, boolean z) {
        super.e(rectF, matrix, z);
        this.D.e(rectF, this.n, z);
    }

    @Override // defpackage.ba1
    public final void k(Canvas canvas, Matrix matrix, int i, hd4 hd4Var) {
        kd4 kd4Var = this.F;
        if (kd4Var != null) {
            hd4Var = kd4Var.b(matrix, i);
        }
        this.D.h(canvas, matrix, i, hd4Var);
    }

    @Override // defpackage.ba1
    public final v l() {
        v vVar = this.p.w;
        return vVar != null ? vVar : this.E.p.w;
    }
}
