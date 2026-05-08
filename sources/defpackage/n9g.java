package defpackage;

import defpackage.ha;
import defpackage.p4a;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class n9g implements p4a<a> {
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
        public final Integer a;

        public b(Integer num) {
            this.a = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && wl7.b(this.a, ((b) obj).a);
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

    public static final class c {
        public final String a;
        public final b b;

        public c(String str, b bVar) {
            this.a = str;
            this.b = bVar;
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
            String str = this.a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            b bVar = this.b;
            return iHashCode + (bVar != null ? bVar.hashCode() : 0);
        }

        public final String toString() {
            return "Preference(id=" + this.a + ", maximumCommute=" + this.b + ")";
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

    public n9g(ueg uegVar) {
        this.a = uegVar;
    }

    @Override // defpackage.g15
    public final ena a() {
        p9g p9gVar = p9g.a;
        ha.g gVar = ha.a;
        return new ena(p9gVar, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation UpdateJobSeekerProfileCommutePreference($input: UpdateJobSeekerProfileStructuredDataPreferenceInput!) { updateJobSeekerProfileStructuredDataPreference(input: $input) { preference { id maximumCommute { timeMinutes } } } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = s4a.R;
        snaVar.getClass();
        List<vd2> list = o9g.d;
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
        return (obj instanceof n9g) && this.a.equals(((n9g) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "d155490e5373339c2f5f92f5e5a36b9ea62b1a440bda0033967b6cd68c648666";
    }

    @Override // defpackage.pua
    public final String name() {
        return "UpdateJobSeekerProfileCommutePreference";
    }

    public final String toString() {
        return "UpdateJobSeekerProfileCommutePreferenceMutation(input=" + this.a + ")";
    }
}
