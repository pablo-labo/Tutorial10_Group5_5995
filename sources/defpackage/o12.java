package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o12 {

    public static final class a extends o12 {
        public final Exception a;

        public a(Exception exc) {
            this.a = exc;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && wl7.b(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Error(error=" + this.a + ")";
        }
    }

    public static final class b extends o12 {
        public final w47 a;

        public b(w47 w47Var) {
            w47Var.getClass();
            this.a = w47Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Success(newFolder=" + this.a + ")";
        }
    }
}
