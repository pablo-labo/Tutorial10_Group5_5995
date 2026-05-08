package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class t44 {

    public static final class a extends t44 {
        public final int a;

        public a(int i) {
            this.a = i;
            if (i > 0) {
                return;
            }
            l5.q("px must be > 0.");
            throw null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                return this.a == ((a) obj).a;
            }
            return false;
        }

        public final int hashCode() {
            return this.a;
        }

        public final String toString() {
            return String.valueOf(this.a);
        }
    }

    public static final class b extends t44 {
        public static final b a = new b();

        public final String toString() {
            return "Dimension.Undefined";
        }
    }
}
