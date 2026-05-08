package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class g6g implements mzg {
    public final mzg a;
    public final mzg b;

    public g6g(mzg mzgVar, mzg mzgVar2) {
        this.a = mzgVar;
        this.b = mzgVar2;
    }

    @Override // defpackage.mzg
    public final int a(iy3 iy3Var) {
        return Math.max(this.a.a(iy3Var), this.b.a(iy3Var));
    }

    @Override // defpackage.mzg
    public final int b(iy3 iy3Var, vl8 vl8Var) {
        return Math.max(this.a.b(iy3Var, vl8Var), this.b.b(iy3Var, vl8Var));
    }

    @Override // defpackage.mzg
    public final int c(iy3 iy3Var) {
        return Math.max(this.a.c(iy3Var), this.b.c(iy3Var));
    }

    @Override // defpackage.mzg
    public final int d(iy3 iy3Var, vl8 vl8Var) {
        return Math.max(this.a.d(iy3Var, vl8Var), this.b.d(iy3Var, vl8Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g6g)) {
            return false;
        }
        g6g g6gVar = (g6g) obj;
        return wl7.b(g6gVar.a, this.a) && wl7.b(g6gVar.b, this.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "(" + this.a + " ∪ " + this.b + ')';
    }
}
