package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class y73 {
    public final w73 a;
    public final a83 b;

    public y73(w73 w73Var, a83 a83Var) {
        this.a = w73Var;
        this.b = a83Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y73)) {
            return false;
        }
        y73 y73Var = (y73) obj;
        return wl7.b(this.a, y73Var.a) && wl7.b(this.b, y73Var.b);
    }

    public final int hashCode() {
        w73 w73Var = this.a;
        int iHashCode = (w73Var == null ? 0 : w73Var.hashCode()) * 31;
        a83 a83Var = this.b;
        return iHashCode + (a83Var != null ? a83Var.hashCode() : 0);
    }

    public final String toString() {
        return "CrowTaxoSkillsOptionsModel(idLabel=" + this.a + ", tag=" + this.b + ")";
    }

    public y73() {
        this(null, null);
    }
}
