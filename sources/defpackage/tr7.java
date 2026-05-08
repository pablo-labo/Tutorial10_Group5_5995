package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tr7 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final sr7 f;

    public tr7(sr7 sr7Var, String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = sr7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tr7)) {
            return false;
        }
        tr7 tr7Var = (tr7) obj;
        return wl7.b(this.a, tr7Var.a) && wl7.b(this.b, tr7Var.b) && wl7.b(this.c, tr7Var.c) && wl7.b(this.d, tr7Var.d) && wl7.b(this.e, tr7Var.e) && wl7.b(this.f, tr7Var.f);
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
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        sr7 sr7Var = this.f;
        return iHashCode5 + (sr7Var != null ? sr7Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("JSTProfileEducation(levelOfEducation=", this.a, ", fieldOfStudy=", this.b, ", school=");
        ia.r(sbF, this.c, ", country=", this.d, ", schoolLocation=");
        sbF.append(this.e);
        sbF.append(", dateRange=");
        sbF.append(this.f);
        sbF.append(")");
        return sbF.toString();
    }
}
