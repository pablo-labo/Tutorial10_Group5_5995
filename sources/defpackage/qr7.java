package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qr7 {
    public final String a;
    public final sr7 b;
    public final String c;

    public qr7(String str, sr7 sr7Var, String str2) {
        this.a = str;
        this.b = sr7Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qr7)) {
            return false;
        }
        qr7 qr7Var = (qr7) obj;
        return wl7.b(this.a, qr7Var.a) && wl7.b(this.b, qr7Var.b) && wl7.b(this.c, qr7Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        sr7 sr7Var = this.b;
        int iHashCode2 = (iHashCode + (sr7Var == null ? 0 : sr7Var.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JSTProfileCertification(certificationName=");
        sb.append(this.a);
        sb.append(", dateRange=");
        sb.append(this.b);
        sb.append(", description=");
        return l6.i(sb, this.c, ")");
    }
}
