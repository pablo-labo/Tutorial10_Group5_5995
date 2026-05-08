package defpackage;

import defpackage.v33;

/* JADX INFO: loaded from: classes2.dex */
public final class v11 extends v33 {
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final v33.e j;
    public final v33.d k;
    public final v33.a l;

    public static final class a extends v33.b {
        public String a;
        public String b;
        public Integer c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public v33.e i;
        public v33.d j;
        public v33.a k;

        public final v11 a() {
            String strConcat = this.a == null ? " sdkVersion" : "";
            if (this.b == null) {
                strConcat = strConcat.concat(" gmpAppId");
            }
            if (this.c == null) {
                strConcat = strConcat.concat(" platform");
            }
            if (this.d == null) {
                strConcat = strConcat.concat(" installationUuid");
            }
            if (this.g == null) {
                strConcat = strConcat.concat(" buildVersion");
            }
            if (this.h == null) {
                strConcat = strConcat.concat(" displayVersion");
            }
            if (strConcat.isEmpty()) {
                return new v11(this.a, this.b, this.c.intValue(), this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
            }
            r6.g("Missing required properties:".concat(strConcat));
            return null;
        }
    }

    public v11(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, v33.e eVar, v33.d dVar, v33.a aVar) {
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = eVar;
        this.k = dVar;
        this.l = aVar;
    }

    @Override // defpackage.v33
    public final v33.a a() {
        return this.l;
    }

    @Override // defpackage.v33
    public final String b() {
        return this.g;
    }

    @Override // defpackage.v33
    public final String c() {
        return this.h;
    }

    @Override // defpackage.v33
    public final String d() {
        return this.i;
    }

    @Override // defpackage.v33
    public final String e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v33)) {
            return false;
        }
        v33 v33Var = (v33) obj;
        if (!this.b.equals(v33Var.j()) || !this.c.equals(v33Var.f()) || this.d != v33Var.i() || !this.e.equals(v33Var.g())) {
            return false;
        }
        String str = this.f;
        if (str == null) {
            if (v33Var.e() != null) {
                return false;
            }
        } else if (!str.equals(v33Var.e())) {
            return false;
        }
        String str2 = this.g;
        if (str2 == null) {
            if (v33Var.b() != null) {
                return false;
            }
        } else if (!str2.equals(v33Var.b())) {
            return false;
        }
        if (!this.h.equals(v33Var.c()) || !this.i.equals(v33Var.d())) {
            return false;
        }
        v33.e eVar = this.j;
        if (eVar == null) {
            if (v33Var.k() != null) {
                return false;
            }
        } else if (!eVar.equals(v33Var.k())) {
            return false;
        }
        v33.d dVar = this.k;
        if (dVar == null) {
            if (v33Var.h() != null) {
                return false;
            }
        } else if (!dVar.equals(v33Var.h())) {
            return false;
        }
        v33.a aVar = this.l;
        return aVar == null ? v33Var.a() == null : aVar.equals(v33Var.a());
    }

    @Override // defpackage.v33
    public final String f() {
        return this.c;
    }

    @Override // defpackage.v33
    public final String g() {
        return this.e;
    }

    @Override // defpackage.v33
    public final v33.d h() {
        return this.k;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        String str = this.f;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.g;
        int iHashCode3 = (((((iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003;
        v33.e eVar = this.j;
        int iHashCode4 = (iHashCode3 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        v33.d dVar = this.k;
        int iHashCode5 = (iHashCode4 ^ (dVar == null ? 0 : dVar.hashCode())) * 1000003;
        v33.a aVar = this.l;
        return iHashCode5 ^ (aVar != null ? aVar.hashCode() : 0);
    }

    @Override // defpackage.v33
    public final int i() {
        return this.d;
    }

    @Override // defpackage.v33
    public final String j() {
        return this.b;
    }

    @Override // defpackage.v33
    public final v33.e k() {
        return this.j;
    }

    @Override // defpackage.v33
    public final a l() {
        a aVar = new a();
        aVar.a = this.b;
        aVar.b = this.c;
        aVar.c = Integer.valueOf(this.d);
        aVar.d = this.e;
        aVar.e = this.f;
        aVar.f = this.g;
        aVar.g = this.h;
        aVar.h = this.i;
        aVar.i = this.j;
        aVar.j = this.k;
        aVar.k = this.l;
        return aVar;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.b + ", gmpAppId=" + this.c + ", platform=" + this.d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f + ", appQualitySessionId=" + this.g + ", buildVersion=" + this.h + ", displayVersion=" + this.i + ", session=" + this.j + ", ndkPayload=" + this.k + ", appExitInfo=" + this.l + "}";
    }
}
