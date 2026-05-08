package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xhc {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public xhc(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof xhc)) {
            return false;
        }
        xhc xhcVar = (xhc) obj;
        return da2.c(this.a, xhcVar.a) && da2.c(this.b, xhcVar.b) && da2.c(this.c, xhcVar.c) && da2.c(this.d, xhcVar.d);
    }

    public final int hashCode() {
        int i = da2.j;
        return Long.hashCode(this.d) + ia.d(ia.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
