package defpackage;

import defpackage.c9c;
import defpackage.ha;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class y46 implements c9c<a> {

    public static final class a implements c9c.a {
        public final b a;

        public a(b bVar) {
            this.a = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && wl7.b(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            b bVar = this.a;
            if (bVar == null) {
                return 0;
            }
            return bVar.a.hashCode();
        }

        public final String toString() {
            return "Data(jobSeekerProfileStructuredData=" + this.a + ")";
        }
    }

    public static final class b {
        public final ArrayList a;

        public b(ArrayList arrayList) {
            this.a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a.equals(((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return m6.g("JobSeekerProfileStructuredData(preferences=", ")", this.a);
        }
    }

    public static final class c {
        public final String a;
        public final String b;
        public final String c;
        public final h68 d;

        public c(h68 h68Var, String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = h68Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return wl7.b(this.a, cVar.a) && wl7.b(this.b, cVar.b) && wl7.b(this.c, cVar.c) && this.d == cVar.d;
        }

        public final int hashCode() {
            String str = this.a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            return this.d.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sbF = u40.f("JobTitle(id=", this.a, ", jobTitle=", this.b, ", normalizedValue=");
            sbF.append(this.c);
            sbF.append(", sentiment=");
            sbF.append(this.d);
            sbF.append(")");
            return sbF.toString();
        }
    }

    public static final class d {
        public final String a;
        public final String b;
        public final String c;
        public final String d;

        public d(String str, String str2, String str3, String str4) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return wl7.b(this.a, dVar.a) && wl7.b(this.b, dVar.b) && wl7.b(this.c, dVar.c) && wl7.b(this.d, dVar.d);
        }

        public final int hashCode() {
            String str = this.a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.d;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        public final String toString() {
            return z3.n(u40.f("Location(id=", this.a, ", formattedLocationFull=", this.b, ", formattedLocationShort="), this.c, ", raw=", this.d, ")");
        }
    }

    public static final class e {
        public final Integer a;

        public e(Integer num) {
            this.a = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && wl7.b(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            Integer num = this.a;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public final String toString() {
            return "MaximumCommute(timeMinutes=" + this.a + ")";
        }
    }

    public static final class f {
        public final String a;
        public final Double b;
        public final f68 c;
        public final String d;
        public final Boolean e;

        public f(f68 f68Var, Boolean bool, Double d, String str, String str2) {
            this.a = str;
            this.b = d;
            this.c = f68Var;
            this.d = str2;
            this.e = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return wl7.b(this.a, fVar.a) && wl7.b(this.b, fVar.b) && this.c == fVar.c && wl7.b(this.d, fVar.d) && wl7.b(this.e, fVar.e);
        }

        public final int hashCode() {
            String str = this.a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Double d = this.b;
            int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
            f68 f68Var = this.c;
            int iHashCode3 = (iHashCode2 + (f68Var == null ? 0 : f68Var.hashCode())) * 31;
            String str2 = this.d;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.e;
            return iHashCode4 + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MinimumPay(id=");
            sb.append(this.a);
            sb.append(", amount=");
            sb.append(this.b);
            sb.append(", salaryType=");
            sb.append(this.c);
            sb.append(", currency=");
            sb.append(this.d);
            sb.append(", amountExists=");
            return l5.n(sb, this.e, ")");
        }
    }

    public static final class g {
        public final String a;
        public final String b;
        public final f c;
        public final ArrayList d;
        public final h e;
        public final ArrayList f;
        public final e g;

        public g(String str, String str2, f fVar, ArrayList arrayList, h hVar, ArrayList arrayList2, e eVar) {
            this.a = str;
            this.b = str2;
            this.c = fVar;
            this.d = arrayList;
            this.e = hVar;
            this.f = arrayList2;
            this.g = eVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return wl7.b(this.a, gVar.a) && wl7.b(this.b, gVar.b) && wl7.b(this.c, gVar.c) && this.d.equals(gVar.d) && wl7.b(this.e, gVar.e) && this.f.equals(gVar.f) && wl7.b(this.g, gVar.g);
        }

        public final int hashCode() {
            String str = this.a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            f fVar = this.c;
            int iD = z3.d(this.d, (iHashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31, 31);
            h hVar = this.e;
            int iD2 = z3.d(this.f, (iD + (hVar == null ? 0 : hVar.hashCode())) * 31, 31);
            e eVar = this.g;
            return iD2 + (eVar != null ? eVar.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbF = u40.f("Preference(uuid=", this.a, ", id=", this.b, ", minimumPay=");
            sbF.append(this.c);
            sbF.append(", jobTitles=");
            sbF.append(this.d);
            sbF.append(", relocation=");
            sbF.append(this.e);
            sbF.append(", locations=");
            sbF.append(this.f);
            sbF.append(", maximumCommute=");
            sbF.append(this.g);
            sbF.append(")");
            return sbF.toString();
        }
    }

    public static final class h {
        public final Boolean a;
        public final c58 b;

        public h(Boolean bool, c58 c58Var) {
            this.a = bool;
            this.b = c58Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return wl7.b(this.a, hVar.a) && this.b == hVar.b;
        }

        public final int hashCode() {
            Boolean bool = this.a;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            c58 c58Var = this.b;
            return iHashCode + (c58Var != null ? c58Var.hashCode() : 0);
        }

        public final String toString() {
            return "Relocation(ableToRelocate=" + this.a + ", source=" + this.b + ")";
        }
    }

    @Override // defpackage.g15
    public final ena a() {
        a56 a56Var = a56.a;
        ha.g gVar = ha.a;
        return new ena(a56Var, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "query GetSdcPreferences { jobSeekerProfileStructuredData(input: { queryFilter: { dataCategories: [CONFIRMED_BY_USER] }  } ) { preferences { uuid id minimumPay { id amount salaryType currency amountExists } jobTitles { id jobTitle normalizedValue sentiment } relocation { ableToRelocate source } locations { id formattedLocationFull formattedLocationShort raw } maximumCommute { timeMinutes } } } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = f9c.e;
        snaVar.getClass();
        List<vd2> list = z46.h;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == y46.class;
    }

    public final int hashCode() {
        return fwc.a.b(y46.class).hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "8bb3cb892a4ca468c70829507a7a899bd65882456c5a7a3ba3ab52148cd5a3f0";
    }

    @Override // defpackage.pua
    public final String name() {
        return "GetSdcPreferences";
    }
}
