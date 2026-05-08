package defpackage;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class pug<T> implements Set<T>, jf8 {
    public final HashSet<kug<T>> a = new HashSet<>();
    public final ReferenceQueue<T> b = new ReferenceQueue<>();

    public static final class a implements Iterator<T>, ze8 {
        public final /* synthetic */ Iterator<kug<T>> a;

        public a(Iterator<kug<T>> it) {
            this.a = it;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.a.hasNext();
        }

        @Override // java.util.Iterator
        public final T next() {
            T t = this.a.next().get();
            if (t != null) {
                return t;
            }
            s6.j("The next element was garbage collected.");
            return null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.a.remove();
        }
    }

    public final void a() {
        while (true) {
            Reference<? extends T> referencePoll = this.b.poll();
            kug kugVar = referencePoll instanceof kug ? (kug) referencePoll : null;
            if (kugVar == null) {
                return;
            } else {
                pxf.a(this.a).remove(kugVar);
            }
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(T t) {
        a();
        return this.a.add(new kug<>(t, this.b));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        collection.getClass();
        Iterator<T> it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (add(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.contains(new kug(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        collection.getClass();
        Collection<?> collection2 = collection;
        if (collection2.isEmpty()) {
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

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        a();
        Iterator<kug<T>> it = this.a.iterator();
        it.getClass();
        return new a(it);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        boolean zRemove = this.a.remove(new kug(obj));
        a();
        return zRemove;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        collection.getClass();
        Iterator<T> it = collection.iterator();
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

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        collection.getClass();
        ArrayList arrayList = new ArrayList();
        for (T t : this) {
            if (!collection.contains(t)) {
                arrayList.add(t);
            }
        }
        return removeAll(z92.E1(arrayList));
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        return (T[]) q92.F(this, tArr);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return q92.E(this);
    }
}
