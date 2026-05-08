package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mt9 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final ig3 f;

    public /* synthetic */ mt9(String str, String str2, String str3, String str4, ig3 ig3Var, int i) {
        this((i & 1) != 0 ? null : "", (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 64) != 0 ? null : ig3Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mt9)) {
            return false;
        }
        mt9 mt9Var = (mt9) obj;
        return wl7.b(this.a, mt9Var.a) && wl7.b(this.b, mt9Var.b) && wl7.b(this.c, mt9Var.c) && wl7.b(this.d, mt9Var.d) && wl7.b(this.e, mt9Var.e) && wl7.b(this.f, mt9Var.f);
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
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 961;
        ig3 ig3Var = this.f;
        return iHashCode5 + (ig3Var != null ? ig3Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("MilitaryServiceItem(id=", this.a, ", country=", this.b, ", branch=");
        ia.r(sbF, this.c, ", rank=", this.d, ", description=");
        sbF.append(this.e);
        sbF.append(", serviceCode=null, dateRange=");
        sbF.append(this.f);
        sbF.append(")");
        return sbF.toString();
    }

    public mt9() {
        this((String) null, (String) null, (String) null, (String) null, (ig3) null, 127);
    }

    public mt9(String str, String str2, String str3, String str4, String str5, ig3 ig3Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = ig3Var;
    }
}
