package defpackage;

import defpackage.cng;
import defpackage.j29;
import defpackage.nwf;
import defpackage.vxf;
import defpackage.y52;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: loaded from: classes3.dex */
public final class x52 implements Function1 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ x52(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object next;
        h04 h04Var;
        t52 v04Var;
        wxf wxfVarG;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                y52 y52Var = (y52) obj2;
                y52.a aVar = (y52.a) obj;
                aVar.getClass();
                a62 a62Var = aVar.a;
                g04 g04Var = y52Var.a;
                Iterator<v52> it = g04Var.k.iterator();
                while (true) {
                    if (it.hasNext()) {
                        v04Var = it.next().a(a62Var);
                        if (v04Var != null) {
                        }
                    } else {
                        if (y52.c.contains(a62Var)) {
                            return null;
                        }
                        o52 o52VarO = aVar.b;
                        if (o52VarO == null && (o52VarO = g04Var.d.o(a62Var)) == null) {
                            return null;
                        }
                        o8a o8aVar = o52VarO.a;
                        u4c u4cVar = o52VarO.b;
                        xf1 xf1Var = o52VarO.c;
                        qne qneVar = o52VarO.d;
                        a62 a62VarE = a62Var.e();
                        if (a62VarE != null) {
                            t52 t52Var = (t52) y52Var.b.invoke(new y52.a(a62VarE, null));
                            v04 v04Var2 = t52Var instanceof v04 ? (v04) t52Var : null;
                            if (v04Var2 == null) {
                                return null;
                            }
                            if (!v04Var2.K0().m().contains(a62Var.f())) {
                                return null;
                            }
                            h04Var = v04Var2.a0;
                        } else {
                            Iterator it2 = boa.I(g04Var.f, a62Var.a).iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    lya lyaVar = (lya) next;
                                    if (lyaVar instanceof o14) {
                                        if (((j14) ((o14) lyaVar).n()).m().contains(a62Var.f())) {
                                        }
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            lya lyaVar2 = (lya) next;
                            if (lyaVar2 == null) {
                                return null;
                            }
                            m5c m5cVarJ0 = u4cVar.J0();
                            m5cVarJ0.getClass();
                            hyf hyfVar = new hyf(m5cVarJ0);
                            cng cngVar = cng.b;
                            p5c p5cVarK0 = u4cVar.K0();
                            p5cVarK0.getClass();
                            cng cngVarA = cng.a.a(p5cVarK0);
                            o8aVar.getClass();
                            xf1Var.getClass();
                            h04Var = new h04(g04Var, o8aVar, lyaVar2, hyfVar, cngVarA, xf1Var, null, null, zr4.a);
                        }
                        v04Var = new v04(h04Var, u4cVar, o8aVar, xf1Var, qneVar);
                    }
                }
                return v04Var;
            case 1:
                qp8 qp8Var = (qp8) obj2;
                n8a n8aVar = (n8a) obj;
                n8aVar.getClass();
                LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) ((j29.k) qp8Var.f).invoke(n8aVar));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj3 : linkedHashSet) {
                    String strA = vs9.a((sfe) obj3, 2);
                    Object arrayList = linkedHashMap.get(strA);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(strA, arrayList);
                    }
                    ((List) arrayList).add(obj3);
                }
                for (List list : linkedHashMap.values()) {
                    if (list.size() != 1) {
                        List list2 = list;
                        Collection collectionA = kxa.a(list2, tu1.c);
                        linkedHashSet.removeAll(list2);
                        linkedHashSet.addAll(collectionA);
                    }
                }
                qp8Var.m(linkedHashSet, n8aVar);
                mp8 mp8Var = qp8Var.b;
                return z92.z1(mp8Var.a.r.c(mp8Var, linkedHashSet));
            default:
                vxf vxfVar = (vxf) obj2;
                vxf.a aVar2 = (vxf.a) obj;
                rxf rxfVar = aVar2.a;
                lw7 lw7Var = aVar2.b;
                Set<rxf> setB = lw7Var.b();
                if (setB != null && setB.contains(rxfVar.a())) {
                    return vxfVar.a(lw7Var);
                }
                mge mgeVarO = rxfVar.o();
                mgeVarO.getClass();
                LinkedHashSet<rxf> linkedHashSet2 = new LinkedHashSet();
                boa.q(mgeVarO, mgeVarO, linkedHashSet2, setB);
                int iV = kc9.V(t92.r0(linkedHashSet2, 10));
                if (iV < 16) {
                    iV = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iV);
                for (rxf rxfVar2 : linkedHashSet2) {
                    if (setB == null || !setB.contains(rxfVar2)) {
                        beb bebVar = vxfVar.a;
                        rxfVar.getClass();
                        Set<rxf> set = lw7Var.f;
                        wxfVarG = bebVar.g(rxfVar2, lw7Var, vxfVar, vxfVar.b(rxfVar2, lw7.a(lw7Var, null, false, set != null ? bbe.p(set, rxfVar) : pi3.k(rxfVar), null, 47)));
                    } else {
                        wxfVarG = kyf.k(rxfVar2, lw7Var);
                    }
                    Pair pair = new Pair(rxfVar2.j(), wxfVarG);
                    linkedHashMap2.put(pair.d(), pair.e());
                }
                nwf.a aVar3 = nwf.b;
                TypeSubstitutor typeSubstitutorE = TypeSubstitutor.e(new mwf(linkedHashMap2));
                List<ui8> upperBounds = rxfVar.getUpperBounds();
                upperBounds.getClass();
                fae faeVarC = vxfVar.c(typeSubstitutorE, upperBounds, lw7Var);
                if (faeVarC.isEmpty()) {
                    return vxfVar.a(lw7Var);
                }
                if (faeVarC.a() == 1) {
                    return (ui8) z92.j1(faeVarC);
                }
                l5.q("Should only be one computed upper bound if no need to intersect all bounds");
                return null;
        }
    }
}
