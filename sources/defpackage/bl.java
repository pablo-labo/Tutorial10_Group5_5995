package defpackage;

import defpackage.ha;
import defpackage.p4a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class bl implements p4a<b> {
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
        public final String c;
        public final String d;

        public c(String str, String str2, String str3, String str4) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return wl7.b(this.a, cVar.a) && wl7.b(this.b, cVar.b) && wl7.b(this.c, cVar.c) && wl7.b(this.d, cVar.d);
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

    public static final class d {
        public final String a;
        public final e b;
        public final ArrayList c;

        public d(String str, e eVar, ArrayList arrayList) {
            this.a = str;
            this.b = eVar;
            this.c = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return wl7.b(this.a, dVar.a) && wl7.b(this.b, dVar.b) && this.c.equals(dVar.c);
        }

        public final int hashCode() {
            String str = this.a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            e eVar = this.b;
            return this.c.hashCode() + ((iHashCode + (eVar != null ? eVar.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "Preference(id=" + this.a + ", relocation=" + this.b + ", locations=" + this.c + ")";
        }
    }

    public static final class e {
        public final Boolean a;
        public final c58 b;

        public e(Boolean bool, c58 c58Var) {
            this.a = bool;
            this.b = c58Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return wl7.b(this.a, eVar.a) && this.b == eVar.b;
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

    public bl(zp zpVar) {
        zpVar.getClass();
        this.a = zpVar;
    }

    @Override // defpackage.g15
    public final ena a() {
        el elVar = el.a;
        ha.g gVar = ha.a;
        return new ena(elVar, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation AddJobSeekerProfileRelocationPreference($input: AddJobSeekerProfileStructuredDataPreferenceInput!) { addJobSeekerProfileStructuredDataPreference(input: $input) { preference { id relocation { ableToRelocate source } locations { id formattedLocationFull formattedLocationShort raw } } } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = s4a.R;
        snaVar.getClass();
        List<vd2> list = cl.e;
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
        return (obj instanceof bl) && wl7.b(this.a, ((bl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "af85e59f28555dcf524d6bbe57c3ba6dc06a0b46d147345c0b34cd4adae08dea";
    }

    @Override // defpackage.pua
    public final String name() {
        return "AddJobSeekerProfileRelocationPreference";
    }

    public final String toString() {
        return "AddJobSeekerProfileRelocationPreferenceMutation(input=" + this.a + ")";
    }
}
