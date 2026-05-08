package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xo0 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final gu5<j6g> e;
    public final boolean f;

    public xo0(String str, String str2, String str3, boolean z, gu5<j6g> gu5Var, boolean z2) {
        gu5Var.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = gu5Var;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xo0)) {
            return false;
        }
        xo0 xo0Var = (xo0) obj;
        return this.a.equals(xo0Var.a) && this.b.equals(xo0Var.b) && this.c.equals(xo0Var.c) && this.d == xo0Var.d && wl7.b(this.e, xo0Var.e) && this.f == xo0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + w40.d(ia.f(akb.d(akb.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("ApplicationWithdrawDataState(jobTitle=", this.a, ", jobLocation=", this.b, ", jobKey=");
        akb.q(this.c, ", shouldShowSurveyQuestions=", ", onWithdrawApplicationClick=", sbF, this.d);
        sbF.append(this.e);
        sbF.append(", isWithdrawalInProgress=");
        sbF.append(this.f);
        sbF.append(")");
        return sbF.toString();
    }
}
