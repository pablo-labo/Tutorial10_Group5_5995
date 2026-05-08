package defpackage;

import defpackage.c20;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class r1b {
    public static final hg9 a(ar8 ar8Var, int i, long j, q1b q1bVar, long j2, c20.c cVar, vl8 vl8Var, int i2, a3a a3aVar) {
        List list;
        Object objG = q1bVar.g(i);
        List list2 = (List) a3aVar.b(i);
        if (list2 != null) {
            list = list2;
        } else {
            List<vf9> listD = ar8Var.d(i);
            int size = listD.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList.add(listD.get(i3).R(j));
            }
            a3aVar.h(i, arrayList);
            list = arrayList;
        }
        return new hg9(i, i2, list, j2, objG, cVar, vl8Var);
    }
}
