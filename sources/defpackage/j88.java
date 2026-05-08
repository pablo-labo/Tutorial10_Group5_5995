package defpackage;

import defpackage.c9c;
import defpackage.ha;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class j88 implements c9c<c> {
    public final ou9 a;

    public static final class a {
        public final String a;
        public final mob b;

        public a(String str, mob mobVar) {
            this.a = str;
            this.b = mobVar;
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
            return "AllocationResult(__typename=" + this.a + ", proctorAllocationResult=" + this.b + ")";
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
        public final String j;

        public b(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
            this.g = str7;
            this.h = str8;
            this.i = str9;
            this.j = str10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return wl7.b(this.a, bVar.a) && wl7.b(this.b, bVar.b) && wl7.b(this.c, bVar.c) && wl7.b(this.d, bVar.d) && wl7.b(this.e, bVar.e) && wl7.b(this.f, bVar.f) && wl7.b(this.g, bVar.g) && wl7.b(this.h, bVar.h) && wl7.b(this.i, bVar.i) && wl7.b(this.j, bVar.j);
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
            int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.j;
            return iHashCode9 + (str10 != null ? str10.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbF = u40.f("AttributionParametersPayload(affiliateKey=", this.a, ", host=", this.b, ", keywords=");
            ia.r(sbF, this.c, ", newCookieValue=", this.d, ", refTime=");
            ia.r(sbF, this.e, ", refType=", this.f, ", referrer=");
            ia.r(sbF, this.g, ", reqAffiliateKey=", this.h, ", reqKeywords=");
            return z3.n(sbF, this.i, ", reqRefType=", this.j, ")");
        }
    }

    public static final class c implements c9c.a {
        public final e a;

        public c(e eVar) {
            this.a = eVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && wl7.b(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            e eVar = this.a;
            if (eVar == null) {
                return 0;
            }
            return eVar.hashCode();
        }

        public final String toString() {
            return "Data(jobseekerMobileAppInit=" + this.a + ")";
        }
    }

    public static final class d {
        public final String a;
        public final mob b;

        public d(String str, mob mobVar) {
            this.a = str;
            this.b = mobVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a.equals(dVar.a) && this.b.equals(dVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "DynamicAllocationResult(__typename=" + this.a + ", proctorAllocationResult=" + this.b + ")";
        }
    }

    public static final class e {
        public final String a;
        public final ArrayList b;
        public final f c;
        public final Object d;
        public final Object e;
        public final b f;
        public final Boolean g;
        public final Boolean h;

        public e(String str, ArrayList arrayList, f fVar, Object obj, Object obj2, b bVar, Boolean bool, Boolean bool2) {
            this.a = str;
            this.b = arrayList;
            this.c = fVar;
            this.d = obj;
            this.e = obj2;
            this.f = bVar;
            this.g = bool;
            this.h = bool2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return wl7.b(this.a, eVar.a) && this.b.equals(eVar.b) && this.c.equals(eVar.c) && wl7.b(this.d, eVar.d) && wl7.b(this.e, eVar.e) && wl7.b(this.f, eVar.f) && wl7.b(this.g, eVar.g) && wl7.b(this.h, eVar.h);
        }

        public final int hashCode() {
            String str = this.a;
            int iHashCode = (this.c.hashCode() + z3.d(this.b, (str == null ? 0 : str.hashCode()) * 31, 31)) * 31;
            Object obj = this.d;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.e;
            int iHashCode3 = (iHashCode2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            b bVar = this.f;
            int iHashCode4 = (iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            Boolean bool = this.g;
            int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.h;
            return iHashCode5 + (bool2 != null ? bool2.hashCode() : 0);
        }

        public final String toString() {
            return "JobseekerMobileAppInit(ctk=" + this.a + ", services=" + this.b + ", proctorResult=" + this.c + ", ipCountry=" + this.d + ", ipLookupCountry=" + this.e + ", attributionParametersPayload=" + this.f + ", showBlockingTOSBanner=" + this.g + ", showForceUpgradeModal=" + this.h + ")";
        }
    }

    public static final class f {
        public final String a;
        public final ArrayList b;
        public final ArrayList c;
        public final String d;
        public final int e;
        public final String f;
        public final List<String> g;

        public f(String str, ArrayList arrayList, ArrayList arrayList2, String str2, int i, String str3, List list) {
            this.a = str;
            this.b = arrayList;
            this.c = arrayList2;
            this.d = str2;
            this.e = i;
            this.f = str3;
            this.g = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.a.equals(fVar.a) && this.b.equals(fVar.b) && this.c.equals(fVar.c) && this.d.equals(fVar.d) && this.e == fVar.e && this.f.equals(fVar.f) && wl7.b(this.g, fVar.g);
        }

        public final int hashCode() {
            int iD = akb.d(w40.c(this.e, akb.d(z3.d(this.c, z3.d(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d), 31), 31, this.f);
            List<String> list = this.g;
            return iD + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ProctorResult(deviceId=");
            sb.append(this.a);
            sb.append(", allocationResults=");
            sb.append(this.b);
            sb.append(", dynamicAllocationResults=");
            sb.append(this.c);
            sb.append(", matrixVersion=");
            sb.append(this.d);
            sb.append(", proctorResultUpdateInterval=");
            sb.append(this.e);
            sb.append(", proctorAllocationResultString=");
            sb.append(this.f);
            sb.append(", errors=");
            return g7.i(sb, this.g, ")");
        }
    }

    public static final class g {
        public final String a;
        public final Object b;

        public g(Object obj, String str) {
            this.a = str;
            this.b = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.a.equals(gVar.a) && this.b.equals(gVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Service(name=" + this.a + ", url=" + this.b + ")";
        }
    }

    public j88(ou9 ou9Var) {
        this.a = ou9Var;
    }

    @Override // defpackage.g15
    public final ena a() {
        n88 n88Var = n88.a;
        ha.g gVar = ha.a;
        return new ena(n88Var, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "query JobseekerMobileAppInit($input: MobileAppInitPayloadInput!) { jobseekerMobileAppInit(input: $input) { ctk services { name url } proctorResult { deviceId allocationResults { __typename ...ProctorAllocationResult } dynamicAllocationResults { __typename ...ProctorAllocationResult } matrixVersion proctorResultUpdateInterval proctorAllocationResultString errors } ipCountry ipLookupCountry attributionParametersPayload { affiliateKey host keywords newCookieValue refTime refType referrer reqAffiliateKey reqKeywords reqRefType } showBlockingTOSBanner showForceUpgradeModal } }  fragment ProctorAllocationResult on MobileAppProctorAllocationResult { testName bucket { value description payload { value type } } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = h9c.j;
        snaVar.getClass();
        List<vd2> list = k88.g;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
        hc8Var.u0("input");
        ha.g gVar = ha.a;
        hc8Var.j();
        pu9.a.b(hc8Var, lb3Var, this.a);
        hc8Var.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j88) && this.a.equals(((j88) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "95ba9393c02f4749995b0ede9d28605acfd888a7ffc410910284a1c1c7a2a999";
    }

    @Override // defpackage.pua
    public final String name() {
        return "JobseekerMobileAppInit";
    }

    public final String toString() {
        return "JobseekerMobileAppInitQuery(input=" + this.a + ")";
    }
}
