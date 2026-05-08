package defpackage;

import defpackage.hph;
import defpackage.ht0;
import defpackage.iph;
import defpackage.pph;
import defpackage.qph;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class mki {
    public final String a;
    public final boolean b;
    public final pph c;
    public final BitSet d;
    public final BitSet e;
    public final ht0 f;
    public final ht0 g;
    public final /* synthetic */ rji h;

    public mki() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public mki(rji rjiVar, String str, pph pphVar, BitSet bitSet, BitSet bitSet2, ht0 ht0Var, ht0 ht0Var2) {
        this.h = rjiVar;
        this.a = str;
        this.d = bitSet;
        this.e = bitSet2;
        this.f = ht0Var;
        this.g = new ht0();
        for (Integer num : (ht0.c) ht0Var2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) ht0Var2.get(num));
            this.g.put(num, arrayList);
        }
        this.b = false;
        this.c = pphVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final hph a(int i) {
        ArrayList arrayList;
        List list;
        hph.a aVarC = hph.C();
        if (aVarC.c) {
            aVarC.k();
            aVarC.c = false;
        }
        hph.r((hph) aVarC.b, i);
        if (aVarC.c) {
            aVarC.k();
            aVarC.c = false;
        }
        hph.t((hph) aVarC.b, this.b);
        pph pphVar = this.c;
        if (pphVar != null) {
            if (aVarC.c) {
                aVarC.k();
                aVarC.c = false;
            }
            hph.w((hph) aVarC.b, pphVar);
        }
        pph.a aVarJ = pph.J();
        ArrayList arrayListQ = nei.q(this.d);
        if (aVarJ.c) {
            aVarJ.k();
            aVarJ.c = false;
        }
        pph.z((pph) aVarJ.b, arrayListQ);
        ArrayList arrayListQ2 = nei.q(this.e);
        if (aVarJ.c) {
            aVarJ.k();
            aVarJ.c = false;
        }
        pph.u((pph) aVarJ.b, arrayListQ2);
        ht0 ht0Var = this.f;
        if (ht0Var == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(ht0Var.c);
            for (Integer num : (ht0.c) ht0Var.keySet()) {
                int iIntValue = num.intValue();
                iph.a aVarX = iph.x();
                if (aVarX.c) {
                    aVarX.k();
                    aVarX.c = false;
                }
                iph.r((iph) aVarX.b, iIntValue);
                long jLongValue = ((Long) ht0Var.get(num)).longValue();
                if (aVarX.c) {
                    aVarX.k();
                    aVarX.c = false;
                }
                iph.s((iph) aVarX.b, jLongValue);
                arrayList2.add((iph) aVarX.m());
            }
            arrayList = arrayList2;
        }
        if (aVarJ.c) {
            aVarJ.k();
            aVarJ.c = false;
        }
        pph.C((pph) aVarJ.b, arrayList);
        ht0 ht0Var2 = this.g;
        if (ht0Var2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList3 = new ArrayList(ht0Var2.c);
            for (Integer num2 : (ht0.c) ht0Var2.keySet()) {
                qph.a aVarY = qph.y();
                int iIntValue2 = num2.intValue();
                if (aVarY.c) {
                    aVarY.k();
                    aVarY.c = false;
                }
                qph.s((qph) aVarY.b, iIntValue2);
                List list2 = (List) ht0Var2.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    if (aVarY.c) {
                        aVarY.k();
                        aVarY.c = false;
                    }
                    qph.t((qph) aVarY.b, list2);
                }
                arrayList3.add((qph) aVarY.m());
            }
            list = arrayList3;
        }
        if (aVarJ.c) {
            aVarJ.k();
            aVarJ.c = false;
        }
        pph.E((pph) aVarJ.b, list);
        if (aVarC.c) {
            aVarC.k();
            aVarC.c = false;
        }
        hph.s((hph) aVarC.b, (pph) aVarJ.m());
        return (hph) aVarC.m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(zli zliVar) {
        int iA = zliVar.a();
        Boolean bool = zliVar.c;
        if (bool != null) {
            this.e.set(iA, bool.booleanValue());
        }
        Boolean bool2 = zliVar.d;
        if (bool2 != null) {
            this.d.set(iA, bool2.booleanValue());
        }
        if (zliVar.e != null) {
            Integer numValueOf = Integer.valueOf(iA);
            ht0 ht0Var = this.f;
            Long l = (Long) ht0Var.get(numValueOf);
            long jLongValue = zliVar.e.longValue() / 1000;
            if (l == null || jLongValue > l.longValue()) {
                ht0Var.put(Integer.valueOf(iA), Long.valueOf(jLongValue));
            }
        }
        if (zliVar.f != null) {
            Integer numValueOf2 = Integer.valueOf(iA);
            ht0 ht0Var2 = this.g;
            List arrayList = (List) ht0Var2.get(numValueOf2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                ht0Var2.put(Integer.valueOf(iA), arrayList);
            }
            if (zliVar.e()) {
                arrayList.clear();
            }
            eei.a();
            rji rjiVar = this.h;
            wmi wmiVar = rjiVar.a.V;
            svh<Boolean> svhVar = djh.f0;
            String str = this.a;
            if (wmiVar.k(str, svhVar) && zliVar.f()) {
                arrayList.clear();
            }
            eei.a();
            boolean zK = rjiVar.a.V.k(str, svhVar);
            Long l2 = zliVar.f;
            if (!zK) {
                arrayList.add(Long.valueOf(l2.longValue() / 1000));
                return;
            }
            long jLongValue2 = l2.longValue() / 1000;
            if (arrayList.contains(Long.valueOf(jLongValue2))) {
                return;
            }
            arrayList.add(Long.valueOf(jLongValue2));
        }
    }

    public mki(rji rjiVar, String str) {
        this.h = rjiVar;
        this.a = str;
        this.b = true;
        this.d = new BitSet();
        this.e = new BitSet();
        this.f = new ht0();
        this.g = new ht0();
    }
}
