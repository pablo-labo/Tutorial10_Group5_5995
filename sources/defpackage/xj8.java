package defpackage;

import defpackage.g15;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class xj8 implements g15.a {
    public final String a;
    public final e b;
    public final h c;

    public static final class a {
        public final String a;

        public a(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && wl7.b(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return l5.m("Context1(suid=", this.a, ")");
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
            return l5.m("Context(suid=", this.a, ")");
        }
    }

    public static final class c {
        public final String a;

        public c(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && wl7.b(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return l5.m("SectionId1(sectionId=", this.a, ")");
        }
    }

    public static final class d {
        public final String a;

        public d(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && wl7.b(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return l5.m("SectionId(sectionId=", this.a, ")");
        }
    }

    public static final class e {
        public final String a;
        public final g b;

        public e(String str, g gVar) {
            this.a = str;
            this.b = gVar;
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
            g gVar = this.b;
            return iHashCode + (gVar != null ? gVar.hashCode() : 0);
        }

        public final String toString() {
            return "TaxonomyConceptLanguage(name=" + this.a + ", taxonomyConceptName=" + this.b + ")";
        }
    }

    public static final class f {
        public final String a;
        public final ArrayList b;
        public final String c;
        public final String d;
        public final String e;
        public final ArrayList f;

        public f(String str, ArrayList arrayList, String str2, String str3, String str4, ArrayList arrayList2) {
            this.a = str;
            this.b = arrayList;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = arrayList2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return wl7.b(this.a, fVar.a) && this.b.equals(fVar.b) && wl7.b(this.c, fVar.c) && wl7.b(this.d, fVar.d) && wl7.b(this.e, fVar.e) && this.f.equals(fVar.f);
        }

        public final int hashCode() {
            String str = this.a;
            int iD = z3.d(this.b, (str == null ? 0 : str.hashCode()) * 31, 31);
            String str2 = this.c;
            int iHashCode = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.d;
            int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.e;
            return this.f.hashCode() + ((iHashCode2 + (str4 != null ? str4.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TaxonomyConceptName1(label=");
            sb.append(this.a);
            sb.append(", sectionIds=");
            sb.append(this.b);
            sb.append(", suid=");
            ia.r(sb, this.c, ", taxonomyConceptId=", this.d, ", type=");
            sb.append(this.e);
            sb.append(", context=");
            sb.append(this.f);
            sb.append(")");
            return sb.toString();
        }
    }

    public static final class g {
        public final String a;
        public final ArrayList b;
        public final String c;
        public final String d;
        public final String e;
        public final ArrayList f;

        public g(String str, ArrayList arrayList, String str2, String str3, String str4, ArrayList arrayList2) {
            this.a = str;
            this.b = arrayList;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = arrayList2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return wl7.b(this.a, gVar.a) && this.b.equals(gVar.b) && wl7.b(this.c, gVar.c) && wl7.b(this.d, gVar.d) && wl7.b(this.e, gVar.e) && this.f.equals(gVar.f);
        }

        public final int hashCode() {
            String str = this.a;
            int iD = z3.d(this.b, (str == null ? 0 : str.hashCode()) * 31, 31);
            String str2 = this.c;
            int iHashCode = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.d;
            int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.e;
            return this.f.hashCode() + ((iHashCode2 + (str4 != null ? str4.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TaxonomyConceptName(label=");
            sb.append(this.a);
            sb.append(", sectionIds=");
            sb.append(this.b);
            sb.append(", suid=");
            ia.r(sb, this.c, ", taxonomyConceptId=", this.d, ", type=");
            sb.append(this.e);
            sb.append(", context=");
            sb.append(this.f);
            sb.append(")");
            return sb.toString();
        }
    }

    public static final class h {
        public final String a;
        public final f b;

        public h(String str, f fVar) {
            this.a = str;
            this.b = fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return wl7.b(this.a, hVar.a) && wl7.b(this.b, hVar.b);
        }

        public final int hashCode() {
            String str = this.a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            f fVar = this.b;
            return iHashCode + (fVar != null ? fVar.hashCode() : 0);
        }

        public final String toString() {
            return "TaxonomyConceptProficiency(name=" + this.a + ", taxonomyConceptName=" + this.b + ")";
        }
    }

    public xj8(String str, e eVar, h hVar) {
        this.a = str;
        this.b = eVar;
        this.c = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xj8)) {
            return false;
        }
        xj8 xj8Var = (xj8) obj;
        return this.a.equals(xj8Var.a) && wl7.b(this.b, xj8Var.b) && wl7.b(this.c, xj8Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        e eVar = this.b;
        int iHashCode2 = (iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        h hVar = this.c;
        return iHashCode2 + (hVar != null ? hVar.hashCode() : 0);
    }

    public final String toString() {
        return "LanguageSkillsForMobileRichProfile(id=" + this.a + ", taxonomyConceptLanguage=" + this.b + ", taxonomyConceptProficiency=" + this.c + ")";
    }
}
