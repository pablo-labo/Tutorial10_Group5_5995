package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class u1i extends p1i {
    public static final Class<?> c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    @Override // defpackage.p1i
    public final void a(Object obj, long j, Object obj2) {
        List list;
        List list2;
        List list3 = (List) r8i.l(obj2, j);
        int size = list3.size();
        List list4 = (List) r8i.l(obj, j);
        if (list4.isEmpty()) {
            List l1iVar = list4 instanceof q1i ? new l1i(size) : ((list4 instanceof b5i) && (list4 instanceof e0i)) ? ((e0i) list4).zza(size) : new ArrayList(size);
            r8i.d(obj, j, l1iVar);
            list2 = l1iVar;
        } else {
            if (c.isAssignableFrom(list4.getClass())) {
                ArrayList arrayList = new ArrayList(list4.size() + size);
                arrayList.addAll(list4);
                r8i.d(obj, j, arrayList);
                list = arrayList;
            } else if (list4 instanceof d8i) {
                d8i d8iVar = (d8i) list4;
                l1i l1iVar2 = new l1i(d8iVar.a.size() + size);
                l1iVar2.addAll(d8iVar);
                r8i.d(obj, j, l1iVar2);
                list = l1iVar2;
            } else {
                boolean z = list4 instanceof b5i;
                list2 = list4;
                if (z) {
                    boolean z2 = list4 instanceof e0i;
                    list2 = list4;
                    if (z2) {
                        e0i e0iVar = (e0i) list4;
                        list2 = list4;
                        if (!e0iVar.zza()) {
                            e0i e0iVarZza = e0iVar.zza(list4.size() + size);
                            r8i.d(obj, j, e0iVarZza);
                            list2 = e0iVarZza;
                        }
                    }
                }
            }
            list2 = list;
        }
        int size2 = list2.size();
        int size3 = list3.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list3);
        }
        if (size2 > 0) {
            list3 = list2;
        }
        r8i.d(obj, j, list3);
    }

    @Override // defpackage.p1i
    public final void b(Object obj, long j) {
        Object objUnmodifiableList;
        List list = (List) r8i.l(obj, j);
        if (list instanceof q1i) {
            objUnmodifiableList = ((q1i) list).zze();
        } else {
            if (c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof b5i) && (list instanceof e0i)) {
                e0i e0iVar = (e0i) list;
                if (e0iVar.zza()) {
                    e0iVar.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        r8i.d(obj, j, objUnmodifiableList);
    }
}
