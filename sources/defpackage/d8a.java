package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class d8a {
    public final String a;
    public final String b;
    public final String c;

    public d8a(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d8a)) {
            return false;
        }
        d8a d8aVar = (d8a) obj;
        return this.a.equals(d8aVar.a) && wl7.b(this.b, d8aVar.b) && wl7.b(this.c, d8aVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return l6.i(u40.f("MyJobsUrlParseResult(subscreenId=", this.a, ", from=", this.b, ", applicationId="), this.c, ")");
    }
}
