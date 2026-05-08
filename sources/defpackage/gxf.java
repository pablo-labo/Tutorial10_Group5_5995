package defpackage;

import defpackage.gwf;
import defpackage.j5c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class gxf {
    public final h04 a;
    public final gxf b;
    public final String c;
    public final String d;
    public final on9 e;
    public final on9 f;
    public final Map<Integer, rxf> g;

    public /* synthetic */ class a extends l4c {
        public static final a a = new a(a62.class, "outerClassId", "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;", 0);

        @Override // defpackage.l4c, defpackage.tf8
        public final Object get(Object obj) {
            return ((a62) obj).e();
        }
    }

    public gxf(h04 h04Var, gxf gxfVar, List<l5c> list, String str, String str2) {
        Map<Integer, rxf> linkedHashMap;
        this.a = h04Var;
        this.b = gxfVar;
        this.c = str;
        this.d = str2;
        j29 j29Var = h04Var.a.a;
        this.e = j29Var.d(new o0(this, 4));
        this.f = j29Var.d(new s4(this, 2));
        if (list.isEmpty()) {
            linkedHashMap = bs4.a;
        } else {
            linkedHashMap = new LinkedHashMap<>();
            int i = 0;
            for (l5c l5cVar : list) {
                linkedHashMap.put(Integer.valueOf(l5cVar.C()), new u14(this.a, l5cVar, i));
                i++;
            }
        }
        this.g = linkedHashMap;
    }

    public static mge a(mge mgeVar, ui8 ui8Var) {
        ei8 ei8VarT = boa.t(mgeVar);
        lf0 annotations = mgeVar.getAnnotations();
        ui8 ui8VarF = tv5.f(mgeVar);
        List<ui8> listD = tv5.d(mgeVar);
        List listK0 = z92.K0(1, tv5.g(mgeVar));
        ArrayList arrayList = new ArrayList(t92.r0(listK0, 10));
        Iterator it = listK0.iterator();
        while (it.hasNext()) {
            arrayList.add(((wxf) it.next()).getType());
        }
        return tv5.b(ei8VarT, annotations, ui8VarF, listD, arrayList, ui8Var, true).Q0(mgeVar.N0());
    }

    public static final ArrayList e(j5c j5cVar, gxf gxfVar) {
        List<j5c.b> listM = j5cVar.M();
        listM.getClass();
        List<j5c.b> list = listM;
        j5c j5cVarA = y5c.a(j5cVar, gxfVar.a.d);
        Iterable iterableE = j5cVarA != null ? e(j5cVarA, gxfVar) : null;
        if (iterableE == null) {
            iterableE = zr4.a;
        }
        return z92.h1(list, iterableE);
    }

    public static gwf f(List list, lf0 lf0Var, kwf kwfVar, aj3 aj3Var) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(t92.r0(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((fwf) it.next()).a(lf0Var));
        }
        ArrayList arrayListS0 = t92.s0(arrayList);
        gwf.b.getClass();
        return gwf.a.e(arrayListS0);
    }

    public static final t52 h(gxf gxfVar, j5c j5cVar, int i) {
        h04 h04Var = gxfVar.a;
        a62 a62VarA = q8a.a(h04Var.b, i);
        r6e<j5c> r6eVarO = v6e.O(j5cVar, new oz3(gxfVar, 2));
        ArrayList arrayList = new ArrayList();
        for (j5c j5cVar2 : r6eVarO) {
            j5cVar2.getClass();
            arrayList.add(Integer.valueOf(j5cVar2.L()));
        }
        int iP = a7e.P(v6e.O(a62VarA, a.a));
        while (arrayList.size() < iP) {
            arrayList.add(0);
        }
        return h04Var.a.l.a(a62VarA, arrayList);
    }

    public final List<rxf> b() {
        return z92.z1(this.g.values());
    }

    public final rxf c(int i) {
        rxf rxfVar = this.g.get(Integer.valueOf(i));
        if (rxfVar != null) {
            return rxfVar;
        }
        gxf gxfVar = this.b;
        if (gxfVar != null) {
            return gxfVar.c(i);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03e8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.mge d(defpackage.j5c r26, boolean r27) {
        /*
            Method dump skipped, instruction units count: 1001
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gxf.d(j5c, boolean):mge");
    }

    public final ui8 g(j5c j5cVar) {
        j5cVar.getClass();
        if (!j5cVar.c0()) {
            return d(j5cVar, true);
        }
        h04 h04Var = this.a;
        String string = h04Var.b.getString(j5cVar.P());
        mge mgeVarD = d(j5cVar, true);
        j5c j5cVarQ = j5cVar.d0() ? j5cVar.Q() : j5cVar.e0() ? h04Var.d.a(j5cVar.R()) : null;
        j5cVarQ.getClass();
        return h04Var.a.j.a(j5cVar, string, mgeVarD, d(j5cVarQ, true));
    }

    public final String toString() {
        gxf gxfVar = this.b;
        return this.c.concat(gxfVar == null ? "" : ". Child of ".concat(gxfVar.c));
    }
}
