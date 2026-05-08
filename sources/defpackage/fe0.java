package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fe0 extends ge0 {
    public float a;
    public float b;
    public float c;
    public float d;
    public final int e = 4;

    public fe0(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // defpackage.ge0
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        if (i == 2) {
            return this.c;
        }
        if (i != 3) {
            return 0.0f;
        }
        return this.d;
    }

    @Override // defpackage.ge0
    public final int b() {
        return this.e;
    }

    @Override // defpackage.ge0
    public final ge0 c() {
        return new fe0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // defpackage.ge0
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
    }

    @Override // defpackage.ge0
    public final void e(float f, int i) {
        if (i == 0) {
            this.a = f;
            return;
        }
        if (i == 1) {
            this.b = f;
        } else if (i == 2) {
            this.c = f;
        } else {
            if (i != 3) {
                return;
            }
            this.d = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fe0)) {
            return false;
        }
        fe0 fe0Var = (fe0) obj;
        return fe0Var.a == this.a && fe0Var.b == this.b && fe0Var.c == this.c && fe0Var.d == this.d;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + k6.c(k6.c(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.a + ", v2 = " + this.b + ", v3 = " + this.c + ", v4 = " + this.d;
    }
}
