package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jy3 implements iy3 {
    public final float a;
    public final float b;

    public jy3(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jy3)) {
            return false;
        }
        jy3 jy3Var = (jy3) obj;
        return Float.compare(this.a, jy3Var.a) == 0 && Float.compare(this.b, jy3Var.b) == 0;
    }

    @Override // defpackage.iy3
    public final float getDensity() {
        return this.a;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    @Override // defpackage.iy3
    public final float p1() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DensityImpl(density=");
        sb.append(this.a);
        sb.append(", fontScale=");
        return l6.h(sb, this.b, ')');
    }
}
