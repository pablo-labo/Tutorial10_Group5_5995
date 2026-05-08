package defpackage;

import defpackage.in9;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class cqd<T extends in9> {
    public final x0 a;
    public final Function1<bj8, T> b;
    public final bj8 c;
    public final fla d;
    public static final /* synthetic */ qf8<Object>[] f = {fwc.a.g(new l4c(cqd.class, "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0))};
    public static final a e = new a();

    public static final class a {
    }

    public cqd() {
        throw null;
    }

    public cqd(x0 x0Var, aue aueVar, Function1 function1, bj8 bj8Var) {
        this.a = x0Var;
        this.b = function1;
        this.c = bj8Var;
        this.d = aueVar.f(new i14(this, 6));
    }

    public final T a(bj8 bj8Var) {
        bj8Var.getClass();
        int i = b04.a;
        x0 x0Var = this.a;
        x0Var.getClass();
        xx9 xx9VarD = yz3.d(x0Var);
        xx9VarD.getClass();
        bj8Var.x0(xx9VarD);
        return (T) zte.c(this.d, f[0]);
    }
}
