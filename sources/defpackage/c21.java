package defpackage;

import defpackage.v33;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class c21 extends v33.e {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final Long e;
    public final boolean f;
    public final v33.e.a g;
    public final v33.e.f h;
    public final v33.e.AbstractC0449e i;
    public final v33.e.c j;
    public final List<v33.e.d> k;
    public final int l;

    public static final class a extends v33.e.b {
        public String a;
        public String b;
        public String c;
        public Long d;
        public Long e;
        public Boolean f;
        public v33.e.a g;
        public v33.e.f h;
        public v33.e.AbstractC0449e i;
        public v33.e.c j;
        public List<v33.e.d> k;
        public Integer l;

        public final c21 a() {
            String strConcat = this.a == null ? " generator" : "";
            if (this.b == null) {
                strConcat = strConcat.concat(" identifier");
            }
            if (this.d == null) {
                strConcat = strConcat.concat(" startedAt");
            }
            if (this.f == null) {
                strConcat = strConcat.concat(" crashed");
            }
            if (this.g == null) {
                strConcat = strConcat.concat(" app");
            }
            if (this.l == null) {
                strConcat = strConcat.concat(" generatorType");
            }
            if (strConcat.isEmpty()) {
                return new c21(this.a, this.b, this.c, this.d.longValue(), this.e, this.f.booleanValue(), this.g, this.h, this.i, this.j, this.k, this.l.intValue());
            }
            r6.g("Missing required properties:".concat(strConcat));
            return null;
        }
    }

    public c21() {
        throw null;
    }

    public c21(String str, String str2, String str3, long j, Long l, boolean z, v33.e.a aVar, v33.e.f fVar, v33.e.AbstractC0449e abstractC0449e, v33.e.c cVar, List list, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = l;
        this.f = z;
        this.g = aVar;
        this.h = fVar;
        this.i = abstractC0449e;
        this.j = cVar;
        this.k = list;
        this.l = i;
    }

    @Override // v33.e
    public final v33.e.a a() {
        return this.g;
    }

    @Override // v33.e
    public final String b() {
        return this.c;
    }

    @Override // v33.e
    public final v33.e.c c() {
        return this.j;
    }

    @Override // v33.e
    public final Long d() {
        return this.e;
    }

    @Override // v33.e
    public final List<v33.e.d> e() {
        return this.k;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v33.e)) {
            return false;
        }
        v33.e eVar = (v33.e) obj;
        if (!this.a.equals(eVar.f()) || !this.b.equals(eVar.h())) {
            return false;
        }
        String str = this.c;
        if (str == null) {
            if (eVar.b() != null) {
                return false;
            }
        } else if (!str.equals(eVar.b())) {
            return false;
        }
        if (this.d != eVar.j()) {
            return false;
        }
        Long l = this.e;
        if (l == null) {
            if (eVar.d() != null) {
                return false;
            }
        } else if (!l.equals(eVar.d())) {
            return false;
        }
        if (this.f != eVar.l() || !this.g.equals(eVar.a())) {
            return false;
        }
        v33.e.f fVar = this.h;
        if (fVar == null) {
            if (eVar.k() != null) {
                return false;
            }
        } else if (!fVar.equals(eVar.k())) {
            return false;
        }
        v33.e.AbstractC0449e abstractC0449e = this.i;
        if (abstractC0449e == null) {
            if (eVar.i() != null) {
                return false;
            }
        } else if (!abstractC0449e.equals(eVar.i())) {
            return false;
        }
        v33.e.c cVar = this.j;
        if (cVar == null) {
            if (eVar.c() != null) {
                return false;
            }
        } else if (!cVar.equals(eVar.c())) {
            return false;
        }
        List<v33.e.d> list = this.k;
        if (list == null) {
            if (eVar.e() != null) {
                return false;
            }
        } else if (!list.equals(eVar.e())) {
            return false;
        }
        return this.l == eVar.g();
    }

    @Override // v33.e
    public final String f() {
        return this.a;
    }

    @Override // v33.e
    public final int g() {
        return this.l;
    }

    @Override // v33.e
    public final String h() {
        return this.b;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j = this.d;
        int i = (((iHashCode ^ iHashCode2) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        Long l = this.e;
        int iHashCode3 = (((((i ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ this.g.hashCode()) * 1000003;
        v33.e.f fVar = this.h;
        int iHashCode4 = (iHashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        v33.e.AbstractC0449e abstractC0449e = this.i;
        int iHashCode5 = (iHashCode4 ^ (abstractC0449e == null ? 0 : abstractC0449e.hashCode())) * 1000003;
        v33.e.c cVar = this.j;
        int iHashCode6 = (iHashCode5 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        List<v33.e.d> list = this.k;
        return this.l ^ ((iHashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003);
    }

    @Override // v33.e
    public final v33.e.AbstractC0449e i() {
        return this.i;
    }

    @Override // v33.e
    public final long j() {
        return this.d;
    }

    @Override // v33.e
    public final v33.e.f k() {
        return this.h;
    }

    @Override // v33.e
    public final boolean l() {
        return this.f;
    }

    @Override // v33.e
    public final a m() {
        a aVar = new a();
        aVar.a = this.a;
        aVar.b = this.b;
        aVar.c = this.c;
        aVar.d = Long.valueOf(this.d);
        aVar.e = this.e;
        aVar.f = Boolean.valueOf(this.f);
        aVar.g = this.g;
        aVar.h = this.h;
        aVar.i = this.i;
        aVar.j = this.j;
        aVar.k = this.k;
        aVar.l = Integer.valueOf(this.l);
        return aVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Session{generator=");
        sb.append(this.a);
        sb.append(", identifier=");
        sb.append(this.b);
        sb.append(", appQualitySessionId=");
        sb.append(this.c);
        sb.append(", startedAt=");
        sb.append(this.d);
        sb.append(", endedAt=");
        sb.append(this.e);
        sb.append(", crashed=");
        sb.append(this.f);
        sb.append(", app=");
        sb.append(this.g);
        sb.append(", user=");
        sb.append(this.h);
        sb.append(", os=");
        sb.append(this.i);
        sb.append(", device=");
        sb.append(this.j);
        sb.append(", events=");
        sb.append(this.k);
        sb.append(", generatorType=");
        return w20.k(sb, this.l, "}");
    }
}
