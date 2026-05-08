package defpackage;

import defpackage.ge0;

/* JADX INFO: loaded from: classes.dex */
public final class umg<V extends ge0> implements nmg<V> {
    public final int a;

    public umg(int i) {
        this.a = i;
    }

    @Override // defpackage.nmg
    public final int i() {
        return this.a;
    }

    @Override // defpackage.nmg
    public final int j() {
        return 0;
    }

    @Override // defpackage.lmg
    public final V o(long j, V v, V v2, V v3) {
        return v3;
    }

    @Override // defpackage.lmg
    public final V q(long j, V v, V v2, V v3) {
        return j < ((long) this.a) * 1000000 ? v : v2;
    }
}
