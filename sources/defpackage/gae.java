package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gae implements qh4 {
    public final int a;
    public final int b;

    public gae(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.qh4
    public final void a(co4 co4Var) {
        boolean zE = co4Var.e();
        t4b t4bVar = co4Var.a;
        if (zE) {
            co4Var.d = -1;
            co4Var.e = -1;
        }
        int iC = nic.C(this.a, 0, t4bVar.a());
        int iC2 = nic.C(this.b, 0, t4bVar.a());
        if (iC != iC2) {
            if (iC < iC2) {
                co4Var.g(iC, iC2);
            } else {
                co4Var.g(iC2, iC);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gae)) {
            return false;
        }
        gae gaeVar = (gae) obj;
        return this.a == gaeVar.a && this.b == gaeVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingRegionCommand(start=");
        sb.append(this.a);
        sb.append(", end=");
        return k6.h(sb, this.b, ')');
    }
}
