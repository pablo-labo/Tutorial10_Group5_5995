package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nte<T> implements olg<T> {
    public final T a;

    public nte(T t) {
        this.a = t;
    }

    @Override // defpackage.olg
    public final T a(t8b t8bVar) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nte) && wl7.b(this.a, ((nte) obj).a);
    }

    public final int hashCode() {
        T t = this.a;
        if (t == null) {
            return 0;
        }
        return t.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.a + ')';
    }
}
