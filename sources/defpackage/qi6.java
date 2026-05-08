package defpackage;

import androidx.compose.ui.e;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: classes.dex */
public final class qi6 implements List<e.c>, ze8 {
    public final p3a<Object> a = new p3a<>(16);
    public final j3a b = new j3a(16);
    public int c = -1;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        defpackage.l5.s("Index must be between 0 and size");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a() {
        /*
            r7 = this;
            r0 = 2139095040(0x7f800000, float:Infinity)
            r1 = 0
            long r0 = defpackage.w74.b(r0, r1, r1)
            int r2 = r7.c
            int r2 = r2 + 1
            p3a<java.lang.Object> r3 = r7.a
            int r3 = r3.b
            int r3 = r3 + (-1)
            if (r2 > r3) goto L46
        L13:
            j3a r4 = r7.b
            if (r2 < 0) goto L3c
            int r5 = r4.b
            if (r2 >= r5) goto L3f
            long[] r4 = r4.a
            r5 = r4[r2]
            int r4 = defpackage.w74.h(r5, r0)
            if (r4 >= 0) goto L26
            r0 = r5
        L26:
            float r4 = defpackage.w74.l(r0)
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L36
            boolean r4 = defpackage.w74.r(r0)
            if (r4 == 0) goto L36
            goto L3b
        L36:
            if (r2 == r3) goto L3b
            int r2 = r2 + 1
            goto L13
        L3b:
            return r0
        L3c:
            r4.getClass()
        L3f:
            java.lang.String r7 = "Index must be between 0 and size"
            defpackage.l5.s(r7)
            r0 = 0
        L46:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qi6.a():long");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, e.c cVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends e.c> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void b(int i, int i2) {
        if (i >= i2) {
            return;
        }
        this.a.l(i, i2);
        j3a j3aVar = this.b;
        if (i >= 0) {
            int i3 = j3aVar.b;
            if (i <= i3 && i2 >= 0 && i2 <= i3) {
                if (i2 < i) {
                    l5.q("The end index must be < start index");
                    return;
                } else {
                    if (i2 != i) {
                        if (i2 < i3) {
                            long[] jArr = j3aVar.a;
                            pyd.i(i, i2, i3, jArr, jArr);
                        }
                        j3aVar.b -= i2 - i;
                        return;
                    }
                    return;
                }
            }
        } else {
            j3aVar.getClass();
        }
        l5.s("Index must be between 0 and size");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.c = -1;
        this.a.i();
        this.b.b = 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof e.c) && indexOf((e.c) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((e.c) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final e.c get(int i) {
        Object objB = this.a.b(i);
        objB.getClass();
        return (e.c) objB;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof e.c)) {
            return -1;
        }
        e.c cVar = (e.c) obj;
        int size = size() - 1;
        if (size >= 0) {
            int i = 0;
            while (!wl7.b(this.a.b(i), cVar)) {
                if (i != size) {
                    i++;
                }
            }
            return i;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.a.d();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<e.c> iterator() {
        return new a(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof e.c)) {
            return -1;
        }
        e.c cVar = (e.c) obj;
        for (int size = size() - 1; -1 < size; size--) {
            if (wl7.b(this.a.b(size), cVar)) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator<e.c> listIterator() {
        return new a(this, 0, 7);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ e.c remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<e.c> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ e.c set(int i, e.c cVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.a.b;
    }

    @Override // java.util.List
    public final void sort(Comparator<? super e.c> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List<e.c> subList(int i, int i2) {
        return new b(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return q92.E(this);
    }

    public final class b implements List<e.c>, ze8 {
        public final int a;
        public final int b;

        public b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        @Override // java.util.List
        public final /* bridge */ /* synthetic */ void add(int i, e.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final boolean addAll(int i, Collection<? extends e.c> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ /* synthetic */ void addLast(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            return (obj instanceof e.c) && indexOf((e.c) obj) != -1;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains((e.c) it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final e.c get(int i) {
            Object objB = qi6.this.a.b(i + this.a);
            objB.getClass();
            return (e.c) objB;
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            if (!(obj instanceof e.c)) {
                return -1;
            }
            e.c cVar = (e.c) obj;
            int i = this.a;
            int i2 = this.b;
            if (i > i2) {
                return -1;
            }
            int i3 = i;
            while (!wl7.b(qi6.this.a.b(i3), cVar)) {
                if (i3 == i2) {
                    return -1;
                }
                i3++;
            }
            return i3 - i;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return size() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator<e.c> iterator() {
            int i = this.a;
            return qi6.this.new a(i, i, this.b);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            if (!(obj instanceof e.c)) {
                return -1;
            }
            e.c cVar = (e.c) obj;
            int i = this.b;
            int i2 = this.a;
            if (i2 > i) {
                return -1;
            }
            while (!wl7.b(qi6.this.a.b(i), cVar)) {
                if (i == i2) {
                    return -1;
                }
                i--;
            }
            return i - i2;
        }

        @Override // java.util.List
        public final ListIterator<e.c> listIterator(int i) {
            int i2 = this.a;
            int i3 = this.b;
            return qi6.this.new a(i + i2, i2, i3);
        }

        @Override // java.util.List
        public final /* bridge */ /* synthetic */ e.c remove(int i) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ /* synthetic */ Object removeFirst() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ /* synthetic */ Object removeLast() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final void replaceAll(UnaryOperator<e.c> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final /* bridge */ /* synthetic */ e.c set(int i, e.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.b - this.a;
        }

        @Override // java.util.List
        public final void sort(Comparator<? super e.c> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final List<e.c> subList(int i, int i2) {
            int i3 = this.a;
            return qi6.this.new b(i + i3, i3 + i2);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return q92.E(this);
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) q92.F(this, tArr);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends e.c> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final ListIterator<e.c> listIterator() {
            int i = this.a;
            return qi6.this.new a(i, i, this.b);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) q92.F(this, tArr);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends e.c> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator<e.c> listIterator(int i) {
        return new a(this, i, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final class a implements ListIterator<e.c>, ze8 {
        public int a;
        public final int b;
        public final int c;

        public a(qi6 qi6Var, int i, int i2) {
            this((i2 & 1) != 0 ? 0 : i, 0, qi6Var.a.b);
        }

        @Override // java.util.ListIterator
        public final /* bridge */ /* synthetic */ void add(e.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.a < this.c;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.a > this.b;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            p3a<Object> p3aVar = qi6.this.a;
            int i = this.a;
            this.a = i + 1;
            Object objB = p3aVar.b(i);
            objB.getClass();
            return (e.c) objB;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.a - this.b;
        }

        @Override // java.util.ListIterator
        public final e.c previous() {
            p3a<Object> p3aVar = qi6.this.a;
            int i = this.a - 1;
            this.a = i;
            Object objB = p3aVar.b(i);
            objB.getClass();
            return (e.c) objB;
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return (this.a - this.b) - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final /* bridge */ /* synthetic */ void set(e.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public a(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }
    }
}
