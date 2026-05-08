package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class bzc {
    public final String a;
    public final String b;
    public final Double c;
    public final String d;
    public final String e;
    public final boolean f;
    public final String g;
    public final String h;
    public final String i;

    public bzc(String str, String str2, Double d, String str3, String str4, boolean z, String str5, String str6, String str7) {
        str5.getClass();
        this.a = str;
        this.b = str2;
        this.c = d;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = str5;
        this.h = str6;
        this.i = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bzc)) {
            return false;
        }
        bzc bzcVar = (bzc) obj;
        return this.a.equals(bzcVar.a) && this.b.equals(bzcVar.b) && wl7.b(this.c, bzcVar.c) && this.d.equals(bzcVar.d) && wl7.b(this.e, bzcVar.e) && this.f == bzcVar.f && wl7.b(this.g, bzcVar.g) && wl7.b(this.h, bzcVar.h) && this.i.equals(bzcVar.i);
    }

    public final int hashCode() {
        int iD = akb.d(this.a.hashCode() * 31, 31, this.b);
        Double d = this.c;
        int iD2 = akb.d((iD + (d == null ? 0 : d.hashCode())) * 31, 31, this.d);
        String str = this.e;
        int iD3 = akb.d(ia.f((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f), 31, this.g);
        String str2 = this.h;
        return this.i.hashCode() + ((iD3 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("RelevantJobsAppWidgetItem(title=", this.a, ", companyName=", this.b, ", rating=");
        sbF.append(this.c);
        sbF.append(", location=");
        sbF.append(this.d);
        sbF.append(", compensationRate=");
        akb.q(this.e, ", applyWithIndeed=", ", dateOnIndeed=", sbF, this.f);
        ia.r(sbF, this.g, ", query=", this.h, ", jobRedirectUrl=");
        return l6.i(sbF, this.i, ")");
    }
}
