package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class rjb {

    public static final class a<T> {
        public final String a;

        public a(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            return this.a.equals(((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return this.a;
        }
    }

    public static final class b<T> {
    }

    public abstract Map<a<?>, Object> a();

    public abstract <T> T b(a<T> aVar);
}
