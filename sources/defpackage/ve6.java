package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ve6 {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;

    public ve6(String str, String str2, String str3, boolean z) {
        str.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ve6)) {
            return false;
        }
        ve6 ve6Var = (ve6) obj;
        return wl7.b(this.a, ve6Var.a) && wl7.b(this.b, ve6Var.b) && this.c == ve6Var.c && wl7.b(this.d, ve6Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + ia.f((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("HamburgerMenuCategory(id=", this.a, ", label=", this.b, ", isLoggedIn=");
        sbF.append(this.c);
        sbF.append(", locale=");
        sbF.append(this.d);
        sbF.append(")");
        return sbF.toString();
    }
}
