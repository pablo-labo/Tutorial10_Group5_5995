package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ou6 {
    public final int a;
    public final String b;
    public final gu5<j6g> c;
    public final boolean d;
    public final Integer e;
    public final boolean f;

    public ou6() {
        throw null;
    }

    public ou6(int i, String str, gu5 gu5Var, boolean z, Integer num, boolean z2, int i2) {
        z2 = (i2 & 32) != 0 ? false : z2;
        str.getClass();
        gu5Var.getClass();
        this.a = i;
        this.b = str;
        this.c = gu5Var;
        this.d = z;
        this.e = num;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ou6)) {
            return false;
        }
        ou6 ou6Var = (ou6) obj;
        return this.a == ou6Var.a && wl7.b(this.b, ou6Var.b) && wl7.b(this.c, ou6Var.c) && this.d == ou6Var.d && wl7.b(this.e, ou6Var.e) && this.f == ou6Var.f;
    }

    public final int hashCode() {
        int iF = ia.f(w40.d(akb.d(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        Integer num = this.e;
        return ia.f((iF + (num == null ? 0 : num.hashCode())) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sbJ = m6.j(this.a, "IdlFilter(id=", ", title=", this.b, ", action=");
        sbJ.append(this.c);
        sbJ.append(", isSelected=");
        sbJ.append(this.d);
        sbJ.append(", count=");
        sbJ.append(this.e);
        sbJ.append(", showBadge=");
        sbJ.append(this.f);
        sbJ.append(", iconName=null)");
        return sbJ.toString();
    }
}
