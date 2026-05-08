package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class s0a {
    public final f88 a;
    public final i88 b;

    public static final class a {
        public final String a;
        public final String b;

        public a(String str, String str2) {
            str.getClass();
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
            return wl7.b(this.a, aVar.a) && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) + 1204948910;
        }

        public final String toString() {
            return akb.k("Params(jobKey=", this.a, ", tk=", this.b, ", from=app-tracker-webapp)");
        }
    }

    public s0a(f88 f88Var, i88 i88Var) {
        this.a = f88Var;
        this.b = i88Var;
    }
}
