package defpackage;

import defpackage.lf0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class mya extends dj3 implements lya {
    public final mq5 e;
    public final String f;

    /* JADX WARN: Illegal instructions before constructor call */
    public mya(xx9 xx9Var, mq5 mq5Var) {
        xx9Var.getClass();
        mq5Var.getClass();
        nq5 nq5Var = mq5Var.a;
        super(xx9Var, lf0.a.a, nq5Var.c() ? nq5.e : nq5Var.f(), qne.p);
        this.e = mq5Var;
        this.f = "package " + mq5Var + " of " + xx9Var;
    }

    @Override // defpackage.dj3, defpackage.aj3
    public final xx9 d() {
        aj3 aj3VarD = super.d();
        aj3VarD.getClass();
        return (xx9) aj3VarD;
    }

    @Override // defpackage.dj3, defpackage.cj3
    public qne g() {
        return qne.p;
    }

    @Override // defpackage.lya
    public final mq5 h() {
        return this.e;
    }

    @Override // defpackage.aj3
    public final <R, D> R o0(ej3<R, D> ej3Var, D d) {
        return (R) ej3Var.i(this, d);
    }

    @Override // defpackage.bj3
    public String toString() {
        return this.f;
    }
}
