package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface qn9 {

    public static final class a {
        public pn9 a;
    }

    public static final class b {
        public final String a;
        public final Map<String, String> b;

        public b(String str, Map<String, String> map) {
            this.a = str;
            this.b = aa2.b(map);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return wl7.b(this.a, bVar.a) && wl7.b(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Key(key=" + this.a + ", extras=" + this.b + ')';
        }
    }

    public static final class c {
        public final k07 a;
        public final Map<String, Object> b;

        public c(k07 k07Var, Map<String, ? extends Object> map) {
            this.a = k07Var;
            this.b = aa2.b(map);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return wl7.b(this.a, cVar.a) && wl7.b(this.b, cVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Value(image=" + this.a + ", extras=" + this.b + ')';
        }
    }

    long a();

    c b(b bVar);

    void clear();

    void d(long j);

    void e(b bVar, c cVar);
}
