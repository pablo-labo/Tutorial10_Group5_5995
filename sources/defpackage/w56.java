package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class w56 {
    public final e08 a;

    public static final class a {
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
            return u40.c(this.a, "Params(topChoiceCreateAfterTime=", ")");
        }
    }

    public static final class b {
        public final String a;

        public b(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a.equals(((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return l5.m("TopChoice(jobKey=", this.a, ")");
        }
    }

    public w56(e08 e08Var) {
        this.a = e08Var;
    }
}
