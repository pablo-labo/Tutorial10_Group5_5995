package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class xe6 {
    public final String a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public xe6(String str, String str2, boolean z, String str3, String str4, String str5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xe6)) {
            return false;
        }
        xe6 xe6Var = (xe6) obj;
        return wl7.b(this.a, xe6Var.a) && this.b == xe6Var.b && wl7.b(this.c, xe6Var.c) && wl7.b(this.d, xe6Var.d) && wl7.b(this.e, xe6Var.e) && wl7.b(this.f, xe6Var.f);
    }

    public final int hashCode() {
        int iD = akb.d(akb.d(akb.d(ia.f(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        return iD + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HamburgerMenuItem(id=");
        sb.append(this.a);
        sb.append(", isLoggedIn=");
        sb.append(this.b);
        sb.append(", locale=");
        ia.r(sb, this.c, ", destinationUrl=", this.d, ", label=");
        return z3.n(sb, this.e, ", subtitle=", this.f, ")");
    }
}
