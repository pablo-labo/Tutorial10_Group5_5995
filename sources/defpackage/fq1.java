package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fq1 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public fq1(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final fq1 a(long j, long j2, long j3, long j4) {
        return new fq1(j != 16 ? j : this.a, j2 != 16 ? j2 : this.b, j3 != 16 ? j3 : this.c, j4 != 16 ? j4 : this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof fq1)) {
            return false;
        }
        fq1 fq1Var = (fq1) obj;
        return da2.c(this.a, fq1Var.a) && da2.c(this.b, fq1Var.b) && da2.c(this.c, fq1Var.c) && da2.c(this.d, fq1Var.d);
    }

    public final int hashCode() {
        int i = da2.j;
        return Long.hashCode(this.d) + ia.d(ia.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
