package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dq7 {
    public final long a;
    public final long b;
    public final long c;
    public final String d;
    public final long e;
    public final long f;

    public dq7(long j, long j2, long j3, String str, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = str;
        this.e = j4;
        this.f = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dq7)) {
            return false;
        }
        dq7 dq7Var = (dq7) obj;
        return this.a == dq7Var.a && this.b == dq7Var.b && this.c == dq7Var.c && this.d.equals(dq7Var.d) && this.e == dq7Var.e && this.f == dq7Var.f;
    }

    public final int hashCode() {
        return ia.d(ia.d(akb.d(ia.d(ia.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 961, this.f);
    }

    public final String toString() {
        StringBuilder sbI = w40.i(this.a, "JSTHttpErrorResponse(timestampMillis=", ", headerLength=");
        sbI.append(this.b);
        o6.p(sbI, ", contentLength=", this.c, ", contentType=");
        sbI.append(this.d);
        sbI.append(", setCookiesLength=");
        sbI.append(this.e);
        sbI.append(", statusCode=");
        sbI.append(this.f);
        sbI.append(", errDomain=null, errCode=null)");
        return sbI.toString();
    }
}
