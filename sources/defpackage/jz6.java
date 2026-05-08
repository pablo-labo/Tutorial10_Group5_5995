package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jz6 {
    public final fv6 a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final gu5<j6g> f;
    public final gu5<j6g> g;

    public jz6(int i, boolean z) {
        fv6 fv6Var = fv6.C1;
        String str = (i & 2) != 0 ? "" : null;
        String str2 = (i & 4) != 0 ? "" : null;
        String str3 = (i & 8) != 0 ? "" : null;
        z = (i & 16) != 0 ? false : z;
        wy2 wy2Var = new wy2(6);
        qr0 qr0Var = new qr0(2);
        fv6Var.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.a = fv6Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = wy2Var;
        this.g = qr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jz6)) {
            return false;
        }
        jz6 jz6Var = (jz6) obj;
        return this.a == jz6Var.a && wl7.b(this.b, jz6Var.b) && wl7.b(this.c, jz6Var.c) && wl7.b(this.d, jz6Var.d) && this.e == jz6Var.e && wl7.b(this.f, jz6Var.f) && wl7.b(this.g, jz6Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + w40.d(ia.f(akb.d(akb.d(akb.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IdlToastExplainState(iconName=");
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
