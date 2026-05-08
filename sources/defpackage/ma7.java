package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ma7<T> {
    public final int a;
    public final T b;

    public ma7(int i, T t) {
        this.a = i;
        this.b = t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ma7)) {
            return false;
        }
        ma7 ma7Var = (ma7) obj;
        return this.a == ma7Var.a && wl7.b(this.b, ma7Var.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        T t = this.b;
        return iHashCode + (t == null ? 0 : t.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.a + ", value=" + this.b + ')';
    }
}
