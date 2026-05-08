package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wc9 {
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
            return this.a.hashCode();
        }

        public final String toString() {
            return l5.m("Params(inviteId=", this.a, ")");
        }
    }

    public wc9(f88 f88Var) {
        this.a = f88Var;
    }
}
