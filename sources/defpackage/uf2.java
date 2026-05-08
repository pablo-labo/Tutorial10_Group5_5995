package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class uf2<T> {
    public final String a;
    public final Set<y8c<? super T>> b;
    public final Set<my3> c;
    public final int d;
    public final int e;
    public final jg2<T> f;
    public final Set<Class<?>> g;

    public uf2(String str, Set<y8c<? super T>> set, Set<my3> set2, int i, int i2, jg2<T> jg2Var, Set<Class<?>> set3) {
        this.a = str;
        this.b = Collections.unmodifiableSet(set);
        this.c = Collections.unmodifiableSet(set2);
        this.d = i;
        this.e = i2;
        this.f = jg2Var;
        this.g = Collections.unmodifiableSet(set3);
    }

    public static <T> a<T> a(y8c<T> y8cVar) {
        return new a<>(y8cVar, new y8c[0]);
    }

    public static <T> a<T> b(Class<T> cls) {
        return new a<>(cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> uf2<T> c(T t, Class<T> cls, Class<? super T>... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(y8c.a(cls));
        for (Class<? super T> cls2 : clsArr) {
            yid.b(cls2, "Null interface");
            hashSet.add(y8c.a(cls2));
        }
        return new uf2<>(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new tf2(t, 0), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }

    public static class a<T> {
        public String a = null;
        public final HashSet b;
        public final HashSet c;
        public int d;
        public int e;
        public jg2<T> f;
        public final HashSet g;

        public a(Class cls, Class[] clsArr) {
            HashSet hashSet = new HashSet();
            this.b = hashSet;
            this.c = new HashSet();
            this.d = 0;
            this.e = 0;
            this.g = new HashSet();
            hashSet.add(y8c.a(cls));
            for (Class cls2 : clsArr) {
                yid.b(cls2, "Null interface");
                this.b.add(y8c.a(cls2));
            }
        }

        public final void a(my3 my3Var) {
            if (this.b.contains(my3Var.a)) {
                l5.q("Components are not allowed to depend on interfaces they themselves provide.");
            } else {
                this.c.add(my3Var);
            }
        }

        public final uf2<T> b() {
            if (this.f != null) {
                return new uf2<>(this.a, new HashSet(this.b), new HashSet(this.c), this.d, this.e, this.f, this.g);
            }
            r6.g("Missing required property: factory.");
            return null;
        }

        public final void c(int i) {
            if (this.d == 0) {
                this.d = i;
            } else {
                r6.g("Instantiation type has already been set.");
            }
        }

        public a(y8c y8cVar, y8c[] y8cVarArr) {
            HashSet hashSet = new HashSet();
            this.b = hashSet;
            this.c = new HashSet();
            this.d = 0;
            this.e = 0;
            this.g = new HashSet();
            hashSet.add(y8cVar);
            for (y8c y8cVar2 : y8cVarArr) {
                yid.b(y8cVar2, "Null interface");
            }
            Collections.addAll(this.b, y8cVarArr);
        }
    }
}
