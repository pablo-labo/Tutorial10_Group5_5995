package defpackage;

import defpackage.aj8;
import defpackage.bj8;
import defpackage.hv1;
import defpackage.ixa;
import java.util.Collection;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class iz3 {
    public static final iz3 a = new iz3();

    public static qne c(fv1 fv1Var) {
        while (fv1Var instanceof hv1) {
            hv1 hv1Var = (hv1) fv1Var;
            if (hv1Var.f() != hv1.a.b) {
                break;
            }
            Collection<? extends hv1> collectionM = hv1Var.m();
            collectionM.getClass();
            fv1Var = (hv1) z92.l1(collectionM);
            if (fv1Var == null) {
                return null;
            }
        }
        return fv1Var.g();
    }

    public final boolean a(aj3 aj3Var, aj3 aj3Var2, boolean z) {
        if ((aj3Var instanceof t52) && (aj3Var2 instanceof t52)) {
            return wl7.b(((t52) aj3Var).j(), ((t52) aj3Var2).j());
        }
        if ((aj3Var instanceof rxf) && (aj3Var2 instanceof rxf)) {
            return b((rxf) aj3Var, (rxf) aj3Var2, z, gz3.a);
        }
        if (!(aj3Var instanceof fv1) || !(aj3Var2 instanceof fv1)) {
            return ((aj3Var instanceof lya) && (aj3Var2 instanceof lya)) ? wl7.b(((lya) aj3Var).h(), ((lya) aj3Var2).h()) : wl7.b(aj3Var, aj3Var2);
        }
        fv1 fv1Var = (fv1) aj3Var;
        fv1 fv1Var2 = (fv1) aj3Var2;
        bj8.a aVar = bj8.a.b;
        aVar.getClass();
        if (!fv1Var.equals(fv1Var2)) {
            if (wl7.b(fv1Var.getName(), fv1Var2.getName()) && ((!(fv1Var instanceof zm9) || !(fv1Var2 instanceof zm9) || ((zm9) fv1Var).i0() == ((zm9) fv1Var2).i0()) && ((!wl7.b(fv1Var.d(), fv1Var2.d()) || (z && wl7.b(c(fv1Var), c(fv1Var2)))) && !yz3.o(fv1Var) && !yz3.o(fv1Var2)))) {
                aj3 aj3VarD = fv1Var.d();
                aj3 aj3VarD2 = fv1Var2.d();
                if (((aj3VarD instanceof hv1) || (aj3VarD2 instanceof hv1)) ? false : a(aj3VarD, aj3VarD2, z)) {
                    ixa ixaVar = new ixa(new hz3(fv1Var, fv1Var2, z), aVar, aj8.a.d);
                    ixa.b.a aVar2 = ixaVar.m(fv1Var, fv1Var2, null, true).a;
                    ixa.b.a aVar3 = ixa.b.a.a;
                    if (aVar2 != aVar3 || ixaVar.m(fv1Var2, fv1Var, null, true).a != aVar3) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean b(rxf rxfVar, rxf rxfVar2, boolean z, Function2<? super aj3, ? super aj3, Boolean> function2) {
        rxfVar.getClass();
        rxfVar2.getClass();
        if (rxfVar.equals(rxfVar2)) {
            return true;
        }
        if (wl7.b(rxfVar.d(), rxfVar2.d())) {
            return false;
        }
        aj3 aj3VarD = rxfVar.d();
        aj3 aj3VarD2 = rxfVar2.d();
        return (((aj3VarD instanceof hv1) || (aj3VarD2 instanceof hv1)) ? function2.invoke(aj3VarD, aj3VarD2).booleanValue() : a(aj3VarD, aj3VarD2, z)) && rxfVar.getIndex() == rxfVar2.getIndex();
    }
}
