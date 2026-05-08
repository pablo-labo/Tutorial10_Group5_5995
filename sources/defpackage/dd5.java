package defpackage;

import defpackage.c9c;
import defpackage.ha;
import defpackage.hva;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class dd5 implements c9c<a> {
    public final hva<md5> a;

    public static final class a implements c9c.a {
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
            return eVar.a.hashCode();
        }

        public final String toString() {
            return "Data(findEmployers=" + this.a + ")";
        }
    }

    public static final class b {
        public final f a;

        public b(f fVar) {
            this.a = fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && wl7.b(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            f fVar = this.a;
            if (fVar == null) {
                return 0;
            }
            return fVar.hashCode();
        }

        public final String toString() {
            return "Dossier(images=" + this.a + ")";
        }
    }

    public static final class c {
        public final b a;
        public final String b;
        public final String c;

        public c(b bVar, String str, String str2) {
            this.a = bVar;
            this.b = str;
            this.c = str2;
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
            b bVar = this.a;
            int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
            String str = this.b;
            return this.c.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Employer1(dossier=");
            sb.append(this.a);
            sb.append(", name=");
            sb.append(this.b);
            sb.append(", key=");
            return l6.i(sb, this.c, ")");
        }
    }

    public static final class d {
        public final c a;
        public final qd5 b;

        public d(c cVar, qd5 qd5Var) {
            this.a = cVar;
            this.b = qd5Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a.equals(dVar.a) && this.b == dVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Employer(employer=" + this.a + ", whatType=" + this.b + ")";
        }
    }

    public static final class e {
        public final ArrayList a;

        public e(ArrayList arrayList) {
            this.a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.a.equals(((e) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return m6.g("FindEmployers(employers=", ")", this.a);
        }
    }

    public static final class f {
        public final g a;

        public f(g gVar) {
            this.a = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && wl7.b(this.a, ((f) obj).a);
        }

        public final int hashCode() {
            g gVar = this.a;
            if (gVar == null) {
                return 0;
            }
            return gVar.hashCode();
        }

        public final String toString() {
            return "Images(squareLogoUrls=" + this.a + ")";
        }
    }

    public static final class g {
        public final String a;
        public final String b;
        public final String c;
        public final String d;

        public g(String str, String str2, String str3, String str4) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.a.equals(gVar.a) && this.b.equals(gVar.b) && this.c.equals(gVar.c) && this.d.equals(gVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + akb.d(akb.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            return z3.n(u40.f("SquareLogoUrls(url256=", this.a, ", url128=", this.b, ", url64="), this.c, ", url96=", this.d, ")");
        }
    }

    public dd5(hva<md5> hvaVar) {
        hvaVar.getClass();
        this.a = hvaVar;
    }

    @Override // defpackage.g15
    public final ena a() {
        fd5 fd5Var = fd5.a;
        ha.g gVar = ha.a;
        return new ena(fd5Var, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "query FindEmployerLogoImageUrlsRichProfile($input: FindEmployersInput) { findEmployers(input: $input) { employers { employer { dossier { images { squareLogoUrls { url256 url128 url64 url96 } } } name key } whatType } } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = f9c.e;
        snaVar.getClass();
        List<vd2> list = ed5.g;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
        hva<md5> hvaVar = this.a;
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("input");
            ha.g gVar = ha.a;
            ena enaVar = new ena(nd5.a, false);
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
        return (obj instanceof dd5) && wl7.b(this.a, ((dd5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "640b34fdae7383f2a35fa62b71dabcfc439849e38f29e3d42d8dd21ee4d7ff91";
    }

    @Override // defpackage.pua
    public final String name() {
        return "FindEmployerLogoImageUrlsRichProfile";
    }

    public final String toString() {
        return "FindEmployerLogoImageUrlsRichProfileQuery(input=" + this.a + ")";
    }
}
