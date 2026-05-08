package defpackage;

import com.bumptech.glide.Registry;
import defpackage.f65;
import defpackage.fx9;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class n1a {
    public static final c e = new c();
    public static final a f = new a();
    public final f65.c d;
    public final ArrayList a = new ArrayList();
    public final HashSet c = new HashSet();
    public final c b = e;

    public static class a implements fx9<Object, Object> {
        @Override // defpackage.fx9
        public final fx9.a<Object> a(Object obj, int i, int i2, ova ovaVar) {
            return null;
        }

        @Override // defpackage.fx9
        public final boolean b(Object obj) {
            return false;
        }
    }

    public static class b<Model, Data> {
        public final Class<Model> a;
        public final Class<Data> b;
        public final gx9<? extends Model, ? extends Data> c;

        public b(Class<Model> cls, Class<Data> cls2, gx9<? extends Model, ? extends Data> gx9Var) {
            this.a = cls;
            this.b = cls2;
            this.c = gx9Var;
        }
    }

    public static class c {
    }

    public n1a(f65.c cVar) {
        this.d = cVar;
    }

    public final synchronized <Model, Data> fx9<Model, Data> a(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (b bVar : this.a) {
                if (this.c.contains(bVar)) {
                    z = true;
                } else if (bVar.a.isAssignableFrom(cls) && bVar.b.isAssignableFrom(cls2)) {
                    this.c.add(bVar);
                    arrayList.add(bVar.c.c(this));
                    this.c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                c cVar = this.b;
                f65.c cVar2 = this.d;
                cVar.getClass();
                return new m1a(arrayList, cVar2);
            }
            if (arrayList.size() == 1) {
                return (fx9) arrayList.get(0);
            }
            if (z) {
                return f;
            }
            throw new Registry.NoModelLoaderAvailableException("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        } catch (Throwable th) {
            this.c.clear();
            throw th;
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final synchronized ArrayList b(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b bVar : this.a) {
                if (!this.c.contains(bVar) && bVar.a.isAssignableFrom((Class<?>) cls)) {
                    this.c.add(bVar);
                    arrayList.add(bVar.c.c(this));
                    this.c.remove(bVar);
                }
            }
        } finally {
        }
        return arrayList;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final synchronized ArrayList c(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b bVar : this.a) {
            if (!arrayList.contains(bVar.b) && bVar.a.isAssignableFrom((Class<?>) cls)) {
                arrayList.add(bVar.b);
            }
        }
        return arrayList;
    }
}
