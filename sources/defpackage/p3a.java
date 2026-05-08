package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class p3a<E> extends ona<E> {
    public b<E> c;

    public static final class a<T> implements ListIterator<T>, ze8 {
        public final List<T> a;
        public int b;

        public a(int i, List list) {
            this.a = list;
            this.b = i - 1;
        }

        @Override // java.util.ListIterator
        public final void add(T t) {
            int i = this.b + 1;
            this.b = i;
            this.a.add(i, t);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.b < this.a.size() - 1;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.b >= 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final T next() {
            int i = this.b + 1;
            this.b = i;
            return this.a.get(i);
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.b + 1;
        }

        @Override // java.util.ListIterator
        public final T previous() {
            int i = this.b;
            this.b = i - 1;
            return this.a.get(i);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.b;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            this.a.remove(this.b);
            this.b--;
        }

        @Override // java.util.ListIterator
        public final void set(T t) {
            this.a.set(this.b, t);
        }
    }

    public p3a(int i) {
        this.a = i == 0 ? pna.a : new Object[i];
    }

    public final void g(Object obj) {
        int i = this.b + 1;
        Object[] objArr = this.a;
        if (objArr.length < i) {
            m(i, objArr);
        }
        Object[] objArr2 = this.a;
        int i2 = this.b;
        objArr2[i2] = obj;
        this.b = i2 + 1;
    }

    public final void h(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return;
        }
        int i = this.b;
        int size = list.size() + i;
        Object[] objArr = this.a;
        if (objArr.length < size) {
            m(size, objArr);
        }
        Object[] objArr2 = this.a;
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            objArr2[i2 + i] = list.get(i2);
        }
        this.b = list.size() + this.b;
    }

    public final void i() {
        pyd.q(null, 0, this.a, this.b);
        this.b = 0;
    }

    public final boolean j(E e) {
        int iC = c(e);
        if (iC < 0) {
            return false;
        }
        k(iC);
        return true;
    }

    public final E k(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.b)) {
            f(i);
            throw null;
        }
        Object[] objArr = this.a;
        E e = (E) objArr[i];
        if (i != i2 - 1) {
            pyd.j(objArr, i, objArr, i + 1, i2);
        }
        int i3 = this.b - 1;
        this.b = i3;
        objArr[i3] = null;
        return e;
    }

    public final void l(int i, int i2) {
        int i3;
        if (i < 0 || i > (i3 = this.b) || i2 < 0 || i2 > i3) {
            v40.k(this.b, uz.f("Start (", i, ") and end (", i2, ") must be in 0.."));
            return;
        }
        if (i2 < i) {
            throw new IllegalArgumentException("Start (" + i + ") is more than end (" + i2 + ')');
        }
        if (i2 != i) {
            if (i2 < i3) {
                Object[] objArr = this.a;
                pyd.j(objArr, i, objArr, i2, i3);
            }
            int i4 = this.b;
            int i5 = i4 - (i2 - i);
            pyd.q(null, i5, this.a, i4);
            this.b = i5;
        }
    }

    public final void m(int i, Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, (length * 3) / 2)];
        pyd.j(objArr, 0, objArr2, 0, length);
        this.a = objArr2;
    }

    public final void n(int i) {
        StringBuilder sbG = o6.g(i, "Index ", " must be in 0..");
        sbG.append(this.b);
        throw new IndexOutOfBoundsException(sbG.toString());
    }

    public static final class b<T> implements List<T>, bf8 {
        public final p3a<T> a;

        public b(p3a<T> p3aVar) {
            this.a = p3aVar;
        }

        @Override // java.util.List
        public final void add(int i, T t) {
            int i2;
            p3a<T> p3aVar = this.a;
            if (i < 0 || i > (i2 = p3aVar.b)) {
                p3aVar.n(i);
                throw null;
            }
            int i3 = i2 + 1;
            Object[] objArr = p3aVar.a;
            if (objArr.length < i3) {
                p3aVar.m(i3, objArr);
            }
            Object[] objArr2 = p3aVar.a;
            int i4 = p3aVar.b;
            if (i != i4) {
                pyd.j(objArr2, i + 1, objArr2, i, i4);
            }
            objArr2[i] = t;
            p3aVar.b++;
        }

        @Override // java.util.List
        public final boolean addAll(int i, Collection<? extends T> collection) {
            collection.getClass();
            p3a<T> p3aVar = this.a;
            if (i < 0 || i > p3aVar.b) {
                p3aVar.n(i);
                throw null;
            }
            int i2 = 0;
            if (collection.isEmpty()) {
                return false;
            }
            int size = collection.size() + p3aVar.b;
            Object[] objArr = p3aVar.a;
            if (objArr.length < size) {
                p3aVar.m(size, objArr);
            }
            Object[] objArr2 = p3aVar.a;
            if (i != p3aVar.b) {
                pyd.j(objArr2, collection.size() + i, objArr2, i, p3aVar.b);
            }
            for (T t : collection) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    u63.o0();
                    throw null;
                }
                objArr2[i2 + i] = t;
                i2 = i3;
            }
            p3aVar.b = collection.size() + p3aVar.b;
            return true;
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            this.a.i();
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            return this.a.c(obj) >= 0;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection<? extends Object> collection) {
            collection.getClass();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (this.a.c(it.next()) < 0) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final T get(int i) {
            pna.a(i, this);
            return this.a.b(i);
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            return this.a.c(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.a.d();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator<T> iterator() {
            return new a(0, this);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            p3a<T> p3aVar = this.a;
            Object[] objArr = p3aVar.a;
            int i = p3aVar.b;
            if (obj == null) {
                for (int i2 = i - 1; -1 < i2; i2--) {
                    if (objArr[i2] == null) {
                        return i2;
                    }
                }
            } else {
                for (int i3 = i - 1; -1 < i3; i3--) {
                    if (obj.equals(objArr[i3])) {
                        return i3;
                    }
                }
            }
            return -1;
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator() {
            return new a(0, this);
        }

        @Override // java.util.List
        public final T remove(int i) {
            pna.a(i, this);
            return this.a.k(i);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection<? extends Object> collection) {
            collection.getClass();
            p3a<T> p3aVar = this.a;
            int i = p3aVar.b;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                p3aVar.j(it.next());
            }
            return i != p3aVar.b;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<? extends Object> collection) {
            collection.getClass();
            p3a<T> p3aVar = this.a;
            int i = p3aVar.b;
            Object[] objArr = p3aVar.a;
            for (int i2 = i - 1; -1 < i2; i2--) {
                if (!collection.contains(objArr[i2])) {
                    p3aVar.k(i2);
                }
            }
            return i != p3aVar.b;
        }

        @Override // java.util.List
        public final T set(int i, T t) {
            pna.a(i, this);
            p3a<T> p3aVar = this.a;
            if (i < 0 || i >= p3aVar.b) {
                p3aVar.f(i);
                throw null;
            }
            Object[] objArr = p3aVar.a;
            T t2 = (T) objArr[i];
            objArr[i] = t;
            return t2;
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.a.b;
        }

        @Override // java.util.List
        public final List<T> subList(int i, int i2) {
            pna.b(this, i, i2);
            return new c(this, i, i2);
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            tArr.getClass();
            return (T[]) q92.F(this, tArr);
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator(int i) {
            return new a(i, this);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return q92.E(this);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            return this.a.j(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean add(T t) {
            this.a.g(t);
            return true;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends T> collection) {
            collection.getClass();
            p3a<T> p3aVar = this.a;
            int i = p3aVar.b;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                p3aVar.g(it.next());
            }
            return i != p3aVar.b;
        }
    }

    public static final class c<T> implements List<T>, bf8 {
        public final List<T> a;
        public final int b;
        public int c;

        public c(List<T> list, int i, int i2) {
            this.a = list;
            this.b = i;
            this.c = i2;
        }

        @Override // java.util.List
        public final void add(int i, T t) {
            this.a.add(i + this.b, t);
            this.c++;
        }

        @Override // java.util.List
        public final boolean addAll(int i, Collection<? extends T> collection) {
            collection.getClass();
            this.a.addAll(i + this.b, collection);
            this.c = collection.size() + this.c;
            return collection.size() > 0;
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            int i = this.c - 1;
            int i2 = this.b;
            if (i2 <= i) {
                while (true) {
                    this.a.remove(i);
                    if (i == i2) {
                        break;
                    } else {
                        i--;
                    }
                }
            }
            this.c = i2;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            int i = this.c;
            for (int i2 = this.b; i2 < i; i2++) {
                if (wl7.b(this.a.get(i2), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection<? extends Object> collection) {
            collection.getClass();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final T get(int i) {
            pna.a(i, this);
            return this.a.get(i + this.b);
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            int i = this.c;
            int i2 = this.b;
            for (int i3 = i2; i3 < i; i3++) {
                if (wl7.b(this.a.get(i3), obj)) {
                    return i3 - i2;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.c == this.b;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator<T> iterator() {
            return new a(0, this);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            int i = this.c - 1;
            int i2 = this.b;
            if (i2 > i) {
                return -1;
            }
            while (!wl7.b(this.a.get(i), obj)) {
                if (i == i2) {
                    return -1;
                }
                i--;
            }
            return i - i2;
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator() {
            return new a(0, this);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            int i = this.c;
            for (int i2 = this.b; i2 < i; i2++) {
                List<T> list = this.a;
                if (wl7.b(list.get(i2), obj)) {
                    list.remove(i2);
                    this.c--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection<? extends Object> collection) {
            collection.getClass();
            int i = this.c;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i != this.c;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<? extends Object> collection) {
            collection.getClass();
            int i = this.c;
            int i2 = i - 1;
            int i3 = this.b;
            if (i3 <= i2) {
                while (true) {
                    List<T> list = this.a;
                    if (!collection.contains(list.get(i2))) {
                        list.remove(i2);
                        this.c--;
                    }
                    if (i2 == i3) {
                        break;
                    }
                    i2--;
                }
            }
            return i != this.c;
        }

        @Override // java.util.List
        public final T set(int i, T t) {
            pna.a(i, this);
            return this.a.set(i + this.b, t);
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.c - this.b;
        }

        @Override // java.util.List
        public final List<T> subList(int i, int i2) {
            pna.b(this, i, i2);
            return new c(this, i, i2);
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            tArr.getClass();
            return (T[]) q92.F(this, tArr);
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator(int i) {
            return new a(i, this);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return q92.E(this);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean add(T t) {
            int i = this.c;
            this.c = i + 1;
            this.a.add(i, t);
            return true;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends T> collection) {
            collection.getClass();
            this.a.addAll(this.c, collection);
            this.c = collection.size() + this.c;
            return collection.size() > 0;
        }

        @Override // java.util.List
        public final T remove(int i) {
            pna.a(i, this);
            this.c--;
            return this.a.remove(i + this.b);
        }
    }

    public p3a() {
        this((Object) null);
    }

    public /* synthetic */ p3a(Object obj) {
        this(16);
    }
}
