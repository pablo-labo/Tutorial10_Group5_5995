package defpackage;

import defpackage.ex7;
import defpackage.v03;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class f13 {
    public static final eu2 a(v03 v03Var) {
        if (v03Var.h1(ex7.a.a) == null) {
            v03Var = v03Var.d1(u63.f());
        }
        return new eu2(v03Var);
    }

    public static final eu2 b() {
        eze ezeVarA = wea.a();
        eq3 eq3Var = a74.a;
        return new eu2(v03.a.C0438a.c(ezeVarA, m89.a));
    }

    public static final void c(e13 e13Var, CancellationException cancellationException) {
        ex7 ex7Var = (ex7) e13Var.getCoroutineContext().h1(ex7.a.a);
        if (ex7Var != null) {
            ex7Var.h(cancellationException);
        } else {
            ja.i(e13Var, "Scope cannot be cancelled because it does not have a job: ");
        }
    }

    public static final <R> Object d(Function2<? super e13, ? super lu2<? super R>, ? extends Object> function2, lu2<? super R> lu2Var) {
        vpd vpdVar = new vpd(lu2Var, lu2Var.getContext());
        return a6g.a(vpdVar, true, vpdVar, function2);
    }

    public static final boolean e(e13 e13Var) {
        ex7 ex7Var = (ex7) e13Var.getCoroutineContext().h1(ex7.a.a);
        if (ex7Var != null) {
            return ex7Var.isActive();
        }
        return true;
    }
}
