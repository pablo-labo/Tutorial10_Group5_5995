package defpackage;

import androidx.compose.runtime.c;
import defpackage.v03;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class im2 implements hm2, tua, v03.a {
    public static final a b = new a();
    public final c a;

    public static final class a implements v03.b<im2> {
        public final String toString() {
            return "CompositionErrorContext";
        }
    }

    public im2(c cVar) {
        this.a = cVar;
    }

    @Override // defpackage.v03
    public final v03 P(v03.b<?> bVar) {
        return v03.a.C0438a.b(this, bVar);
    }

    @Override // defpackage.tua
    public final List<fl2> b(Integer num) {
        return this.a.h0();
    }

    @Override // defpackage.hm2
    public final boolean c(Object obj, Throwable th) {
        return ka2.K(th, new pi(2, this, obj));
    }

    @Override // defpackage.v03
    public final v03 d1(v03 v03Var) {
        return v03.a.C0438a.c(this, v03Var);
    }

    @Override // v03.a
    public final v03.b<?> getKey() {
        return b;
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
