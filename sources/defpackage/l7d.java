package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class l7d implements fg2 {
    public final Set<y8c<?>> a;
    public final Set<y8c<?>> b;
    public final Set<y8c<?>> c;
    public final Set<y8c<?>> d;
    public final Set<y8c<?>> e;
    public final Set<Class<?>> f;
    public final fg2 g;

    public static class a implements w6c {
        public final Set<Class<?>> a;
        public final w6c b;

        public a(Set<Class<?>> set, w6c w6cVar) {
            this.a = set;
            this.b = w6cVar;
        }
    }

    public l7d(uf2<?> uf2Var, fg2 fg2Var) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        Set<my3> set = uf2Var.c;
        Set<Class<?>> set2 = uf2Var.g;
        for (my3 my3Var : set) {
            int i = my3Var.c;
            int i2 = my3Var.b;
            boolean z = i == 0;
            y8c<?> y8cVar = my3Var.a;
            if (z) {
                if (i2 == 2) {
                    hashSet4.add(y8cVar);
                } else {
                    hashSet.add(y8cVar);
                }
            } else if (i == 2) {
                hashSet3.add(y8cVar);
            } else if (i2 == 2) {
                hashSet5.add(y8cVar);
            } else {
                hashSet2.add(y8cVar);
            }
        }
        if (!set2.isEmpty()) {
            hashSet.add(y8c.a(w6c.class));
        }
        this.a = Collections.unmodifiableSet(hashSet);
        this.b = Collections.unmodifiableSet(hashSet2);
        this.c = Collections.unmodifiableSet(hashSet3);
        this.d = Collections.unmodifiableSet(hashSet4);
        this.e = Collections.unmodifiableSet(hashSet5);
        this.f = set2;
        this.g = fg2Var;
    }

    @Override // defpackage.fg2
    public final <T> j6c<Set<T>> a(y8c<T> y8cVar) {
        if (this.e.contains(y8cVar)) {
            return this.g.a(y8cVar);
        }
        w40.p("Attempting to request an undeclared dependency Provider<Set<", y8cVar, ">>.");
        return null;
    }

    @Override // defpackage.fg2
    public final <T> j6c<T> b(y8c<T> y8cVar) {
        if (this.b.contains(y8cVar)) {
            return this.g.b(y8cVar);
        }
        w40.p("Attempting to request an undeclared dependency Provider<", y8cVar, ">.");
        return null;
    }

    @Override // defpackage.fg2
    public final <T> T c(y8c<T> y8cVar) {
        if (this.a.contains(y8cVar)) {
            return (T) this.g.c(y8cVar);
        }
        w40.p("Attempting to request an undeclared dependency ", y8cVar, ".");
        return null;
    }

    @Override // defpackage.fg2
    public final <T> Set<T> d(y8c<T> y8cVar) {
        if (this.d.contains(y8cVar)) {
            return this.g.d(y8cVar);
        }
        w40.p("Attempting to request an undeclared dependency Set<", y8cVar, ">.");
        return null;
    }

    @Override // defpackage.fg2
    public final <T> j6c<T> e(Class<T> cls) {
        return b(y8c.a(cls));
    }

    @Override // defpackage.fg2
    public final <T> wr3<T> f(y8c<T> y8cVar) {
        if (this.c.contains(y8cVar)) {
            return this.g.f(y8cVar);
        }
        w40.p("Attempting to request an undeclared dependency Deferred<", y8cVar, ">.");
        return null;
    }

    public final <T> wr3<T> g(Class<T> cls) {
        return f(y8c.a(cls));
    }

    @Override // defpackage.fg2
    public final <T> T get(Class<T> cls) {
        if (this.a.contains(y8c.a(cls))) {
            T t = (T) this.g.get(cls);
            return !cls.equals(w6c.class) ? t : (T) new a(this.f, (w6c) t);
        }
        w40.p("Attempting to request an undeclared dependency ", cls, ".");
        return null;
    }
}
