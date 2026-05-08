package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k32 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;

    public k32(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
        this.j = j10;
        this.k = j11;
        this.l = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof k32)) {
            return false;
        }
        k32 k32Var = (k32) obj;
        return da2.c(this.a, k32Var.a) && da2.c(this.b, k32Var.b) && da2.c(this.c, k32Var.c) && da2.c(this.d, k32Var.d) && da2.c(this.e, k32Var.e) && da2.c(this.f, k32Var.f) && da2.c(this.g, k32Var.g) && da2.c(this.h, k32Var.h) && da2.c(this.i, k32Var.i) && da2.c(this.j, k32Var.j) && da2.c(this.k, k32Var.k) && da2.c(this.l, k32Var.l);
    }

    public final int hashCode() {
        int i = da2.j;
        return Long.hashCode(this.l) + ia.d(ia.d(ia.d(ia.d(ia.d(ia.d(ia.d(ia.d(ia.d(ia.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
    }
}
