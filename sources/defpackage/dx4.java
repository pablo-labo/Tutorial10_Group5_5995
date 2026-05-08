package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dx4 {
    public final boolean a;
    public final boolean b;
    public final Integer c;
    public final boolean d;
    public final boolean e;
    public final ex4 f;
    public final boolean g;

    public dx4(boolean z, boolean z2, Integer num, boolean z3, boolean z4, ex4 ex4Var, boolean z5) {
        ex4Var.getClass();
        this.a = z;
        this.b = z2;
        this.c = num;
        this.d = z3;
        this.e = z4;
        this.f = ex4Var;
        this.g = z5;
    }

    public static dx4 a(dx4 dx4Var, boolean z, ex4 ex4Var, boolean z2, int i) {
        boolean z3 = dx4Var.a;
        boolean z4 = dx4Var.b;
        Integer num = dx4Var.c;
        boolean z5 = dx4Var.d;
        if ((i & 16) != 0) {
            z = dx4Var.e;
        }
        boolean z6 = z;
        if ((i & 32) != 0) {
            ex4Var = dx4Var.f;
        }
        ex4 ex4Var2 = ex4Var;
        if ((i & 64) != 0) {
            z2 = dx4Var.g;
        }
        dx4Var.getClass();
        ex4Var2.getClass();
        return new dx4(z3, z4, num, z5, z6, ex4Var2, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dx4)) {
            return false;
        }
        dx4 dx4Var = (dx4) obj;
        return this.a == dx4Var.a && this.b == dx4Var.b && wl7.b(this.c, dx4Var.c) && this.d == dx4Var.d && this.e == dx4Var.e && this.f == dx4Var.f && this.g == dx4Var.g;
    }

    public final int hashCode() {
        int iF = ia.f(Boolean.hashCode(this.a) * 31, 31, this.b);
        Integer num = this.c;
        return Boolean.hashCode(this.g) + ((this.f.hashCode() + ia.f(ia.f((iF + (num == null ? 0 : num.hashCode())) * 31, 31, this.d), 31, this.e)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ErrorScreenState(reportButtonIsEnabled=");
        sb.append(this.a);
        sb.append(", retryButtonIsEnabled=");
        sb.append(this.b);
        sb.append(", secondaryButtonIcon=");
        sb.append(this.c);
        sb.append(", errorImageIsVisible=");
        sb.append(this.d);
        sb.append(", shouldShowPrepareReportDialog=");
        sb.append(this.e);
        sb.append(", errorScreenType=");
        sb.append(this.f);
        sb.append(", shouldShowReportErrorToast=");
        return z3.o(sb, this.g, ")");
    }

    public dx4() {
        this(null, 127);
    }

    public /* synthetic */ dx4(ex4 ex4Var, int i) {
        this(true, true, null, true, false, (i & 32) != 0 ? ex4.a : ex4Var, false);
    }
}
