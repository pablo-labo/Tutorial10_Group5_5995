package defpackage;

import defpackage.ge0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class mvf<T, V extends ge0> implements lvf<T, V> {
    public final Function1<T, V> a;
    public final Function1<V, T> b;

    /* JADX WARN: Multi-variable type inference failed */
    public mvf(Function1<? super T, ? extends V> function1, Function1<? super V, ? extends T> function12) {
        this.a = function1;
        this.b = function12;
    }

    @Override // defpackage.lvf
    public final Function1<T, V> a() {
        return this.a;
    }

    @Override // defpackage.lvf
    public final Function1<V, T> b() {
        return this.b;
    }
}
