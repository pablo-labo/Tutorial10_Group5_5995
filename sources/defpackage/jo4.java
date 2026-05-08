package defpackage;

import defpackage.g15;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class jo4 implements g15.a {
    public final String a;
    public final String b;
    public final List<b> c;
    public final c d;
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
        public final f d;
        public final g e;

        public b(String str, String str2, String str3, f fVar, g gVar) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = fVar;
            this.e = gVar;
        }

        public static b a(b bVar, String str, String str2, int i) {
            if ((i & 1) != 0) {
                str = bVar.a;
            }
            String str3 = str;
            if ((i & 2) != 0) {
                str2 = bVar.b;
            }
            String str4 = bVar.c;
            f fVar = bVar.d;
            g gVar = bVar.e;
            bVar.getClass();
            return new b(str3, str2, str4, fVar, gVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return wl7.b(this.a, bVar.a) && wl7.b(this.b, bVar.b) && this.c.equals(bVar.c) && wl7.b(this.d, bVar.d) && wl7.b(this.e, bVar.e);
        }

        public final int hashCode() {
            String str = this.a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iD = akb.d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.c);
            f fVar = this.d;
            int iHashCode2 = (iD + (fVar == null ? 0 : fVar.hashCode())) * 31;
            g gVar = this.e;
            return iHashCode2 + (gVar != null ? gVar.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbF = u40.f("Degree(degreeName=", this.a, ", field=", this.b, ", id=");
            sbF.append(this.c);
            sbF.append(", taxonomyConceptDegree=");
            sbF.append(this.d);
            sbF.append(", taxonomyConceptField=");
            sbF.append(this.e);
            sbF.append(")");
            return sbF.toString();
        }
    }

    public static final class c {
        public final String a;
        public final String b;
        public final String c;

        public c(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public static c a(c cVar, String str, String str2, String str3, int i) {
            if ((i & 1) != 0) {
                str = cVar.a;
            }
            if ((i & 2) != 0) {
                str2 = cVar.b;
            }
            if ((i & 4) != 0) {
                str3 = cVar.c;
            }
            cVar.getClass();
            return new c(str, str2, str3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return wl7.b(this.a, cVar.a) && wl7.b(this.b, cVar.b) && wl7.b(this.c, cVar.c);
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

    public static final class d {
        public final String a;

        public d(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && wl7.b(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return l5.m("SectionId1(sectionId=", this.a, ")");
        }
    }

    public static final class e {
        public final String a;

        public e(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && wl7.b(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return l5.m("SectionId(sectionId=", this.a, ")");
        }
    }

    public static final class f {
        public final String a;
        public final ArrayList b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;

        public f(String str, ArrayList arrayList, String str2, String str3, String str4, String str5) {
            this.a = str;
            this.b = arrayList;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return wl7.b(this.a, fVar.a) && this.b.equals(fVar.b) && wl7.b(this.c, fVar.c) && wl7.b(this.d, fVar.d) && wl7.b(this.e, fVar.e) && wl7.b(this.f, fVar.f);
        }

        public final int hashCode() {
            String str = this.a;
            int iD = z3.d(this.b, (str == null ? 0 : str.hashCode()) * 31, 31);
            String str2 = this.c;
            int iHashCode = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.d;
            int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.e;
            int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f;
            return iHashCode3 + (str5 != null ? str5.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TaxonomyConceptDegree(label=");
            sb.append(this.a);
            sb.append(", sectionIds=");
            sb.append(this.b);
            sb.append(", suid=");
            ia.r(sb, this.c, ", taxonomyConceptId=", this.d, ", type=");
            return z3.n(sb, this.e, ", uuid=", this.f, ")");
        }
    }

    public static final class g {
        public final String a;
        public final ArrayList b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;

        public g(String str, ArrayList arrayList, String str2, String str3, String str4, String str5) {
            this.a = str;
            this.b = arrayList;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return wl7.b(this.a, gVar.a) && this.b.equals(gVar.b) && wl7.b(this.c, gVar.c) && wl7.b(this.d, gVar.d) && wl7.b(this.e, gVar.e) && wl7.b(this.f, gVar.f);
        }

        public final int hashCode() {
            String str = this.a;
            int iD = z3.d(this.b, (str == null ? 0 : str.hashCode()) * 31, 31);
            String str2 = this.c;
            int iHashCode = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.d;
            int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.e;
            int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f;
            return iHashCode3 + (str5 != null ? str5.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TaxonomyConceptField(label=");
            sb.append(this.a);
            sb.append(", sectionIds=");
            sb.append(this.b);
            sb.append(", suid=");
            ia.r(sb, this.c, ", taxonomyConceptId=", this.d, ", type=");
            return z3.n(sb, this.e, ", uuid=", this.f, ")");
        }
    }

    public jo4(String str, String str2, List<b> list, c cVar, a aVar, String str3) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = cVar;
        this.e = aVar;
        this.f = str3;
    }

    public static jo4 a(jo4 jo4Var, String str, ArrayList arrayList, c cVar, a aVar, int i) {
        String str2 = jo4Var.a;
        if ((i & 2) != 0) {
            str = jo4Var.b;
        }
        String str3 = str;
        List<b> list = arrayList;
        if ((i & 4) != 0) {
            list = jo4Var.c;
        }
        List<b> list2 = list;
        if ((i & 8) != 0) {
            cVar = jo4Var.d;
        }
        c cVar2 = cVar;
        if ((i & 16) != 0) {
            aVar = jo4Var.e;
        }
        return new jo4(str2, str3, list2, cVar2, aVar, jo4Var.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jo4)) {
            return false;
        }
        jo4 jo4Var = (jo4) obj;
        return this.a.equals(jo4Var.a) && wl7.b(this.b, jo4Var.b) && this.c.equals(jo4Var.c) && wl7.b(this.d, jo4Var.d) && wl7.b(this.e, jo4Var.e) && wl7.b(this.f, jo4Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iG = ia.g(this.c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        c cVar = this.d;
        int iHashCode2 = (iG + (cVar == null ? 0 : cVar.hashCode())) * 31;
        a aVar = this.e;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str2 = this.f;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("EducationsForMobileRichProfile(id=", this.a, ", school=", this.b, ", degree=");
        sbF.append(this.c);
        sbF.append(", location=");
        sbF.append(this.d);
        sbF.append(", dateRange=");
        sbF.append(this.e);
        sbF.append(", additionalDetails=");
        sbF.append(this.f);
        sbF.append(")");
        return sbF.toString();
    }
}
