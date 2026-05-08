package defpackage;

import defpackage.ha;
import defpackage.p4a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class z9g implements p4a<a> {
    public final ueg a;

    public static final class a implements p4a.a {
        public final d a;

        public a(d dVar) {
            this.a = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && wl7.b(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            d dVar = this.a;
            if (dVar == null) {
                return 0;
            }
            return dVar.hashCode();
        }

        public final String toString() {
            return "Data(updateJobSeekerProfileStructuredDataPreference=" + this.a + ")";
        }
    }

    public static final class b {
        public final String a;
        public final String b;
        public final h68 c;
        public final String d;

        public b(h68 h68Var, String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = h68Var;
            this.d = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return wl7.b(this.a, bVar.a) && wl7.b(this.b, bVar.b) && this.c == bVar.c && wl7.b(this.d, bVar.d);
        }

        public final int hashCode() {
            String str = this.a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iHashCode2 = (this.c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            String str3 = this.d;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbF = u40.f("JobTitle(id=", this.a, ", jobTitle=", this.b, ", sentiment=");
            sbF.append(this.c);
            sbF.append(", normalizedValue=");
            sbF.append(this.d);
            sbF.append(")");
            return sbF.toString();
        }
    }

    public static final class c {
        public final String a;
        public final ArrayList b;

        public c(String str, ArrayList arrayList) {
            this.a = str;
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return wl7.b(this.a, cVar.a) && this.b.equals(cVar.b);
        }

        public final int hashCode() {
            String str = this.a;
            return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return "Preference(id=" + this.a + ", jobTitles=" + this.b + ")";
        }
    }

    public static final class d {
        public final c a;

        public d(c cVar) {
            this.a = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && wl7.b(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            c cVar = this.a;
            if (cVar == null) {
                return 0;
            }
            return cVar.hashCode();
        }

        public final String toString() {
            return "UpdateJobSeekerProfileStructuredDataPreference(preference=" + this.a + ")";
        }
    }

    public z9g(ueg uegVar) {
        uegVar.getClass();
        this.a = uegVar;
    }

    @Override // defpackage.g15
    public final ena a() {
        bag bagVar = bag.a;
        ha.g gVar = ha.a;
        return new ena(bagVar, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation UpdateJobSeekerProfileJobTitlePreference($input: UpdateJobSeekerProfileStructuredDataPreferenceInput!) { updateJobSeekerProfileStructuredDataPreference(input: $input) { preference { id jobTitles { id jobTitle sentiment normalizedValue } } } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = s4a.R;
        snaVar.getClass();
        List<vd2> list = aag.d;
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
        veg.a.b(hc8Var, lb3Var, this.a);
        hc8Var.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z9g) && wl7.b(this.a, ((z9g) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "2e7102e438b0cdbfdb80f79dc2077da5b6f091edf83061dcef374f72eb2d9749";
    }

    @Override // defpackage.pua
    public final String name() {
        return "UpdateJobSeekerProfileJobTitlePreference";
    }

    public final String toString() {
        return "UpdateJobSeekerProfileJobTitlePreferenceMutation(input=" + this.a + ")";
    }
}
