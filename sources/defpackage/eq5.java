package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class eq5 implements fie {
    public final fie a;

    public eq5(fie fieVar) {
        fieVar.getClass();
        this.a = fieVar;
    }

    @Override // defpackage.fie
    public void I1(zn1 zn1Var, long j) {
        zn1Var.getClass();
        this.a.I1(zn1Var, j);
    }

    @Override // defpackage.fie, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }

    @Override // defpackage.fie, java.io.Flushable
    public void flush() {
        this.a.flush();
    }

    @Override // defpackage.fie
    public final kmf g() {
        return this.a.g();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.a + ')';
    }
}
