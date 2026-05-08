package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class bhd {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public bhd(String str, String str2, String str3, String str4, String str5, String str6) {
        w20.p(str2, str3, str4, str5, str6);
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
        if (!(obj instanceof bhd)) {
            return false;
        }
        bhd bhdVar = (bhd) obj;
        return this.a.equals(bhdVar.a) && wl7.b(this.b, bhdVar.b) && wl7.b(this.c, bhdVar.c) && wl7.b(this.d, bhdVar.d) && wl7.b(this.e, bhdVar.e) && wl7.b(this.f, bhdVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + akb.d(akb.d(akb.d(akb.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("RowData(countryCode=", this.a, ", countryName=", this.b, ", altCountryName=");
        ia.r(sbF, this.c, ", languageCode=", this.d, ", languageName=");
        return z3.n(sbF, this.e, ", altLanguageName=", this.f, ")");
    }
}
