package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class f9g {
    public final f88 a;

    public static final class a {
        public final String a;

        public a(String str) {
            str.getClass();
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && wl7.b(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return (this.a.hashCode() * 31) - 1113817783;
        }

        public final String toString() {
            return l5.m("Params(inviteId=", this.a, ", newStatus=INTERESTED)");
        }
    }

    public f9g(f88 f88Var) {
        this.a = f88Var;
    }
}
