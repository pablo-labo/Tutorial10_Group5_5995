package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public class s92<E> extends AbstractCollection<E> {
    public final Collection<E> a;
    public final bjb<? super E> b;

    public s92(Collection<E> collection, bjb<? super E> bjbVar) {
        this.a = collection;
        this.b = bjbVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(E e) {
        if (this.b.apply(e)) {
            return this.a.add(e);
        }
        o6.h();
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            if (!this.b.apply(it.next())) {
                o6.h();
                return false;
            }
        }
        return this.a.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        Collection<E> collection = this.a;
        boolean z = collection instanceof RandomAccess;
        bjb<? super E> bjbVar = this.b;
        if (!z || !(collection instanceof List)) {
            Iterator<T> it = collection.iterator();
            bjbVar.getClass();
            while (it.hasNext()) {
                if (bjbVar.apply((Object) it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) collection;
        bjbVar.getClass();
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            a aVar = (Object) list.get(i2);
            if (!bjbVar.apply(aVar)) {
                if (i2 > i) {
                    try {
                        list.set(i, aVar);
                    } catch (IllegalArgumentException unused) {
                        h4.y(list, bjbVar, i, i2);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        h4.y(list, bjbVar, i, i2);
                        return;
                    }
                }
                i++;
            }
        }
        list.subList(i, list.size()).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        boolean zContains;
        Collection<E> collection = this.a;
        collection.getClass();
        try {
            zContains = collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            zContains = false;
        }
        if (zContains) {
            return this.b.apply(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        Iterator<T> it = this.a.iterator();
        bjb<? super E> bjbVar = this.b;
        pnb.t(bjbVar, "predicate");
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (bjbVar.apply((Object) it.next())) {
                break;
            }
            i++;
        }
        return true ^ (i != -1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        Iterator<E> it = this.a.iterator();
        it.getClass();
        bjb<? super E> bjbVar = this.b;
        bjbVar.getClass();
        return new mo7(it, bjbVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        return contains(obj) && this.a.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        Iterator<E> it = this.a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            E next = it.next();
            if (this.b.apply(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        Iterator<E> it = this.a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            E next = it.next();
            if (this.b.apply(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        Iterator<E> it = this.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.b.apply(it.next())) {
                i++;
            }
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        Iterator<E> it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            n2 n2Var = (n2) it;
            if (!n2Var.hasNext()) {
                return arrayList.toArray();
            }
            arrayList.add(n2Var.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        Iterator<E> it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            n2 n2Var = (n2) it;
            if (n2Var.hasNext()) {
                arrayList.add(n2Var.next());
            } else {
                return (T[]) arrayList.toArray(tArr);
            }
        }
    }
}
