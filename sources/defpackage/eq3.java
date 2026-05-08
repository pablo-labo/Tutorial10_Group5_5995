package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class eq3 extends p15 {
    public static final eq3 d = new eq3();
    public final d13 c = new d13(uaf.e, uaf.a, uaf.c, uaf.d);

    @Override // defpackage.y03
    public final y03 E1(int i) {
        h4.g(i);
        return i >= uaf.c ? this : super.E1(i);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.y03
    public final String toString() {
        return "Dispatchers.Default";
    }

    @Override // defpackage.y03
    public final void v1(v03 v03Var, Runnable runnable) {
        d13.p(this.c, runnable, 6);
    }

    @Override // defpackage.y03
    public final void w1(v03 v03Var, Runnable runnable) {
        d13.p(this.c, runnable, 2);
    }
}
