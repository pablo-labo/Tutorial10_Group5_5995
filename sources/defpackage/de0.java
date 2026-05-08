package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class de0 extends ge0 {
    public float a;
    public float b;
    public final int c = 2;

    public de0(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.ge0
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.b;
    }

    @Override // defpackage.ge0
    public final int b() {
        return this.c;
    }

    @Override // defpackage.ge0
    public final ge0 c() {
        return new de0(0.0f, 0.0f);
    }

    @Override // defpackage.ge0
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
    }

    @Override // defpackage.ge0
    public final void e(float f, int i) {
        if (i == 0) {
            this.a = f;
        } else {
            if (i != 1) {
                return;
            }
            this.b = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof de0)) {
            return false;
        }
        de0 de0Var = (de0) obj;
        return de0Var.a == this.a && de0Var.b == this.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.a + ", v2 = " + this.b;
    }
}
