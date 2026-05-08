package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hae implements qh4 {
    public final le0 a;
    public final int b;

    public hae(String str, int i) {
        this.a = new le0(str);
        this.b = i;
    }

    @Override // defpackage.qh4
    public final void a(co4 co4Var) {
        boolean zE = co4Var.e();
        le0 le0Var = this.a;
        if (zE) {
            int i = co4Var.d;
            int i2 = co4Var.e;
            String str = le0Var.b;
            String str2 = le0Var.b;
            co4Var.f(i, i2, str);
            if (str2.length() > 0) {
                co4Var.g(i, str2.length() + i);
            }
        } else {
            int i3 = co4Var.b;
            int i4 = co4Var.c;
            String str3 = le0Var.b;
            String str4 = le0Var.b;
            co4Var.f(i3, i4, str3);
            if (str4.length() > 0) {
                co4Var.g(i3, str4.length() + i3);
            }
        }
        int iD = co4Var.d();
        int i5 = this.b;
        int iC = nic.C(i5 > 0 ? (iD + i5) - 1 : (iD + i5) - le0Var.b.length(), 0, co4Var.a.a());
        co4Var.h(iC, iC);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hae)) {
            return false;
        }
        hae haeVar = (hae) obj;
        return wl7.b(this.a.b, haeVar.a.b) && this.b == haeVar.b;
    }

    public final int hashCode() {
        return (this.a.b.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingTextCommand(text='");
        sb.append(this.a.b);
        sb.append("', newCursorPosition=");
        return k6.h(sb, this.b, ')');
    }
}
