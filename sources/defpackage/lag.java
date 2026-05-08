package defpackage;

import defpackage.ha;
import defpackage.p4a;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class lag implements p4a<a> {
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
        public final f68 b;
        public final String c;
        public final Double d;
        public final Boolean e;

        public b(f68 f68Var, Boolean bool, Double d, String str, String str2) {
            this.a = str;
            this.b = f68Var;
            this.c = str2;
            this.d = d;
            this.e = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return wl7.b(this.a, bVar.a) && this.b == bVar.b && wl7.b(this.c, bVar.c) && wl7.b(this.d, bVar.d) && wl7.b(this.e, bVar.e);
        }

        public final int hashCode() {
            String str = this.a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            f68 f68Var = this.b;
            int iHashCode2 = (iHashCode + (f68Var == null ? 0 : f68Var.hashCode())) * 31;
            String str2 = this.c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Double d = this.d;
            int iHashCode4 = (iHashCode3 + (d == null ? 0 : d.hashCode())) * 31;
            Boolean bool = this.e;
            return iHashCode4 + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MinimumPay(id=");
            sb.append(this.a);
            sb.append(", salaryType=");
            sb.append(this.b);
            sb.append(", currency=");
            sb.append(this.c);
            sb.append(", amount=");
            sb.append(this.d);
            sb.append(", amountExists=");
            return l5.n(sb, this.e, ")");
        }
    }

    public static final class c {
        public final b a;

        public c(b bVar) {
            this.a = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && wl7.b(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            b bVar = this.a;
            if (bVar == null) {
                return 0;
            }
            return bVar.hashCode();
        }

        public final String toString() {
            return "Preference(minimumPay=" + this.a + ")";
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

    public lag(ueg uegVar) {
        uegVar.getClass();
        this.a = uegVar;
    }

    @Override // defpackage.g15
    public final ena a() {
        nag nagVar = nag.a;
        ha.g gVar = ha.a;
        return new ena(nagVar, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation UpdateJobSeekerProfileMinimumPayPreference($input: UpdateJobSeekerProfileStructuredDataPreferenceInput!) { updateJobSeekerProfileStructuredDataPreference(input: $input) { preference { minimumPay { id salaryType currency amount amountExists } } } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = s4a.R;
        snaVar.getClass();
        List<vd2> list = mag.d;
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
        return (obj instanceof lag) && wl7.b(this.a, ((lag) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "5cc2e473ac2321b7ceba84cbe2dd84d07b046ddc529cdf4d3cc6201de5c19c95";
    }

    @Override // defpackage.pua
    public final String name() {
        return "UpdateJobSeekerProfileMinimumPayPreference";
    }

    public final String toString() {
        return "UpdateJobSeekerProfileMinimumPayPreferenceMutation(input=" + this.a + ")";
    }
}
