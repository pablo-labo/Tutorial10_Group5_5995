package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class hva<V> {

    public static final class a extends hva {
        public static final a a = new a();
    }

    public static final class b {
        public static hva a(Object obj) {
            return obj == null ? a.a : new c(obj);
        }
    }

    public static final class c<V> extends hva<V> {
        public final V a;

        public c(V v) {
            this.a = v;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && wl7.b(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            V v = this.a;
            if (v == null) {
                return 0;
            }
            return v.hashCode();
        }

        public final String toString() {
            return "Present(value=" + this.a + ')';
        }
    }
}
