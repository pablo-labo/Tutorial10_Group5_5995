package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bj1 {
    public final float a;
    public final kne b;

    public bj1(float f, kne kneVar) {
        this.a = f;
        this.b = kneVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bj1)) {
            return false;
        }
        bj1 bj1Var = (bj1) obj;
        return j94.c(this.a, bj1Var.a) && this.b.equals(bj1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + ((Object) j94.e(this.a)) + ", brush=" + this.b + ')';
    }
}
