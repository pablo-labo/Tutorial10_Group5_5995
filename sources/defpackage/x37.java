package defpackage;

import defpackage.e47;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;

/* JADX INFO: loaded from: classes2.dex */
public abstract class x37<E> extends AbstractCollection<E> implements Serializable {
    public static final Object[] a = new Object[0];
    private static final long serialVersionUID = 912559;

    public static abstract class a<E> extends b<E> {
        public Object[] a;
        public int b;
        public boolean c;

        public a(int i) {
            wg2.o(i, "initialCapacity");
            this.a = new Object[i];
            this.b = 0;
        }

        public final void c(Object obj) {
            obj.getClass();
            e(1);
            Object[] objArr = this.a;
            int i = this.b;
            this.b = i + 1;
            objArr[i] = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final a d(Iterable iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                e(collection.size());
                if (collection instanceof x37) {
                    this.b = ((x37) collection).b(this.b, this.a);
                    return this;
                }
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }

        public final void e(int i) {
            Object[] objArr = this.a;
            int iB = b.b(objArr.length, this.b + i);
            if (iB > objArr.length || this.c) {
                this.a = Arrays.copyOf(this.a, iB);
                this.c = false;
            }
        }
    }

    public static abstract class b<E> {
        public static int b(int i, int i2) {
            if (i2 < 0) {
                l5.q("cannot store more than MAX_VALUE elements");
                return 0;
            }
            if (i2 <= i) {
                return i;
            }
            int iHighestOneBit = i + (i >> 1) + 1;
            if (iHighestOneBit < i2) {
                iHighestOneBit = Integer.highestOneBit(i2 - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                return Integer.MAX_VALUE;
            }
            return iHighestOneBit;
        }

        public abstract b<E> a(E e);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public e47<E> a() {
        if (isEmpty()) {
            e47.b bVar = e47.b;
            return qyc.e;
        }
        Object[] array = toArray(a);
        e47.b bVar2 = e47.b;
        return e47.i(array.length, array);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public int b(int i, Object[] objArr) {
        r6g<E> it = iterator();
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return i;
    }

    public Object[] c() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    public int d() {
        throw new UnsupportedOperationException();
    }

    public int e() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean f();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public abstract r6g<E> iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Spliterator<E> spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        int size = size();
        if (tArr.length < size) {
            Object[] objArrC = c();
            if (objArrC != null) {
                return (T[]) Arrays.copyOfRange(objArrC, e(), d(), tArr.getClass());
            }
            if (tArr.length != 0) {
                tArr = (T[]) Arrays.copyOf(tArr, 0);
            }
            tArr = (T[]) Arrays.copyOf(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        b(0, tArr);
        return tArr;
    }

    public Object writeReplace() {
        return new e47.c(toArray(a));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(a);
    }
}
