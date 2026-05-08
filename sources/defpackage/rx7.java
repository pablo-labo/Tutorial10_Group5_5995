package defpackage;

import defpackage.g15;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class rx7 implements g15.a {
    public final String a;
    public final String b;
    public final String c;
    public final g d;
    public final String e;
    public final d f;
    public final b g;
    public final ArrayList h;

    public static final class a {
        public final String a;
        public final String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return akb.k("Attribute(key=", this.a, ", label=", this.b, ")");
        }
    }

    public static final class b {
        public final String a;

        public b(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && wl7.b(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return l5.m("Compensation(formattedText=", this.a, ")");
        }
    }

    public static final class c {
        public final f a;

        public c(f fVar) {
            this.a = fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && wl7.b(this.a, ((c) obj).a);
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

    public static final class d {
        public final c a;
        public final k b;

        public d(c cVar, k kVar) {
            this.a = cVar;
            this.b = kVar;
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
            c cVar = this.a;
            int iHashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
            k kVar = this.b;
            return iHashCode + (kVar != null ? kVar.hashCode() : 0);
        }

        public final String toString() {
            return "Employer(dossier=" + this.a + ", ugcStats=" + this.b + ")";
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
            return akb.k("Formatted(short=", this.a, ", long=", this.b, ")");
        }
    }

    public static final class f {
        public final j a;

        public f(j jVar) {
            this.a = jVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && wl7.b(this.a, ((f) obj).a);
        }

        public final int hashCode() {
            j jVar = this.a;
            if (jVar == null) {
                return 0;
            }
            return jVar.hashCode();
        }

        public final String toString() {
            return "Images(squareLogoUrls=" + this.a + ")";
        }
    }

    public static final class g {
        public final e a;

        public g(e eVar) {
            this.a = eVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.a.equals(((g) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Location(formatted=" + this.a + ")";
        }
    }

    public static final class h {
        public final Double a;

        public h(Double d) {
            this.a = d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && wl7.b(this.a, ((h) obj).a);
        }

        public final int hashCode() {
            Double d = this.a;
            if (d == null) {
                return 0;
            }
            return d.hashCode();
        }

        public final String toString() {
            return "OverallRating(value=" + this.a + ")";
        }
    }

    public static final class i {
        public final h a;

        public i(h hVar) {
            this.a = hVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && wl7.b(this.a, ((i) obj).a);
        }

        public final int hashCode() {
            h hVar = this.a;
            if (hVar == null) {
                return 0;
            }
            return hVar.hashCode();
        }

        public final String toString() {
            return "Ratings(overallRating=" + this.a + ")";
        }
    }

    public static final class j {
        public final String a;
        public final String b;

        public j(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.a.equals(jVar.a) && this.b.equals(jVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return akb.k("SquareLogoUrls(url64=", this.a, ", url128=", this.b, ")");
        }
    }

    public static final class k {
        public final i a;

        public k(i iVar) {
            this.a = iVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && wl7.b(this.a, ((k) obj).a);
        }

        public final int hashCode() {
            i iVar = this.a;
            if (iVar == null) {
                return 0;
            }
            return iVar.hashCode();
        }

        public final String toString() {
            return "UgcStats(ratings=" + this.a + ")";
        }
    }

    public rx7(String str, String str2, String str3, g gVar, String str4, d dVar, b bVar, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = gVar;
        this.e = str4;
        this.f = dVar;
        this.g = bVar;
        this.h = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx7)) {
            return false;
        }
        rx7 rx7Var = (rx7) obj;
        return this.a.equals(rx7Var.a) && this.b.equals(rx7Var.b) && this.c.equals(rx7Var.c) && this.d.equals(rx7Var.d) && this.e.equals(rx7Var.e) && wl7.b(this.f, rx7Var.f) && wl7.b(this.g, rx7Var.g) && this.h.equals(rx7Var.h);
    }

    public final int hashCode() {
        int iD = akb.d((this.d.a.hashCode() + akb.d(akb.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e);
        d dVar = this.f;
        int iHashCode = (iD + (dVar == null ? 0 : dVar.hashCode())) * 31;
        b bVar = this.g;
        return this.h.hashCode() + ((iHashCode + (bVar != null ? bVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("JobData(key=", this.a, ", url=", this.b, ", title=");
        sbF.append(this.c);
        sbF.append(", location=");
        sbF.append(this.d);
        sbF.append(", sourceEmployerName=");
        sbF.append(this.e);
        sbF.append(", employer=");
        sbF.append(this.f);
        sbF.append(", compensation=");
        sbF.append(this.g);
        sbF.append(", attributes=");
        sbF.append(this.h);
        sbF.append(")");
        return sbF.toString();
    }
}
