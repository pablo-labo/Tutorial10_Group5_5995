package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xr7 {
    public final String a;
    public final sr7 b;
    public final String c;

    public xr7(String str, sr7 sr7Var, String str2) {
        this.a = str;
        this.b = sr7Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xr7)) {
            return false;
        }
        xr7 xr7Var = (xr7) obj;
        return wl7.b(this.a, xr7Var.a) && wl7.b(this.b, xr7Var.b) && wl7.b(this.c, xr7Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        sr7 sr7Var = this.b;
        int iHashCode2 = (iHashCode + (sr7Var == null ? 0 : sr7Var.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JSTProfileGroup(groupTitle=");
        sb.append(this.a);
        sb.append(", dateRange=");
        sb.append(this.b);
        sb.append(", description=");
        return l6.i(sb, this.c, ")");
    }
}
