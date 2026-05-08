package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wje {

    public static final class a extends wje {
        public final long a;

        public a(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return u40.c(this.a, "Dismissed(lastDismissedTimestampMillis=", ")");
        }
    }

    public static final class b extends wje {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1075600388;
        }

        public final String toString() {
            return "Error";
        }
    }

    public static final class c extends wje {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1741833830;
        }

        public final String toString() {
            return "NotDismissed";
        }
    }
}
