package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class d24 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public d24(String str, String str2, String str3, String str4, String str5, String str6) {
        w20.p(str, str2, str3, str4, str5);
        str6.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d24)) {
            return false;
        }
        d24 d24Var = (d24) obj;
        return wl7.b(this.a, d24Var.a) && wl7.b(this.b, d24Var.b) && wl7.b(this.c, d24Var.c) && wl7.b(this.d, d24Var.d) && wl7.b(this.e, d24Var.e) && wl7.b(this.f, d24Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + akb.d(akb.d(akb.d(akb.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("DetectLocationResult(formattedLocation=", this.a, ", postalCode=", this.b, ", admin1=");
        ia.r(sbF, this.c, ", admin2=", this.d, ", admin3=");
        return z3.n(sbF, this.e, ", admin4=", this.f, ")");
    }
}
