package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k65 {
    public final jf5<Float> a;

    public k65(jf5 jf5Var) {
        this.a = jf5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k65) {
            return Float.compare(0.0f, 0.0f) == 0 && wl7.b(this.a, ((k65) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (Float.hashCode(0.0f) * 31);
    }

    public final String toString() {
        return "Fade(alpha=0.0, animationSpec=" + this.a + ')';
    }
}
