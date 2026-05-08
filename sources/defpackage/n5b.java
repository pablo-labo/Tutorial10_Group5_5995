package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class n5b {
    public final String a;
    public final tg3 b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public /* synthetic */ n5b(tg3 tg3Var, String str, String str2, String str3, String str4, int i) {
        this((String) null, (i & 2) != 0 ? null : tg3Var, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5b)) {
            return false;
        }
        n5b n5bVar = (n5b) obj;
        return wl7.b(this.a, n5bVar.a) && wl7.b(this.b, n5bVar.b) && wl7.b(this.c, n5bVar.c) && wl7.b(this.d, n5bVar.d) && wl7.b(this.e, n5bVar.e) && wl7.b(this.f, n5bVar.f);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        tg3 tg3Var = this.b;
        int iHashCode2 = (iHashCode + (tg3Var == null ? 0 : tg3Var.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PatentItem(id=");
        sb.append(this.a);
        sb.append(", date=");
        sb.append(this.b);
        sb.append(", description=");
        ia.r(sb, this.c, ", title=", this.d, ", url=");
        return z3.n(sb, this.e, ", patentNumber=", this.f, ")");
    }

    public n5b() {
        this((tg3) null, (String) null, (String) null, (String) null, (String) null, 63);
    }

    public n5b(String str, tg3 tg3Var, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = tg3Var;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }
}
