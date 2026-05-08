package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class q66 {
    public final i88 a;
    public final f88 b;

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
            return Boolean.hashCode(true) + (((((Long.hashCode(this.a) * 31) + 1184743178) * 31) + 732922764) * 31);
        }

        public final String toString() {
            return u40.c(this.a, "Params(applyUpdateStartTime=", ", type=VISITED, from=app-tracker, toLoadLimitedJobs=true)");
        }
    }

    public q66(f88 f88Var, i88 i88Var) {
        this.a = i88Var;
        this.b = f88Var;
    }
}
