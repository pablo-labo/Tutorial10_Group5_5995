package defpackage;

import defpackage.hb9;
import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class fae<E> extends n3<E> implements Serializable {
    public static final fae a = new fae(hb9.a);
    private final hb9<E, ?> backing;

    public fae() {
        this.backing = new hb9<>();
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.backing.u()) {
            return new z7e(1, this);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    @Override // defpackage.n3
    public final int a() {
        return this.backing.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(E e) {
        return this.backing.h(e) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> collection) {
        collection.getClass();
        this.backing.k();
        return super.addAll(collection);
    }

    public final fae b() {
        this.backing.j();
        return this.backing.size() > 0 ? this : a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.backing.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.backing.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.backing.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        hb9<E, ?> hb9Var = this.backing;
        hb9Var.getClass();
        return new hb9.e(hb9Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        hb9<E, ?> hb9Var = this.backing;
        hb9Var.k();
        int iR = hb9Var.r(obj);
        if (iR < 0) {
            return false;
        }
        hb9Var.x(iR);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> collection) {
        collection.getClass();
        this.backing.k();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> collection) {
        collection.getClass();
        this.backing.k();
        return super.retainAll(collection);
    }

    public fae(hb9<E, ?> hb9Var) {
        hb9Var.getClass();
        this.backing = hb9Var;
    }

    public fae(int i) {
        this.backing = new hb9<>(i);
    }
}
