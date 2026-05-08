package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class a83 {
    public final w73 a;

    public a83(w73 w73Var) {
        this.a = w73Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a83) && wl7.b(this.a, ((a83) obj).a);
    }

    public final int hashCode() {
        w73 w73Var = this.a;
        if (w73Var == null) {
            return 0;
        }
        return w73Var.hashCode();
    }

    public final String toString() {
        return "CrowTaxoSkillsTagModel(idLabel=" + this.a + ")";
    }
}
