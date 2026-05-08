package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bka {
    public final String a;
    public final String b;
    public final String c;
    public final gu5<j6g> d;
    public final gu5<j6g> e;

    public bka(String str, String str2, String str3, gu5<j6g> gu5Var, gu5<j6g> gu5Var2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        gu5Var.getClass();
        gu5Var2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = gu5Var;
        this.e = gu5Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bka)) {
            return false;
        }
        bka bkaVar = (bka) obj;
        return wl7.b(this.a, bkaVar.a) && wl7.b(this.b, bkaVar.b) && wl7.b(this.c, bkaVar.c) && wl7.b(this.d, bkaVar.d) && wl7.b(this.e, bkaVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + w40.d(akb.d(akb.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("NonIACardState(title=", this.a, ", company=", this.b, ", location=");
        sbF.append(this.c);
        sbF.append(", onYesClick=");
        sbF.append(this.d);
        sbF.append(", onNoClick=");
        sbF.append(this.e);
        sbF.append(")");
        return sbF.toString();
    }
}
