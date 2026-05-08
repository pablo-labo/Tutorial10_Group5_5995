package defpackage;

import androidx.navigation.e;
import defpackage.p63;
import defpackage.zaa;

/* JADX INFO: loaded from: classes.dex */
public final class iba extends e {
    public final void F(zv8 zv8Var) {
        kv8 lifecycle;
        zv8Var.getClass();
        if (zv8Var.equals(this.o)) {
            return;
        }
        zv8 zv8Var2 = this.o;
        vaa vaaVar = this.s;
        if (zv8Var2 != null && (lifecycle = zv8Var2.getLifecycle()) != null) {
            lifecycle.c(vaaVar);
        }
        this.o = zv8Var;
        zv8Var.getLifecycle().a(vaaVar);
    }

    public final void G(irg irgVar) {
        irgVar.getClass();
        zaa zaaVar = this.p;
        p63.a aVar = p63.a.b;
        aVar.getClass();
        zaa.a aVar2 = zaa.c;
        hrg hrgVar = new hrg(irgVar, aVar2, aVar);
        iwc iwcVar = fwc.a;
        yd8 yd8VarB = iwcVar.b(zaa.class);
        String strP = yd8VarB.p();
        if (strP == null) {
            l5.q("Local and anonymous classes can not be ViewModels");
            return;
        }
        if (wl7.b(zaaVar, (zaa) hrgVar.a(yd8VarB, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strP)))) {
            return;
        }
        if (!this.g.isEmpty()) {
            r6.g("ViewModelStore should be set before setGraph call");
            return;
        }
        aVar.getClass();
        hrg hrgVar2 = new hrg(irgVar, aVar2, aVar);
        yd8 yd8VarB2 = iwcVar.b(zaa.class);
        String strP2 = yd8VarB2.p();
        if (strP2 != null) {
            this.p = (zaa) hrgVar2.a(yd8VarB2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strP2));
        } else {
            l5.q("Local and anonymous classes can not be ViewModels");
        }
    }
}
