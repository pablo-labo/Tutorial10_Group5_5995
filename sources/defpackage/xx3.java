package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class xx3 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;

    public xx3(String str, String str2, String str3, String str4, long j, long j2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = j;
        this.f = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xx3)) {
            return false;
        }
        xx3 xx3Var = (xx3) obj;
        return wl7.b(this.a, xx3Var.a) && wl7.b(this.b, xx3Var.b) && wl7.b(this.c, xx3Var.c) && wl7.b(this.d, xx3Var.d) && this.e == xx3Var.e && this.f == xx3Var.f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + ia.d(akb.d(akb.d(akb.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("DeletedRecentSearch(uid=", this.a, ", accountId=", this.b, ", whatQuery=");
        ia.r(sbF, this.c, ", whereQuery=", this.d, ", searchTimestamp=");
        sbF.append(this.e);
        sbF.append(", createdAt=");
        sbF.append(this.f);
        sbF.append(")");
        return sbF.toString();
    }
}
