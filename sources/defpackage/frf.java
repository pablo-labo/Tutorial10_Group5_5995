package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class frf {
    public final ArrayList a = new ArrayList();

    public static final class a<Z, R> {
        public final Class<Z> a;
        public final Class<R> b;
        public final b6d<Z, R> c;

        public a(Class<Z> cls, Class<R> cls2, b6d<Z, R> b6dVar) {
            this.a = cls;
            this.b = cls2;
            this.c = b6dVar;
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final synchronized ArrayList a(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (a aVar : this.a) {
            if ((aVar.a.isAssignableFrom((Class<?>) cls) && cls2.isAssignableFrom(aVar.b)) && !arrayList.contains(aVar.b)) {
                arrayList.add(aVar.b);
            }
        }
        return arrayList;
    }
}
