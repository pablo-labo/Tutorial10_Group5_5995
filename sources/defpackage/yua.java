package defpackage;

import defpackage.ere;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class yua implements Function1 {
    public static final yua a = new yua();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        mge mgeVarO;
        p7g p7gVarL;
        ui8 returnType;
        kv5 kv5Var = (kv5) obj;
        ava avaVar = ava.a;
        kv5Var.getClass();
        aj3 aj3VarD = kv5Var.d();
        aj3VarD.getClass();
        if (aj3VarD instanceof t52) {
            n8a n8aVar = ei8.e;
            if (ei8.b((t52) aj3VarD, ere.a.a)) {
                return null;
            }
        }
        Collection<? extends hv1> collectionM = kv5Var.m();
        collectionM.getClass();
        Collection<? extends hv1> collection = collectionM;
        if (!collection.isEmpty()) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                aj3 aj3VarD2 = ((kv5) it.next()).d();
                aj3VarD2.getClass();
                if (aj3VarD2 instanceof t52) {
                    n8a n8aVar2 = ei8.e;
                    if (ei8.b((t52) aj3VarD2, ere.a.a)) {
                        return null;
                    }
                }
            }
        }
        aj3 aj3VarD3 = kv5Var.d();
        t52 t52Var = aj3VarD3 instanceof t52 ? (t52) aj3VarD3 : null;
        if (t52Var != null) {
            if (!fe7.e(t52Var)) {
                t52Var = null;
            }
            if (t52Var != null && (mgeVarO = t52Var.o()) != null && (p7gVarL = boa.L(mgeVarO)) != null && (returnType = kv5Var.getReturnType()) != null && wl7.b(kv5Var.getName(), bva.d)) {
                n8a n8aVar3 = ei8.e;
                if ((ei8.C(returnType, ere.a.h) || ei8.F(returnType)) && kv5Var.i().size() == 1) {
                    ui8 type = kv5Var.i().get(0).getType();
                    type.getClass();
                    if (wl7.b(boa.L(type), p7gVarL) && kv5Var.w0().isEmpty() && kv5Var.O() == null) {
                        return null;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder("must override ''equals()'' in Any");
        aj3 aj3VarD4 = kv5Var.d();
        aj3VarD4.getClass();
        if (fe7.e(aj3VarD4)) {
            pz3 pz3Var = mz3.b;
            aj3 aj3VarD5 = kv5Var.d();
            aj3VarD5.getClass();
            mge mgeVarO2 = ((t52) aj3VarD5).o();
            mgeVarO2.getClass();
            sb.append(" or define ''equals(other: " + pz3Var.X(boa.L(mgeVarO2)) + "): Boolean''");
        }
        return sb.toString();
    }
}
