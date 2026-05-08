package defpackage;

import defpackage.ke8;
import defpackage.z4d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class o04 implements gu5 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ o04(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                v04 v04Var = (v04) obj;
                h04 h04Var = v04Var.a0;
                List<w4c> listL0 = v04Var.e.l0();
                listL0.getClass();
                ArrayList<w4c> arrayList = new ArrayList();
                for (Object obj2 : listL0) {
                    if (ch5.n.c(((w4c) obj2).B()).booleanValue()) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(t92.r0(arrayList, 10));
                for (w4c w4cVar : arrayList) {
                    gn9 gn9Var = h04Var.i;
                    w4cVar.getClass();
                    arrayList2.add(gn9Var.d(w4cVar, false));
                }
                return z92.h1(z92.h1(arrayList2, u63.b0(v04Var.C())), h04Var.a.n.e(v04Var));
            case 1:
                Collection collectionA = z4d.a.a(((ke8.a) obj).b().T(), null, 3);
                ArrayList<aj3> arrayList3 = new ArrayList();
                for (Object obj3 : collectionA) {
                    if (!yz3.m((aj3) obj3)) {
                        arrayList3.add(obj3);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                for (aj3 aj3Var : arrayList3) {
                    t52 t52Var = aj3Var instanceof t52 ? (t52) aj3Var : null;
                    Class<?> clsJ = t52Var != null ? akg.j(t52Var) : null;
                    ke8 ke8Var = clsJ != null ? new ke8(clsJ) : null;
                    if (ke8Var != null) {
                        arrayList4.add(ke8Var);
                    }
                }
                return arrayList4;
            case 2:
                return ((uf8) obj).D();
            default:
                Collection collectionS = ((gp8) obj).o.s();
                ArrayList arrayList5 = new ArrayList();
                for (Object obj4 : collectionS) {
                    if (((bv7) obj4).q()) {
                        arrayList5.add(obj4);
                    }
                }
                int iV = kc9.V(t92.r0(arrayList5, 10));
                if (iV < 16) {
                    iV = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iV);
                for (Object obj5 : arrayList5) {
                    linkedHashMap.put(((bv7) obj5).getName(), obj5);
                }
                return linkedHashMap;
        }
    }
}
