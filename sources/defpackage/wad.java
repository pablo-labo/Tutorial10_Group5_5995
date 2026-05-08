package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class wad<T> extends l3<T> {
    public final List<T> a;

    public static final class a implements ListIterator<T>, ze8 {
        public final ListIterator<T> a;
        public final /* synthetic */ wad<T> b;

        public a(wad<T> wadVar, int i) {
            this.b = wadVar;
            this.a = wadVar.a.listIterator(w92.u0(i, wadVar));
        }

        @Override // java.util.ListIterator
        public final void add(T t) {
            ListIterator<T> listIterator = this.a;
            listIterator.add(t);
            listIterator.previous();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.a.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final T next() {
            return this.a.previous();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return (this.b.size() - 1) - this.a.previousIndex();
        }

        @Override // java.util.ListIterator
        public final T previous() {
            return this.a.next();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return (this.b.size() - 1) - this.a.nextIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            this.a.remove();
        }

        @Override // java.util.ListIterator
        public final void set(T t) {
            this.a.set(t);
        }
    }

    public wad(List<T> list) {
        list.getClass();
        this.a = list;
    }

    @Override // defpackage.l3
    public final int a() {
        return this.a.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, T t) {
        this.a.add(w92.u0(i, this), t);
    }

    @Override // defpackage.l3
    public final T b(int i) {
        return this.a.remove(w92.t0(i, this));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i) {
        return this.a.get(w92.t0(i, this));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<T> iterator() {
        return new a(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<T> listIterator() {
        return new a(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final T set(int i, T t) {
        return this.a.set(w92.t0(i, this), t);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<T> listIterator(int i) {
        return new a(this, i);
    }
}
