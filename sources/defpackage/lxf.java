package defpackage;

import defpackage.in9;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class lxf extends d4 {
    public final in9 b;

    public static final class a {
        public static in9 a(Collection collection, String str) {
            collection.getClass();
            Collection collection2 = collection;
            ArrayList arrayList = new ArrayList(t92.r0(collection2, 10));
            Iterator it = collection2.iterator();
            while (it.hasNext()) {
                arrayList.add(((ui8) it.next()).n());
            }
            lke lkeVarB = aqd.b(arrayList);
            int i = lkeVarB.a;
            in9 vz1Var = i != 0 ? i != 1 ? new vz1(str, (in9[]) lkeVarB.toArray(new in9[0])) : (in9) lkeVarB.get(0) : in9.b.b;
            return lkeVarB.a <= 1 ? vz1Var : new lxf(vz1Var);
        }
    }

    public lxf(in9 in9Var) {
        this.b = in9Var;
    }

    @Override // defpackage.d4, defpackage.in9
    public final Collection b(n8a n8aVar, dia diaVar) {
        n8aVar.getClass();
        return kxa.a(super.b(n8aVar, diaVar), kxf.b);
    }

    @Override // defpackage.d4, defpackage.in9
    public final Collection<sfe> e(n8a n8aVar, dia diaVar) {
        n8aVar.getClass();
        return kxa.a(super.e(n8aVar, diaVar), tz3.d);
    }

    @Override // defpackage.d4, defpackage.z4d
    public final Collection<aj3> f(lz3 lz3Var, Function1<? super n8a, Boolean> function1) {
        lz3Var.getClass();
        Collection<aj3> collectionF = super.f(lz3Var, function1);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : collectionF) {
            if (((aj3) obj) instanceof fv1) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List list = (List) pair.a();
        List list2 = (List) pair.b();
        list.getClass();
        return z92.h1(kxa.a(list, uv5.d), list2);
    }

    @Override // defpackage.d4
    public final in9 i() {
        return this.b;
    }
}
