package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qf7 implements gza {
    public final mzg a;
    public final iy3 b;

    public qf7(mzg mzgVar, iy3 iy3Var) {
        this.a = mzgVar;
        this.b = iy3Var;
    }

    @Override // defpackage.gza
    public final float a() {
        mzg mzgVar = this.a;
        iy3 iy3Var = this.b;
        return iy3Var.k1(mzgVar.c(iy3Var));
    }

    @Override // defpackage.gza
    public final float b(vl8 vl8Var) {
        mzg mzgVar = this.a;
        iy3 iy3Var = this.b;
        return iy3Var.k1(mzgVar.d(iy3Var, vl8Var));
    }

    @Override // defpackage.gza
    public final float c(vl8 vl8Var) {
        mzg mzgVar = this.a;
        iy3 iy3Var = this.b;
        return iy3Var.k1(mzgVar.b(iy3Var, vl8Var));
    }

    @Override // defpackage.gza
    public final float d() {
        mzg mzgVar = this.a;
        iy3 iy3Var = this.b;
        return iy3Var.k1(mzgVar.a(iy3Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qf7)) {
            return false;
        }
        qf7 qf7Var = (qf7) obj;
        return wl7.b(this.a, qf7Var.a) && wl7.b(this.b, qf7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.a + ", density=" + this.b + ')';
    }
}
