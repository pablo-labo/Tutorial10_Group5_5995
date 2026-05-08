package defpackage;

import defpackage.ge0;

/* JADX INFO: loaded from: classes.dex */
public interface lmg<V extends ge0> {
    boolean a();

    long d(V v, V v2, V v3);

    default V k(V v, V v2, V v3) {
        return (V) o(d(v, v2, v3), v, v2, v3);
    }

    V o(long j, V v, V v2, V v3);

    V q(long j, V v, V v2, V v3);
}
