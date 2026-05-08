package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vs7 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final sr7 e;
    public final String f;

    public vs7(sr7 sr7Var, String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = sr7Var;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vs7)) {
            return false;
        }
        vs7 vs7Var = (vs7) obj;
        return wl7.b(this.a, vs7Var.a) && wl7.b(this.b, vs7Var.b) && wl7.b(this.c, vs7Var.c) && wl7.b(this.d, vs7Var.d) && wl7.b(this.e, vs7Var.e) && wl7.b(this.f, vs7Var.f);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        sr7 sr7Var = this.e;
        int iHashCode5 = (iHashCode4 + (sr7Var == null ? 0 : sr7Var.hashCode())) * 31;
        String str5 = this.f;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("JSTProfileWorkExperience(jobTitle=", this.a, ", company=", this.b, ", country=");
        ia.r(sbF, this.c, ", location=", this.d, ", dateRange=");
        sbF.append(this.e);
        sbF.append(", description=");
        sbF.append(this.f);
        sbF.append(")");
        return sbF.toString();
    }
}
