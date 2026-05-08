package defpackage;

import defpackage.v33;

/* JADX INFO: loaded from: classes2.dex */
public final class j21 extends v33.e.d.a.b.AbstractC0443a {
    public final long a;
    public final long b;
    public final String c;
    public final String d;

    public j21(long j, long j2, String str, String str2) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
    }

    @Override // v33.e.d.a.b.AbstractC0443a
    public final long a() {
        return this.a;
    }

    @Override // v33.e.d.a.b.AbstractC0443a
    public final String b() {
        return this.c;
    }

    @Override // v33.e.d.a.b.AbstractC0443a
    public final long c() {
        return this.b;
    }

    @Override // v33.e.d.a.b.AbstractC0443a
    public final String d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v33.e.d.a.b.AbstractC0443a)) {
            return false;
        }
        v33.e.d.a.b.AbstractC0443a abstractC0443a = (v33.e.d.a.b.AbstractC0443a) obj;
        if (this.a != abstractC0443a.a() || this.b != abstractC0443a.c() || !this.c.equals(abstractC0443a.b())) {
            return false;
        }
        String str = this.d;
        return str == null ? abstractC0443a.d() == null : str.equals(abstractC0443a.d());
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str = this.d;
        return (str == null ? 0 : str.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BinaryImage{baseAddress=");
        sb.append(this.a);
        sb.append(", size=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", uuid=");
        return l6.i(sb, this.d, "}");
    }
}
