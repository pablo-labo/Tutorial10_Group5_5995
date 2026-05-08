package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class x73 {
    public final w73 a;
    public final z73 b;

    public x73(w73 w73Var, z73 z73Var) {
        this.a = w73Var;
        this.b = z73Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x73)) {
            return false;
        }
        x73 x73Var = (x73) obj;
        return wl7.b(this.a, x73Var.a) && wl7.b(this.b, x73Var.b);
    }

    public final int hashCode() {
        w73 w73Var = this.a;
        int iHashCode = (w73Var == null ? 0 : w73Var.hashCode()) * 31;
        z73 z73Var = this.b;
        return iHashCode + (z73Var != null ? z73Var.hashCode() : 0);
    }

    public final String toString() {
        return "CrowTaxoSkillsOQVTModel(idLabel=" + this.a + ", question=" + this.b + ")";
    }

    public x73() {
        this(null, null);
    }
}
