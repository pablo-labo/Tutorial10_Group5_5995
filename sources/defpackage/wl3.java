package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wl3 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public wl3(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wl3.class != obj.getClass()) {
            return false;
        }
        wl3 wl3Var = (wl3) obj;
        return da2.c(this.a, wl3Var.a) && da2.c(this.b, wl3Var.b) && da2.c(this.c, wl3Var.c) && da2.c(this.d, wl3Var.d);
    }

    public final int hashCode() {
        int i = da2.j;
        return Long.hashCode(this.d) + ia.d(ia.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
