package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y7b implements t03 {
    public final float a;

    public y7b(float f) {
        this.a = f;
        if (f < 0.0f || f > 100.0f) {
            de7.a("The percent should be in the range of [0, 100]");
        }
    }

    @Override // defpackage.t03
    public final float a(long j, iy3 iy3Var) {
        return (this.a / 100.0f) * kie.c(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y7b) && Float.compare(this.a, ((y7b) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + "%)";
    }
}
