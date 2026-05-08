package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vr0<T> {
    public final T a;
    public final T b;

    public vr0(T t, T t2) {
        this.a = t;
        this.b = t2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vr0)) {
            return false;
        }
        vr0 vr0Var = (vr0) obj;
        return wl7.b(this.a, vr0Var.a) && wl7.b(this.b, vr0Var.b);
    }

    public final int hashCode() {
        T t = this.a;
        int iHashCode = (t == null ? 0 : t.hashCode()) * 31;
        T t2 = this.b;
        return iHashCode + (t2 != null ? t2.hashCode() : 0);
    }

    public final String toString() {
        return "ApproximationBounds(lower=" + this.a + ", upper=" + this.b + ')';
    }
}
