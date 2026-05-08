package defpackage;

import defpackage.pua;

/* JADX INFO: loaded from: classes.dex */
public final class iga implements ph0 {
    public final cha a;

    public iga(cha chaVar, cha chaVar2) {
        this.a = chaVar;
    }

    @Override // defpackage.ph0
    public final <D extends pua.a> vi5<sh0<D>> a(rh0<D> rh0Var, qh0 qh0Var) {
        rh0Var.getClass();
        qh0Var.getClass();
        pua<D> puaVar = rh0Var.a;
        boolean z = puaVar instanceof c9c;
        cha chaVar = this.a;
        if (!z && !(puaVar instanceof p4a)) {
            r6.g("");
            return null;
        }
        return chaVar.a(rh0Var);
    }
}
