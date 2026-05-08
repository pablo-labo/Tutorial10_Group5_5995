package defpackage;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class qwe<T> implements List<T>, bf8 {
    public final SnapshotStateList<T> a;
    public final int b;
    public int c;
    public int d;

    public static final class a implements ListIterator<T>, ze8 {
        public final /* synthetic */ juc a;
        public final /* synthetic */ qwe<T> b;

        public a(juc jucVar, qwe<T> qweVar) {
            this.a = jucVar;
            this.b = qweVar;
        }

        @Override // java.util.ListIterator
        public final void add(Object obj) {
            throw new IllegalStateException("Cannot modify a state list through an iterator");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.a.element < this.b.d - 1;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.a.element >= 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final T next() {
            juc jucVar = this.a;
            int i = jucVar.element + 1;
            qwe<T> qweVar = this.b;
            ak2.f(i, qweVar.d);
            jucVar.element = i;
            return qweVar.get(i);
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.a.element + 1;
        }

        @Override // java.util.ListIterator
        public final T previous() {
            juc jucVar = this.a;
            int i = jucVar.element;
            qwe<T> qweVar = this.b;
            ak2.f(i, qweVar.d);
            jucVar.element = i - 1;
            return qweVar.get(i);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.a.element;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new IllegalStateException("Cannot modify a state list through an iterator");
        }

        @Override // java.util.ListIterator
        public final void set(Object obj) {
            throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public qwe(SnapshotStateList<T> snapshotStateList, int i, int i2) {
        this.a = snapshotStateList;
        this.b = i;
        this.c = ak2.r(snapshotStateList);
        this.d = i2 - i;
    }

    public final void a() {
        if (ak2.r(this.a) == this.c) {
            return;
        }
        q6.h();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t) {
        a();
        int i = this.b + this.d;
        SnapshotStateList<T> snapshotStateList = this.a;
        snapshotStateList.add(i, t);
        this.d++;
        this.c = ak2.r(snapshotStateList);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends T> collection) {
        a();
        int i2 = i + this.b;
        SnapshotStateList<T> snapshotStateList = this.a;
        boolean zAddAll = snapshotStateList.addAll(i2, collection);
        if (zAddAll) {
            this.d = collection.size() + this.d;
            this.c = ak2.r(snapshotStateList);
        }
        return zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.d > 0) {
            a();
            int i = this.d;
            int i2 = this.b;
            SnapshotStateList<T> snapshotStateList = this.a;
            snapshotStateList.a(i2, i + i2);
            this.d = 0;
            this.c = ak2.r(snapshotStateList);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        Collection<?> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final T get(int i) {
        a();
        ak2.f(i, this.d);
        return this.a.get(this.b + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        a();
        int i = this.d;
        int i2 = this.b;
        Iterator<Integer> it = nic.H(i2, i + i2).iterator();
        while (((nh7) it).c) {
            int iNextInt = ((fh7) it).nextInt();
            if (wl7.b(obj, this.a.get(iNextInt))) {
                return iNextInt - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.d == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        a();
        int i = this.d;
        int i2 = this.b;
        for (int i3 = (i + i2) - 1; i3 >= i2; i3--) {
            if (wl7.b(obj, this.a.get(i3))) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator(int i) {
        a();
        juc jucVar = new juc();
        jucVar.element = i - 1;
        return new a(jucVar, this);
    }

    @Override // java.util.List
    public final T remove(int i) {
        a();
        int i2 = this.b + i;
        SnapshotStateList<T> snapshotStateList = this.a;
        T tRemove = snapshotStateList.remove(i2);
        this.d--;
        this.c = ak2.r(snapshotStateList);
        return tRemove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        int i;
        r3 r3Var;
        wle wleVarJ;
        boolean zG;
        a();
        SnapshotStateList<T> snapshotStateList = this.a;
        int i2 = this.b;
        int i3 = this.d + i2;
        int size = snapshotStateList.size();
        do {
            synchronized (ak2.a0) {
                lse lseVar = snapshotStateList.a;
                lseVar.getClass();
                lse lseVar2 = (lse) ame.h(lseVar);
                i = lseVar2.d;
                r3Var = lseVar2.c;
                j6g j6gVar = j6g.a;
            }
            r3Var.getClass();
            q9b q9bVarG = r3Var.g();
            q9bVarG.subList(i2, i3).retainAll(collection);
            r3 r3VarD = q9bVarG.d();
            if (wl7.b(r3VarD, r3Var)) {
                break;
            }
            lse lseVar3 = snapshotStateList.a;
            lseVar3.getClass();
            synchronized (ame.c) {
                wle.e.getClass();
                wleVarJ = ame.j();
                zG = ak2.g((lse) ame.v(lseVar3, snapshotStateList, wleVarJ), i, r3VarD, true);
            }
            ame.m(wleVarJ, snapshotStateList);
        } while (!zG);
        int size2 = size - snapshotStateList.size();
        if (size2 > 0) {
            this.c = ak2.r(this.a);
            this.d -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final T set(int i, T t) {
        ak2.f(i, this.d);
        a();
        int i2 = i + this.b;
        SnapshotStateList<T> snapshotStateList = this.a;
        T t2 = snapshotStateList.set(i2, t);
        this.c = ak2.r(snapshotStateList);
        return t2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.d;
    }

    @Override // java.util.List
    public final List<T> subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.d) {
            gib.a("fromIndex or toIndex are out of bounds");
        }
        a();
        int i3 = this.b;
        return new qwe(this.a, i + i3, i2 + i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return q92.E(this);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) q92.F(this, tArr);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List
    public final void add(int i, T t) {
        a();
        int i2 = this.b + i;
        SnapshotStateList<T> snapshotStateList = this.a;
        snapshotStateList.add(i2, t);
        this.d++;
        this.c = ak2.r(snapshotStateList);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        return addAll(this.d, collection);
    }
}
