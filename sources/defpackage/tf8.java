package defpackage;

import defpackage.qf8;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public interface tf8<T, V> extends qf8<V>, Function1<T, V> {

    public interface a<T, V> extends qf8.b<V>, Function1<T, V> {
    }

    @Override // defpackage.qf8
    a<T, V> c();

    V get(T t);
}
