package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class xad<T> extends w2<T> {
    public final List<T> a;

    public static final class a implements ListIterator<T>, ze8 {
        public final ListIterator<T> a;
        public final /* synthetic */ xad<T> b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(xad<? extends T> xadVar, int i) {
            this.b = xadVar;
            this.a = xadVar.a.listIterator(w92.u0(i, xadVar));
        }

        @Override // java.util.ListIterator
        public final void add(T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final void set(T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public xad(List<? extends T> list) {
        list.getClass();
        this.a = list;
    }

    @Override // defpackage.l1
    public final int a() {
        return this.a.size();
    }

    @Override // java.util.List
    public final T get(int i) {
        return this.a.get(w92.t0(i, this));
    }

    @Override // defpackage.w2, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<T> iterator() {
        return new a(this, 0);
    }

    @Override // defpackage.w2, java.util.List
    public final ListIterator<T> listIterator() {
        return new a(this, 0);
    }

    @Override // defpackage.w2, java.util.List
    public final ListIterator<T> listIterator(int i) {
        return new a(this, i);
    }
}
