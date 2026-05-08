package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cq7 {
    public final long a;
    public final long b;
    public final long c;
    public final String d;

    public cq7(long j, long j2, long j3, String str) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cq7)) {
            return false;
        }
        cq7 cq7Var = (cq7) obj;
        return this.a == cq7Var.a && this.b == cq7Var.b && this.c == cq7Var.c && wl7.b(this.d, cq7Var.d);
    }

    public final int hashCode() {
        int iD = ia.d(ia.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return (iD + (str == null ? 0 : str.hashCode())) * 961;
    }

    public final String toString() {
        StringBuilder sbI = w40.i(this.a, "JSTHttpErrorRequest(timestampMillis=", ", headerLength=");
        sbI.append(this.b);
        o6.p(sbI, ", cookiesLength=", this.c, ", referrer=");
        return l6.i(sbI, this.d, ", errDomain=null, errCode=null)");
    }

    public /* synthetic */ cq7(long j, long j2) {
        this(j, j2, 0L, null);
    }
}
