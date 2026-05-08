package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pe4<T> implements olg<T> {
    public final g4a<T> a;

    public pe4(g4a<T> g4aVar) {
        this.a = g4aVar;
    }

    @Override // defpackage.olg
    public final T a(t8b t8bVar) {
        return this.a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pe4) && wl7.b(this.a, ((pe4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.a + ')';
    }
}
