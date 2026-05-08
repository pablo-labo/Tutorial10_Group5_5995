package defpackage;

import defpackage.pua;

/* JADX INFO: loaded from: classes.dex */
public final class k85 implements ph0, uh0 {
    public static final k85 a = new k85();

    @Override // defpackage.ph0
    public final <D extends pua.a> vi5<sh0<D>> a(rh0<D> rh0Var, qh0 qh0Var) {
        rh0Var.getClass();
        k15 k15Var = rh0Var.c;
        qh0Var.getClass();
        if (!(rh0Var.a instanceof c9c)) {
            return qh0Var.a(rh0Var);
        }
        h85 h85Var = (h85) k15Var.c(h85.b);
        return (h85Var != null ? h85Var.a : i85.b).a(rh0Var, qh0Var);
    }
}
