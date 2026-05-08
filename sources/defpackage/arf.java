package defpackage;

import defpackage.v03;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class arf implements v03.a {
    public static final a c = new a();
    public final qu2 a;
    public final AtomicInteger b = new AtomicInteger(0);

    public static final class a implements v03.b<arf> {
    }

    public arf(qu2 qu2Var) {
        this.a = qu2Var;
    }

    @Override // defpackage.v03
    public final v03 P(v03.b<?> bVar) {
        return v03.a.C0438a.b(this, bVar);
    }

    @Override // defpackage.v03
    public final v03 d1(v03 v03Var) {
        return v03.a.C0438a.c(this, v03Var);
    }

    @Override // v03.a
    public final v03.b<arf> getKey() {
        return c;
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
