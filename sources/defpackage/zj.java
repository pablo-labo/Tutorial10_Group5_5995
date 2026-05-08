package defpackage;

import defpackage.ha;
import defpackage.p4a;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zj implements p4a<b> {
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
        public final Integer a;

        public c(Integer num) {
            this.a = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && wl7.b(this.a, ((c) obj).a);
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
            return "Preference(id=" + this.a + ", maximumCommute=" + this.b + ")";
        }
    }

    public zj(zp zpVar) {
        this.a = zpVar;
    }

    @Override // defpackage.g15
    public final ena a() {
        ck ckVar = ck.a;
        ha.g gVar = ha.a;
        return new ena(ckVar, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation AddJobSeekerProfileCommutePreference($input: AddJobSeekerProfileStructuredDataPreferenceInput!) { addJobSeekerProfileStructuredDataPreference(input: $input) { preference { id maximumCommute { timeMinutes } } } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = s4a.R;
        snaVar.getClass();
        List<vd2> list = ak.d;
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
        return (obj instanceof zj) && this.a.equals(((zj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "db39c3b59b91f8afaf8cf7122ad644dc49009176cdecb0f8e652eb1f8a612e92";
    }

    @Override // defpackage.pua
    public final String name() {
        return "AddJobSeekerProfileCommutePreference";
    }

    public final String toString() {
        return "AddJobSeekerProfileCommutePreferenceMutation(input=" + this.a + ")";
    }
}
