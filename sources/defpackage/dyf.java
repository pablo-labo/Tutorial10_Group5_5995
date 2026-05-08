package defpackage;

import defpackage.lf0;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class dyf {
    public static final mge a(ui8 ui8Var) {
        ui8Var.getClass();
        p7g p7gVarP0 = ui8Var.P0();
        mge mgeVar = p7gVarP0 instanceof mge ? (mge) p7gVarP0 : null;
        if (mgeVar != null) {
            return mgeVar;
        }
        ja.i(ui8Var, "This is should be simple type: ");
        return null;
    }

    public static final mge b(mge mgeVar, List<? extends wxf> list, gwf gwfVar) {
        mgeVar.getClass();
        list.getClass();
        gwfVar.getClass();
        if (list.isEmpty() && gwfVar == mgeVar.L0()) {
            return mgeVar;
        }
        if (list.isEmpty()) {
            return mgeVar.S0(gwfVar);
        }
        if (!(mgeVar instanceof hx4)) {
            return yi8.c(gwfVar, mgeVar.M0(), list, mgeVar.N0(), null);
        }
        hx4 hx4Var = (hx4) mgeVar;
        kwf kwfVar = hx4Var.b;
        in9 in9Var = hx4Var.c;
        kx4 kx4Var = hx4Var.d;
        boolean z = hx4Var.f;
        String[] strArr = hx4Var.V;
        return new hx4(kwfVar, in9Var, kx4Var, list, z, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static ui8 c(ui8 ui8Var, List list, lf0 lf0Var, int i) {
        if ((i & 2) != 0) {
            lf0Var = ui8Var.getAnnotations();
        }
        ui8Var.getClass();
        if ((list.isEmpty() || list == ui8Var.K0()) && lf0Var == ui8Var.getAnnotations()) {
            return ui8Var;
        }
        gwf gwfVarL0 = ui8Var.L0();
        if ((lf0Var instanceof xb5) && ((xb5) lf0Var).isEmpty()) {
            lf0Var = lf0.a.a;
        }
        gwf gwfVarC = hwf.c(gwfVarL0, lf0Var);
        p7g p7gVarP0 = ui8Var.P0();
        if (p7gVarP0 instanceof jh5) {
            jh5 jh5Var = (jh5) p7gVarP0;
            return yi8.a(b(jh5Var.b, list, gwfVarC), b(jh5Var.c, list, gwfVarC));
        }
        if (p7gVarP0 instanceof mge) {
            return b((mge) p7gVarP0, list, gwfVarC);
        }
        l.g();
        return null;
    }

    public static /* synthetic */ mge d(mge mgeVar, List list, gwf gwfVar, int i) {
        if ((i & 1) != 0) {
            list = mgeVar.K0();
        }
        if ((i & 2) != 0) {
            gwfVar = mgeVar.L0();
        }
        return b(mgeVar, list, gwfVar);
    }
}
