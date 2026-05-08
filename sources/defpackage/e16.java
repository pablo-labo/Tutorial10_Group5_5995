package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class e16 {
    public final e08 a;

    public static final class a {
        public final boolean a;

        public a(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return "JobSeekerProStatus(isPro=" + this.a + ")";
        }
    }

    public e16(e08 e08Var) {
        this.a = e08Var;
    }
}
