package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hz1 {
    public final String a;
    public final String b;
    public final ig3 c;
    public final String d;

    public hz1(String str, String str2, ig3 ig3Var, String str3, int i) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        ig3Var = (i & 8) != 0 ? null : ig3Var;
        str3 = (i & 16) != 0 ? null : str3;
        this.a = str;
        this.b = str2;
        this.c = ig3Var;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hz1)) {
            return false;
        }
        hz1 hz1Var = (hz1) obj;
        return wl7.b(this.a, hz1Var.a) && wl7.b(this.b, hz1Var.b) && wl7.b(this.c, hz1Var.c) && wl7.b(this.d, hz1Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 961;
        ig3 ig3Var = this.c;
        int iHashCode3 = (iHashCode2 + (ig3Var == null ? 0 : ig3Var.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("CertificationItem(id=", this.a, ", title=", this.b, ", titleTaxonomySuid=null, dateRange=");
        sbF.append(this.c);
        sbF.append(", description=");
        sbF.append(this.d);
        sbF.append(")");
        return sbF.toString();
    }

    public hz1() {
        this(null, null, null, null, 31);
    }
}
