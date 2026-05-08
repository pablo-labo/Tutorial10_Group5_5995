package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ux1 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public ux1(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final ux1 a(long j, long j2, long j3, long j4) {
        return new ux1(j != 16 ? j : this.a, j2 != 16 ? j2 : this.b, j3 != 16 ? j3 : this.c, j4 != 16 ? j4 : this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ux1)) {
            return false;
        }
        ux1 ux1Var = (ux1) obj;
        return da2.c(this.a, ux1Var.a) && da2.c(this.b, ux1Var.b) && da2.c(this.c, ux1Var.c) && da2.c(this.d, ux1Var.d);
    }

    public final int hashCode() {
        int i = da2.j;
        return Long.hashCode(this.d) + ia.d(ia.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
