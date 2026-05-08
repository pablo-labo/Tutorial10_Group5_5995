package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k94 implements t03 {
    public final float a;

    public k94(float f) {
        this.a = f;
    }

    @Override // defpackage.t03
    public final float a(long j, iy3 iy3Var) {
        return iy3Var.t1(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k94) && j94.c(this.a, ((k94) obj).a);
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + ".dp)";
    }
}
