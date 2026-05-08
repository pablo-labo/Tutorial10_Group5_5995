package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k82 implements AutoCloseable, e13 {
    public final v03 a;

    public k82(v03 v03Var) {
        v03Var.getClass();
        this.a = v03Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        u63.o(this.a, null);
    }

    @Override // defpackage.e13
    public final v03 getCoroutineContext() {
        return this.a;
    }
}
