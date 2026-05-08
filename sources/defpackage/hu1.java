package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hu1<K, V> extends ht0<K, V> {
    public int V;

    @Override // defpackage.jfe, java.util.Map
    public final void clear() {
        this.V = 0;
        super.clear();
    }

    @Override // defpackage.jfe, java.util.Map
    public final int hashCode() {
        if (this.V == 0) {
            this.V = super.hashCode();
        }
        return this.V;
    }

    @Override // defpackage.jfe
    public final void i(jfe<? extends K, ? extends V> jfeVar) {
        this.V = 0;
        super.i(jfeVar);
    }

    @Override // defpackage.jfe
    public final V j(int i) {
        this.V = 0;
        return (V) super.j(i);
    }

    @Override // defpackage.jfe
    public final V k(int i, V v) {
        this.V = 0;
        return (V) super.k(i, v);
    }

    @Override // defpackage.jfe, java.util.Map
    public final V put(K k, V v) {
        this.V = 0;
        return (V) super.put(k, v);
    }
}
