package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kwe {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public kwe(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kwe)) {
            return false;
        }
        kwe kweVar = (kwe) obj;
        return da2.c(this.a, kweVar.a) && da2.c(this.b, kweVar.b) && da2.c(this.c, kweVar.c) && da2.c(this.d, kweVar.d);
    }

    public final int hashCode() {
        int i = da2.j;
        return Long.hashCode(this.d) + ia.d(ia.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        String strI = da2.i(this.a);
        String strI2 = da2.i(this.b);
        return z3.n(u40.f("StyleObject(bgColor=", strI, ", textColor=", strI2, ", linkColor="), da2.i(this.c), ", borderColor=", da2.i(this.d), ")");
    }
}
