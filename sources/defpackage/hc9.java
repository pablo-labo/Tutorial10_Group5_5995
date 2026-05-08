package defpackage;

import defpackage.nwf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class hc9 {
    public static final mwf a(t52 t52Var, t52 t52Var2) {
        t52Var.getClass();
        t52Var2.getClass();
        t52Var.p().size();
        t52Var2.p().size();
        nwf.a aVar = nwf.b;
        List<rxf> listP = t52Var.p();
        listP.getClass();
        List<rxf> list = listP;
        ArrayList arrayList = new ArrayList(t92.r0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((rxf) it.next()).j());
        }
        List<rxf> listP2 = t52Var2.p();
        listP2.getClass();
        List<rxf> list2 = listP2;
        ArrayList arrayList2 = new ArrayList(t92.r0(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            mge mgeVarO = ((rxf) it2.next()).o();
            mgeVarO.getClass();
            arrayList2.add(new yxf(mgeVarO));
        }
        return new mwf(lc9.f0(z92.H1(arrayList, arrayList2)));
    }
}
