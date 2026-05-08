package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ky3 implements iy3 {
    public final float a;
    public final float b;
    public final io5 c;

    public ky3(float f, float f2, io5 io5Var) {
        this.a = f;
        this.b = f2;
        this.c = io5Var;
    }

    @Override // defpackage.iy3
    public final long H(float f) {
        return hh2.y(4294967296L, this.c.a(f));
    }

    @Override // defpackage.iy3
    public final float S(long j) {
        if (ckf.a(bkf.b(j), 4294967296L)) {
            return this.c.b(bkf.c(j));
        }
        r6.g("Only Sp can convert to Px");
        return 0.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ky3)) {
            return false;
        }
        ky3 ky3Var = (ky3) obj;
        return Float.compare(this.a, ky3Var.a) == 0 && Float.compare(this.b, ky3Var.b) == 0 && this.c.equals(ky3Var.c);
    }

    @Override // defpackage.iy3
    public final float getDensity() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + k6.c(Float.hashCode(this.a) * 31, this.b, 31);
    }

    @Override // defpackage.iy3
    public final float p1() {
        return this.b;
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.a + ", fontScale=" + this.b + ", converter=" + this.c + ')';
    }
}
