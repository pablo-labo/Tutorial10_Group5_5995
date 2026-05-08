package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ms2 {
    public final int a;
    public final long b;
    public final ns2 c;
    public final xrg d;

    public ms2(int i, long j, ns2 ns2Var, xrg xrgVar) {
        this.a = i;
        this.b = j;
        this.c = ns2Var;
        this.d = xrgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ms2)) {
            return false;
        }
        ms2 ms2Var = (ms2) obj;
        return this.a == ms2Var.a && this.b == ms2Var.b && this.c == ms2Var.c && wl7.b(this.d, ms2Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ia.d(Integer.hashCode(this.a) * 31, 31, this.b)) * 31;
        xrg xrgVar = this.d;
        return iHashCode + (xrgVar == null ? 0 : xrgVar.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.a + ", timestamp=" + this.b + ", type=" + this.c + ", structureCompat=" + this.d + ')';
    }
}
