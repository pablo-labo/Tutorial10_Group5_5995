package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dp7 {
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final Double f;

    public dp7(boolean z, String str, String str2, String str3, boolean z2, Double d) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z2;
        this.f = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dp7)) {
            return false;
        }
        dp7 dp7Var = (dp7) obj;
        return this.a == dp7Var.a && wl7.b(this.b, dp7Var.b) && wl7.b(this.c, dp7Var.c) && wl7.b(this.d, dp7Var.d) && this.e == dp7Var.e && wl7.b(this.f, dp7Var.f);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iF = ia.f((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.e);
        Double d = this.f;
        return iF + (d != null ? d.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JSTAccountStatusRecord(isLoggedIn=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", accountId=");
        ia.r(sb, this.c, ", emailAddress=", this.d, ", isConfirmed=");
        sb.append(this.e);
        sb.append(", creationDate=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
