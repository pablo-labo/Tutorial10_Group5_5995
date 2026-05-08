package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class up3 {
    public final long a;
    public final long b;
    public final long c;

    public up3(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || up3.class != obj.getClass()) {
            return false;
        }
        up3 up3Var = (up3) obj;
        return da2.c(this.a, up3Var.a) && da2.c(this.b, up3Var.b) && da2.c(this.c, up3Var.c);
    }

    public final int hashCode() {
        int i = da2.j;
        return Long.hashCode(this.c) + ia.d(Long.hashCode(this.a) * 31, 31, this.b);
    }
}
