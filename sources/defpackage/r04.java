package defpackage;

import defpackage.lf0;
import defpackage.xf8;
import defpackage.z4d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class r04 implements gu5 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ r04(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [zr4] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.ArrayList] */
    @Override // defpackage.gu5
    public final Object invoke() {
        ?? arrayList;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return (ArrayList) obj;
            case 1:
                h96 h96Var = (h96) obj;
                List<kv5> listH = h96Var.h();
                List<kv5> list = listH;
                ArrayList arrayList2 = new ArrayList(3);
                Collection<ui8> collectionB = h96Var.b.j().b();
                collectionB.getClass();
                ArrayList arrayList3 = new ArrayList();
                Iterator it = collectionB.iterator();
                while (it.hasNext()) {
                    w92.w0(arrayList3, z4d.a.a(((ui8) it.next()).n(), null, 3));
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : arrayList3) {
                    if (obj2 instanceof hv1) {
                        arrayList4.add(obj2);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj3 : arrayList4) {
                    n8a name = ((hv1) obj3).getName();
                    Object arrayList5 = linkedHashMap.get(name);
                    if (arrayList5 == null) {
                        arrayList5 = new ArrayList();
                        linkedHashMap.put(name, arrayList5);
                    }
                    ((List) arrayList5).add(obj3);
                }
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    Object key = entry.getKey();
                    key.getClass();
                    n8a n8aVar = (n8a) key;
                    List list2 = (List) entry.getValue();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Object obj4 : list2) {
                        Boolean boolValueOf = Boolean.valueOf(((hv1) obj4) instanceof kv5);
                        Object arrayList6 = linkedHashMap2.get(boolValueOf);
                        if (arrayList6 == null) {
                            arrayList6 = new ArrayList();
                            linkedHashMap2.put(boolValueOf, arrayList6);
                        }
                        ((List) arrayList6).add(obj4);
                    }
                    for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                        boolean zBooleanValue = ((Boolean) entry2.getKey()).booleanValue();
                        List list3 = (List) entry2.getValue();
                        ixa ixaVar = ixa.e;
                        List list4 = list3;
                        if (zBooleanValue) {
                            arrayList = new ArrayList();
                            for (Object obj5 : listH) {
                                if (wl7.b(((kv5) obj5).getName(), n8aVar)) {
                                    arrayList.add(obj5);
                                }
                            }
                        } else {
                            arrayList = zr4.a;
                        }
                        ixaVar.h(n8aVar, list4, (Collection) arrayList, h96Var.b, new g96(arrayList2, h96Var));
                    }
                }
                return z92.h1(list, r03.i(arrayList2));
            case 2:
                wd8 wd8Var = (wd8) obj;
                ui8 returnType = wd8Var.z().getReturnType();
                returnType.getClass();
                return new cg8(returnType, new qc8(wd8Var, 1));
            default:
                xf8.b bVar = (xf8.b) obj;
                g4c g4cVarC = bVar.E().z().c();
                return g4cVarC == null ? jz3.c(bVar.E().z(), lf0.a.a) : g4cVarC;
        }
    }
}
