package defpackage;

import defpackage.v33;

/* JADX INFO: loaded from: classes2.dex */
public final class l21 extends v33.e.d.a.b.c {
    public final String a;
    public final String b;
    public final long c;

    public l21(long j, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    @Override // v33.e.d.a.b.c
    public final long a() {
        return this.c;
    }

    @Override // v33.e.d.a.b.c
    public final String b() {
        return this.b;
    }

    @Override // v33.e.d.a.b.c
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v33.e.d.a.b.c)) {
            return false;
        }
        v33.e.d.a.b.c cVar = (v33.e.d.a.b.c) obj;
        return this.a.equals(cVar.c()) && this.b.equals(cVar.b()) && this.c == cVar.a();
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        long j = this.c;
        return ((int) ((j >>> 32) ^ j)) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Signal{name=");
        sb.append(this.a);
        sb.append(", code=");
        sb.append(this.b);
        sb.append(", address=");
        return r6.d(this.c, "}", sb);
    }
}
