package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class xy1 {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public xy1(String str, String str2, boolean z, String str3, String str4, String str5, String str6) {
        w20.p(str, str2, str3, str4, str5);
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xy1)) {
            return false;
        }
        xy1 xy1Var = (xy1) obj;
        return wl7.b(this.a, xy1Var.a) && wl7.b(this.b, xy1Var.b) && this.c == xy1Var.c && wl7.b(this.d, xy1Var.d) && wl7.b(this.e, xy1Var.e) && wl7.b(this.f, xy1Var.f) && wl7.b(this.g, xy1Var.g);
    }

    public final int hashCode() {
        int iD = akb.d(akb.d(akb.d(ia.f(akb.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        String str = this.g;
        return iD + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbF = u40.f("CategorizedHamburgerMenuItem(id=", this.a, ", categoryId=", this.b, ", isLoggedIn=");
        k6.k(", locale=", this.d, ", destinationUrl=", sbF, this.c);
        ia.r(sbF, this.e, ", label=", this.f, ", subtitle=");
        return l6.i(sbF, this.g, ")");
    }
}
