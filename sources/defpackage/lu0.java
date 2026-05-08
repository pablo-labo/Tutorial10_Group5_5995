package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class lu0 {
    public final String a;
    public final String b;
    public final ig3 c;
    public final String d;

    public /* synthetic */ lu0(String str, ig3 ig3Var, String str2, int i) {
        this((String) null, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : ig3Var, (i & 8) != 0 ? null : str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lu0)) {
            return false;
        }
        lu0 lu0Var = (lu0) obj;
        return wl7.b(this.a, lu0Var.a) && wl7.b(this.b, lu0Var.b) && wl7.b(this.c, lu0Var.c) && wl7.b(this.d, lu0Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ig3 ig3Var = this.c;
        int iHashCode3 = (iHashCode2 + (ig3Var == null ? 0 : ig3Var.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("AssociationItem(id=", this.a, ", title=", this.b, ", timePeriod=");
        sbF.append(this.c);
        sbF.append(", description=");
        sbF.append(this.d);
        sbF.append(")");
        return sbF.toString();
    }

    public lu0() {
        this((String) null, (ig3) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), 15);
    }

    public lu0(String str, String str2, ig3 ig3Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = ig3Var;
        this.d = str3;
    }
}
