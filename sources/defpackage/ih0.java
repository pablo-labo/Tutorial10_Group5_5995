package defpackage;

import defpackage.k15;
import defpackage.pua;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ih0 implements ph0, uh0 {
    public final fl3 a;

    public ih0(fl3 fl3Var) {
        this.a = fl3Var;
    }

    @Override // defpackage.ph0
    public final <D extends pua.a> vi5<sh0<D>> a(rh0<D> rh0Var, qh0 qh0Var) {
        rh0Var.getClass();
        k15 k15Var = rh0Var.c;
        qh0Var.getClass();
        pua<D> puaVar = rh0Var.a;
        if (puaVar instanceof p4a) {
            k15.a aVarC = k15Var.c(lb3.f);
            aVarC.getClass();
            return new kjd(new dh0(rh0Var, this, (lb3) aVarC, qh0Var, null));
        }
        if (!(puaVar instanceof c9c)) {
            ja.i(puaVar, "Unknown operation ");
            return null;
        }
        k15.a aVarC2 = k15Var.c(lb3.f);
        aVarC2.getClass();
        return new kjd(new eh0(((d85) k15Var.c(d85.a)) != null, this, rh0Var, (lb3) aVarC2, qh0Var, null));
    }

    public final Object b(rh0 rh0Var, sh0 sh0Var, lb3 lb3Var, Set set, pu2 pu2Var) {
        rh0Var.getClass();
        k15 k15Var = rh0Var.c;
        if (((e84) k15Var.c(e84.a)) == null && sh0Var.c != 0) {
            if (sh0Var.b()) {
                return j6g.a;
            }
            fh0 fh0Var = new fh0(sh0Var, rh0Var, this, lb3Var, set, null);
            Object objInvoke = fh0Var.invoke(pu2Var);
            g13 g13Var = g13.a;
            if (objInvoke != g13Var) {
                objInvoke = j6g.a;
            }
            return objInvoke == g13Var ? objInvoke : j6g.a;
        }
        return j6g.a;
    }
}
