package defpackage;

import defpackage.mb8;

/* JADX INFO: loaded from: classes.dex */
public final class nma<T> implements ga<T> {
    public final ga<T> a;

    public nma(ga<T> gaVar) {
        gaVar.getClass();
        this.a = gaVar;
        if (gaVar instanceof nma) {
            r6.g("The adapter is already nullable");
            throw null;
        }
    }

    @Override // defpackage.ga
    public final T a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        if (mb8Var.peek() != mb8.a.Y) {
            return this.a.a(mb8Var, lb3Var);
        }
        mb8Var.I();
        return null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, T t) {
        hc8Var.getClass();
        lb3Var.getClass();
        if (t == null) {
            hc8Var.H1();
        } else {
            this.a.b(hc8Var, lb3Var, t);
        }
    }
}
