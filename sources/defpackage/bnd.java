package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bnd {
    public float a;
    public float b;

    public bnd(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final String toString() {
        return this.a + "x" + this.b;
    }

    public bnd() {
        this(1.0f, 1.0f);
    }
}
