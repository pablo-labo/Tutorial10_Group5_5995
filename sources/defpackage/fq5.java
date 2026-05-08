package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fq5 implements pne {
    public final pne a;

    public fq5(pne pneVar) {
        pneVar.getClass();
        this.a = pneVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }

    @Override // defpackage.pne
    public long f1(zn1 zn1Var, long j) {
        zn1Var.getClass();
        return this.a.f1(zn1Var, j);
    }

    @Override // defpackage.pne
    public final kmf g() {
        return this.a.g();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.a + ')';
    }
}
