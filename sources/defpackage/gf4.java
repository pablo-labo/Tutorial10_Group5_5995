package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gf4 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public gf4(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf4)) {
            return false;
        }
        gf4 gf4Var = (gf4) obj;
        return Float.compare(this.a, gf4Var.a) == 0 && Float.compare(this.b, gf4Var.b) == 0 && Float.compare(this.c, gf4Var.c) == 0 && Float.compare(this.d, gf4Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + k6.c(k6.c(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        return "EdgeInsets(top=" + this.a + ", right=" + this.b + ", bottom=" + this.c + ", left=" + this.d + ")";
    }
}
