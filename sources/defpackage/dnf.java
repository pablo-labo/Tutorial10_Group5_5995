package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dnf {
    public final cnf a;
    public final Integer b;
    public final gu5<j6g> c;
    public final w5 d;

    public /* synthetic */ dnf(cnf cnfVar, Integer num, rr rrVar, int i) {
        this((i & 1) != 0 ? null : cnfVar, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : rrVar, (w5) null);
    }

    public static dnf a(dnf dnfVar, w5 w5Var) {
        cnf cnfVar = dnfVar.a;
        Integer num = dnfVar.b;
        gu5<j6g> gu5Var = dnfVar.c;
        dnfVar.getClass();
        return new dnf(cnfVar, num, gu5Var, w5Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnf)) {
            return false;
        }
        dnf dnfVar = (dnf) obj;
        return this.a == dnfVar.a && wl7.b(this.b, dnfVar.b) && wl7.b(this.c, dnfVar.c) && this.d == dnfVar.d;
    }

    public final int hashCode() {
        cnf cnfVar = this.a;
        int iHashCode = (cnfVar == null ? 0 : cnfVar.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        gu5<j6g> gu5Var = this.c;
        int iHashCode3 = (iHashCode2 + (gu5Var == null ? 0 : gu5Var.hashCode())) * 31;
        w5 w5Var = this.d;
        return iHashCode3 + (w5Var != null ? w5Var.hashCode() : 0);
    }

    public final String toString() {
        return "ToastUiState(toastType=" + this.a + ", variableCount=" + this.b + ", action=" + this.c + ", accessibilityAnnouncementType=" + this.d + ")";
    }

    public dnf() {
        this((cnf) null, (Integer) (0 == true ? 1 : 0), (rr) (0 == true ? 1 : 0), 15);
    }

    public dnf(cnf cnfVar, Integer num, gu5<j6g> gu5Var, w5 w5Var) {
        this.a = cnfVar;
        this.b = num;
        this.c = gu5Var;
        this.d = w5Var;
    }
}
