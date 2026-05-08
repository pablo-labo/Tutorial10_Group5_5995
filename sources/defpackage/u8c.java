package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class u8c implements t03 {
    public final float a;

    public u8c(float f) {
        this.a = f;
    }

    @Override // defpackage.t03
    public final float a(long j, iy3 iy3Var) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u8c) && Float.compare(this.a, ((u8c) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + ".px)";
    }
}
