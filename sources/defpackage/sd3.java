package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sd3 implements qd3 {
    public final n42 a;
    public final long b;

    public sd3(n42 n42Var, long j) {
        this.a = n42Var;
        this.b = j;
    }

    @Override // defpackage.qd3
    public final long a(long j) {
        return this.a.e[(int) j] - this.b;
    }

    @Override // defpackage.qd3
    public final boolean b() {
        return true;
    }

    @Override // defpackage.qd3
    public final long c(long j, long j2) {
        return this.a.d[(int) j];
    }

    @Override // defpackage.qd3
    public final long d(long j, long j2) {
        return 0L;
    }

    @Override // defpackage.qd3
    public final long e(long j, long j2) {
        return -9223372036854775807L;
    }

    @Override // defpackage.qd3
    public final mic f(long j) {
        return new mic(this.a.c[(int) j], null, r6.b[r7]);
    }

    @Override // defpackage.qd3
    public final long g(long j, long j2) {
        return vjg.e(this.a.e, j + this.b, true);
    }

    @Override // defpackage.qd3
    public final long h(long j) {
        return this.a.a;
    }

    @Override // defpackage.qd3
    public final long i() {
        return 0L;
    }

    @Override // defpackage.qd3
    public final long j(long j, long j2) {
        return this.a.a;
    }
}
