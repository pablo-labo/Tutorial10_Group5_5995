package defpackage;

import defpackage.v33;

/* JADX INFO: loaded from: classes2.dex */
public final class g21 extends v33.e.d {
    public final long a;
    public final String b;
    public final v33.e.d.a c;
    public final v33.e.d.c d;
    public final v33.e.d.AbstractC0447d e;
    public final v33.e.d.f f;

    public static final class a extends v33.e.d.b {
        public Long a;
        public String b;
        public v33.e.d.a c;
        public v33.e.d.c d;
        public v33.e.d.AbstractC0447d e;
        public v33.e.d.f f;

        public final g21 a() {
            String strConcat = this.a == null ? " timestamp" : "";
            if (this.b == null) {
                strConcat = strConcat.concat(" type");
            }
            if (this.c == null) {
                strConcat = strConcat.concat(" app");
            }
            if (this.d == null) {
                strConcat = strConcat.concat(" device");
            }
            if (strConcat.isEmpty()) {
                return new g21(this.a.longValue(), this.b, this.c, this.d, this.e, this.f);
            }
            r6.g("Missing required properties:".concat(strConcat));
            return null;
        }
    }

    public g21(long j, String str, v33.e.d.a aVar, v33.e.d.c cVar, v33.e.d.AbstractC0447d abstractC0447d, v33.e.d.f fVar) {
        this.a = j;
        this.b = str;
        this.c = aVar;
        this.d = cVar;
        this.e = abstractC0447d;
        this.f = fVar;
    }

    @Override // v33.e.d
    public final v33.e.d.a a() {
        return this.c;
    }

    @Override // v33.e.d
    public final v33.e.d.c b() {
        return this.d;
    }

    @Override // v33.e.d
    public final v33.e.d.AbstractC0447d c() {
        return this.e;
    }

    @Override // v33.e.d
    public final v33.e.d.f d() {
        return this.f;
    }

    @Override // v33.e.d
    public final long e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v33.e.d)) {
            return false;
        }
        v33.e.d dVar = (v33.e.d) obj;
        if (this.a != dVar.e() || !this.b.equals(dVar.f()) || !this.c.equals(dVar.a()) || !this.d.equals(dVar.b())) {
            return false;
        }
        v33.e.d.AbstractC0447d abstractC0447d = this.e;
        if (abstractC0447d == null) {
            if (dVar.c() != null) {
                return false;
            }
        } else if (!abstractC0447d.equals(dVar.c())) {
            return false;
        }
        v33.e.d.f fVar = this.f;
        return fVar == null ? dVar.d() == null : fVar.equals(dVar.d());
    }

    @Override // v33.e.d
    public final String f() {
        return this.b;
    }

    public final a g() {
        a aVar = new a();
        aVar.a = Long.valueOf(this.a);
        aVar.b = this.b;
        aVar.c = this.c;
        aVar.d = this.d;
        aVar.e = this.e;
        aVar.f = this.f;
        return aVar;
    }

    public final int hashCode() {
        long j = this.a;
        int iHashCode = (((((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        v33.e.d.AbstractC0447d abstractC0447d = this.e;
        int iHashCode2 = (iHashCode ^ (abstractC0447d == null ? 0 : abstractC0447d.hashCode())) * 1000003;
        v33.e.d.f fVar = this.f;
        return iHashCode2 ^ (fVar != null ? fVar.hashCode() : 0);
    }

    public final String toString() {
        return "Event{timestamp=" + this.a + ", type=" + this.b + ", app=" + this.c + ", device=" + this.d + ", log=" + this.e + ", rollouts=" + this.f + "}";
    }
}
