package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public abstract class w2<E> extends l1<E> implements List<E> {

    public static final class a {
        public static void a(int i, int i2, int i3) {
            if (i < 0 || i2 > i3) {
                v40.k(i3, uz.f("startIndex: ", i, ", endIndex: ", i2, ", size: "));
            } else {
                if (i <= i2) {
                    return;
                }
                l5.q(k20.l("startIndex: ", i, i2, " > endIndex: "));
            }
        }

        public static void b(int i, int i2, int i3) {
            if (i < 0 || i2 > i3) {
                v40.k(i3, uz.f("fromIndex: ", i, ", toIndex: ", i2, ", size: "));
            } else {
                if (i <= i2) {
                    return;
                }
                l5.q(k20.l("fromIndex: ", i, i2, " > toIndex: "));
            }
        }
    }

    public class b implements Iterator<E>, ze8 {
        public int a;

        public b() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.a < w2.this.a();
        }

        @Override // java.util.Iterator
        public final E next() {
            if (!hasNext()) {
                k20.p();
                return null;
            }
            int i = this.a;
            this.a = i + 1;
            return w2.this.get(i);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public class c extends w2<E>.b implements ListIterator<E> {
        public c(int i) {
            super();
            int iA = w2.this.a();
            if (i < 0 || i > iA) {
                l5.s(k20.l("index: ", i, iA, ", size: "));
                throw null;
            }
            this.a = i;
        }

        @Override // java.util.ListIterator
        public final void add(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.a > 0;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.a;
        }

        @Override // java.util.ListIterator
        public final E previous() {
            if (!hasPrevious()) {
                k20.p();
                return null;
            }
            int i = this.a - 1;
            this.a = i;
            return w2.this.get(i);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.a - 1;
        }

        @Override // java.util.ListIterator
        public final void set(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final class d<E> extends w2<E> implements RandomAccess {
        public final w2<E> a;
        public final int b;
        public final int c;

        /* JADX WARN: Multi-variable type inference failed */
        public d(w2<? extends E> w2Var, int i, int i2) {
            this.a = w2Var;
            this.b = i;
            a.b(i, i2, w2Var.a());
            this.c = i2 - i;
        }

        @Override // defpackage.l1
        public final int a() {
            return this.c;
        }

        @Override // java.util.List
        public final E get(int i) {
            int i2 = this.c;
            if (i < 0 || i >= i2) {
                l5.s(k20.l("index: ", i, i2, ", size: "));
                return null;
            }
            return this.a.get(this.b + i);
        }

        @Override // defpackage.w2, java.util.List
        public final List<E> subList(int i, int i2) {
            a.b(i, i2, this.c);
            int i3 = this.b;
            return new d(this.a, i + i3, i3 + i2);
        }
    }

    @Override // java.util.List
    public final void add(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection collection = (Collection) obj;
        if (size() == collection.size()) {
            Iterator<E> it = collection.iterator();
            Iterator<E> it2 = iterator();
            while (it2.hasNext()) {
                if (!wl7.b(it2.next(), it.next())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        Iterator<E> it = iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            E next = it.next();
            iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
        }
        return iHashCode;
    }

    public int indexOf(Object obj) {
        Iterator<E> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            if (wl7.b(it.next(), obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new b();
    }

    public int lastIndexOf(Object obj) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (wl7.b(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator<E> listIterator() {
        return new c(0);
    }

    @Override // java.util.List
    public final E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final E set(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List<E> subList(int i, int i2) {
        return new d(this, i, i2);
    }

    public ListIterator<E> listIterator(int i) {
        return new c(i);
    }
}
