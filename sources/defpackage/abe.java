package defpackage;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes2.dex */
public final class abe {

    public static class a<E> extends s92<E> implements Set<E> {
        public a() {
            throw null;
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean equals(Object obj) {
            return abe.a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public final int hashCode() {
            return abe.c(this);
        }
    }

    public static class b<E> extends a<E> implements SortedSet<E> {
        @Override // java.util.SortedSet
        public final Comparator<? super E> comparator() {
            return ((SortedSet) this.a).comparator();
        }

        @Override // java.util.SortedSet
        public final E first() {
            Iterator<E> it = this.a.iterator();
            it.getClass();
            bjb<? super E> bjbVar = this.b;
            bjbVar.getClass();
            while (it.hasNext()) {
                E next = it.next();
                if (bjbVar.apply(next)) {
                    return next;
                }
            }
            k20.p();
            return null;
        }

        @Override // java.util.SortedSet
        public final SortedSet<E> headSet(E e) {
            return new b(((SortedSet) this.a).headSet(e), this.b);
        }

        @Override // java.util.SortedSet
        public final E last() {
            SortedSet sortedSetHeadSet = (SortedSet) this.a;
            while (true) {
                E e = (Object) sortedSetHeadSet.last();
                if (this.b.apply(e)) {
                    return e;
                }
                sortedSetHeadSet = sortedSetHeadSet.headSet(e);
            }
        }

        @Override // java.util.SortedSet
        public final SortedSet<E> subSet(E e, E e2) {
            return new b(((SortedSet) this.a).subSet(e, e2), this.b);
        }

        @Override // java.util.SortedSet
        public final SortedSet<E> tailSet(E e) {
            return new b(((SortedSet) this.a).tailSet(e), this.b);
        }
    }

    public static abstract class c<E> extends AbstractSet<E> {
        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return abe.e(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            collection.getClass();
            return super.retainAll(collection);
        }
    }

    public static abstract class d<E> extends AbstractSet<E> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean add(E e) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }
    }

    public static boolean a(Set<?> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size()) {
                return set.containsAll(set2);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static a b(Set set, bjb bjbVar) {
        if (set instanceof SortedSet) {
            Collection collection = (SortedSet) set;
            if (!(collection instanceof a)) {
                return new b(collection, bjbVar);
            }
            a aVar = (a) collection;
            bjb bjbVar2 = aVar.b;
            bjbVar2.getClass();
            return new b((SortedSet) aVar.a, new djb(Arrays.asList(bjbVar2, bjbVar)));
        }
        if (!(set instanceof a)) {
            set.getClass();
            return new a(set, bjbVar);
        }
        a aVar2 = (a) set;
        bjb bjbVar3 = aVar2.b;
        bjbVar3.getClass();
        return new a((Set) aVar2.a, new djb(Arrays.asList(bjbVar3, bjbVar)));
    }

    public static int c(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    public static zae d(Set set, i47 i47Var) {
        pnb.t(set, "set1");
        pnb.t(i47Var, "set2");
        return new zae(set, i47Var);
    }

    public static boolean e(Set<?> set, Collection<?> collection) {
        collection.getClass();
        if (collection instanceof o2a) {
            collection = ((o2a) collection).L0();
        }
        boolean zRemove = false;
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                zRemove |= set.remove(it.next());
            }
            return zRemove;
        }
        Iterator<?> it2 = set.iterator();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                zRemove = true;
            }
        }
        return zRemove;
    }
}
