package defpackage;

import defpackage.ha;
import defpackage.p4a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class sfg implements p4a<a> {
    public final kcg a;

    public static final class a implements p4a.a {
        public final e a;

        public a(e eVar) {
            this.a = eVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && wl7.b(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            e eVar = this.a;
            if (eVar == null) {
                return 0;
            }
            return eVar.hashCode();
        }

        public final String toString() {
            return "Data(updateJobSeekerProfileResume=" + this.a + ")";
        }
    }

    public static final class b {
        public final String a;
        public final o18 b;

        public b(o18 o18Var, String str) {
            this.a = str;
            this.b = o18Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && this.b == bVar.b;
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            o18 o18Var = this.b;
            return iHashCode + (o18Var == null ? 0 : o18Var.hashCode());
        }

        public final String toString() {
            return "EmploymentEligibility(id=" + this.a + ", employmentEligibility=" + this.b + ")";
        }
    }

    public static final class c {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;
        public final String i;

        public c(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
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
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return wl7.b(this.a, cVar.a) && wl7.b(this.b, cVar.b) && wl7.b(this.c, cVar.c) && wl7.b(this.d, cVar.d) && wl7.b(this.e, cVar.e) && wl7.b(this.f, cVar.f) && wl7.b(this.g, cVar.g) && wl7.b(this.h, cVar.h) && wl7.b(this.i, cVar.i);
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

    public static final class d {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final Boolean f;
        public final c g;
        public final ArrayList h;

        public d(String str, String str2, String str3, String str4, String str5, Boolean bool, c cVar, ArrayList arrayList) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = bool;
            this.g = cVar;
            this.h = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a.equals(dVar.a) && wl7.b(this.b, dVar.b) && wl7.b(this.c, dVar.c) && wl7.b(this.d, dVar.d) && wl7.b(this.e, dVar.e) && wl7.b(this.f, dVar.f) && wl7.b(this.g, dVar.g) && this.h.equals(dVar.h);
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
            Boolean bool = this.f;
            int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
            c cVar = this.g;
            return this.h.hashCode() + ((iHashCode6 + (cVar != null ? cVar.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sbF = u40.f("Resume(id=", this.a, ", firstName=", this.b, ", lastName=");
            ia.r(sbF, this.c, ", headline=", this.d, ", phoneNumber=");
            sbF.append(this.e);
            sbF.append(", showPhoneNumber=");
            sbF.append(this.f);
            sbF.append(", location=");
            sbF.append(this.g);
            sbF.append(", employmentEligibilities=");
            sbF.append(this.h);
            sbF.append(")");
            return sbF.toString();
        }
    }

    public static final class e {
        public final d a;

        public e(d dVar) {
            this.a = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && wl7.b(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            d dVar = this.a;
            if (dVar == null) {
                return 0;
            }
            return dVar.hashCode();
        }

        public final String toString() {
            return "UpdateJobSeekerProfileResume(resume=" + this.a + ")";
        }
    }

    public sfg(kcg kcgVar) {
        this.a = kcgVar;
    }

    @Override // defpackage.g15
    public final ena a() {
        ufg ufgVar = ufg.a;
        ha.g gVar = ha.a;
        return new ena(ufgVar, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation UpdateRichProfileResumeContactInfo($input: UpdateJobSeekerProfileResumeInput!) { updateJobSeekerProfileResume(input: $input) { resume { id firstName lastName headline phoneNumber showPhoneNumber location { address address2 admin1 city country formattedLocation location postalCode state } employmentEligibilities { id employmentEligibility } } } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = s4a.R;
        snaVar.getClass();
        List<vd2> list = tfg.e;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
        hc8Var.u0("input");
        pv3 pv3Var = pv3.d;
        ha.g gVar = ha.a;
        hc8Var.j();
        pv3Var.b(hc8Var, lb3Var, this.a);
        hc8Var.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sfg) && this.a.equals(((sfg) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "c74438350bdc9e301a78f4866b2634fa2f40876f0130e0329ac75c2b7dd87487";
    }

    @Override // defpackage.pua
    public final String name() {
        return "UpdateRichProfileResumeContactInfo";
    }

    public final String toString() {
        return "UpdateRichProfileResumeContactInfoMutation(input=" + this.a + ")";
    }
}
