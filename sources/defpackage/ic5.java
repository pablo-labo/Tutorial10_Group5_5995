package defpackage;

import defpackage.c9c;
import defpackage.ha;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ic5 implements c9c<a> {
    public final fc5 a;
    public final py1 b;

    public static final class a implements c9c.a {
        public final b a;

        public a(b bVar) {
            this.a = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && wl7.b(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            b bVar = this.a;
            if (bVar == null) {
                return 0;
            }
            return bVar.a.hashCode();
        }

        public final String toString() {
            return "Data(findCategoricalOQVTTaxonomies=" + this.a + ")";
        }
    }

    public static final class b {
        public final ArrayList a;

        public b(ArrayList arrayList) {
            this.a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a.equals(((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return m6.g("FindCategoricalOQVTTaxonomies(taxonomies=", ")", this.a);
        }
    }

    public static final class c {
        public final String a;
        public final String b;
        public final d c;

        public c(String str, String str2, d dVar) {
            this.a = str;
            this.b = str2;
            this.c = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a.equals(cVar.a) && this.b.equals(cVar.b) && wl7.b(this.c, cVar.c);
        }

        public final int hashCode() {
            int iD = akb.d(this.a.hashCode() * 31, 31, this.b);
            d dVar = this.c;
            return iD + (dVar == null ? 0 : dVar.hashCode());
        }

        public final String toString() {
            StringBuilder sbF = u40.f("GenericAttribute(id=", this.a, ", label=", this.b, ", question=");
            sbF.append(this.c);
            sbF.append(")");
            return sbF.toString();
        }
    }

    public static final class d {
        public final String a;
        public final String b;
        public final ArrayList c;

        public d(String str, String str2, ArrayList arrayList) {
            this.a = str;
            this.b = str2;
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
            return this.a.equals(dVar.a) && this.b.equals(dVar.b) && this.c.equals(dVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + akb.d(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sbF = u40.f("Question(id=", this.a, ", label=", this.b, ", values=");
            sbF.append(this.c);
            sbF.append(")");
            return sbF.toString();
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
            return this.a.equals(eVar.a) && this.b.equals(eVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return akb.k("Tag(id=", this.a, ", label=", this.b, ")");
        }
    }

    public static final class f {
        public final ArrayList a;

        public f(ArrayList arrayList) {
            this.a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.a.equals(((f) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return m6.g("Taxonomy(genericAttributes=", ")", this.a);
        }
    }

    public static final class g {
        public final String a;
        public final String b;
        public final e c;

        public g(String str, String str2, e eVar) {
            this.a = str;
            this.b = str2;
            this.c = eVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.a.equals(gVar.a) && this.b.equals(gVar.b) && wl7.b(this.c, gVar.c);
        }

        public final int hashCode() {
            int iD = akb.d(this.a.hashCode() * 31, 31, this.b);
            e eVar = this.c;
            return iD + (eVar == null ? 0 : eVar.hashCode());
        }

        public final String toString() {
            StringBuilder sbF = u40.f("Value(id=", this.a, ", label=", this.b, ", tag=");
            sbF.append(this.c);
            sbF.append(")");
            return sbF.toString();
        }
    }

    public ic5(fc5 fc5Var, py1 py1Var) {
        this.a = fc5Var;
        this.b = py1Var;
    }

    @Override // defpackage.g15
    public final ena a() {
        kc5 kc5Var = kc5.a;
        ha.g gVar = ha.a;
        return new ena(kc5Var, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "query FindCategoricalOQVTTaxonomies($taxonomyInput: FindCategoricalOQVTTaxonomiesInput!, $genericAttributesInput: CategoricalOQVTGenericAttributesInput!) { findCategoricalOQVTTaxonomies(input: $taxonomyInput) { taxonomies { genericAttributes(input: $genericAttributesInput) { id label question { id label values { id label tag { id label } } } } } } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = f9c.e;
        snaVar.getClass();
        List<vd2> list = jc5.g;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
        hc8Var.u0("taxonomyInput");
        ha.g gVar = ha.a;
        hc8Var.j();
        gc5.a.b(hc8Var, lb3Var, this.a);
        hc8Var.t();
        hc8Var.u0("genericAttributesInput");
        ip ipVar = ip.c;
        hc8Var.j();
        ipVar.b(hc8Var, lb3Var, this.b);
        hc8Var.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ic5)) {
            return false;
        }
        ic5 ic5Var = (ic5) obj;
        return this.a.equals(ic5Var.a) && this.b.equals(ic5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.pua
    public final String id() {
        return "6aa8cbf77d26b8682e252abf007f9411cd30bbe4735dd7c378a1c1a661297d6a";
    }

    @Override // defpackage.pua
    public final String name() {
        return "FindCategoricalOQVTTaxonomies";
    }

    public final String toString() {
        return "FindCategoricalOQVTTaxonomiesQuery(taxonomyInput=" + this.a + ", genericAttributesInput=" + this.b + ")";
    }
}
