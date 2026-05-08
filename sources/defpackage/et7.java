package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class et7 {

    public static final class a extends et7 {
    }

    public static final class b extends et7 {
        public final ft7 a;

        public b(ft7 ft7Var) {
            ft7Var.getClass();
            this.a = ft7Var;
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
            return "Success(status=" + this.a + ")";
        }
    }
}
