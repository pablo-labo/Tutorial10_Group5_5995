package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class e78 {
    public final String a;
    public final String b;
    public final String c;
    public final h68 d;

    public e78(h68 h68Var, String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = h68Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e78)) {
            return false;
        }
        e78 e78Var = (e78) obj;
        return wl7.b(this.a, e78Var.a) && wl7.b(this.b, e78Var.b) && wl7.b(this.c, e78Var.c) && this.d == e78Var.d;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        h68 h68Var = this.d;
        return iHashCode3 + (h68Var != null ? h68Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("JobTitle(id=", this.a, ", jobTitle=", this.b, ", normalizedValue=");
        sbF.append(this.c);
        sbF.append(", sentiment=");
        sbF.append(this.d);
        sbF.append(")");
        return sbF.toString();
    }

    public e78() {
        this(null, 15);
    }

    public /* synthetic */ e78(String str, int i) {
        this(null, null, (i & 2) != 0 ? null : str, null);
    }
}
