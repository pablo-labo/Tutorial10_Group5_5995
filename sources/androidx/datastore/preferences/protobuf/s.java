package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.p;
import defpackage.f7g;
import defpackage.ot8;
import defpackage.t6g;
import defpackage.zmb;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {
    public static final a a = new a();
    public static final b b = new b();

    public static final class a extends s {
        public static final Class<?> c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

        public static List d(Object obj, int i, long j) {
            List list = (List) f7g.d.i(obj, j);
            if (list.isEmpty()) {
                List rVar = list instanceof ot8 ? new r(i) : ((list instanceof zmb) && (list instanceof p.c)) ? ((p.c) list).Q0(i) : new ArrayList(i);
                f7g.o(obj, j, rVar);
                return rVar;
            }
            if (c.isAssignableFrom(list.getClass())) {
                ArrayList arrayList = new ArrayList(list.size() + i);
                arrayList.addAll(list);
                f7g.o(obj, j, arrayList);
                return arrayList;
            }
            if (list instanceof t6g) {
                t6g t6gVar = (t6g) list;
                r rVar2 = new r(t6gVar.a.size() + i);
                rVar2.addAll(t6gVar);
                f7g.o(obj, j, rVar2);
                return rVar2;
            }
            if ((list instanceof zmb) && (list instanceof p.c)) {
                p.c cVar = (p.c) list;
                if (!cVar.B0()) {
                    p.c cVarQ0 = cVar.Q0(list.size() + i);
                    f7g.o(obj, j, cVarQ0);
                    return cVarQ0;
                }
            }
            return list;
        }

        @Override // androidx.datastore.preferences.protobuf.s
        public final void a(Object obj, long j) {
            Object objUnmodifiableList;
            List list = (List) f7g.d.i(obj, j);
            if (list instanceof ot8) {
                objUnmodifiableList = ((ot8) list).v();
            } else {
                if (c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof zmb) && (list instanceof p.c)) {
                    p.c cVar = (p.c) list;
                    if (cVar.B0()) {
                        cVar.G();
                        return;
                    }
                    return;
                }
                objUnmodifiableList = Collections.unmodifiableList(list);
            }
            f7g.o(obj, j, objUnmodifiableList);
        }

        @Override // androidx.datastore.preferences.protobuf.s
        public final void b(Object obj, long j, Object obj2) {
            List list = (List) f7g.d.i(obj2, j);
            List listD = d(obj, list.size(), j);
            int size = listD.size();
            int size2 = list.size();
            if (size > 0 && size2 > 0) {
                listD.addAll(list);
            }
            if (size > 0) {
                list = listD;
            }
            f7g.o(obj, j, list);
        }

        @Override // androidx.datastore.preferences.protobuf.s
        public final <L> List<L> c(Object obj, long j) {
            return d(obj, 10, j);
        }
    }

    public static final class b extends s {
        @Override // androidx.datastore.preferences.protobuf.s
        public final void a(Object obj, long j) {
            ((p.c) f7g.d.i(obj, j)).G();
        }

        @Override // androidx.datastore.preferences.protobuf.s
        public final void b(Object obj, long j, Object obj2) {
            f7g.e eVar = f7g.d;
            p.c cVarQ0 = (p.c) eVar.i(obj, j);
            p.c cVar = (p.c) eVar.i(obj2, j);
            int size = cVarQ0.size();
            int size2 = cVar.size();
            if (size > 0 && size2 > 0) {
                if (!cVarQ0.B0()) {
                    cVarQ0 = cVarQ0.Q0(size2 + size);
                }
                cVarQ0.addAll(cVar);
            }
            if (size > 0) {
                cVar = cVarQ0;
            }
            f7g.o(obj, j, cVar);
        }

        @Override // androidx.datastore.preferences.protobuf.s
        public final <L> List<L> c(Object obj, long j) {
            p.c cVar = (p.c) f7g.d.i(obj, j);
            if (cVar.B0()) {
                return cVar;
            }
            int size = cVar.size();
            p.c cVarQ0 = cVar.Q0(size == 0 ? 10 : size * 2);
            f7g.o(obj, j, cVarQ0);
            return cVarQ0;
        }
    }

    public abstract void a(Object obj, long j);

    public abstract void b(Object obj, long j, Object obj2);

    public abstract <L> List<L> c(Object obj, long j);
}
