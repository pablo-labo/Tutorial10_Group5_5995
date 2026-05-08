package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class c78 {
    public final b78 a;
    public final b78 b;
    public final b78 c;

    public c78(b78 b78Var, b78 b78Var2, b78 b78Var3) {
        this.a = b78Var;
        this.b = b78Var2;
        this.c = b78Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c78)) {
            return false;
        }
        c78 c78Var = (c78) obj;
        return wl7.b(this.a, c78Var.a) && wl7.b(this.b, c78Var.b) && wl7.b(this.c, c78Var.c);
    }

    public final int hashCode() {
        b78 b78Var = this.a;
        int iHashCode = (b78Var == null ? 0 : b78Var.hashCode()) * 31;
        b78 b78Var2 = this.b;
        int iHashCode2 = (iHashCode + (b78Var2 == null ? 0 : b78Var2.hashCode())) * 961;
        b78 b78Var3 = this.c;
        return iHashCode2 + (b78Var3 != null ? b78Var3.hashCode() : 0);
    }

    public final String toString() {
        return "JobStatuses(candidateStatus=" + this.a + ", selfReportedStatus=" + this.b + ", employerJobStatus=null, userJobStatus=" + this.c + ")";
    }
}
