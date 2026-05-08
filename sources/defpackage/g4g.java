package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
@fd8
public final class g4g implements Collection<f4g>, ze8 {
    public final int[] a;

    public static final class a implements Iterator<f4g>, ze8 {
        public final int[] a;
        public int b;

        public a(int[] iArr) {
            this.a = iArr;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.b < this.a.length;
        }

        @Override // java.util.Iterator
        public final f4g next() {
            int i = this.b;
            int[] iArr = this.a;
            if (i < iArr.length) {
                this.b = i + 1;
                return new f4g(iArr[i]);
            }
            s6.j(String.valueOf(i));
            return null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(f4g f4gVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends f4g> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof f4g)) {
            return false;
        }
        int i = ((f4g) obj).a;
        int[] iArr = this.a;
        int length = iArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            if (i == iArr[i2]) {
                break;
            }
            i2++;
        }
        return i2 >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        collection.getClass();
        Collection<?> collection2 = collection;
        if (!collection2.isEmpty()) {
            for (Object obj : collection2) {
                if (obj instanceof f4g) {
                    int i = ((f4g) obj).a;
                    int[] iArr = this.a;
                    int length = iArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            i2 = -1;
                            break;
                        }
                        if (i == iArr[i2]) {
                            break;
                        }
                        i2++;
                    }
                    if (i2 >= 0) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof g4g) {
            return this.a.equals(((g4g) obj).a);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<f4g> iterator() {
        return new a(this.a);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.a.length;
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        return (T[]) q92.F(this, tArr);
    }

    public final String toString() {
        return "UIntArray(storage=" + Arrays.toString(this.a) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return q92.E(this);
    }
}
