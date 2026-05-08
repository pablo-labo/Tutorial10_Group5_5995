package defpackage;

import defpackage.dg7;

/* JADX INFO: loaded from: classes2.dex */
public final class c31 extends dg7 {
    public final String a;
    public final String b;
    public final String c;
    public final lnf d;
    public final dg7.a e;

    public c31(String str, String str2, String str3, u31 u31Var, dg7.a aVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = u31Var;
        this.e = aVar;
    }

    @Override // defpackage.dg7
    public final lnf a() {
        return this.d;
    }

    @Override // defpackage.dg7
    public final String b() {
        return this.b;
    }

    @Override // defpackage.dg7
    public final String c() {
        return this.c;
    }

    @Override // defpackage.dg7
    public final dg7.a d() {
        return this.e;
    }

    @Override // defpackage.dg7
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dg7)) {
            return false;
        }
        dg7 dg7Var = (dg7) obj;
        String str = this.a;
        if (str == null) {
            if (dg7Var.e() != null) {
                return false;
            }
        } else if (!str.equals(dg7Var.e())) {
            return false;
        }
        String str2 = this.b;
        if (str2 == null) {
            if (dg7Var.b() != null) {
                return false;
            }
        } else if (!str2.equals(dg7Var.b())) {
            return false;
        }
        String str3 = this.c;
        if (str3 == null) {
            if (dg7Var.c() != null) {
                return false;
            }
        } else if (!str3.equals(dg7Var.c())) {
            return false;
        }
        lnf lnfVar = this.d;
        if (lnfVar == null) {
            if (dg7Var.a() != null) {
                return false;
            }
        } else if (!lnfVar.equals(dg7Var.a())) {
            return false;
        }
        dg7.a aVar = this.e;
        return aVar == null ? dg7Var.d() == null : aVar.equals(dg7Var.d());
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        lnf lnfVar = this.d;
        int iHashCode4 = (iHashCode3 ^ (lnfVar == null ? 0 : lnfVar.hashCode())) * 1000003;
        dg7.a aVar = this.e;
        return iHashCode4 ^ (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "InstallationResponse{uri=" + this.a + ", fid=" + this.b + ", refreshToken=" + this.c + ", authToken=" + this.d + ", responseCode=" + this.e + "}";
    }
}
