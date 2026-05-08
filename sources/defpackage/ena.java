package defpackage;

import com.apollographql.apollo.exception.ApolloGraphQLException;
import defpackage.mb8;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ena<T> implements ga<T> {
    public final ga<T> a;
    public final boolean b;

    public ena(ga<T> gaVar, boolean z) {
        gaVar.getClass();
        this.a = gaVar;
        this.b = z;
    }

    @Override // defpackage.ga
    public final T a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        if (this.b) {
            if (mb8Var instanceof tb9) {
                mb8Var = (tb9) mb8Var;
            } else {
                mb8.a aVarPeek = mb8Var.peek();
                if (aVarPeek != mb8.a.c) {
                    v40.o("Failed to buffer json reader, expected `BEGIN_OBJECT` but found `", aVarPeek, "` json token");
                    return null;
                }
                ArrayList arrayListC = mb8Var.c();
                Object objA = e.a(mb8Var);
                objA.getClass();
                mb8Var = new tb9((Map) objA, arrayListC);
            }
        }
        mb8Var.j();
        try {
            T tA = this.a.a(mb8Var, lb3Var);
            mb8Var.t();
            return tA;
        } catch (ApolloGraphQLException e) {
            while (mb8Var.hasNext()) {
                mb8Var.X();
                mb8Var.I();
            }
            mb8Var.t();
            throw e;
        }
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, T t) {
        hc8Var.getClass();
        lb3Var.getClass();
        boolean z = this.b;
        ga<T> gaVar = this.a;
        if (!z || (hc8Var instanceof ub9)) {
            hc8Var.j();
            gaVar.b(hc8Var, lb3Var, t);
            hc8Var.t();
            return;
        }
        ub9 ub9Var = new ub9();
        ub9Var.j();
        gaVar.b(ub9Var, lb3Var, t);
        ub9Var.t();
        Object objH = ub9Var.h();
        objH.getClass();
        f.a(hc8Var, objH);
    }
}
