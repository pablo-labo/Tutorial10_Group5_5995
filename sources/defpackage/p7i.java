package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class p7i extends k7i {
    public static final Class<?> c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public static List d(Object obj, int i, long j) {
        List list = (List) rdi.l(obj, j);
        if (list.isEmpty()) {
            List t6iVar = list instanceof q6i ? new t6i(i) : ((list instanceof rai) && (list instanceof s5i)) ? ((s5i) list).b0(i) : new ArrayList(i);
            rdi.d(obj, j, t6iVar);
            return t6iVar;
        }
        if (c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            rdi.d(obj, j, arrayList);
            return arrayList;
        }
        if (list instanceof qdi) {
            qdi qdiVar = (qdi) list;
            t6i t6iVar2 = new t6i(qdiVar.a.size() + i);
            t6iVar2.addAll(qdiVar);
            rdi.d(obj, j, t6iVar2);
            return t6iVar2;
        }
        if ((list instanceof rai) && (list instanceof s5i)) {
            s5i s5iVar = (s5i) list;
            if (!s5iVar.Q()) {
                s5i s5iVarB0 = s5iVar.b0(list.size() + i);
                rdi.d(obj, j, s5iVarB0);
                return s5iVarB0;
            }
        }
        return list;
    }

    @Override // defpackage.k7i
    public final <L> List<L> a(Object obj, long j) {
        return d(obj, 10, j);
    }

    @Override // defpackage.k7i
    public final void b(Object obj, long j, Object obj2) {
        List list = (List) rdi.l(obj2, j);
        List listD = d(obj, list.size(), j);
        int size = listD.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listD.addAll(list);
        }
        if (size > 0) {
            list = listD;
        }
        rdi.d(obj, j, list);
    }

    @Override // defpackage.k7i
    public final void c(Object obj, long j) {
        Object objUnmodifiableList;
        List list = (List) rdi.l(obj, j);
        if (list instanceof q6i) {
            objUnmodifiableList = ((q6i) list).d1();
        } else {
            if (c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof rai) && (list instanceof s5i)) {
                s5i s5iVar = (s5i) list;
                if (s5iVar.Q()) {
                    s5iVar.W();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        rdi.d(obj, j, objUnmodifiableList);
    }
}
