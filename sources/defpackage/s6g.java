package defpackage;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class s6g extends AbstractList<String> implements RandomAccess, nt8 {
    public final mt8 a;

    public class a implements ListIterator<String> {
        public ListIterator<String> a;

        @Override // java.util.ListIterator
        public final void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.a.hasNext();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.a.hasPrevious();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            return this.a.next();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.a.nextIndex();
        }

        @Override // java.util.ListIterator
        public final String previous() {
            return this.a.previous();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        public final void set(String str) {
            throw new UnsupportedOperationException();
        }
    }

    public class b implements Iterator<String> {
        public Iterator<String> a;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.a.hasNext();
        }

        @Override // java.util.Iterator
        public final String next() {
            return this.a.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public s6g(mt8 mt8Var) {
        this.a = mt8Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.a.get(i);
    }

    @Override // defpackage.nt8
    public final List<?> h() {
        return Collections.unmodifiableList(this.a.a);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        b bVar = new b();
        bVar.a = this.a.iterator();
        return bVar;
    }

    @Override // defpackage.nt8
    public final ur1 k0(int i) {
        return this.a.k0(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i) {
        a aVar = new a();
        aVar.a = this.a.listIterator(i);
        return aVar;
    }

    @Override // defpackage.nt8
    public final void o0(oz8 oz8Var) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.nt8
    public final s6g v() {
        return this;
    }
}
