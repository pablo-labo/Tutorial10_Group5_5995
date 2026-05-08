package defpackage;

import defpackage.ha;
import defpackage.p4a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class mk implements p4a<b> {
    public final zp a;

    public static final class a {
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
            return "AddJobSeekerProfileStructuredDataPreference(preference=" + this.a + ")";
        }
    }

    public static final class b implements p4a.a {
        public final a a;

        public b(a aVar) {
            this.a = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && wl7.b(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            a aVar = this.a;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        public final String toString() {
            return "Data(addJobSeekerProfileStructuredDataPreference=" + this.a + ")";
        }
    }

    public static final class c {
        public final String a;
        public final String b;
        public final h68 c;
        public final String d;

        public c(h68 h68Var, String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = h68Var;
            this.d = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return wl7.b(this.a, cVar.a) && wl7.b(this.b, cVar.b) && this.c == cVar.c && wl7.b(this.d, cVar.d);
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

    public static final class d {
        public final String a;
        public final ArrayList b;

        public d(String str, ArrayList arrayList) {
            this.a = str;
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return wl7.b(this.a, dVar.a) && this.b.equals(dVar.b);
        }

        public final int hashCode() {
            String str = this.a;
            return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return "Preference(id=" + this.a + ", jobTitles=" + this.b + ")";
        }
    }

    public mk(zp zpVar) {
        zpVar.getClass();
        this.a = zpVar;
    }

    @Override // defpackage.g15
    public final ena a() {
        pk pkVar = pk.a;
        ha.g gVar = ha.a;
        return new ena(pkVar, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation AddJobSeekerProfileJobTitlePreference($input: AddJobSeekerProfileStructuredDataPreferenceInput!) { addJobSeekerProfileStructuredDataPreference(input: $input) { preference { id jobTitles { id jobTitle sentiment normalizedValue } } } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = s4a.R;
        snaVar.getClass();
        List<vd2> list = nk.d;
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
        aq.a.b(hc8Var, lb3Var, this.a);
        hc8Var.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mk) && wl7.b(this.a, ((mk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "862fb0c6b3a483f9d0d3f3372e720346d2d50f7c23982cc9561a56637adf5cd4";
    }

    @Override // defpackage.pua
    public final String name() {
        return "AddJobSeekerProfileJobTitlePreference";
    }

    public final String toString() {
        return "AddJobSeekerProfileJobTitlePreferenceMutation(input=" + this.a + ")";
    }
}
