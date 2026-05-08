package defpackage;

import defpackage.pua;

/* JADX INFO: loaded from: classes.dex */
public final class lo3 implements qh0 {
    public final iy8 a;
    public final int b;

    public lo3(iy8 iy8Var, int i) {
        this.a = iy8Var;
        this.b = i;
    }

    @Override // defpackage.qh0
    public final <D extends pua.a> vi5<sh0<D>> a(rh0<D> rh0Var) {
        rh0Var.getClass();
        iy8 iy8Var = this.a;
        int iA = iy8Var.a();
        int i = this.b;
        if (i < iA) {
            return ((ph0) iy8Var.get(i)).a(rh0Var, new lo3(iy8Var, i + 1));
        }
        r6.g("Check failed.");
        return null;
    }
}
