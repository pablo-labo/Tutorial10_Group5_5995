package defpackage;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public final class xtc implements ct2 {
    public final String a;
    public final tc0<PointF, PointF> b;
    public final tc0<PointF, PointF> c;
    public final dc0 d;
    public final boolean e;

    public xtc(String str, tc0 tc0Var, jc0 jc0Var, dc0 dc0Var, boolean z) {
        this.a = str;
        this.b = tc0Var;
        this.c = jc0Var;
        this.d = dc0Var;
        this.e = z;
    }

    @Override // defpackage.ct2
    public final ks2 a(j79 j79Var, s69 s69Var, ba1 ba1Var) {
        return new wtc(j79Var, ba1Var, this);
    }

    public final String toString() {
        return "RectangleShape{position=" + this.b + ", size=" + this.c + '}';
    }
}
