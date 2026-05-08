package defpackage;

import defpackage.v03;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class y05 implements z03 {
    public final /* synthetic */ x05 a = x05.b;

    @Override // defpackage.z03
    public final void N0(v03 v03Var, Throwable th) {
        this.a.getClass();
        synchronized (x05.c) {
        }
    }

    @Override // defpackage.v03
    public final v03 P(v03.b<?> bVar) {
        x05 x05Var = this.a;
        x05Var.getClass();
        return v03.a.C0438a.b(x05Var, bVar);
    }

    @Override // defpackage.v03
    public final v03 d1(v03 v03Var) {
        x05 x05Var = this.a;
        x05Var.getClass();
        return v03.a.C0438a.c(x05Var, v03Var);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof y05) || (obj instanceof x05);
    }

    @Override // v03.a
    public final v03.b<?> getKey() {
        return this.a.a;
    }

    @Override // defpackage.v03
    public final <E extends v03.a> E h1(v03.b<E> bVar) {
        x05 x05Var = this.a;
        x05Var.getClass();
        return (E) v03.a.C0438a.a(x05Var, bVar);
    }

    public final int hashCode() {
        return x05.b.hashCode();
    }

    @Override // defpackage.v03
    public final <R> R j1(R r, Function2<? super R, ? super v03.a, ? extends R> function2) {
        x05 x05Var = this.a;
        x05Var.getClass();
        return function2.invoke(r, x05Var);
    }
}
