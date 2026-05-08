package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class p6c {
    public final String a;
    public final tg3 b;
    public final String c;
    public final String d;
    public final String e;

    public /* synthetic */ p6c(tg3 tg3Var, String str, String str2, String str3, int i) {
        this((String) null, (i & 2) != 0 ? null : tg3Var, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6c)) {
            return false;
        }
        p6c p6cVar = (p6c) obj;
        return wl7.b(this.a, p6cVar.a) && wl7.b(this.b, p6cVar.b) && wl7.b(this.c, p6cVar.c) && wl7.b(this.d, p6cVar.d) && wl7.b(this.e, p6cVar.e);
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
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PublicationItem(id=");
        sb.append(this.a);
        sb.append(", date=");
        sb.append(this.b);
        sb.append(", description=");
        ia.r(sb, this.c, ", title=", this.d, ", url=");
        return l6.i(sb, this.e, ")");
    }

    public p6c() {
        this((tg3) null, (String) null, (String) null, (String) null, 31);
    }

    public p6c(String str, tg3 tg3Var, String str2, String str3, String str4) {
        this.a = str;
        this.b = tg3Var;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }
}
