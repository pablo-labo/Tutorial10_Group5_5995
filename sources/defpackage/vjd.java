package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vjd {
    public final f88 a;

    public static final class a {
        public final String a;
        public final String b;

        public a(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.a = str;
            this.b = str2;
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
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return akb.k("Params(jobKey=", this.a, ", status=", this.b, ")");
        }
    }

    public vjd(f88 f88Var) {
        this.a = f88Var;
    }
}
