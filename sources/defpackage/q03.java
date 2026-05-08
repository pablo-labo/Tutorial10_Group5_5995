package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class q03 {
    public final float a;
    public final float b;

    public q03(ou8 ou8Var, float f, float f2) {
        this(ou8Var.a(f), ou8Var.a(f2));
    }

    public final q03 a() {
        return new q03(nn2.G(this.a), nn2.G(this.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q03)) {
            return false;
        }
        q03 q03Var = (q03) obj;
        return Float.compare(this.a, q03Var.a) == 0 && Float.compare(this.b, q03Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "CornerRadii(horizontal=" + this.a + ", vertical=" + this.b + ")";
    }

    public q03(float f, float f2) {
        this.a = f;
        this.b = f2;
    }
}
