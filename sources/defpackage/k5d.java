package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k5d {
    public final ArrayList a = new ArrayList();
    public final HashMap b = new HashMap();

    public static class a<T, R> {
        public final Class<T> a;
        public final Class<R> b;
        public final j5d<T, R> c;

        public a(Class<T> cls, Class<R> cls2, j5d<T, R> j5dVar) {
            this.a = cls;
            this.b = cls2;
            this.c = j5dVar;
        }
    }

    public final synchronized List<a<?, ?>> a(String str) {
        List<a<?, ?>> arrayList;
        try {
            if (!this.a.contains(str)) {
                this.a.add(str);
            }
            arrayList = (List) this.b.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.b.put(str, arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final synchronized ArrayList b(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if ((aVar.a.isAssignableFrom((Class<?>) cls) && cls2.isAssignableFrom(aVar.b)) && !arrayList.contains(aVar.b)) {
                        arrayList.add(aVar.b);
                    }
                }
            }
        }
        return arrayList;
    }
}
