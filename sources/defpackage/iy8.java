package defpackage;

import defpackage.w2;
import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class iy8<E> extends l3<E> implements RandomAccess, Serializable {
    public static final iy8 a;
    private E[] backing;
    private boolean isReadOnly;
    private int length;

    public static final class b<E> implements ListIterator<E>, ze8 {
        public final iy8<E> a;
        public int b;
        public int c = -1;
        public int d;

        public b(iy8<E> iy8Var, int i) {
            this.a = iy8Var;
            this.b = i;
            this.d = ((AbstractList) iy8Var).modCount;
        }

        public final void a() {
            if (((AbstractList) this.a).modCount == this.d) {
                return;
            }
            q6.h();
        }

        @Override // java.util.ListIterator
        public final void add(E e) {
            a();
            int i = this.b;
            this.b = i + 1;
            iy8<E> iy8Var = this.a;
            iy8Var.add(i, e);
            this.c = -1;
            this.d = ((AbstractList) iy8Var).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.b < ((iy8) this.a).length;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.b > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final E next() {
            a();
            int i = this.b;
            iy8<E> iy8Var = this.a;
            if (i >= ((iy8) iy8Var).length) {
                k20.p();
                return null;
            }
            int i2 = this.b;
            this.b = i2 + 1;
            this.c = i2;
            return (E) ((iy8) iy8Var).backing[this.c];
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.b;
        }

        @Override // java.util.ListIterator
        public final E previous() {
            a();
            int i = this.b;
            if (i <= 0) {
                k20.p();
                return null;
            }
            int i2 = i - 1;
            this.b = i2;
            this.c = i2;
            return (E) ((iy8) this.a).backing[this.c];
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            a();
            int i = this.c;
            if (i == -1) {
                r6.g("Call next() or previous() before removing element from the iterator.");
                return;
            }
            iy8<E> iy8Var = this.a;
            iy8Var.b(i);
            this.b = this.c;
            this.c = -1;
            this.d = ((AbstractList) iy8Var).modCount;
        }

        @Override // java.util.ListIterator
        public final void set(E e) {
            a();
            int i = this.c;
            if (i != -1) {
                this.a.set(i, e);
            } else {
                r6.g("Call next() or previous() before replacing element from the iterator.");
            }
        }
    }

    static {
        iy8 iy8Var = new iy8(0);
        iy8Var.isReadOnly = true;
        a = iy8Var;
    }

    public iy8(int i) {
        if (i >= 0) {
            this.backing = (E[]) new Object[i];
        } else {
            l5.q("capacity must be non-negative.");
            throw null;
        }
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.isReadOnly) {
            return new z7e(0, this);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // defpackage.l3
    public final int a() {
        return this.length;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        n();
        int i2 = this.length;
        if (i < 0 || i > i2) {
            l5.s(k20.l("index: ", i, i2, ", size: "));
        } else {
            k(i, e);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        collection.getClass();
        n();
        int i2 = this.length;
        if (i < 0 || i > i2) {
            l5.s(k20.l("index: ", i, i2, ", size: "));
            return false;
        }
        int size = collection.size();
        j(i, collection, size);
        return size > 0;
    }

    @Override // defpackage.l3
    public final E b(int i) {
        n();
        int i2 = this.length;
        if (i >= 0 && i < i2) {
            return q(i);
        }
        l5.s(k20.l("index: ", i, i2, ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        n();
        r(0, this.length);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            E[] eArr = this.backing;
            int i = this.length;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (wl7.b(eArr[i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        int i2 = this.length;
        if (i >= 0 && i < i2) {
            return this.backing[i];
        }
        l5.s(k20.l("index: ", i, i2, ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        E[] eArr = this.backing;
        int i = this.length;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            E e = eArr[i2];
            iHashCode = (iHashCode * 31) + (e != null ? e.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.length; i++) {
            if (wl7.b(this.backing[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.length == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    public final void j(int i, Collection<? extends E> collection, int i2) {
        ((AbstractList) this).modCount++;
        o(i, i2);
        Iterator<? extends E> it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.backing[i + i3] = it.next();
        }
    }

    public final void k(int i, E e) {
        ((AbstractList) this).modCount++;
        o(i, 1);
        this.backing[i] = e;
    }

    public final iy8 l() {
        n();
        this.isReadOnly = true;
        return this.length > 0 ? this : a;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.length - 1; i >= 0; i--) {
            if (wl7.b(this.backing[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator(int i) {
        int i2 = this.length;
        if (i >= 0 && i <= i2) {
            return new b(this, i);
        }
        l5.s(k20.l("index: ", i, i2, ", size: "));
        return null;
    }

    public final void n() {
        if (this.isReadOnly) {
            b0.l();
        }
    }

    public final void o(int i, int i2) {
        int i3 = this.length + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        E[] eArr = this.backing;
        if (i3 > eArr.length) {
            int length = eArr.length;
            int i4 = length + (length >> 1);
            if (i4 - i3 < 0) {
                i4 = i3;
            }
            if (i4 - 2147483639 > 0) {
                i4 = i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.backing = (E[]) Arrays.copyOf(eArr, i4);
        }
        E[] eArr2 = this.backing;
        pyd.j(eArr2, i + i2, eArr2, i, this.length);
        this.length += i2;
    }

    public final E q(int i) {
        ((AbstractList) this).modCount++;
        E[] eArr = this.backing;
        E e = eArr[i];
        pyd.j(eArr, i, eArr, i + 1, this.length);
        E[] eArr2 = this.backing;
        int i2 = this.length - 1;
        eArr2.getClass();
        eArr2[i2] = null;
        this.length--;
        return e;
    }

    public final void r(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        E[] eArr = this.backing;
        pyd.j(eArr, i, eArr, i + i2, this.length);
        E[] eArr2 = this.backing;
        int i3 = this.length;
        ygg.u(eArr2, i3 - i2, i3);
        this.length -= i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        n();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            b(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<?> collection) {
        collection.getClass();
        n();
        return s(0, this.length, collection, false) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<?> collection) {
        collection.getClass();
        n();
        return s(0, this.length, collection, true) > 0;
    }

    public final int s(int i, int i2, Collection<? extends E> collection, boolean z) {
        E[] eArr;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            eArr = this.backing;
            if (i3 >= i2) {
                break;
            }
            int i5 = i + i3;
            if (collection.contains(eArr[i5]) == z) {
                E[] eArr2 = this.backing;
                i3++;
                eArr2[i4 + i] = eArr2[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        pyd.j(eArr, i + i4, eArr, i2 + i, this.length);
        E[] eArr3 = this.backing;
        int i7 = this.length;
        ygg.u(eArr3, i7 - i6, i7);
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.length -= i6;
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        n();
        int i2 = this.length;
        if (i < 0 || i >= i2) {
            l5.s(k20.l("index: ", i, i2, ", size: "));
            return null;
        }
        E[] eArr = this.backing;
        E e2 = eArr[i];
        eArr[i] = e;
        return e2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List<E> subList(int i, int i2) {
        w2.a.b(i, i2, this.length);
        return new a(this.backing, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        int length = tArr.length;
        int i = this.length;
        E[] eArr = this.backing;
        if (length < i) {
            T[] tArr2 = (T[]) Arrays.copyOfRange(eArr, 0, i, tArr.getClass());
            tArr2.getClass();
            return tArr2;
        }
        pyd.j(eArr, 0, tArr, 0, i);
        int i2 = this.length;
        if (i2 < tArr.length) {
            tArr[i2] = null;
        }
        return tArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return ygg.f(this.backing, 0, this.length, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        n();
        k(this.length, e);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    public static final class a<E> extends l3<E> implements RandomAccess, Serializable {
        private E[] backing;
        private int length;
        private final int offset;
        private final a<E> parent;
        private final iy8<E> root;

        /* JADX INFO: renamed from: iy8$a$a, reason: collision with other inner class name */
        public static final class C0275a<E> implements ListIterator<E>, ze8 {
            public final a<E> a;
            public int b;
            public int c = -1;
            public int d;

            public C0275a(a<E> aVar, int i) {
                this.a = aVar;
                this.b = i;
                this.d = ((AbstractList) aVar).modCount;
            }

            public final void a() {
                if (((AbstractList) ((a) this.a).root).modCount == this.d) {
                    return;
                }
                q6.h();
            }

            @Override // java.util.ListIterator
            public final void add(E e) {
                a();
                int i = this.b;
                this.b = i + 1;
                a<E> aVar = this.a;
                aVar.add(i, e);
                this.c = -1;
                this.d = ((AbstractList) aVar).modCount;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final boolean hasNext() {
                return this.b < ((a) this.a).length;
            }

            @Override // java.util.ListIterator
            public final boolean hasPrevious() {
                return this.b > 0;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final E next() {
                a();
                int i = this.b;
                a<E> aVar = this.a;
                if (i >= ((a) aVar).length) {
                    k20.p();
                    return null;
                }
                int i2 = this.b;
                this.b = i2 + 1;
                this.c = i2;
                return (E) ((a) aVar).backing[((a) aVar).offset + this.c];
            }

            @Override // java.util.ListIterator
            public final int nextIndex() {
                return this.b;
            }

            @Override // java.util.ListIterator
            public final E previous() {
                a();
                int i = this.b;
                if (i <= 0) {
                    k20.p();
                    return null;
                }
                int i2 = i - 1;
                this.b = i2;
                this.c = i2;
                a<E> aVar = this.a;
                return (E) ((a) aVar).backing[((a) aVar).offset + this.c];
            }

            @Override // java.util.ListIterator
            public final int previousIndex() {
                return this.b - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final void remove() {
                a();
                int i = this.c;
                if (i == -1) {
                    r6.g("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                a<E> aVar = this.a;
                aVar.b(i);
                this.b = this.c;
                this.c = -1;
                this.d = ((AbstractList) aVar).modCount;
            }

            @Override // java.util.ListIterator
            public final void set(E e) {
                a();
                int i = this.c;
                if (i != -1) {
                    this.a.set(i, e);
                } else {
                    r6.g("Call next() or previous() before replacing element from the iterator.");
                }
            }
        }

        public a(E[] eArr, int i, int i2, a<E> aVar, iy8<E> iy8Var) {
            eArr.getClass();
            iy8Var.getClass();
            this.backing = eArr;
            this.offset = i;
            this.length = i2;
            this.parent = aVar;
            this.root = iy8Var;
            ((AbstractList) this).modCount = ((AbstractList) iy8Var).modCount;
        }

        private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Deserialization is supported via proxy only");
        }

        private final Object writeReplace() throws NotSerializableException {
            if (((iy8) this.root).isReadOnly) {
                return new z7e(0, this);
            }
            throw new NotSerializableException("The list cannot be serialized while it is being built.");
        }

        @Override // defpackage.l3
        public final int a() {
            n();
            return this.length;
        }

        @Override // java.util.AbstractList, java.util.List
        public final void add(int i, E e) {
            o();
            n();
            int i2 = this.length;
            if (i < 0 || i > i2) {
                l5.s(k20.l("index: ", i, i2, ", size: "));
            } else {
                l(this.offset + i, e);
            }
        }

        @Override // java.util.AbstractList, java.util.List
        public final boolean addAll(int i, Collection<? extends E> collection) {
            collection.getClass();
            o();
            n();
            int i2 = this.length;
            if (i < 0 || i > i2) {
                l5.s(k20.l("index: ", i, i2, ", size: "));
                return false;
            }
            int size = collection.size();
            k(this.offset + i, collection, size);
            return size > 0;
        }

        @Override // defpackage.l3
        public final E b(int i) {
            o();
            n();
            int i2 = this.length;
            if (i >= 0 && i < i2) {
                return q(this.offset + i);
            }
            l5.s(k20.l("index: ", i, i2, ", size: "));
            return null;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final void clear() {
            o();
            n();
            r(this.offset, this.length);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(Object obj) {
            n();
            if (obj == this) {
                return true;
            }
            if (obj instanceof List) {
                List list = (List) obj;
                E[] eArr = this.backing;
                int i = this.offset;
                int i2 = this.length;
                if (i2 == list.size()) {
                    for (int i3 = 0; i3 < i2; i3++) {
                        if (wl7.b(eArr[i + i3], list.get(i3))) {
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public final E get(int i) {
            n();
            int i2 = this.length;
            if (i >= 0 && i < i2) {
                return this.backing[this.offset + i];
            }
            l5.s(k20.l("index: ", i, i2, ", size: "));
            return null;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            n();
            E[] eArr = this.backing;
            int i = this.offset;
            int i2 = this.length;
            int iHashCode = 1;
            for (int i3 = 0; i3 < i2; i3++) {
                E e = eArr[i + i3];
                iHashCode = (iHashCode * 31) + (e != null ? e.hashCode() : 0);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(Object obj) {
            n();
            for (int i = 0; i < this.length; i++) {
                if (wl7.b(this.backing[this.offset + i], obj)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            n();
            return this.length == 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public final Iterator<E> iterator() {
            return listIterator(0);
        }

        public final void k(int i, Collection<? extends E> collection, int i2) {
            ((AbstractList) this).modCount++;
            a<E> aVar = this.parent;
            if (aVar != null) {
                aVar.k(i, collection, i2);
            } else {
                iy8<E> iy8Var = this.root;
                iy8 iy8Var2 = iy8.a;
                iy8Var.j(i, collection, i2);
            }
            this.backing = (E[]) ((iy8) this.root).backing;
            this.length += i2;
        }

        public final void l(int i, E e) {
            ((AbstractList) this).modCount++;
            a<E> aVar = this.parent;
            if (aVar != null) {
                aVar.l(i, e);
            } else {
                iy8<E> iy8Var = this.root;
                iy8 iy8Var2 = iy8.a;
                iy8Var.k(i, e);
            }
            this.backing = (E[]) ((iy8) this.root).backing;
            this.length++;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(Object obj) {
            n();
            for (int i = this.length - 1; i >= 0; i--) {
                if (wl7.b(this.backing[this.offset + i], obj)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final ListIterator<E> listIterator(int i) {
            n();
            int i2 = this.length;
            if (i >= 0 && i <= i2) {
                return new C0275a(this, i);
            }
            l5.s(k20.l("index: ", i, i2, ", size: "));
            return null;
        }

        public final void n() {
            if (((AbstractList) this.root).modCount == ((AbstractList) this).modCount) {
                return;
            }
            q6.h();
        }

        public final void o() {
            if (((iy8) this.root).isReadOnly) {
                b0.l();
            }
        }

        public final E q(int i) {
            E eQ;
            ((AbstractList) this).modCount++;
            a<E> aVar = this.parent;
            if (aVar != null) {
                eQ = aVar.q(i);
            } else {
                iy8<E> iy8Var = this.root;
                iy8 iy8Var2 = iy8.a;
                eQ = iy8Var.q(i);
            }
            this.length--;
            return eQ;
        }

        public final void r(int i, int i2) {
            if (i2 > 0) {
                ((AbstractList) this).modCount++;
            }
            a<E> aVar = this.parent;
            if (aVar != null) {
                aVar.r(i, i2);
            } else {
                iy8<E> iy8Var = this.root;
                iy8 iy8Var2 = iy8.a;
                iy8Var.r(i, i2);
            }
            this.length -= i2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean remove(Object obj) {
            o();
            n();
            int iIndexOf = indexOf(obj);
            if (iIndexOf >= 0) {
                b(iIndexOf);
            }
            return iIndexOf >= 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean removeAll(Collection<?> collection) {
            collection.getClass();
            o();
            n();
            return s(this.offset, this.length, collection, false) > 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean retainAll(Collection<?> collection) {
            collection.getClass();
            o();
            n();
            return s(this.offset, this.length, collection, true) > 0;
        }

        public final int s(int i, int i2, Collection<? extends E> collection, boolean z) {
            int iS;
            a<E> aVar = this.parent;
            if (aVar != null) {
                iS = aVar.s(i, i2, collection, z);
            } else {
                iy8<E> iy8Var = this.root;
                iy8 iy8Var2 = iy8.a;
                iS = iy8Var.s(i, i2, collection, z);
            }
            if (iS > 0) {
                ((AbstractList) this).modCount++;
            }
            this.length -= iS;
            return iS;
        }

        @Override // java.util.AbstractList, java.util.List
        public final E set(int i, E e) {
            o();
            n();
            int i2 = this.length;
            if (i < 0 || i >= i2) {
                l5.s(k20.l("index: ", i, i2, ", size: "));
                return null;
            }
            E[] eArr = this.backing;
            int i3 = this.offset;
            E e2 = eArr[i3 + i];
            eArr[i3 + i] = e;
            return e2;
        }

        @Override // java.util.AbstractList, java.util.List
        public final List<E> subList(int i, int i2) {
            w2.a.b(i, i2, this.length);
            return new a(this.backing, this.offset + i, i2 - i, this, this.root);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final <T> T[] toArray(T[] tArr) {
            tArr.getClass();
            n();
            int length = tArr.length;
            int i = this.length;
            E[] eArr = this.backing;
            int i2 = this.offset;
            if (length < i) {
                T[] tArr2 = (T[]) Arrays.copyOfRange(eArr, i2, i + i2, tArr.getClass());
                tArr2.getClass();
                return tArr2;
            }
            pyd.j(eArr, 0, tArr, i2, i + i2);
            int i3 = this.length;
            if (i3 < tArr.length) {
                tArr[i3] = null;
            }
            return tArr;
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            n();
            return ygg.f(this.backing, this.offset, this.length, this);
        }

        @Override // java.util.AbstractList, java.util.List
        public final ListIterator<E> listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean add(E e) {
            o();
            n();
            l(this.offset + this.length, e);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final Object[] toArray() {
            n();
            E[] eArr = this.backing;
            int i = this.offset;
            return pyd.n(eArr, i, this.length + i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean addAll(Collection<? extends E> collection) {
            collection.getClass();
            o();
            n();
            int size = collection.size();
            k(this.offset + this.length, collection, size);
            return size > 0;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return pyd.n(this.backing, 0, this.length);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        collection.getClass();
        n();
        int size = collection.size();
        j(this.length, collection, size);
        return size > 0;
    }
}
