package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fk1 {
    public final String a;
    public final String b;
    public final ah2 c;

    public fk1(String str, String str2, ah2 ah2Var) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = ah2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fk1) {
            fk1 fk1Var = (fk1) obj;
            return wl7.b(this.a, fk1Var.a) && wl7.b(this.b, fk1Var.b) && this.c == fk1Var.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + akb.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("BottomSheetConfig(title=", this.a, ", content=", this.b, ", illustration=");
        sbF.append(this.c);
        sbF.append(")");
        return sbF.toString();
    }
}
