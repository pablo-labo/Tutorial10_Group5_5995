package defpackage;

import defpackage.g15;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class cv8 implements g15.a {
    public final String a;
    public final ArrayList b;
    public final c c;
    public final b d;
    public final d e;
    public final k38 f;
    public final a g;
    public final String h;

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
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;
        public final String i;

        public b(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
            this.g = str7;
            this.h = str8;
            this.i = str9;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return wl7.b(this.a, bVar.a) && wl7.b(this.b, bVar.b) && wl7.b(this.c, bVar.c) && wl7.b(this.d, bVar.d) && wl7.b(this.e, bVar.e) && wl7.b(this.f, bVar.f) && wl7.b(this.g, bVar.g) && wl7.b(this.h, bVar.h) && wl7.b(this.i, bVar.i);
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
            int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.h;
            int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.i;
            return iHashCode8 + (str9 != null ? str9.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbF = u40.f("Location(address=", this.a, ", address2=", this.b, ", admin1=");
            ia.r(sbF, this.c, ", city=", this.d, ", country=");
            ia.r(sbF, this.e, ", formattedLocation=", this.f, ", location=");
            ia.r(sbF, this.g, ", postalCode=", this.h, ", state=");
            return l6.i(sbF, this.i, ")");
        }
    }

    public static final class c {
        public final Object a;

        public c(Object obj) {
            this.a = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && wl7.b(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            Object obj = this.a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final String toString() {
            return v40.e(this.a, "Metadata(collectionTimestamp=", ")");
        }
    }

    public static final class d {
        public final String a;
        public final String b;

        public d(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return wl7.b(this.a, dVar.a) && wl7.b(this.b, dVar.b);
        }

        public final int hashCode() {
            String str = this.a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return akb.k("TaxonomyConceptTitle(label=", this.a, ", suid=", this.b, ")");
        }
    }

    public cv8(String str, ArrayList arrayList, c cVar, b bVar, d dVar, k38 k38Var, a aVar, String str2) {
        this.a = str;
        this.b = arrayList;
        this.c = cVar;
        this.d = bVar;
        this.e = dVar;
        this.f = k38Var;
        this.g = aVar;
        this.h = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cv8)) {
            return false;
        }
        cv8 cv8Var = (cv8) obj;
        return wl7.b(this.a, cv8Var.a) && this.b.equals(cv8Var.b) && wl7.b(this.c, cv8Var.c) && wl7.b(this.d, cv8Var.d) && wl7.b(this.e, cv8Var.e) && this.f == cv8Var.f && wl7.b(this.g, cv8Var.g) && this.h.equals(cv8Var.h);
    }

    public final int hashCode() {
        String str = this.a;
        int iD = z3.d(this.b, (str == null ? 0 : str.hashCode()) * 31, 31);
        c cVar = this.c;
        int iHashCode = (iD + (cVar == null ? 0 : cVar.hashCode())) * 31;
        b bVar = this.d;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        d dVar = this.e;
        int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        k38 k38Var = this.f;
        int iHashCode4 = (iHashCode3 + (k38Var == null ? 0 : k38Var.hashCode())) * 31;
        a aVar = this.g;
        return this.h.hashCode() + ((iHashCode4 + (aVar != null ? aVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "LicensesForMobileRichProfile(title=" + this.a + ", endorsements=" + this.b + ", metadata=" + this.c + ", location=" + this.d + ", taxonomyConceptTitle=" + this.e + ", type=" + this.f + ", dateRange=" + this.g + ", id=" + this.h + ")";
    }
}
