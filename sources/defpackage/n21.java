package defpackage;

import defpackage.v33;

/* JADX INFO: loaded from: classes2.dex */
public final class n21 extends v33.e.d.a.b.AbstractC0445d.AbstractC0446a {
    public final long a;
    public final String b;
    public final String c;
    public final long d;
    public final int e;

    public n21(long j, String str, String str2, long j2, int i) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = j2;
        this.e = i;
    }

    @Override // v33.e.d.a.b.AbstractC0445d.AbstractC0446a
    public final String a() {
        return this.c;
    }

    @Override // v33.e.d.a.b.AbstractC0445d.AbstractC0446a
    public final int b() {
        return this.e;
    }

    @Override // v33.e.d.a.b.AbstractC0445d.AbstractC0446a
    public final long c() {
        return this.d;
    }

    @Override // v33.e.d.a.b.AbstractC0445d.AbstractC0446a
    public final long d() {
        return this.a;
    }

    @Override // v33.e.d.a.b.AbstractC0445d.AbstractC0446a
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v33.e.d.a.b.AbstractC0445d.AbstractC0446a)) {
            return false;
        }
        v33.e.d.a.b.AbstractC0445d.AbstractC0446a abstractC0446a = (v33.e.d.a.b.AbstractC0445d.AbstractC0446a) obj;
        if (this.a != abstractC0446a.d() || !this.b.equals(abstractC0446a.e())) {
            return false;
        }
        String str = this.c;
        if (str == null) {
            if (abstractC0446a.a() != null) {
                return false;
            }
        } else if (!str.equals(abstractC0446a.a())) {
            return false;
        }
        return this.d == abstractC0446a.c() && this.e == abstractC0446a.b();
    }

    public final int hashCode() {
        long j = this.a;
        int iHashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j2 = this.d;
        return this.e ^ ((iHashCode2 ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Frame{pc=");
        sb.append(this.a);
        sb.append(", symbol=");
        sb.append(this.b);
        sb.append(", file=");
        sb.append(this.c);
        sb.append(", offset=");
        sb.append(this.d);
        sb.append(", importance=");
        return w20.k(sb, this.e, "}");
    }
}
