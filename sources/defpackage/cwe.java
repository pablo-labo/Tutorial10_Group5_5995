package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
public final class cwe extends za1 {
    public final boolean p;
    public final ia2 q;

    /* JADX WARN: Illegal instructions before constructor call */
    public cwe(j79 j79Var, ba1 ba1Var, xce xceVar) {
        int iOrdinal = xceVar.g.ordinal();
        Paint.Cap cap = iOrdinal != 0 ? iOrdinal != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int iOrdinal2 = xceVar.h.ordinal();
        super(j79Var, ba1Var, cap, iOrdinal2 != 0 ? iOrdinal2 != 1 ? iOrdinal2 != 2 ? null : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER, xceVar.i, xceVar.e, xceVar.f, xceVar.c, xceVar.b);
        this.p = xceVar.j;
        z91<Integer, Integer> z91VarT = xceVar.d.t();
        this.q = (ia2) z91VarT;
        z91VarT.a(this);
        ba1Var.f(z91VarT);
    }

    @Override // defpackage.za1, defpackage.vc4
    public final void h(Canvas canvas, Matrix matrix, int i, hd4 hd4Var) {
        if (this.p) {
            return;
        }
        ia2 ia2Var = this.q;
        this.i.setColor(ia2Var.j(ia2Var.c.b(), ia2Var.c()));
        super.h(canvas, matrix, i, hd4Var);
    }
}
