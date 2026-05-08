package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sae implements qh4 {
    public final int a;
    public final int b;

    public sae(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.qh4
    public final void a(co4 co4Var) {
        int iC = nic.C(this.a, 0, co4Var.a.a());
        int iC2 = nic.C(this.b, 0, co4Var.a.a());
        if (iC < iC2) {
            co4Var.h(iC, iC2);
        } else {
            co4Var.h(iC2, iC);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sae)) {
            return false;
        }
        sae saeVar = (sae) obj;
        return this.a == saeVar.a && this.b == saeVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetSelectionCommand(start=");
        sb.append(this.a);
        sb.append(", end=");
        return k6.h(sb, this.b, ')');
    }
}
