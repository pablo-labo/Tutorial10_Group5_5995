package defpackage;

import defpackage.c9c;
import defpackage.ha;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class yda implements c9c<c> {
    public final Object a;

    public static final class a {
        public final ArrayList a;

        public a(ArrayList arrayList) {
            this.a = arrayList;
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
            return m6.g("AvailableCountrySites(results=", ")", this.a);
        }
    }

    public static final class b {
        public final tca a;
        public final String b;
        public final ArrayList c;

        public b(tca tcaVar, String str, ArrayList arrayList) {
            this.a = tcaVar;
            this.b = str;
            this.c = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && wl7.b(this.b, bVar.b) && this.c.equals(bVar.c);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            return "CategorizedHamburgerMenu(id=" + this.a + ", label=" + this.b + ", items=" + this.c + ")";
        }
    }

    public static final class c implements c9c.a {
        public final h a;
        public final a b;

        public c(h hVar, a aVar) {
            this.a = hVar;
            this.b = aVar;
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
            h hVar = this.a;
            int iHashCode = (hVar == null ? 0 : hVar.hashCode()) * 31;
            a aVar = this.b;
            return iHashCode + (aVar != null ? aVar.a.hashCode() : 0);
        }

        public final String toString() {
            return "Data(navigationMenu=" + this.a + ", availableCountrySites=" + this.b + ")";
        }
    }

    public static final class d {
        public final vca a;
        public final Object b;
        public final String c;
        public final String d;

        public d(vca vcaVar, Object obj, String str, String str2) {
            this.a = vcaVar;
            this.b = obj;
            this.c = str;
            this.d = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && this.b.equals(dVar.b) && this.c.equals(dVar.c) && wl7.b(this.d, dVar.d);
        }

        public final int hashCode() {
            int iD = akb.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
            String str = this.d;
            return iD + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HamburgerMenu(id=");
            sb.append(this.a);
            sb.append(", destinationUrl=");
            sb.append(this.b);
            sb.append(", label=");
            return z3.n(sb, this.c, ", subtitle=", this.d, ")");
        }
    }

    public static final class e {
        public final vca a;
        public final Object b;
        public final String c;
        public final String d;

        public e(vca vcaVar, Object obj, String str, String str2) {
            this.a = vcaVar;
            this.b = obj;
            this.c = str;
            this.d = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a == eVar.a && this.b.equals(eVar.b) && this.c.equals(eVar.c) && wl7.b(this.d, eVar.d);
        }

        public final int hashCode() {
            int iD = akb.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
            String str = this.d;
            return iD + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Item(id=");
            sb.append(this.a);
            sb.append(", destinationUrl=");
            sb.append(this.b);
            sb.append(", label=");
            return z3.n(sb, this.c, ", subtitle=", this.d, ")");
        }
    }

    public static final class f {
        public final vca a;
        public final Object b;
        public final String c;
        public final String d;

        public f(vca vcaVar, Object obj, String str, String str2) {
            this.a = vcaVar;
            this.b = obj;
            this.c = str;
            this.d = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.a == fVar.a && this.b.equals(fVar.b) && wl7.b(this.c, fVar.c) && this.d.equals(fVar.d);
        }

        public final int hashCode() {
            int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
            String str = this.c;
            return this.d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LeftItem(id=");
            sb.append(this.a);
            sb.append(", destinationUrl=");
            sb.append(this.b);
            sb.append(", logoUrl=");
            return z3.n(sb, this.c, ", label=", this.d, ")");
        }
    }

    public static final class g {
        public final ArrayList a;
        public final ArrayList b;

        public g(ArrayList arrayList, ArrayList arrayList2) {
            this.a = arrayList;
            this.b = arrayList2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.a.equals(gVar.a) && this.b.equals(gVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "NavigationBar(leftItems=" + this.a + ", rightItems=" + this.b + ")";
        }
    }

    public static final class h {
        public final g a;
        public final ArrayList b;
        public final ArrayList c;

        public h(g gVar, ArrayList arrayList, ArrayList arrayList2) {
            this.a = gVar;
            this.b = arrayList;
            this.c = arrayList2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.a.equals(hVar.a) && this.b.equals(hVar.b) && this.c.equals(hVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + z3.d(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            return "NavigationMenu(navigationBar=" + this.a + ", hamburgerMenu=" + this.b + ", categorizedHamburgerMenu=" + this.c + ")";
        }
    }

    public static final class i {
        public final Object a;
        public final String b;
        public final String c;
        public final ArrayList d;

        public i(Object obj, String str, String str2, ArrayList arrayList) {
            this.a = obj;
            this.b = str;
            this.c = str2;
            this.d = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return this.a.equals(iVar.a) && this.b.equals(iVar.b) && this.c.equals(iVar.c) && this.d.equals(iVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + akb.d(akb.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            return "Result(countryCode=" + this.a + ", countryName=" + this.b + ", baseIndeedUrl=" + this.c + ", supportedLanguages=" + this.d + ")";
        }
    }

    public static final class j {
        public final vca a;
        public final Object b;
        public final String c;

        public j(vca vcaVar, Object obj, String str) {
            this.a = vcaVar;
            this.b = obj;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.a == jVar.a && this.b.equals(jVar.b) && this.c.equals(jVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RightItem(id=");
            sb.append(this.a);
            sb.append(", destinationUrl=");
            sb.append(this.b);
            sb.append(", label=");
            return l6.i(sb, this.c, ")");
        }
    }

    public yda(Object obj) {
        obj.getClass();
        this.a = obj;
    }

    @Override // defpackage.g15
    public final ena a() {
        cea ceaVar = cea.a;
        ha.g gVar = ha.a;
        return new ena(ceaVar, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "query navigationMenu($continueUrl: WebUrl!) { navigationMenu(input: { variant: JOBSEEKER_MOBILE_APP from: \"android-nav-menu\" continueUrl: $continueUrl appName: \"jsma-jobsearch-android\" } ) { navigationBar { leftItems { id destinationUrl logoUrl label } rightItems { id destinationUrl label } } hamburgerMenu { id destinationUrl label subtitle } categorizedHamburgerMenu { id label items { id destinationUrl label subtitle } } } availableCountrySites { results { countryCode countryName baseIndeedUrl supportedLanguages } } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = h9c.j;
        snaVar.getClass();
        List<vd2> list = zda.j;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
        hc8Var.u0("continueUrl");
        ha.g.b(hc8Var, lb3Var, this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yda) && wl7.b(this.a, ((yda) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "a4f2e4e194c32731ae55fde0727ad0172275fb5974553be2d3154f5d99665d90";
    }

    @Override // defpackage.pua
    public final String name() {
        return "navigationMenu";
    }

    public final String toString() {
        return v40.e(this.a, "NavigationMenuQuery(continueUrl=", ")");
    }
}
