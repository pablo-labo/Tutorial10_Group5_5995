package defpackage;

import defpackage.g15;

/* JADX INFO: loaded from: classes3.dex */
public final class nz1 implements g15.a {
    public final String a;
    public final String b;
    public final a c;
    public final String d;

    public static final class a {
        public final String a;
        public final ig3 b;

        public a(String str, ig3 ig3Var) {
            this.a = str;
            this.b = ig3Var;
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
            return "DateRange(__typename=" + this.a + ", dateRangeForMobileRichProfile=" + this.b + ")";
        }
    }

    public nz1(String str, String str2, a aVar, String str3) {
        this.a = str;
        this.b = str2;
        this.c = aVar;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nz1)) {
            return false;
        }
        nz1 nz1Var = (nz1) obj;
        return wl7.b(this.a, nz1Var.a) && wl7.b(this.b, nz1Var.b) && wl7.b(this.c, nz1Var.c) && this.d.equals(nz1Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        a aVar = this.c;
        return this.d.hashCode() + ((iHashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("CertificationsForMobileRichProfile(title=", this.a, ", description=", this.b, ", dateRange=");
        sbF.append(this.c);
        sbF.append(", id=");
        sbF.append(this.d);
        sbF.append(")");
        return sbF.toString();
    }
}
