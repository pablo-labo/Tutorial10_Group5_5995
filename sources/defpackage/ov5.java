package defpackage;

import defpackage.d04;
import defpackage.hv1;
import defpackage.lf0;
import defpackage.mv5;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: loaded from: classes3.dex */
public final class ov5 extends tfe {

    public static final class a {
        public static ov5 a(hv5 hv5Var, boolean z) {
            String lowerCase;
            hv5Var.getClass();
            List<rxf> list = hv5Var.Z;
            ov5 ov5Var = new ov5(hv5Var, null, hv1.a.a, z);
            hsc hscVarJ0 = hv5Var.J0();
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((rxf) obj).z() != ylg.IN_VARIANCE) {
                    break;
                }
                arrayList.add(obj);
            }
            na7 na7VarG1 = z92.G1(arrayList);
            ArrayList arrayList2 = new ArrayList(t92.r0(na7VarG1, 10));
            Iterator it = na7VarG1.iterator();
            while (true) {
                oa7 oa7Var = (oa7) it;
                if (!oa7Var.a.hasNext()) {
                    mge mgeVarO = ((rxf) z92.Y0(list)).o();
                    ax9 ax9Var = ax9.e;
                    d04.h hVar = d04.e;
                    zr4 zr4Var = zr4.a;
                    ov5Var.P0(null, hscVarJ0, zr4Var, zr4Var, arrayList2, mgeVarO, ax9Var, hVar);
                    ov5 ov5Var2 = ov5Var;
                    ov5Var2.m0 = true;
                    return ov5Var2;
                }
                ma7 ma7Var = (ma7) oa7Var.next();
                int i = ma7Var.a;
                rxf rxfVar = (rxf) ma7Var.b;
                String strC = rxfVar.getName().c();
                strC.getClass();
                if (strC.equals("T")) {
                    lowerCase = "instance";
                } else if (strC.equals("E")) {
                    lowerCase = "receiver";
                } else {
                    lowerCase = strC.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                }
                ov5 ov5Var3 = ov5Var;
                n8a n8aVarH = n8a.h(lowerCase);
                mge mgeVarO2 = rxfVar.o();
                mgeVarO2.getClass();
                arrayList2.add(new slg(ov5Var3, null, i, lf0.a.a, n8aVarH, mgeVarO2, false, false, false, null, qne.p));
                ov5Var = ov5Var3;
            }
        }
    }

    public ov5(aj3 aj3Var, ov5 ov5Var, hv1.a aVar, boolean z) {
        super(aj3Var, ov5Var, lf0.a.a, bva.g, aVar, qne.p);
        this.b0 = true;
        this.k0 = z;
        this.l0 = false;
    }

    @Override // defpackage.mv5, defpackage.kv5
    public final boolean B() {
        return false;
    }

    @Override // defpackage.tfe, defpackage.mv5
    public final mv5 M0(lf0 lf0Var, hv1.a aVar, aj3 aj3Var, kv5 kv5Var, n8a n8aVar, qne qneVar) {
        aj3Var.getClass();
        aVar.getClass();
        lf0Var.getClass();
        return new ov5(aj3Var, (ov5) kv5Var, aVar, this.k0);
    }

    @Override // defpackage.mv5
    public final mv5 N0(mv5.a aVar) {
        n8a n8aVar;
        ov5 ov5Var = (ov5) super.N0(aVar);
        if (ov5Var == null) {
            return null;
        }
        List<rlg> listI = ov5Var.i();
        listI.getClass();
        List<rlg> list = listI;
        if ((list instanceof Collection) && list.isEmpty()) {
            return ov5Var;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ui8 type = ((rlg) it.next()).getType();
            type.getClass();
            if (tv5.c(type) != null) {
                List<rlg> listI2 = ov5Var.i();
                listI2.getClass();
                List<rlg> list2 = listI2;
                ArrayList arrayList = new ArrayList(t92.r0(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    ui8 type2 = ((rlg) it2.next()).getType();
                    type2.getClass();
                    arrayList.add(tv5.c(type2));
                }
                int size = ov5Var.i().size() - arrayList.size();
                boolean z = true;
                if (size == 0) {
                    List<rlg> listI3 = ov5Var.i();
                    listI3.getClass();
                    ArrayList<Pair> arrayListH1 = z92.H1(arrayList, listI3);
                    if (arrayListH1.isEmpty()) {
                        return ov5Var;
                    }
                    for (Pair pair : arrayListH1) {
                        if (!wl7.b((n8a) pair.a(), ((rlg) pair.b()).getName())) {
                        }
                    }
                    return ov5Var;
                }
                List<rlg> listI4 = ov5Var.i();
                listI4.getClass();
                List<rlg> list3 = listI4;
                ArrayList arrayList2 = new ArrayList(t92.r0(list3, 10));
                for (rlg rlgVar : list3) {
                    n8a name = rlgVar.getName();
                    name.getClass();
                    int index = rlgVar.getIndex();
                    int i = index - size;
                    if (i >= 0 && (n8aVar = (n8a) arrayList.get(i)) != null) {
                        name = n8aVar;
                    }
                    arrayList2.add(rlgVar.G(ov5Var, name, index));
                }
                mv5.a aVarQ0 = ov5Var.Q0(TypeSubstitutor.b);
                if (arrayList.isEmpty()) {
                    z = false;
                } else {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        if (((n8a) it3.next()) == null) {
                            break;
                        }
                    }
                    z = false;
                }
                aVarQ0.v = Boolean.valueOf(z);
                aVarQ0.g = arrayList2;
                aVarQ0.e = ov5Var.a();
                mv5 mv5VarN0 = super.N0(aVarQ0);
                mv5VarN0.getClass();
                return mv5VarN0;
            }
        }
        return ov5Var;
    }

    @Override // defpackage.mv5, defpackage.zm9
    public final boolean isExternal() {
        return false;
    }

    @Override // defpackage.mv5, defpackage.kv5
    public final boolean isInline() {
        return false;
    }
}
