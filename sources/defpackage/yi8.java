package defpackage;

import defpackage.lxf;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class yi8 {
    public static final p7g a(mge mgeVar, mge mgeVar2) {
        mgeVar.getClass();
        mgeVar2.getClass();
        return mgeVar.equals(mgeVar2) ? mgeVar : new lh5(mgeVar, mgeVar2);
    }

    public static final mge b(gwf gwfVar, t52 t52Var, List<? extends wxf> list) {
        gwfVar.getClass();
        t52Var.getClass();
        list.getClass();
        kwf kwfVarJ = t52Var.j();
        kwfVarJ.getClass();
        return c(gwfVar, kwfVarJ, list, false, null);
    }

    public static final mge c(gwf gwfVar, kwf kwfVar, List<? extends wxf> list, boolean z, bj8 bj8Var) {
        in9 in9VarA;
        tx9 tx9Var;
        gwfVar.getClass();
        kwfVar.getClass();
        list.getClass();
        if (gwfVar.isEmpty() && list.isEmpty() && !z && kwfVar.d() != null) {
            v62 v62VarD = kwfVar.d();
            v62VarD.getClass();
            mge mgeVarO = v62VarD.o();
            mgeVarO.getClass();
            return mgeVarO;
        }
        v62 v62VarD2 = kwfVar.d();
        if (v62VarD2 instanceof rxf) {
            in9VarA = ((rxf) v62VarD2).o().n();
        } else if (v62VarD2 instanceof t52) {
            if (bj8Var == null) {
                int i = b04.a;
                xx9 xx9VarD = yz3.d(v62VarD2);
                xx9VarD.getClass();
                bj8Var = b04.h(xx9VarD);
            }
            if (list.isEmpty()) {
                t52 t52Var = (t52) v62VarD2;
                bj8Var.getClass();
                tx9Var = t52Var instanceof tx9 ? (tx9) t52Var : null;
                if (tx9Var == null || (in9VarA = tx9Var.K(bj8Var)) == null) {
                    in9VarA = t52Var.W();
                    in9VarA.getClass();
                }
            } else {
                t52 t52Var2 = (t52) v62VarD2;
                byf byfVarA = nwf.b.a(kwfVar, list);
                bj8Var.getClass();
                tx9Var = t52Var2 instanceof tx9 ? (tx9) t52Var2 : null;
                if (tx9Var == null || (in9VarA = tx9Var.t(byfVarA, bj8Var)) == null) {
                    in9VarA = t52Var2.H(byfVarA);
                    in9VarA.getClass();
                }
            }
        } else if (v62VarD2 instanceof zvf) {
            in9VarA = lx4.a(xw4.SCOPE_FOR_ABBREVIATION_TYPE, true, ((zvf) v62VarD2).getName().a);
        } else {
            if (!(kwfVar instanceof kj7)) {
                throw new IllegalStateException("Unsupported classifier: " + v62VarD2 + " for constructor: " + kwfVar);
            }
            in9VarA = lxf.a.a(((kj7) kwfVar).b, "member scope for intersection type");
        }
        return e(gwfVar, kwfVar, list, z, in9VarA, new wi8(kwfVar, list, gwfVar, z));
    }

    public static final mge d(in9 in9Var, gwf gwfVar, kwf kwfVar, List list, boolean z) {
        gwfVar.getClass();
        kwfVar.getClass();
        list.getClass();
        in9Var.getClass();
        nge ngeVar = new nge(kwfVar, list, z, in9Var, new xi8(in9Var, gwfVar, kwfVar, list, z));
        return gwfVar.isEmpty() ? ngeVar : new pge(ngeVar, gwfVar);
    }

    public static final mge e(gwf gwfVar, kwf kwfVar, List<? extends wxf> list, boolean z, in9 in9Var, Function1<? super bj8, ? extends mge> function1) {
        gwfVar.getClass();
        kwfVar.getClass();
        list.getClass();
        in9Var.getClass();
        nge ngeVar = new nge(kwfVar, list, z, in9Var, function1);
        return gwfVar.isEmpty() ? ngeVar : new pge(ngeVar, gwfVar);
    }
}
