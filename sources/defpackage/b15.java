package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b15 implements mzg {
    public final mzg a;
    public final mzg b;

    public b15(mzg mzgVar, mzg mzgVar2) {
        this.a = mzgVar;
        this.b = mzgVar2;
    }

    @Override // defpackage.mzg
    public final int a(iy3 iy3Var) {
        int iA = this.a.a(iy3Var) - this.b.a(iy3Var);
        if (iA < 0) {
            return 0;
        }
        return iA;
    }

    @Override // defpackage.mzg
    public final int b(iy3 iy3Var, vl8 vl8Var) {
        int iB = this.a.b(iy3Var, vl8Var) - this.b.b(iy3Var, vl8Var);
        if (iB < 0) {
            return 0;
        }
        return iB;
    }

    @Override // defpackage.mzg
    public final int c(iy3 iy3Var) {
        int iC = this.a.c(iy3Var) - this.b.c(iy3Var);
        if (iC < 0) {
            return 0;
        }
        return iC;
    }

    @Override // defpackage.mzg
    public final int d(iy3 iy3Var, vl8 vl8Var) {
        int iD = this.a.d(iy3Var, vl8Var) - this.b.d(iy3Var, vl8Var);
        if (iD < 0) {
            return 0;
        }
        return iD;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b15)) {
            return false;
        }
        b15 b15Var = (b15) obj;
        return wl7.b(b15Var.a, this.a) && wl7.b(b15Var.b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.a + " - " + this.b + ')';
    }
}
