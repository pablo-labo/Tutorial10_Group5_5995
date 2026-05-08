package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class w73 {
    public final String a;
    public final String b;

    public w73(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w73)) {
            return false;
        }
        w73 w73Var = (w73) obj;
        return wl7.b(this.a, w73Var.a) && wl7.b(this.b, w73Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return akb.k("CrowTaxoSkillsOQVTIdLabelModel(id=", this.a, ", label=", this.b, ")");
    }
}
