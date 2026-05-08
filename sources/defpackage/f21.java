package defpackage;

import defpackage.v33;

/* JADX INFO: loaded from: classes2.dex */
public final class f21 extends v33.e.c {
    public final int a;
    public final String b;
    public final int c;
    public final long d;
    public final long e;
    public final boolean f;
    public final int g;
    public final String h;
    public final String i;

    public static final class a extends v33.e.c.a {
        public Integer a;
        public String b;
        public Integer c;
        public Long d;
        public Long e;
        public Boolean f;
        public Integer g;
        public String h;
        public String i;

        public final f21 a() {
            String strConcat = this.a == null ? " arch" : "";
            if (this.b == null) {
                strConcat = strConcat.concat(" model");
            }
            if (this.c == null) {
                strConcat = strConcat.concat(" cores");
            }
            if (this.d == null) {
                strConcat = strConcat.concat(" ram");
            }
            if (this.e == null) {
                strConcat = strConcat.concat(" diskSpace");
            }
            if (this.f == null) {
                strConcat = strConcat.concat(" simulator");
            }
            if (this.g == null) {
                strConcat = strConcat.concat(" state");
            }
            if (this.h == null) {
                strConcat = strConcat.concat(" manufacturer");
            }
            if (this.i == null) {
                strConcat = strConcat.concat(" modelClass");
            }
            if (strConcat.isEmpty()) {
                return new f21(this.a.intValue(), this.b, this.c.intValue(), this.d.longValue(), this.e.longValue(), this.f.booleanValue(), this.g.intValue(), this.h, this.i);
            }
            r6.g("Missing required properties:".concat(strConcat));
            return null;
        }
    }

    public f21(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = j;
        this.e = j2;
        this.f = z;
        this.g = i3;
        this.h = str2;
        this.i = str3;
    }

    @Override // v33.e.c
    public final int a() {
        return this.a;
    }

    @Override // v33.e.c
    public final int b() {
        return this.c;
    }

    @Override // v33.e.c
    public final long c() {
        return this.e;
    }

    @Override // v33.e.c
    public final String d() {
        return this.h;
    }

    @Override // v33.e.c
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v33.e.c)) {
            return false;
        }
        v33.e.c cVar = (v33.e.c) obj;
        return this.a == cVar.a() && this.b.equals(cVar.e()) && this.c == cVar.b() && this.d == cVar.g() && this.e == cVar.c() && this.f == cVar.i() && this.g == cVar.h() && this.h.equals(cVar.d()) && this.i.equals(cVar.f());
    }

    @Override // v33.e.c
    public final String f() {
        return this.i;
    }

    @Override // v33.e.c
    public final long g() {
        return this.d;
    }

    @Override // v33.e.c
    public final int h() {
        return this.g;
    }

    public final int hashCode() {
        int iHashCode = (((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003;
        long j = this.d;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.e;
        return this.i.hashCode() ^ ((((((((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003);
    }

    @Override // v33.e.c
    public final boolean i() {
        return this.f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{arch=");
        sb.append(this.a);
        sb.append(", model=");
        sb.append(this.b);
        sb.append(", cores=");
        sb.append(this.c);
        sb.append(", ram=");
        sb.append(this.d);
        sb.append(", diskSpace=");
        sb.append(this.e);
        sb.append(", simulator=");
        sb.append(this.f);
        sb.append(", state=");
        sb.append(this.g);
        sb.append(", manufacturer=");
        sb.append(this.h);
        sb.append(", modelClass=");
        return l6.i(sb, this.i, "}");
    }
}
