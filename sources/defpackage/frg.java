package defpackage;

import defpackage.brg;
import defpackage.grg;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes.dex */
public final class frg<VM extends brg> implements Lazy<VM> {
    public final yd8<VM> a;
    public final gu5<irg> b;
    public final gu5<grg.c> c;
    public final gu5<p63> d;
    public VM e;

    /* JADX WARN: Multi-variable type inference failed */
    public frg(yd8<VM> yd8Var, gu5<? extends irg> gu5Var, gu5<? extends grg.c> gu5Var2, gu5<? extends p63> gu5Var3) {
        yd8Var.getClass();
        this.a = yd8Var;
        this.b = gu5Var;
        this.c = gu5Var2;
        this.d = gu5Var3;
    }

    @Override // kotlin.Lazy
    public final Object getValue() {
        VM vm = this.e;
        if (vm != null) {
            return vm;
        }
        irg irgVarInvoke = this.b.invoke();
        grg.c cVarInvoke = this.c.invoke();
        p63 p63VarInvoke = this.d.invoke();
        irgVarInvoke.getClass();
        cVarInvoke.getClass();
        p63VarInvoke.getClass();
        hrg hrgVar = new hrg(irgVarInvoke, cVarInvoke, p63VarInvoke);
        yd8<VM> yd8Var = this.a;
        yd8Var.getClass();
        String strP = yd8Var.p();
        if (strP == null) {
            l5.q("Local and anonymous classes can not be ViewModels");
            return null;
        }
        VM vm2 = (VM) hrgVar.a(yd8Var, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strP));
        this.e = vm2;
        return vm2;
    }
}
