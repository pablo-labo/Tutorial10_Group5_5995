package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class mqe<E> implements List<E>, bf8 {
    public final /* synthetic */ ArrayList<E> a = new ArrayList<>();

    @Override // java.util.List, java.util.Collection
    public final boolean add(E e) {
        return this.a.add(e);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        collection.getClass();
        return this.a.addAll(i, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        collection.getClass();
        return this.a.containsAll(collection);
    }

    @Override // java.util.List
    public final E get(int i) {
        return this.a.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.a.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        Iterator<E> it = this.a.iterator();
        it.getClass();
        return it;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return this.a.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator<E> listIterator() {
        ListIterator<E> listIterator = this.a.listIterator();
        listIterator.getClass();
        return listIterator;
    }

    public final E pop() {
        E e = (E) z92.Y0(this);
        remove(this.a.size() - 1);
        return e;
    }

    @Override // java.util.List
    public final E remove(int i) {
        return this.a.remove(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        collection.getClass();
        return this.a.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        collection.getClass();
        return this.a.retainAll(collection);
    }

    @Override // java.util.List
    public final E set(int i, E e) {
        return this.a.set(i, e);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.List
    public final List<E> subList(int i, int i2) {
        List<E> listSubList = this.a.subList(i, i2);
        listSubList.getClass();
        return listSubList;
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        return (T[]) q92.F(this, tArr);
    }

    @Override // java.util.List
    public final void add(int i, E e) {
        this.a.add(i, e);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.a.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return q92.E(this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        collection.getClass();
        return this.a.addAll(collection);
    }

    @Override // java.util.List
    public final ListIterator<E> listIterator(int i) {
        ListIterator<E> listIterator = this.a.listIterator(i);
        listIterator.getClass();
        return listIterator;
    }
}
