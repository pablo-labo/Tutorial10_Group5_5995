package defpackage;

import defpackage.g15;

/* JADX INFO: loaded from: classes3.dex */
public final class q5b implements g15.a {
    public final String a;
    public final a b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public static final class a {
        public final String a;
        public final tg3 b;

        public a(String str, tg3 tg3Var) {
            this.a = str;
            this.b = tg3Var;
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
            return "Date(__typename=" + this.a + ", dateTypeForMobileRichProfile=" + this.b + ")";
        }
    }

    public q5b(String str, a aVar, String str2, String str3, String str4, String str5) {
        str.getClass();
        this.a = str;
        this.b = aVar;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q5b)) {
            return false;
        }
        q5b q5bVar = (q5b) obj;
        return wl7.b(this.a, q5bVar.a) && wl7.b(this.b, q5bVar.b) && wl7.b(this.c, q5bVar.c) && wl7.b(this.d, q5bVar.d) && wl7.b(this.e, q5bVar.e) && wl7.b(this.f, q5bVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        a aVar = this.b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PatentsForMobileRichProfile(id=");
        sb.append(this.a);
        sb.append(", date=");
        sb.append(this.b);
        sb.append(", patentNumber=");
        ia.r(sb, this.c, ", description=", this.d, ", title=");
        return z3.n(sb, this.e, ", url=", this.f, ")");
    }
}
