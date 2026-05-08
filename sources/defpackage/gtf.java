package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gtf implements d65<etf> {
    public final gq3 a;
    public final jhg b;
    public final u2h c;

    public gtf(gq3 gq3Var, jhg jhgVar, u2h u2hVar) {
        this.a = gq3Var;
        this.b = jhgVar;
        this.c = u2hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new etf(new dmc(), new zkd(26), (fod) this.a.get(), (ihg) this.b.get(), (t2h) this.c.get());
    }
}
