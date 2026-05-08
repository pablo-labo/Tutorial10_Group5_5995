package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface u44 {

    @fd8
    public static final class a implements u44 {
        public final int a;

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return this.a == ((a) obj).a;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return bg.c(')', this.a, "Pixels(px=");
        }
    }

    public static final class b implements u44 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -2093724603;
        }

        public final String toString() {
            return "Undefined";
        }
    }
}
