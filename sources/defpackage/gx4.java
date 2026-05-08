package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gx4 {
    public final x2b a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final gu5<j6g> g;
    public final String h;
    public final gu5<j6g> i;

    public gx4(x2b x2bVar, String str, String str2, String str3, String str4, String str5, gu5<j6g> gu5Var, String str6, gu5<j6g> gu5Var2) {
        x2bVar.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        gu5Var.getClass();
        this.a = x2bVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = gu5Var;
        this.h = str6;
        this.i = gu5Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gx4)) {
            return false;
        }
        gx4 gx4Var = (gx4) obj;
        return wl7.b(this.a, gx4Var.a) && wl7.b(this.b, gx4Var.b) && wl7.b(this.c, gx4Var.c) && wl7.b(this.d, gx4Var.d) && wl7.b(this.e, gx4Var.e) && wl7.b(this.f, gx4Var.f) && wl7.b(this.g, gx4Var.g) && wl7.b(this.h, gx4Var.h) && wl7.b(this.i, gx4Var.i);
    }

    public final int hashCode() {
        int iD = akb.d(akb.d(akb.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iD2 = w40.d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.g);
        String str3 = this.h;
        int iHashCode2 = (iD2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        gu5<j6g> gu5Var = this.i;
        return iHashCode2 + (gu5Var != null ? gu5Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ErrorStateConfig(icon=");
        sb.append(this.a);
        sb.append(", iconDescription=");
        sb.append(this.b);
        sb.append(", title=");
        ia.r(sb, this.c, ", subtitle=", this.d, ", footerLinkText=");
        ia.r(sb, this.e, ", footerNormalText=", this.f, ", onClickLink=");
        sb.append(this.g);
        sb.append(", buttonText=");
        sb.append(this.h);
        sb.append(", onClickButton=");
        sb.append(this.i);
        sb.append(")");
        return sb.toString();
    }
}
