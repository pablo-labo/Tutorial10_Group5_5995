package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class g98 implements m55 {
    public final m55 a;

    public g98(int i) {
        if ((i & 1) != 0) {
            this.a = new rhe(65496, 2, "image/jpeg");
        } else {
            this.a = new h98();
        }
    }

    @Override // defpackage.m55
    public final int b(n55 n55Var, dhb dhbVar) {
        return this.a.b(n55Var, dhbVar);
    }

    @Override // defpackage.m55
    public final boolean c(n55 n55Var) {
        return this.a.c(n55Var);
    }

    @Override // defpackage.m55
    public final void d(long j, long j2) {
        this.a.d(j, j2);
    }

    @Override // defpackage.m55
    public final void l(o55 o55Var) {
        this.a.l(o55Var);
    }

    @Override // defpackage.m55
    public final void release() {
        this.a.release();
    }
}
