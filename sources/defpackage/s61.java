package defpackage;

import defpackage.g15;

/* JADX INFO: loaded from: classes3.dex */
public final class s61 implements g15.a {
    public final String a;
    public final a b;
    public final String c;
    public final String d;

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

    public s61(String str, a aVar, String str2, String str3) {
        this.a = str;
        this.b = aVar;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s61)) {
            return false;
        }
        s61 s61Var = (s61) obj;
        return this.a.equals(s61Var.a) && wl7.b(this.b, s61Var.b) && wl7.b(this.c, s61Var.c) && wl7.b(this.d, s61Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        a aVar = this.b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AwardsForMobileRichProfile(id=");
        sb.append(this.a);
        sb.append(", date=");
        sb.append(this.b);
        sb.append(", description=");
        return z3.n(sb, this.c, ", title=", this.d, ")");
    }
}
