package defpackage;

import defpackage.c9c;
import defpackage.ha;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class hig implements c9c<a> {
    public final lea a;

    public static final class a implements c9c.a {
        public final c a;

        public a(c cVar) {
            this.a = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && wl7.b(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            c cVar = this.a;
            if (cVar == null) {
                return 0;
            }
            return cVar.a.hashCode();
        }

        public final String toString() {
            return "Data(urlRegistry=" + this.a + ")";
        }
    }

    public static final class b {
        public final Object a;
        public final vca b;
        public final String c;

        public b(vca vcaVar, Object obj, String str) {
            this.a = obj;
            this.b = vcaVar;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && this.b == bVar.b && wl7.b(this.c, bVar.c);
        }

        public final int hashCode() {
            int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
            String str = this.c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UrlRegistry1(destinationUrl=");
            sb.append(this.a);
            sb.append(", id=");
            sb.append(this.b);
            sb.append(", label=");
            return l6.i(sb, this.c, ")");
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
            return m6.g("UrlRegistry(urlRegistry=", ")", this.a);
        }
    }

    public hig(lea leaVar) {
        leaVar.getClass();
        this.a = leaVar;
    }

    @Override // defpackage.g15
    public final ena a() {
        jig jigVar = jig.a;
        ha.g gVar = ha.a;
        return new ena(jigVar, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "query UrlRegistry($urlRegistryInput: NavigationQueryInput!) { urlRegistry(input: $urlRegistryInput) { urlRegistry { destinationUrl id label } } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = h9c.j;
        snaVar.getClass();
        List<vd2> list = iig.c;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
        hc8Var.u0("urlRegistryInput");
        ha.g gVar = ha.a;
        hc8Var.j();
        mea.a.b(hc8Var, lb3Var, this.a);
        hc8Var.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hig) && wl7.b(this.a, ((hig) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "3648fb272baae8528eb7a466e00ac0e649acb76568e5e5dc51219dec8c3e85e2";
    }

    @Override // defpackage.pua
    public final String name() {
        return "UrlRegistry";
    }

    public final String toString() {
        return "UrlRegistryQuery(urlRegistryInput=" + this.a + ")";
    }
}
