package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ax6 {
    public final String a;
    public final gu5<j6g> b;
    public final fv6 c;
    public final boolean d;
    public final boolean e;

    public ax6() {
        throw null;
    }

    public ax6(String str, gu5 gu5Var, fv6 fv6Var, boolean z, boolean z2, int i) {
        fv6Var = (i & 8) != 0 ? null : fv6Var;
        z = (i & 16) != 0 ? false : z;
        z2 = (i & 32) != 0 ? false : z2;
        str.getClass();
        gu5Var.getClass();
        this.a = str;
        this.b = gu5Var;
        this.c = fv6Var;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ax6)) {
            return false;
        }
        ax6 ax6Var = (ax6) obj;
        return wl7.b(this.a, ax6Var.a) && wl7.b(this.b, ax6Var.b) && this.c == ax6Var.c && this.d == ax6Var.d && this.e == ax6Var.e;
    }

    public final int hashCode() {
        int iD = w40.d(this.a.hashCode() * 31, 961, this.b);
        fv6 fv6Var = this.c;
        return ia.f(ia.f((iD + (fv6Var == null ? 0 : fv6Var.hashCode())) * 31, 31, this.d), 29791, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IdlSelectListItem(label=");
        sb.append(this.a);
        sb.append(", tapAction=");
        sb.append(this.b);
        sb.append(", description=null, iconName=");
        sb.append(this.c);
        sb.append(", isSelected=");
        sb.append(this.d);
        sb.append(", isDestructive=");
        return z3.o(sb, this.e, ", contentBefore=null, contentAfter=null, testTag=null)");
    }
}
