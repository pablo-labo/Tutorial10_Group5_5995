package defpackage;

import defpackage.l71;

/* JADX INFO: loaded from: classes2.dex */
public final class s11 extends l71 {
    public final l71.a a;
    public final long b;

    public s11(l71.a aVar, long j) {
        this.a = aVar;
        this.b = j;
    }

    @Override // defpackage.l71
    public final long a() {
        return this.b;
    }

    @Override // defpackage.l71
    public final l71.a b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l71)) {
            return false;
        }
        l71 l71Var = (l71) obj;
        return this.a.equals(l71Var.b()) && this.b == l71Var.a();
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        return ((int) ((j >>> 32) ^ j)) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        sb.append(this.a);
        sb.append(", nextRequestWaitMillis=");
        return r6.d(this.b, "}", sb);
    }
}
