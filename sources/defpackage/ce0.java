package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ce0 extends ge0 {
    public float a;
    public final int b = 1;

    public ce0(float f) {
        this.a = f;
    }

    @Override // defpackage.ge0
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        return 0.0f;
    }

    @Override // defpackage.ge0
    public final int b() {
        return this.b;
    }

    @Override // defpackage.ge0
    public final ge0 c() {
        return new ce0(0.0f);
    }

    @Override // defpackage.ge0
    public final void d() {
        this.a = 0.0f;
    }

    @Override // defpackage.ge0
    public final void e(float f, int i) {
        if (i == 0) {
            this.a = f;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ce0) && ((ce0) obj).a == this.a;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.a;
    }
}
