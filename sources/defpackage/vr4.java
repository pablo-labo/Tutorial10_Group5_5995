package defpackage;

import defpackage.v03;
import java.io.Serializable;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class vr4 implements v03, Serializable {
    public static final vr4 a = new vr4();
    private static final long serialVersionUID = 0;

    private final Object readResolve() {
        return a;
    }

    @Override // defpackage.v03
    public final v03 P(v03.b<?> bVar) {
        bVar.getClass();
        return this;
    }

    @Override // defpackage.v03
    public final v03 d1(v03 v03Var) {
        v03Var.getClass();
        return v03Var;
    }

    @Override // defpackage.v03
    public final <E extends v03.a> E h1(v03.b<E> bVar) {
        bVar.getClass();
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // defpackage.v03
    public final <R> R j1(R r, Function2<? super R, ? super v03.a, ? extends R> function2) {
        return r;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }
}
