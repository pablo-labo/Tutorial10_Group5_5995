package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fj8 {
    public final long a;
    public final Long b;

    public fj8(long j, Long l) {
        this.a = j;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fj8)) {
            return false;
        }
        fj8 fj8Var = (fj8) obj;
        return this.a == fj8Var.a && wl7.b(this.b, fj8Var.b);
    }

    public final int hashCode() {
        long j = this.a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        Long l = this.b;
        return i + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "KronosTime(posixTimeMs=" + this.a + ", timeSinceLastNtpSyncMs=" + this.b + ")";
    }
}
