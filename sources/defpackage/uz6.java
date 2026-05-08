package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uz6 {
    public final fv6 a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final gu5<j6g> f;
    public final gu5<j6g> g;

    public uz6(fv6 fv6Var, String str, String str2, String str3, boolean z, int i) {
        fv6Var = (i & 1) != 0 ? fv6.C1 : fv6Var;
        str = (i & 2) != 0 ? "" : str;
        str2 = (i & 4) != 0 ? null : str2;
        str3 = (i & 8) != 0 ? "" : str3;
        z = (i & 16) != 0 ? false : z;
        o7 o7Var = new o7(4);
        zw zwVar = new zw(4);
        fv6Var.getClass();
        str.getClass();
        str3.getClass();
        this.a = fv6Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = o7Var;
        this.g = zwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uz6)) {
            return false;
        }
        uz6 uz6Var = (uz6) obj;
        return this.a == uz6Var.a && wl7.b(this.b, uz6Var.b) && wl7.b(this.c, uz6Var.c) && wl7.b(this.d, uz6Var.d) && this.e == uz6Var.e && wl7.b(this.f, uz6Var.f) && wl7.b(this.g, uz6Var.g);
    }

    public final int hashCode() {
        int iD = akb.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.g.hashCode() + w40.d(ia.f(akb.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IdlToastState(iconName=");
        sb.append(this.a);
        sb.append(", label=");
        sb.append(this.b);
        sb.append(", explainerText=");
        ia.r(sb, this.c, ", ctaText=", this.d, ", showDialog=");
        sb.append(this.e);
        sb.append(", onCtaClick=");
        sb.append(this.f);
        sb.append(", onDismiss=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
