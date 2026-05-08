package defpackage;

import defpackage.hv1;
import defpackage.jz3;
import defpackage.lf0;
import defpackage.uf8;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class n04 implements gu5 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ n04(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        Object next;
        e04 e04Var;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                v04 v04Var = (v04) obj;
                c62 c62Var = v04Var.Z;
                if (!c62Var.a()) {
                    List<w4c> listL0 = v04Var.e.l0();
                    listL0.getClass();
                    Iterator<T> it = listL0.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            if (!ch5.n.c(((w4c) next).B()).booleanValue()) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    w4c w4cVar = (w4c) next;
                    if (w4cVar != null) {
                        return v04Var.a0.i.d(w4cVar, true);
                    }
                    return null;
                }
                jz3.a aVar = new jz3.a(v04Var, null, lf0.a.a, true, hv1.a.a, qne.p);
                List list = Collections.EMPTY_LIST;
                int i2 = yz3.a;
                if (c62Var == c62.ENUM_CLASS || c62Var.a()) {
                    e04Var = d04.a;
                    if (e04Var == null) {
                        yz3.a(49);
                        throw null;
                    }
                } else if (yz3.q(v04Var)) {
                    e04Var = d04.a;
                    if (e04Var == null) {
                        yz3.a(51);
                        throw null;
                    }
                } else if (yz3.k(v04Var)) {
                    e04Var = d04.l;
                    if (e04Var == null) {
                        yz3.a(52);
                        throw null;
                    }
                } else {
                    e04Var = d04.e;
                    if (e04Var == null) {
                        yz3.a(53);
                        throw null;
                    }
                }
                aVar.X0(list, e04Var);
                aVar.U0(v04Var.o());
                return aVar;
            case 1:
                ke8 ke8Var = (ke8) obj;
                Collection<uq2> collectionT = ke8Var.t();
                ArrayList arrayList = new ArrayList(t92.r0(collectionT, 10));
                Iterator<T> it2 = collectionT.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new ye8(ke8Var, (uq2) it2.next()));
                }
                return arrayList;
            default:
                return new uf8.a((uf8) obj);
        }
    }
}
