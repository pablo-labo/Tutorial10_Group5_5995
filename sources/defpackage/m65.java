package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m65<T> {
    public final T a;
    public final ah2 b;

    /* JADX WARN: Multi-variable type inference failed */
    public m65(qke qkeVar, ah2 ah2Var) {
        this.a = qkeVar;
        this.b = ah2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m65) {
            m65 m65Var = (m65) obj;
            return wl7.b(this.a, m65Var.a) && this.b == m65Var.b;
        }
        return false;
    }

    public final int hashCode() {
        T t = this.a;
        return this.b.hashCode() + ((t == null ? 0 : t.hashCode()) * 31);
    }

    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.a + ", transition=" + this.b + ')';
    }
}
