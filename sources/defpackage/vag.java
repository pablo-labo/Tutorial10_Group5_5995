package defpackage;

import defpackage.ha;
import defpackage.p4a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class vag implements p4a<a> {
    public final ueg a;

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
            return "Data(updateJobSeekerProfileStructuredDataPreference=" + this.a + ")";
        }
    }

    public static final class b {
        public final String a;
        public final String b;
        public final String c;
        public final String d;

        public b(String str, String str2, String str3, String str4) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return wl7.b(this.a, bVar.a) && wl7.b(this.b, bVar.b) && wl7.b(this.c, bVar.c) && wl7.b(this.d, bVar.d);
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

    public static final class c {
        public final String a;
        public final d b;
        public final ArrayList c;

        public c(String str, d dVar, ArrayList arrayList) {
            this.a = str;
            this.b = dVar;
            this.c = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return wl7.b(this.a, cVar.a) && wl7.b(this.b, cVar.b) && this.c.equals(cVar.c);
        }

        public final int hashCode() {
            String str = this.a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            d dVar = this.b;
            return this.c.hashCode() + ((iHashCode + (dVar != null ? dVar.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "Preference(id=" + this.a + ", relocation=" + this.b + ", locations=" + this.c + ")";
        }
    }

    public static final class d {
        public final Boolean a;
        public final c58 b;

        public d(Boolean bool, c58 c58Var) {
            this.a = bool;
            this.b = c58Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return wl7.b(this.a, dVar.a) && this.b == dVar.b;
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

    public static final class e {
        public final c a;

        public e(c cVar) {
            this.a = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && wl7.b(this.a, ((e) obj).a);
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

    public vag(ueg uegVar) {
        uegVar.getClass();
        this.a = uegVar;
    }

    @Override // defpackage.g15
    public final ena a() {
        xag xagVar = xag.a;
        ha.g gVar = ha.a;
        return new ena(xagVar, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation UpdateJobSeekerProfileRelocationPreference($input: UpdateJobSeekerProfileStructuredDataPreferenceInput!) { updateJobSeekerProfileStructuredDataPreference(input: $input) { preference { id relocation { ableToRelocate source } locations { id formattedLocationFull formattedLocationShort raw } } } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = s4a.R;
        snaVar.getClass();
        List<vd2> list = wag.e;
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
        return (obj instanceof vag) && wl7.b(this.a, ((vag) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "63b213cbad6d3b69fcfb9e0a94c96b12a5ffba644cb0ffe0d20407f0287c94d8";
    }

    @Override // defpackage.pua
    public final String name() {
        return "UpdateJobSeekerProfileRelocationPreference";
    }

    public final String toString() {
        return "UpdateJobSeekerProfileRelocationPreferenceMutation(input=" + this.a + ")";
    }
}
