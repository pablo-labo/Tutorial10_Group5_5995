package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ds0 {
    public final i88 a;
    public final f88 b;

    public static final class a {
        public final long a;
        public final String b;

        public a(long j, String str) {
            this.a = j;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return ((this.b.hashCode() + (((Long.hashCode(this.a) * 31) - 933681182) * 31)) * 31) + 732922764;
        }

        public final String toString() {
            return "Params(applyUpdateStartTime=" + this.a + ", type=ARCHIVED, tk=" + this.b + ", from=app-tracker)";
        }
    }

    public ds0(f88 f88Var, i88 i88Var) {
        this.a = i88Var;
        this.b = f88Var;
    }
}
