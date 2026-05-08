package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qi7 {
    public final String a;
    public final long b;
    public final long c;
    public final String d;

    public qi7(long j, long j2, String str, String str2) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qi7.class != obj.getClass()) {
            return false;
        }
        qi7 qi7Var = (qi7) obj;
        if (this.b == qi7Var.b && this.c == qi7Var.c && this.a.equals(qi7Var.a)) {
            return this.d.equals(qi7Var.d);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = this.b;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.c;
        return this.d.hashCode() + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InternalAccessToken{accessToken='#####', expiresInMillis=");
        sb.append(this.b);
        sb.append(", issuedClientTimeMillis=");
        return r6.d(this.c, ", refreshToken='#####'}", sb);
    }
}
