package defpackage;

import defpackage.g15;

/* JADX INFO: loaded from: classes3.dex */
public final class it9 implements g15.a {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final a g;

    public static final class a {
        public final String a;
        public final ig3 b;

        public a(String str, ig3 ig3Var) {
            this.a = str;
            this.b = ig3Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "DateRange(__typename=" + this.a + ", dateRangeForMobileRichProfile=" + this.b + ")";
        }
    }

    public it9(String str, String str2, String str3, String str4, String str5, String str6, a aVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = aVar;
    }

    public static it9 a(it9 it9Var, String str, String str2, String str3, String str4, a aVar, int i) {
        String str5 = it9Var.a;
        if ((i & 2) != 0) {
            str = it9Var.b;
        }
        String str6 = str;
        if ((i & 4) != 0) {
            str2 = it9Var.c;
        }
        String str7 = str2;
        if ((i & 8) != 0) {
            str3 = it9Var.d;
        }
        String str8 = str3;
        if ((i & 16) != 0) {
            str4 = it9Var.e;
        }
        String str9 = str4;
        String str10 = it9Var.f;
        if ((i & 64) != 0) {
            aVar = it9Var.g;
        }
        it9Var.getClass();
        return new it9(str5, str6, str7, str8, str9, str10, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof it9)) {
            return false;
        }
        it9 it9Var = (it9) obj;
        return this.a.equals(it9Var.a) && wl7.b(this.b, it9Var.b) && wl7.b(this.c, it9Var.c) && wl7.b(this.d, it9Var.d) && wl7.b(this.e, it9Var.e) && wl7.b(this.f, it9Var.f) && wl7.b(this.g, it9Var.g);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        a aVar = this.g;
        return iHashCode6 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("MilitaryServiceForMobileRichProfile(id=", this.a, ", country=", this.b, ", branch=");
        ia.r(sbF, this.c, ", rank=", this.d, ", description=");
        ia.r(sbF, this.e, ", serviceCode=", this.f, ", dateRange=");
        sbF.append(this.g);
        sbF.append(")");
        return sbF.toString();
    }
}
