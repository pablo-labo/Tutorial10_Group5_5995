package defpackage;

import defpackage.ge0;

/* JADX INFO: loaded from: classes.dex */
public interface nmg<V extends ge0> extends omg<V> {
    @Override // defpackage.lmg
    default long d(V v, V v2, V v3) {
        return ((long) (j() + i())) * 1000000;
    }

    int i();

    int j();
}
