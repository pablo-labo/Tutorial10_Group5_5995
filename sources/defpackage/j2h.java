package defpackage;

import defpackage.g15;

/* JADX INFO: loaded from: classes3.dex */
public final class j2h implements g15.a {
    public final String a;
    public final String b;
    public final String c;
    public final b d;
    public final a e;
    public final String f;

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

    public static final class b {
        public final String a;
        public final String b;
        public final String c;

        public b(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return wl7.b(this.a, bVar.a) && wl7.b(this.b, bVar.b) && wl7.b(this.c, bVar.c);
        }

        public final int hashCode() {
            String str = this.a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            return l6.i(u40.f("Location(country=", this.a, ", formattedLocation=", this.b, ", unknownLocation="), this.c, ")");
        }
    }

    public j2h(String str, String str2, String str3, b bVar, a aVar, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bVar;
        this.e = aVar;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j2h)) {
            return false;
        }
        j2h j2hVar = (j2h) obj;
        return this.a.equals(j2hVar.a) && wl7.b(this.b, j2hVar.b) && wl7.b(this.c, j2hVar.c) && wl7.b(this.d, j2hVar.d) && wl7.b(this.e, j2hVar.e) && wl7.b(this.f, j2hVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        b bVar = this.d;
        int iHashCode4 = (iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        a aVar = this.e;
        int iHashCode5 = (iHashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str3 = this.f;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("WorkExperiencesForMobileRichProfile(id=", this.a, ", title=", this.b, ", company=");
        sbF.append(this.c);
        sbF.append(", location=");
        sbF.append(this.d);
        sbF.append(", dateRange=");
        sbF.append(this.e);
        sbF.append(", description=");
        sbF.append(this.f);
        sbF.append(")");
        return sbF.toString();
    }
}
