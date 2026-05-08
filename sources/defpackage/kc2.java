package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kc2 implements qh4 {
    public final le0 a;
    public final int b;

    public kc2(String str, int i) {
        this(new le0(str), i);
    }

    @Override // defpackage.qh4
    public final void a(co4 co4Var) {
        boolean zE = co4Var.e();
        le0 le0Var = this.a;
        if (zE) {
            co4Var.f(co4Var.d, co4Var.e, le0Var.b);
        } else {
            co4Var.f(co4Var.b, co4Var.c, le0Var.b);
        }
        int iD = co4Var.d();
        int i = this.b;
        int iC = nic.C(i > 0 ? (iD + i) - 1 : (iD + i) - le0Var.b.length(), 0, co4Var.a.a());
        co4Var.h(iC, iC);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kc2)) {
            return false;
        }
        kc2 kc2Var = (kc2) obj;
        return wl7.b(this.a.b, kc2Var.a.b) && this.b == kc2Var.b;
    }

    public final int hashCode() {
        return (this.a.b.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommitTextCommand(text='");
        sb.append(this.a.b);
        sb.append("', newCursorPosition=");
        return k6.h(sb, this.b, ')');
    }

    public kc2(le0 le0Var, int i) {
        this.a = le0Var;
        this.b = i;
    }
}
