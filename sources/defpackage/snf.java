package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class snf {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public snf(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof snf)) {
            return false;
        }
        snf snfVar = (snf) obj;
        return da2.c(this.a, snfVar.a) && da2.c(this.b, snfVar.b) && da2.c(this.c, snfVar.c) && da2.c(this.d, snfVar.d) && da2.c(this.e, snfVar.e);
    }

    public final int hashCode() {
        int i = da2.j;
        return Long.hashCode(this.e) + ia.d(ia.d(ia.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
