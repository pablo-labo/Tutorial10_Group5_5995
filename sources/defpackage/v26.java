package defpackage;

import defpackage.c9c;
import defpackage.ha;
import defpackage.hva;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class v26 implements c9c<b> {
    public final hva<u58> a;

    public static final class a {
        public final String a;
        public final String b;
        public final String c;

        public a(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b) && this.c.equals(aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + akb.d(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return l6.i(u40.f("Attribute(id=", this.a, ", label=", this.b, ", suid="), this.c, ")");
        }
    }

    public static final class b implements c9c.a {
        public final c a;

        public b(c cVar) {
            this.a = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && wl7.b(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            c cVar = this.a;
            if (cVar == null) {
                return 0;
            }
            return cVar.a.hashCode();
        }

        public final String toString() {
            return "Data(jobSeekerProfileStructuredDataPreferenceAttributesByCustomClass=" + this.a + ")";
        }
    }

    public static final class c {
        public final ArrayList a;

        public c(ArrayList arrayList) {
            this.a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a.equals(((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return m6.g("JobSeekerProfileStructuredDataPreferenceAttributesByCustomClass(positivePreferenceAttributesByCustomClass=", ")", this.a);
        }
    }

    public static final class d {
        public final ArrayList a;

        public d(ArrayList arrayList) {
            this.a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a.equals(((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return m6.g("PositivePreferenceAttributesByCustomClass(attributes=", ")", this.a);
        }
    }

    public v26(hva<u58> hvaVar) {
        hvaVar.getClass();
        this.a = hvaVar;
    }

    @Override // defpackage.g15
    public final ena a() {
        y26 y26Var = y26.a;
        ha.g gVar = ha.a;
        return new ena(y26Var, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "query GetPreferenceAttributesByCustomClass($input: JobSeekerProfileStructuredDataPreferenceAttributeByCustomClassInput) { jobSeekerProfileStructuredDataPreferenceAttributesByCustomClass(input: $input) { positivePreferenceAttributesByCustomClass { attributes { id label suid } } } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = h9c.j;
        snaVar.getClass();
        List<vd2> list = w26.d;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
        hva<u58> hvaVar = this.a;
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("input");
            ha.g gVar = ha.a;
            ena enaVar = new ena(v58.a, false);
            V v = ((hva.c) hvaVar).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                enaVar.b(hc8Var, lb3Var, v);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v26) && wl7.b(this.a, ((v26) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "40f03dd0f66719ca279c52c3435dd2be616d9c908f31b9768a16ee540e39aef3";
    }

    @Override // defpackage.pua
    public final String name() {
        return "GetPreferenceAttributesByCustomClass";
    }

    public final String toString() {
        return "GetPreferenceAttributesByCustomClassQuery(input=" + this.a + ")";
    }
}
