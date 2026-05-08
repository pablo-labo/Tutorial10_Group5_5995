package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lq1 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public lq1(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof lq1)) {
            return false;
        }
        lq1 lq1Var = (lq1) obj;
        return j94.c(this.a, lq1Var.a) && j94.c(this.b, lq1Var.b) && j94.c(this.c, lq1Var.c) && j94.c(this.d, lq1Var.d) && j94.c(0.0f, 0.0f);
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + k6.c(k6.c(k6.c(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31);
    }
}
