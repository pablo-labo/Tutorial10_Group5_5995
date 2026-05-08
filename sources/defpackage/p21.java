package defpackage;

import defpackage.v33;

/* JADX INFO: loaded from: classes2.dex */
public final class p21 extends v33.e.d.c {
    public final Double a;
    public final int b;
    public final boolean c;
    public final int d;
    public final long e;
    public final long f;

    public static final class a extends v33.e.d.c.a {
        public Double a;
        public Integer b;
        public Boolean c;
        public Integer d;
        public Long e;
        public Long f;

        public final p21 a() {
            String strConcat = this.b == null ? " batteryVelocity" : "";
            if (this.c == null) {
                strConcat = strConcat.concat(" proximityOn");
            }
            if (this.d == null) {
                strConcat = strConcat.concat(" orientation");
            }
            if (this.e == null) {
                strConcat = strConcat.concat(" ramUsed");
            }
            if (this.f == null) {
                strConcat = strConcat.concat(" diskUsed");
            }
            if (strConcat.isEmpty()) {
                return new p21(this.a, this.b.intValue(), this.c.booleanValue(), this.d.intValue(), this.e.longValue(), this.f.longValue());
            }
            r6.g("Missing required properties:".concat(strConcat));
            return null;
        }
    }

    public p21(Double d, int i, boolean z, int i2, long j, long j2) {
        this.a = d;
        this.b = i;
        this.c = z;
        this.d = i2;
        this.e = j;
        this.f = j2;
    }

    @Override // v33.e.d.c
    public final Double a() {
        return this.a;
    }

    @Override // v33.e.d.c
    public final int b() {
        return this.b;
    }

    @Override // v33.e.d.c
    public final long c() {
        return this.f;
    }

    @Override // v33.e.d.c
    public final int d() {
        return this.d;
    }

    @Override // v33.e.d.c
    public final long e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v33.e.d.c)) {
            return false;
        }
        v33.e.d.c cVar = (v33.e.d.c) obj;
        Double d = this.a;
        if (d == null) {
            if (cVar.a() != null) {
                return false;
            }
        } else if (!d.equals(cVar.a())) {
            return false;
        }
        return this.b == cVar.b() && this.c == cVar.f() && this.d == cVar.d() && this.e == cVar.e() && this.f == cVar.c();
    }

    @Override // v33.e.d.c
    public final boolean f() {
        return this.c;
    }

    public final int hashCode() {
        Double d = this.a;
        int iHashCode = ((((((((d == null ? 0 : d.hashCode()) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ this.d) * 1000003;
        long j = this.e;
        long j2 = this.f;
        return ((int) (j2 ^ (j2 >>> 32))) ^ ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{batteryLevel=");
        sb.append(this.a);
        sb.append(", batteryVelocity=");
        sb.append(this.b);
        sb.append(", proximityOn=");
        sb.append(this.c);
        sb.append(", orientation=");
        sb.append(this.d);
        sb.append(", ramUsed=");
        sb.append(this.e);
        sb.append(", diskUsed=");
        return r6.d(this.f, "}", sb);
    }
}
