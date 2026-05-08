package defpackage;

import defpackage.g15;

/* JADX INFO: loaded from: classes3.dex */
public final class gje implements g15.a {
    public final String a;
    public final String b;
    public final Object c;
    public final q68 d;
    public final Boolean e;
    public final a f;
    public final c g;
    public final b h;

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
            return this.a.equals(aVar.a) && wl7.b(this.b, aVar.b) && wl7.b(this.c, aVar.c);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return l6.i(u40.f("ChildAchievementSkill(id=", this.a, ", suid=", this.b, ", label="), this.c, ")");
        }
    }

    public static final class b {
        public final String a;
        public final String b;

        public b(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return wl7.b(this.a, bVar.a) && wl7.b(this.b, bVar.b);
        }

        public final int hashCode() {
            String str = this.a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return akb.k("SkillBucket(suid=", this.a, ", label=", this.b, ")");
        }
    }

    public static final class c {
        public final String a;
        public final String b;

        public c(String str, String str2) {
            this.a = str;
            this.b = str2;
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
            String str = this.a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return akb.k("TaxonomyConceptTitle(label=", this.a, ", suid=", this.b, ")");
        }
    }

    public gje(String str, String str2, Object obj, q68 q68Var, Boolean bool, a aVar, c cVar, b bVar) {
        this.a = str;
        this.b = str2;
        this.c = obj;
        this.d = q68Var;
        this.e = bool;
        this.f = aVar;
        this.g = cVar;
        this.h = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gje)) {
            return false;
        }
        gje gjeVar = (gje) obj;
        return this.a.equals(gjeVar.a) && wl7.b(this.b, gjeVar.b) && wl7.b(this.c, gjeVar.c) && this.d == gjeVar.d && wl7.b(this.e, gjeVar.e) && wl7.b(this.f, gjeVar.f) && wl7.b(this.g, gjeVar.g) && wl7.b(this.h, gjeVar.h);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Object obj = this.c;
        int iHashCode3 = (iHashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
        q68 q68Var = this.d;
        int iHashCode4 = (iHashCode3 + (q68Var == null ? 0 : q68Var.hashCode())) * 31;
        Boolean bool = this.e;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        a aVar = this.f;
        int iHashCode6 = (iHashCode5 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        c cVar = this.g;
        int iHashCode7 = (iHashCode6 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        b bVar = this.h;
        return iHashCode7 + (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("SkillsForMobileRichProfile(id=", this.a, ", text=", this.b, ", experience=");
        sbF.append(this.c);
        sbF.append(", timeUnit=");
        sbF.append(this.d);
        sbF.append(", isParentCrowtaxoAttribute=");
        sbF.append(this.e);
        sbF.append(", childAchievementSkill=");
        sbF.append(this.f);
        sbF.append(", taxonomyConceptTitle=");
        sbF.append(this.g);
        sbF.append(", skillBucket=");
        sbF.append(this.h);
        sbF.append(")");
        return sbF.toString();
    }
}
