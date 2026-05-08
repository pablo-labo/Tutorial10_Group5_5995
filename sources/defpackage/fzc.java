package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fzc {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public fzc(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fzc)) {
            return false;
        }
        fzc fzcVar = (fzc) obj;
        return wl7.b(this.a, fzcVar.a) && wl7.b(this.b, fzcVar.b) && wl7.b(this.c, fzcVar.c) && wl7.b(this.d, fzcVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return z3.n(u40.f("RelocationLocation(id=", this.a, ", rawLocation=", this.b, ", fullFormattedLocation="), this.c, ", shortFormattedLocation=", this.d, ")");
    }

    public /* synthetic */ fzc(String str, int i) {
        this(null, (i & 2) != 0 ? null : str, null, null);
    }

    public fzc() {
        this(null, 15);
    }
}
