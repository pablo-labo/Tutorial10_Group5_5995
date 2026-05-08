package defpackage;

import defpackage.ge0;

/* JADX INFO: loaded from: classes.dex */
public final class mre<V extends ge0> implements lmg<V> {
    public final lmg<V> a;
    public final long b;

    public mre(lmg<V> lmgVar, long j) {
        this.a = lmgVar;
        this.b = j;
    }

    @Override // defpackage.lmg
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.lmg
    public final long d(V v, V v2, V v3) {
        return this.a.d(v, v2, v3) + this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mre)) {
            return false;
        }
        mre mreVar = (mre) obj;
        return mreVar.b == this.b && wl7.b(mreVar.a, this.a);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.lmg
    public final V o(long j, V v, V v2, V v3) {
        long j2 = this.b;
        return j < j2 ? v3 : (V) this.a.o(j - j2, v, v2, v3);
    }

    @Override // defpackage.lmg
    public final V q(long j, V v, V v2, V v3) {
        long j2 = this.b;
        return j < j2 ? v : (V) this.a.q(j - j2, v, v2, v3);
    }
}
