package defpackage;

import defpackage.ge0;

/* JADX INFO: loaded from: classes.dex */
public interface sd0<T, V extends ge0> {
    boolean a();

    V b(long j);

    default boolean c(long j) {
        return j >= d();
    }

    long d();

    lvf<T, V> e();

    T f(long j);

    T g();
}
