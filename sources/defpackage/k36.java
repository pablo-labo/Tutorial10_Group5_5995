package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class k36 {
    public final e08 a;

    public static final class a {
        public final int a;
        public final Long b;

        public a(int i, Long l) {
            this.a = i;
            this.b = l;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && wl7.b(this.b, aVar.b);
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.a) * 31;
            Long l = this.b;
            return iHashCode + (l == null ? 0 : l.hashCode());
        }

        public final String toString() {
            return "RemainingTopChoices(amount=" + this.a + ", nextAvailableTimestamp=" + this.b + ")";
        }
    }

    public k36(e08 e08Var) {
        this.a = e08Var;
    }
}
