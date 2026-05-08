package defpackage;

import defpackage.c9c;
import defpackage.ha;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class fqb implements c9c<b> {

    public static final class a {
        public final f a;

        public a(f fVar) {
            this.a = fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && wl7.b(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            f fVar = this.a;
            if (fVar == null) {
                return 0;
            }
            return fVar.hashCode();
        }

        public final String toString() {
            return "ContactInformation(location=" + this.a + ")";
        }
    }

    public static final class b implements c9c.a {
        public final d a;

        public b(d dVar) {
            this.a = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && wl7.b(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            d dVar = this.a;
            if (dVar == null) {
                return 0;
            }
            return dVar.hashCode();
        }

        public final String toString() {
            return "Data(jobSeekerProfile=" + this.a + ")";
        }
    }

    public static final class c {
        public final a a;

        public c(a aVar) {
            this.a = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && wl7.b(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            a aVar = this.a;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        public final String toString() {
            return "DefaultInfo(contactInformation=" + this.a + ")";
        }
    }

    public static final class d {
        public final g a;

        public d(g gVar) {
            this.a = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && wl7.b(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            g gVar = this.a;
            if (gVar == null) {
                return 0;
            }
            return gVar.hashCode();
        }

        public final String toString() {
            return "JobSeekerProfile(profile=" + this.a + ")";
        }
    }

    public static final class e {
        public final String a;
        public final String b;

        public e(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return wl7.b(this.a, eVar.a) && wl7.b(this.b, eVar.b);
        }

        public final int hashCode() {
            String str = this.a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return akb.k("Location1(formattedLocation=", this.a, ", unknownLocation=", this.b, ")");
        }
    }

    public static final class f {
        public final String a;

        public f(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && wl7.b(this.a, ((f) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return l5.m("Location(formattedLocation=", this.a, ")");
        }
    }

    public static final class g {
        public final c a;
        public final ArrayList b;

        public g(c cVar, ArrayList arrayList) {
            this.a = cVar;
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return wl7.b(this.a, gVar.a) && this.b.equals(gVar.b);
        }

        public final int hashCode() {
            c cVar = this.a;
            return this.b.hashCode() + ((cVar == null ? 0 : cVar.hashCode()) * 31);
        }

        public final String toString() {
            return "Profile(defaultInfo=" + this.a + ", resume=" + this.b + ")";
        }
    }

    public static final class h {
        public final e a;

        public h(e eVar) {
            this.a = eVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && wl7.b(this.a, ((h) obj).a);
        }

        public final int hashCode() {
            e eVar = this.a;
            if (eVar == null) {
                return 0;
            }
            return eVar.hashCode();
        }

        public final String toString() {
            return "Resume(location=" + this.a + ")";
        }
    }

    @Override // defpackage.g15
    public final ena a() {
        iqb iqbVar = iqb.a;
        ha.g gVar = ha.a;
        return new ena(iqbVar, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "query ProfileFormattedLocation { jobSeekerProfile { profile { defaultInfo { contactInformation { location { formattedLocation } } } resume { location { formattedLocation unknownLocation } } } } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = h9c.j;
        snaVar.getClass();
        List<vd2> list = gqb.h;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == fqb.class;
    }

    public final int hashCode() {
        return fwc.a.b(fqb.class).hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "09486d90cf7107d61c3ea8454c359a75bde01516b2c6776436180844b40b81b4";
    }

    @Override // defpackage.pua
    public final String name() {
        return "ProfileFormattedLocation";
    }
}
