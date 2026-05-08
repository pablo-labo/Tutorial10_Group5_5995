package defpackage;

import defpackage.v03;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class i94 implements v03 {
    public final /* synthetic */ v03 a;
    public final Throwable b;

    public i94(v03 v03Var, Throwable th) {
        this.a = v03Var;
        this.b = th;
    }

    @Override // defpackage.v03
    public final v03 P(v03.b<?> bVar) {
        return this.a.P(bVar);
    }

    @Override // defpackage.v03
    public final v03 d1(v03 v03Var) {
        return this.a.d1(v03Var);
    }

    @Override // defpackage.v03
    public final <E extends v03.a> E h1(v03.b<E> bVar) {
        return (E) this.a.h1(bVar);
    }

    @Override // defpackage.v03
    public final <R> R j1(R r, Function2<? super R, ? super v03.a, ? extends R> function2) {
        return (R) this.a.j1(r, function2);
    }
}
