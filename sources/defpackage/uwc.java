package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class uwc {
    public final String a;
    public final long b;
    public final String c;
    public final List<tpd> d;

    public uwc(String str, long j, String str2, List<tpd> list) {
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || uwc.class != obj.getClass()) {
            return false;
        }
        uwc uwcVar = (uwc) obj;
        if (this.b == uwcVar.b && this.a.equals(uwcVar.a) && this.c.equals(uwcVar.c)) {
            return this.d.equals(uwcVar.d);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = this.b;
        return this.d.hashCode() + akb.d((iHashCode + ((int) (j ^ (j >>> 32)))) * 31, 31, this.c);
    }

    public final String toString() {
        return "RefreshTokenResult{accessToken='#####', expiresInMillis=" + this.b + ", refreshToken='#####', scopes=" + this.d + '}';
    }
}
