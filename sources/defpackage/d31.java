package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class d31 extends eg7 {
    public final String a;
    public final long b;
    public final long c;

    public d31(long j, String str, long j2) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    @Override // defpackage.eg7
    public final String a() {
        return this.a;
    }

    @Override // defpackage.eg7
    public final long b() {
        return this.c;
    }

    @Override // defpackage.eg7
    public final long c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eg7)) {
            return false;
        }
        eg7 eg7Var = (eg7) obj;
        return this.a.equals(eg7Var.a()) && this.b == eg7Var.c() && this.c == eg7Var.b();
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        long j2 = this.c;
        return ((int) (j2 ^ (j2 >>> 32))) ^ ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationTokenResult{token=");
        sb.append(this.a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.b);
        sb.append(", tokenCreationTimestamp=");
        return r6.d(this.c, "}", sb);
    }
}
