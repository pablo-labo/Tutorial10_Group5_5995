package defpackage;

import defpackage.v03;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class tkf<T> implements qkf<T> {
    public final T a;
    public final ThreadLocal<T> b;
    public final vkf c;

    public tkf(T t, ThreadLocal<T> threadLocal) {
        this.a = t;
        this.b = threadLocal;
        this.c = new vkf(threadLocal);
    }

    @Override // defpackage.v03
    public final v03 P(v03.b<?> bVar) {
        return this.c.equals(bVar) ? vr4.a : this;
    }

    @Override // defpackage.qkf
    public final Object P0() {
        ThreadLocal<T> threadLocal = this.b;
        T t = threadLocal.get();
        threadLocal.set(this.a);
        return t;
    }

    @Override // defpackage.v03
    public final v03 d1(v03 v03Var) {
        return v03.a.C0438a.c(this, v03Var);
    }

    @Override // v03.a
    public final v03.b<?> getKey() {
        return this.c;
    }

    @Override // defpackage.v03
    public final <E extends v03.a> E h1(v03.b<E> bVar) {
        if (this.c.equals(bVar)) {
            return this;
        }
        return null;
    }

    @Override // defpackage.v03
    public final <R> R j1(R r, Function2<? super R, ? super v03.a, ? extends R> function2) {
        return function2.invoke(r, this);
    }

    @Override // defpackage.qkf
    public final void k0(Object obj) {
        this.b.set(obj);
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.a + ", threadLocal = " + this.b + ')';
    }
}
