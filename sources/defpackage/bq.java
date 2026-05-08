package defpackage;

import defpackage.ha;
import defpackage.p4a;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class bq implements p4a<b> {
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
        public final Double a;
        public final Boolean b;
        public final String c;
        public final f68 d;

        public c(f68 f68Var, Boolean bool, Double d, String str) {
            this.a = d;
            this.b = bool;
            this.c = str;
            this.d = f68Var;
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
            Double d = this.a;
            int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
            Boolean bool = this.b;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            String str = this.c;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            f68 f68Var = this.d;
            return iHashCode3 + (f68Var != null ? f68Var.hashCode() : 0);
        }

        public final String toString() {
            return "MinimumPay(amount=" + this.a + ", amountExists=" + this.b + ", currency=" + this.c + ", salaryType=" + this.d + ")";
        }
    }

    public static final class d {
        public final String a;
        public final c b;

        public d(String str, c cVar) {
            this.a = str;
            this.b = cVar;
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
            c cVar = this.b;
            return iHashCode + (cVar != null ? cVar.hashCode() : 0);
        }

        public final String toString() {
            return "Preference(id=" + this.a + ", minimumPay=" + this.b + ")";
        }
    }

    public bq(zp zpVar) {
        zpVar.getClass();
        this.a = zpVar;
    }

    @Override // defpackage.g15
    public final ena a() {
        eq eqVar = eq.a;
        ha.g gVar = ha.a;
        return new ena(eqVar, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation AddJobSeekerProfileStructuredDataPreference($input: AddJobSeekerProfileStructuredDataPreferenceInput!) { addJobSeekerProfileStructuredDataPreference(input: $input) { preference { id minimumPay { amount amountExists currency salaryType } } } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = s4a.R;
        snaVar.getClass();
        List<vd2> list = cq.d;
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
        return (obj instanceof bq) && wl7.b(this.a, ((bq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "9daeb535c00788090d198d52f8872c2f4fa6511e2657f55902cd44489da44404";
    }

    @Override // defpackage.pua
    public final String name() {
        return "AddJobSeekerProfileStructuredDataPreference";
    }

    public final String toString() {
        return "AddJobSeekerProfileStructuredDataPreferenceMutation(input=" + this.a + ")";
    }
}
