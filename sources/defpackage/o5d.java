package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class o5d {
    public final ArrayList a = new ArrayList();

    public static final class a<T> {
        public final Class<T> a;
        public final n5d<T> b;

        public a(Class<T> cls, n5d<T> n5dVar) {
            this.a = cls;
            this.b = n5dVar;
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final synchronized <Z> n5d<Z> a(Class<Z> cls) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            a aVar = (a) this.a.get(i);
            if (aVar.a.isAssignableFrom((Class<?>) cls)) {
                return aVar.b;
            }
        }
        return null;
    }
}
