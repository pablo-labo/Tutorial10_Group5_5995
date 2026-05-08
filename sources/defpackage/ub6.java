package defpackage;

import com.apollographql.apollo.exception.ApolloException;
import defpackage.pua;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ub6<T> {

    public static final class b extends ub6 {
        public static final b a = new b();
    }

    public static final class c<T> extends ub6<T> {
        public final T a;

        /* JADX WARN: Multi-variable type inference failed */
        public c(pua.a aVar) {
            this.a = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && wl7.b(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            T t = this.a;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        public final String toString() {
            return v40.e(this.a, "Success(data=", ")");
        }
    }

    public static final class d extends ub6 {
        public static final d a = new d();
    }

    public static final class a extends ub6 {
        public final String a;
        public final Throwable b;

        public a(String str) {
            this.a = str;
            this.b = null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return wl7.b(this.a, aVar.a) && wl7.b(this.b, aVar.b);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            Throwable th = this.b;
            return iHashCode + (th == null ? 0 : th.hashCode());
        }

        public final String toString() {
            return "Error(message=" + this.a + ", throwable=" + this.b + ")";
        }

        public a(String str, ApolloException apolloException) {
            this.a = str;
            this.b = apolloException;
        }
    }
}
