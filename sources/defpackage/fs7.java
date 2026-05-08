package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fs7 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public fs7(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fs7)) {
            return false;
        }
        fs7 fs7Var = (fs7) obj;
        return wl7.b(this.a, fs7Var.a) && wl7.b(this.b, fs7Var.b) && wl7.b(this.c, fs7Var.c) && wl7.b(this.d, fs7Var.d) && wl7.b(this.e, fs7Var.e) && wl7.b(this.f, fs7Var.f) && wl7.b(this.g, fs7Var.g);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.g;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("JSTProfilePersonalInfo(firstName=", this.a, ", lastName=", this.b, ", phoneNumber=");
        ia.r(sbF, this.c, ", location=", this.d, ", country=");
        ia.r(sbF, this.e, ", streetAddress=", this.f, ", postalCode=");
        return l6.i(sbF, this.g, ")");
    }
}
