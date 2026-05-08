package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class zba {
    public final bca a;
    public final String b;
    public final String c;
    public final String d;

    public zba(bca bcaVar, String str, String str2, String str3) {
        bcaVar.getClass();
        str.getClass();
        str2.getClass();
        this.a = bcaVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zba)) {
            return false;
        }
        zba zbaVar = (zba) obj;
        return this.a == zbaVar.a && wl7.b(this.b, zbaVar.b) && wl7.b(this.c, zbaVar.c) && wl7.b(this.d, zbaVar.d);
    }

    public final int hashCode() {
        int iD = akb.d(akb.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return iD + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavMenuItem(id=");
        sb.append(this.a);
        sb.append(", destinationUrl=");
        sb.append(this.b);
        sb.append(", label=");
        return z3.n(sb, this.c, ", subtitle=", this.d, ")");
    }
}
