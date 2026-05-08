package defpackage;

import defpackage.hb9;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class kb9<V> extends k3<V> {
    public final hb9<?, V> a;

    public kb9(hb9<?, V> hb9Var) {
        this.a = hb9Var;
    }

    @Override // defpackage.k3
    public final int a() {
        return this.a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends V> collection) {
        collection.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        hb9<?, V> hb9Var = this.a;
        hb9Var.getClass();
        return new hb9.f(hb9Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        hb9<?, V> hb9Var = this.a;
        hb9Var.k();
        int iS = hb9Var.s(obj);
        if (iS < 0) {
            return false;
        }
        hb9Var.x(iS);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        collection.getClass();
        this.a.k();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        collection.getClass();
        this.a.k();
        return super.retainAll(collection);
    }
}
