package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class q55 {
    public static final q55 b = new q55(aa2.b(new a().a));
    public final Map<b<?>, Object> a;

    public static final class b<T> {
        public final T a;

        public b(T t) {
            this.a = t;
        }
    }

    public q55(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q55) && wl7.b(this.a, ((q55) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Extras(data=" + this.a + ')';
    }

    public static final class a {
        public final LinkedHashMap a;

        public a(q55 q55Var) {
            this.a = lc9.i0(q55Var.a);
        }

        public a() {
            this.a = new LinkedHashMap();
        }
    }
}
