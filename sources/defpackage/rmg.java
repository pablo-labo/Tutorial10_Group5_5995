package defpackage;

import defpackage.ge0;

/* JADX INFO: loaded from: classes.dex */
public final class rmg<V extends ge0> implements lmg<V> {
    public final nmg<V> a;
    public final b2d b;
    public final long c;
    public final long d = 0;

    public rmg(nmg nmgVar, b2d b2dVar) {
        this.a = nmgVar;
        this.b = b2dVar;
        this.c = ((long) (nmgVar.j() + nmgVar.i())) * 1000000;
    }

    @Override // defpackage.lmg
    public final boolean a() {
        return true;
    }

    public final long b(long j) {
        long j2 = this.d;
        if (j + j2 <= 0) {
            return 0L;
        }
        long j3 = j + j2;
        long j4 = this.c;
        long j5 = j3 / j4;
        return (this.b == b2d.a || j5 % 2 == 0) ? j3 - (j5 * j4) : ((j5 + 1) * j4) - j3;
    }

    public final V c(long j, V v, V v2, V v3) {
        long j2 = this.d;
        long j3 = j + j2;
        long j4 = this.c;
        return j3 > j4 ? this.a.o(j4 - j2, v, v3, v2) : v2;
    }

    @Override // defpackage.lmg
    public final long d(V v, V v2, V v3) {
        return Long.MAX_VALUE;
    }

    @Override // defpackage.lmg
    public final V o(long j, V v, V v2, V v3) {
        return this.a.o(b(j), v, v2, c(j, v, v3, v2));
    }

    @Override // defpackage.lmg
    public final V q(long j, V v, V v2, V v3) {
        return this.a.q(b(j), v, v2, c(j, v, v3, v2));
    }
}
