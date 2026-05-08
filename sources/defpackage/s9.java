package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class s9 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Float h;
    public final Integer i;
    public final String j;
    public final String k;

    public s9(String str, String str2, String str3, String str4, String str5, String str6, Float f, Integer num, String str7, String str8) {
        w20.p(str, str3, str4, str5, str6);
        str8.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = "Ad";
        this.g = str6;
        this.h = f;
        this.i = num;
        this.j = str7;
        this.k = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s9)) {
            return false;
        }
        s9 s9Var = (s9) obj;
        return wl7.b(this.a, s9Var.a) && wl7.b(this.b, s9Var.b) && wl7.b(this.c, s9Var.c) && wl7.b(this.d, s9Var.d) && wl7.b(this.e, s9Var.e) && this.f.equals(s9Var.f) && wl7.b(this.g, s9Var.g) && wl7.b(this.h, s9Var.h) && wl7.b(this.i, s9Var.i) && wl7.b(this.j, s9Var.j) && wl7.b(this.k, s9Var.k);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iD = akb.d(akb.d(akb.d(akb.d(akb.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        Float f = this.h;
        int iHashCode2 = (iD + (f == null ? 0 : f.hashCode())) * 31;
        Integer num = this.i;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.j;
        return this.k.hashCode() + ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("AdCardData(headerImageUrl=", this.a, ", logoImageUrl=", this.b, ", companyName=");
        ia.r(sbF, this.c, ", companyDescription=", this.d, ", gotoText=");
        ia.r(sbF, this.e, ", adLabel=", this.f, ", gotoURL=");
        sbF.append(this.g);
        sbF.append(", companyRating=");
        sbF.append(this.h);
        sbF.append(", numReviews=");
        sbF.append(this.i);
        sbF.append(", parentCompanyName=");
        sbF.append(this.j);
        sbF.append(", targetingCriteria=");
        return l6.i(sbF, this.k, ")");
    }
}
