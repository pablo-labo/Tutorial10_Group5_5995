package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes.dex */
public final class cmb<T> implements ga<hva.c<T>> {
    public final ga<T> a;

    public cmb(ga<T> gaVar) {
        gaVar.getClass();
        this.a = gaVar;
    }

    @Override // defpackage.ga
    public final Object a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        return new hva.c(this.a.a(mb8Var, lb3Var));
    }

    @Override // defpackage.ga
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void b(hc8 hc8Var, lb3 lb3Var, hva.c<T> cVar) {
        hc8Var.getClass();
        lb3Var.getClass();
        cVar.getClass();
        this.a.b(hc8Var, lb3Var, cVar.a);
    }
}
