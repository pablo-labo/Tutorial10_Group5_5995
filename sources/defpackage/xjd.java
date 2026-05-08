package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xjd {
    public final f88 a;

    public static final class a {
        public final String a;
        public final long b;

        public a(String str, long j) {
            str.getClass();
            this.a = str;
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return wl7.b(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Params(inviteId=" + this.a + ", timestamp=" + this.b + ")";
        }
    }

    public xjd(f88 f88Var) {
        this.a = f88Var;
    }
}
