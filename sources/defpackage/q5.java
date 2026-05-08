package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class q5 {
    public final String a;
    public final long b;
    public final List<tpd> c;

    public q5(String str, long j, List<tpd> list) {
        this.a = str;
        this.b = j;
        this.c = Collections.unmodifiableList(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q5.class != obj.getClass()) {
            return false;
        }
        q5 q5Var = (q5) obj;
        if (this.b == q5Var.b && this.a.equals(q5Var.a)) {
            return this.c.equals(q5Var.c);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = this.b;
        return this.c.hashCode() + ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        return "AccessTokenVerificationResult{channelId='" + this.a + "', expiresInMillis=" + this.b + ", scopes=" + this.c + '}';
    }
}
