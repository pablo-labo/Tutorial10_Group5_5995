package defpackage;

import defpackage.v03;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class q54 implements lz9 {
    public static final q54 a = new q54();

    @Override // defpackage.v03
    public final v03 P(v03.b<?> bVar) {
        return v03.a.C0438a.b(this, bVar);
    }

    @Override // defpackage.lz9
    public final float Q() {
        return 0.0f;
    }

    @Override // defpackage.v03
    public final v03 d1(v03 v03Var) {
        return v03.a.C0438a.c(this, v03Var);
    }

    @Override // defpackage.v03
    public final <E extends v03.a> E h1(v03.b<E> bVar) {
        return (E) v03.a.C0438a.a(this, bVar);
    }

    @Override // defpackage.v03
    public final <R> R j1(R r, Function2<? super R, ? super v03.a, ? extends R> function2) {
        return function2.invoke(r, this);
    }
}
