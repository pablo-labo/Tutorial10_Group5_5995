package defpackage;

import defpackage.c9c;
import defpackage.ha;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class p56 implements c9c<b> {
    public final kbf a;

    public static final class a {
        public final String a;

        public a(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a.equals(((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return l5.m("CustomClass(key=", this.a, ")");
        }
    }

    public static final class b implements c9c.a {
        public final e a;

        public b(e eVar) {
            this.a = eVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && wl7.b(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            e eVar = this.a;
            if (eVar == null) {
                return 0;
            }
            return eVar.hashCode();
        }

        public final String toString() {
            return "Data(taxonomyConcepts=" + this.a + ")";
        }
    }

    public static final class c {
        public final String a;
        public final sf9 b;

        public c(String str, sf9 sf9Var) {
            this.a = str;
            this.b = sf9Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return wl7.b(this.a, cVar.a) && this.b == cVar.b;
        }

        public final int hashCode() {
            String str = this.a;
            return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return "ResponseStatus(errorMessage=" + this.a + ", responseCode=" + this.b + ")";
        }
    }

    public static final class d {
        public final String a;
        public final String b;
        public final String c;
        public final ArrayList d;

        public d(String str, String str2, String str3, ArrayList arrayList) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a.equals(dVar.a) && this.b.equals(dVar.b) && this.c.equals(dVar.c) && this.d.equals(dVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + akb.d(akb.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sbF = u40.f("TaxonomyConcept(uuid=", this.a, ", key=", this.b, ", label=");
            sbF.append(this.c);
            sbF.append(", customClasses=");
            sbF.append(this.d);
            sbF.append(")");
            return sbF.toString();
        }
    }

    public static final class e {
        public final List<d> a;
        public final c b;

        public e(List<d> list, c cVar) {
            this.a = list;
            this.b = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return wl7.b(this.a, eVar.a) && this.b.equals(eVar.b);
        }

        public final int hashCode() {
            List<d> list = this.a;
            return this.b.hashCode() + ((list == null ? 0 : list.hashCode()) * 31);
        }

        public final String toString() {
            return "TaxonomyConcepts(taxonomyConcepts=" + this.a + ", responseStatus=" + this.b + ")";
        }
    }

    public p56(kbf kbfVar) {
        this.a = kbfVar;
    }

    @Override // defpackage.g15
    public final ena a() {
        s56 s56Var = s56.a;
        ha.g gVar = ha.a;
        return new ena(s56Var, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "query GetTaxonomyConceptsByCustomClass($customClassInput: TaxonomyConceptsInput!) { taxonomyConcepts(input: $customClassInput) { taxonomyConcepts { uuid key label customClasses { key } } responseStatus { errorMessage responseCode } } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = h9c.j;
        snaVar.getClass();
        List<vd2> list = q56.e;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
        hc8Var.u0("customClassInput");
        ha.g gVar = ha.a;
        hc8Var.j();
        lbf.a.b(hc8Var, lb3Var, this.a);
        hc8Var.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p56) && this.a.equals(((p56) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "850464af174a6b1d3016599cbcf7222677aed7977e4fe1209351c9e7a0c00e4c";
    }

    @Override // defpackage.pua
    public final String name() {
        return "GetTaxonomyConceptsByCustomClass";
    }

    public final String toString() {
        return "GetTaxonomyConceptsByCustomClassQuery(customClassInput=" + this.a + ")";
    }
}
