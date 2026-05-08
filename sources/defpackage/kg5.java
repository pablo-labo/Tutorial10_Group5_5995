package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kg5 implements mzg {
    public final float a;
    public final float b;
    public final float c;

    public kg5(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    @Override // defpackage.mzg
    public final int a(iy3 iy3Var) {
        return iy3Var.x0(this.b);
    }

    @Override // defpackage.mzg
    public final int b(iy3 iy3Var, vl8 vl8Var) {
        return iy3Var.x0(0.0f);
    }

    @Override // defpackage.mzg
    public final int c(iy3 iy3Var) {
        return iy3Var.x0(this.c);
    }

    @Override // defpackage.mzg
    public final int d(iy3 iy3Var, vl8 vl8Var) {
        return iy3Var.x0(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kg5)) {
            return false;
        }
        kg5 kg5Var = (kg5) obj;
        return j94.c(this.a, kg5Var.a) && j94.c(this.b, kg5Var.b) && j94.c(0.0f, 0.0f) && j94.c(this.c, kg5Var.c);
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + k6.c(k6.c(Float.hashCode(this.a) * 31, this.b, 31), 0.0f, 31);
    }

    public final String toString() {
        return "Insets(left=" + ((Object) j94.e(this.a)) + ", top=" + ((Object) j94.e(this.b)) + ", right=" + ((Object) j94.e(0.0f)) + ", bottom=" + ((Object) j94.e(this.c)) + ')';
    }
}
