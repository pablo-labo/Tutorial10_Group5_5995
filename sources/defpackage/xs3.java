package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xs3<I, O> extends w81<I> {
    public final xq2<O> b;

    public xs3(xq2<O> xq2Var) {
        xq2Var.getClass();
        this.b = xq2Var;
    }

    @Override // defpackage.w81
    public void c() {
        this.b.u();
    }

    @Override // defpackage.w81
    public void d(Throwable th) {
        th.getClass();
        this.b.t(th);
    }

    @Override // defpackage.w81
    public void f(float f) {
        this.b.w(f);
    }
}
