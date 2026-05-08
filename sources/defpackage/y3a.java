package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y3a {
    public float a = 0.0f;
    public float b = 0.0f;
    public float c = 0.0f;
    public float d = 0.0f;

    public final void a(float f, float f2, float f3, float f4) {
        this.a = Math.max(f, this.a);
        this.b = Math.max(f2, this.b);
        this.c = Math.min(f3, this.c);
        this.d = Math.min(f4, this.d);
    }

    public final boolean b() {
        return (this.a >= this.c) | (this.b >= this.d);
    }

    public final String toString() {
        return "MutableRect(" + q92.I(this.a) + ", " + q92.I(this.b) + ", " + q92.I(this.c) + ", " + q92.I(this.d) + ')';
    }
}
