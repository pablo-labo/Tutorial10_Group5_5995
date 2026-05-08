package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class z73 {
    public final w73 a;
    public final List<y73> b;

    public z73(w73 w73Var, List<y73> list) {
        this.a = w73Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z73)) {
            return false;
        }
        z73 z73Var = (z73) obj;
        return wl7.b(this.a, z73Var.a) && wl7.b(this.b, z73Var.b);
    }

    public final int hashCode() {
        w73 w73Var = this.a;
        int iHashCode = (w73Var == null ? 0 : w73Var.hashCode()) * 31;
        List<y73> list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "CrowTaxoSkillsQuestionModel(idLabel=" + this.a + ", options=" + this.b + ")";
    }
}
