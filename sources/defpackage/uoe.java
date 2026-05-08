package defpackage;

import defpackage.fs3;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class uoe {
    public static final p7g a(p7g p7gVar, boolean z) {
        p7gVar.getClass();
        fs3 fs3VarA = fs3.a.a(p7gVar, z);
        if (fs3VarA != null) {
            return fs3VarA;
        }
        mge mgeVarB = b(p7gVar);
        return mgeVarB != null ? mgeVarB : p7gVar.Q0(false);
    }

    public static final mge b(p7g p7gVar) {
        kj7 kj7Var;
        kwf kwfVarM0 = p7gVar.M0();
        kj7 kj7Var2 = kwfVarM0 instanceof kj7 ? (kj7) kwfVarM0 : null;
        if (kj7Var2 != null) {
            LinkedHashSet<ui8> linkedHashSet = kj7Var2.b;
            ArrayList arrayList = new ArrayList(t92.r0(linkedHashSet, 10));
            boolean z = false;
            for (ui8 ui8VarA : linkedHashSet) {
                if (kyf.e(ui8VarA)) {
                    ui8VarA = a(ui8VarA.P0(), false);
                    z = true;
                }
                arrayList.add(ui8VarA);
            }
            if (z) {
                ui8 ui8VarA2 = kj7Var2.a;
                if (ui8VarA2 == null) {
                    ui8VarA2 = null;
                } else if (kyf.e(ui8VarA2)) {
                    ui8VarA2 = a(ui8VarA2.P0(), false);
                }
                arrayList.isEmpty();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList);
                linkedHashSet2.hashCode();
                kj7Var = new kj7(linkedHashSet2);
                kj7Var.a = ui8VarA2;
            } else {
                kj7Var = null;
            }
            if (kj7Var != null) {
                return kj7Var.f();
            }
        }
        return null;
    }

    public static final mge c(mge mgeVar, mge mgeVar2) {
        mgeVar.getClass();
        mgeVar2.getClass();
        return pnb.D(mgeVar) ? mgeVar : new g0(mgeVar, mgeVar2);
    }
}
