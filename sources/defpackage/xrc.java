package defpackage;

import defpackage.qn9;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class xrc implements nug {
    public final LinkedHashMap<qn9.b, ArrayList<a>> a = new LinkedHashMap<>();
    public int b;

    public static final class a {
        public final WeakReference<k07> a;
        public final Map<String, Object> b;
        public final long c;

        public a(WeakReference<k07> weakReference, Map<String, ? extends Object> map, long j) {
            this.a = weakReference;
            this.b = map;
            this.c = j;
        }
    }

    public final void a() {
        int i = this.b;
        this.b = i + 1;
        if (i >= 10) {
            this.b = 0;
            Iterator<ArrayList<a>> it = this.a.values().iterator();
            while (it.hasNext()) {
                ArrayList<a> next = it.next();
                if (next.size() <= 1) {
                    a aVar = (a) z92.Q0(next);
                    if ((aVar != null ? aVar.a.get() : null) == null) {
                        it.remove();
                    }
                } else {
                    int size = next.size();
                    int i2 = 0;
                    for (int i3 = 0; i3 < size; i3++) {
                        int i4 = i3 - i2;
                        if (next.get(i4).a.get() == null) {
                            next.remove(i4);
                            i2++;
                        }
                    }
                    if (next.isEmpty()) {
                        it.remove();
                    }
                }
            }
        }
    }

    @Override // defpackage.nug
    public final qn9.c b(qn9.b bVar) {
        ArrayList<a> arrayList = this.a.get(bVar);
        qn9.c cVar = null;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            a aVar = arrayList.get(i);
            k07 k07Var = aVar.a.get();
            qn9.c cVar2 = k07Var != null ? new qn9.c(k07Var, aVar.b) : null;
            if (cVar2 != null) {
                cVar = cVar2;
                break;
            }
            i++;
        }
        a();
        return cVar;
    }

    @Override // defpackage.nug
    public final void c(qn9.b bVar, k07 k07Var, Map<String, ? extends Object> map, long j) {
        LinkedHashMap<qn9.b, ArrayList<a>> linkedHashMap = this.a;
        ArrayList<a> arrayList = linkedHashMap.get(bVar);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            linkedHashMap.put(bVar, arrayList);
        }
        ArrayList<a> arrayList2 = arrayList;
        a aVar = new a(new WeakReference(k07Var), map, j);
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                a aVar2 = arrayList2.get(i);
                if (j < aVar2.c) {
                    i++;
                } else if (aVar2.a.get() == k07Var) {
                    arrayList2.set(i, aVar);
                } else {
                    arrayList2.add(i, aVar);
                }
            }
        } else {
            arrayList2.add(aVar);
        }
        a();
    }

    @Override // defpackage.nug
    public final void clear() {
        this.b = 0;
        this.a.clear();
    }

    @Override // defpackage.nug
    public final boolean e(qn9.b bVar) {
        return this.a.remove(bVar) != null;
    }
}
