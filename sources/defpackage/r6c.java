package defpackage;

import defpackage.g15;

/* JADX INFO: loaded from: classes3.dex */
public final class r6c implements g15.a {
    public final String a;
    public final a b;
    public final String c;
    public final String d;
    public final String e;

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

    public r6c(String str, a aVar, String str2, String str3, String str4) {
        str.getClass();
        this.a = str;
        this.b = aVar;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r6c)) {
            return false;
        }
        r6c r6cVar = (r6c) obj;
        return wl7.b(this.a, r6cVar.a) && wl7.b(this.b, r6cVar.b) && wl7.b(this.c, r6cVar.c) && wl7.b(this.d, r6cVar.d) && wl7.b(this.e, r6cVar.e);
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
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PublicationsForMobileRichProfile(id=");
        sb.append(this.a);
        sb.append(", date=");
        sb.append(this.b);
        sb.append(", description=");
        ia.r(sb, this.c, ", title=", this.d, ", url=");
        return l6.i(sb, this.e, ")");
    }
}
