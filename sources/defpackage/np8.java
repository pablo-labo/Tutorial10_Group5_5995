package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class np8 implements gu5 {
    public final qp8 a;
    public final bv7 b;
    public final luc c;

    public np8(qp8 qp8Var, bv7 bv7Var, luc lucVar) {
        this.a = qp8Var;
        this.b = bv7Var;
        this.c = lucVar;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        qp8 qp8Var = this.a;
        return qp8Var.b.a.a.e(new op8(0, qp8Var, this.b, this.c));
    }
}
