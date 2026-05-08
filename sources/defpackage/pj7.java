package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class pj7 {
    public final String a;
    public final String b;
    public final Long c;
    public final String d;

    public pj7(String str, String str2, Long l, String str3) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = l;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pj7)) {
            return false;
        }
        pj7 pj7Var = (pj7) obj;
        return wl7.b(this.a, pj7Var.a) && this.b.equals(pj7Var.b) && this.c.equals(pj7Var.c) && wl7.b(this.d, pj7Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + akb.d(this.a.hashCode() * 31, 31, this.b)) * 31;
        String str = this.d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbF = u40.f("Interview(id=", this.a, ", category=", this.b, ", interviewStartTime=");
        sbF.append(this.c);
        sbF.append(", interviewDuration=");
        sbF.append(this.d);
        sbF.append(")");
        return sbF.toString();
    }
}
