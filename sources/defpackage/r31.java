package defpackage;

import defpackage.lte;

/* JADX INFO: loaded from: classes2.dex */
public final class r31 extends lte.a {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final o34 f;

    public r31(String str, String str2, String str3, String str4, int i, o34 o34Var) {
        if (str == null) {
            ja.k("Null appIdentifier");
            throw null;
        }
        this.a = str;
        if (str2 == null) {
            ja.k("Null versionCode");
            throw null;
        }
        this.b = str2;
        if (str3 == null) {
            ja.k("Null versionName");
            throw null;
        }
        this.c = str3;
        if (str4 == null) {
            ja.k("Null installUuid");
            throw null;
        }
        this.d = str4;
        this.e = i;
        this.f = o34Var;
    }

    @Override // lte.a
    public final String a() {
        return this.a;
    }

    @Override // lte.a
    public final int b() {
        return this.e;
    }

    @Override // lte.a
    public final o34 c() {
        return this.f;
    }

    @Override // lte.a
    public final String d() {
        return this.d;
    }

    @Override // lte.a
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lte.a)) {
            return false;
        }
        lte.a aVar = (lte.a) obj;
        return this.a.equals(aVar.a()) && this.b.equals(aVar.e()) && this.c.equals(aVar.f()) && this.d.equals(aVar.d()) && this.e == aVar.b() && this.f.equals(aVar.c());
    }

    @Override // lte.a
    public final String f() {
        return this.c;
    }

    public final int hashCode() {
        return this.f.hashCode() ^ ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003);
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.a + ", versionCode=" + this.b + ", versionName=" + this.c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.e + ", developmentPlatformProvider=" + this.f + "}";
    }
}
