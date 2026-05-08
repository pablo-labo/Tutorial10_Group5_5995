package defpackage;

import defpackage.c9c;
import defpackage.ha;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class s36 implements c9c<b> {

    public static final class a {
        public final String a;
        public final String b;
        public final String c;
        public final f d;

        public a(String str, String str2, String str3, f fVar) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return wl7.b(this.a, aVar.a) && wl7.b(this.b, aVar.b) && wl7.b(this.c, aVar.c) && wl7.b(this.d, aVar.d);
        }

        public final int hashCode() {
            String str = this.a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            f fVar = this.d;
            return iHashCode3 + (fVar != null ? fVar.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbF = u40.f("ContactInformation(firstName=", this.a, ", lastName=", this.b, ", phoneNumber=");
            sbF.append(this.c);
            sbF.append(", location=");
            sbF.append(this.d);
            sbF.append(")");
            return sbF.toString();
        }
    }

    public static final class b implements c9c.a {
        public final e a;

        public b(e eVar) {
            this.a = eVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && wl7.b(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            e eVar = this.a;
            if (eVar == null) {
                return 0;
            }
            return eVar.hashCode();
        }

        public final String toString() {
            return "Data(jobSeekerProfile=" + this.a + ")";
        }
    }

    public static final class c {
        public final a a;
        public final h b;

        public c(a aVar, h hVar) {
            this.a = aVar;
            this.b = hVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return wl7.b(this.a, cVar.a) && wl7.b(this.b, cVar.b);
        }

        public final int hashCode() {
            a aVar = this.a;
            int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
            h hVar = this.b;
            return iHashCode + (hVar != null ? hVar.hashCode() : 0);
        }

        public final String toString() {
            return "DefaultInfo(contactInformation=" + this.a + ", privacy=" + this.b + ")";
        }
    }

    public static final class d {
        public final o18 a;
        public final String b;

        public d(o18 o18Var, String str) {
            this.a = o18Var;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && this.b.equals(dVar.b);
        }

        public final int hashCode() {
            o18 o18Var = this.a;
            return this.b.hashCode() + ((o18Var == null ? 0 : o18Var.hashCode()) * 31);
        }

        public final String toString() {
            return "EmploymentEligibility(employmentEligibility=" + this.a + ", id=" + this.b + ")";
        }
    }

    public static final class e {
        public final i a;

        public e(i iVar) {
            this.a = iVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && wl7.b(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            i iVar = this.a;
            if (iVar == null) {
                return 0;
            }
            return iVar.hashCode();
        }

        public final String toString() {
            return "JobSeekerProfile(profile=" + this.a + ")";
        }
    }

    public static final class f {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;
        public final String i;

        public f(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
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
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return wl7.b(this.a, fVar.a) && wl7.b(this.b, fVar.b) && wl7.b(this.c, fVar.c) && wl7.b(this.d, fVar.d) && wl7.b(this.e, fVar.e) && wl7.b(this.f, fVar.f) && wl7.b(this.g, fVar.g) && wl7.b(this.h, fVar.h) && wl7.b(this.i, fVar.i);
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
            StringBuilder sbF = u40.f("Location1(address=", this.a, ", address2=", this.b, ", admin1=");
            ia.r(sbF, this.c, ", city=", this.d, ", country=");
            ia.r(sbF, this.e, ", formattedLocation=", this.f, ", location=");
            ia.r(sbF, this.g, ", postalCode=", this.h, ", state=");
            return l6.i(sbF, this.i, ")");
        }
    }

    public static final class g {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;
        public final String i;

        public g(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
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
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return wl7.b(this.a, gVar.a) && wl7.b(this.b, gVar.b) && wl7.b(this.c, gVar.c) && wl7.b(this.d, gVar.d) && wl7.b(this.e, gVar.e) && wl7.b(this.f, gVar.f) && wl7.b(this.g, gVar.g) && wl7.b(this.h, gVar.h) && wl7.b(this.i, gVar.i);
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

    public static final class h {
        public final r48 a;

        public h(r48 r48Var) {
            this.a = r48Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.a == ((h) obj).a;
        }

        public final int hashCode() {
            r48 r48Var = this.a;
            if (r48Var == null) {
                return 0;
            }
            return r48Var.hashCode();
        }

        public final String toString() {
            return "Privacy(sourcingElection=" + this.a + ")";
        }
    }

    public static final class i {
        public final ArrayList a;
        public final c b;

        public i(ArrayList arrayList, c cVar) {
            this.a = arrayList;
            this.b = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return this.a.equals(iVar.a) && wl7.b(this.b, iVar.b);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            c cVar = this.b;
            return iHashCode + (cVar == null ? 0 : cVar.hashCode());
        }

        public final String toString() {
            return "Profile(resume=" + this.a + ", defaultInfo=" + this.b + ")";
        }
    }

    public static final class j {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final ArrayList f;
        public final Boolean g;
        public final g h;

        public j(String str, String str2, String str3, String str4, String str5, ArrayList arrayList, Boolean bool, g gVar) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = arrayList;
            this.g = bool;
            this.h = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.a.equals(jVar.a) && wl7.b(this.b, jVar.b) && wl7.b(this.c, jVar.c) && wl7.b(this.d, jVar.d) && wl7.b(this.e, jVar.e) && this.f.equals(jVar.f) && wl7.b(this.g, jVar.g) && wl7.b(this.h, jVar.h);
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
            int iD = z3.d(this.f, (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31);
            Boolean bool = this.g;
            int iHashCode5 = (iD + (bool == null ? 0 : bool.hashCode())) * 31;
            g gVar = this.h;
            return iHashCode5 + (gVar != null ? gVar.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbF = u40.f("Resume(id=", this.a, ", firstName=", this.b, ", lastName=");
            ia.r(sbF, this.c, ", headline=", this.d, ", phoneNumber=");
            sbF.append(this.e);
            sbF.append(", employmentEligibilities=");
            sbF.append(this.f);
            sbF.append(", showPhoneNumber=");
            sbF.append(this.g);
            sbF.append(", location=");
            sbF.append(this.h);
            sbF.append(")");
            return sbF.toString();
        }
    }

    @Override // defpackage.g15
    public final ena a() {
        v36 v36Var = v36.a;
        ha.g gVar = ha.a;
        return new ena(v36Var, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "query GetRichProfileContactInfo { jobSeekerProfile { profile { resume { id firstName lastName headline phoneNumber employmentEligibilities { employmentEligibility id } showPhoneNumber location { address address2 admin1 city country formattedLocation location postalCode state } } defaultInfo { contactInformation { firstName lastName phoneNumber location { address address2 admin1 city country formattedLocation location postalCode state } } privacy { sourcingElection } } } } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = f9c.e;
        snaVar.getClass();
        List<vd2> list = t36.j;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == s36.class;
    }

    public final int hashCode() {
        return fwc.a.b(s36.class).hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "adc4370384f025a5b59ab631197661d8173e5d200553af05ec81e4140236438c";
    }

    @Override // defpackage.pua
    public final String name() {
        return "GetRichProfileContactInfo";
    }
}
