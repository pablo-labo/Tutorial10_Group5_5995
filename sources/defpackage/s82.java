package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class s82 implements t82<Float> {
    public final float a;
    public final float b;

    public s82(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean a() {
        return this.a > this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).floatValue() <= ((Number) comparable2).floatValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s82)) {
            return false;
        }
        if (a() && ((s82) obj).a()) {
            return true;
        }
        s82 s82Var = (s82) obj;
        return this.a == s82Var.a && this.b == s82Var.b;
    }

    public final int hashCode() {
        if (a()) {
            return -1;
        }
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
