package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class rnh extends gmh {
    public static final rnh f;
    public final transient gkh e;

    static {
        ujh ujhVar = gkh.b;
        f = new rnh(enh.e, umh.a);
    }

    public rnh(gkh gkhVar, Comparator comparator) {
        super(comparator);
        this.e = gkhVar;
    }

    @Override // defpackage.qjh
    public final int a(Object[] objArr) {
        return this.e.a(objArr);
    }

    @Override // defpackage.qjh
    public final int b() {
        return this.e.b();
    }

    @Override // defpackage.qjh
    public final int c() {
        return this.e.c();
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int iQ = q(obj, true);
        gkh gkhVar = this.e;
        if (iQ == gkhVar.size()) {
            return null;
        }
        return gkhVar.get(iQ);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.e, obj, this.c) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof rmh) {
            collection = ((rmh) collection).zza();
        }
        Comparator comparator = this.c;
        if (!ojd.z(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        ujh ujhVarListIterator = this.e.listIterator(0);
        Iterator it = collection.iterator();
        if (ujhVarListIterator.hasNext()) {
            Object next = it.next();
            Object next2 = ujhVarListIterator.next();
            while (true) {
                try {
                    int iCompare = comparator.compare(next2, next);
                    if (iCompare >= 0) {
                        if (iCompare != 0) {
                            break;
                        }
                        if (!it.hasNext()) {
                            return true;
                        }
                        next = it.next();
                    } else {
                        if (!ujhVarListIterator.hasNext()) {
                            break;
                        }
                        next2 = ujhVarListIterator.next();
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
        }
        return false;
    }

    @Override // defpackage.qjh
    public final s7h d() {
        return this.e.listIterator(0);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return this.e.f().listIterator(0);
    }

    @Override // defpackage.qjh
    public final Object[] e() {
        return this.e.e();
    }

    @Override // defpackage.rlh, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            gkh gkhVar = this.e;
            if (gkhVar.size() == set.size()) {
                if (isEmpty()) {
                    return true;
                }
                Comparator comparator = this.c;
                if (!ojd.z(comparator, set)) {
                    return containsAll(set);
                }
                Iterator it = set.iterator();
                try {
                    ujh ujhVarListIterator = gkhVar.listIterator(0);
                    while (ujhVarListIterator.hasNext()) {
                        Object next = ujhVarListIterator.next();
                        Object next2 = it.next();
                        if (next2 == null || comparator.compare(next, next2) != 0) {
                        }
                    }
                    return true;
                } catch (ClassCastException | NoSuchElementException unused) {
                }
            }
        }
        return false;
    }

    @Override // java.util.SortedSet
    public final Object first() {
        if (!isEmpty()) {
            return this.e.get(0);
        }
        k20.p();
        return null;
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int iO = o(obj, true) - 1;
        if (iO == -1) {
            return null;
        }
        return this.e.get(iO);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int iQ = q(obj, false);
        gkh gkhVar = this.e;
        if (iQ == gkhVar.size()) {
            return null;
        }
        return gkhVar.get(iQ);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final /* synthetic */ Iterator iterator() {
        return this.e.listIterator(0);
    }

    @Override // defpackage.rlh
    public final gkh j() {
        return this.e;
    }

    @Override // java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            k20.p();
            return null;
        }
        return this.e.get(r1.size() - 1);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int iO = o(obj, false) - 1;
        if (iO == -1) {
            return null;
        }
        return this.e.get(iO);
    }

    public final int o(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.e, obj, this.c);
        return iBinarySearch >= 0 ? z ? iBinarySearch + 1 : iBinarySearch : ~iBinarySearch;
    }

    public final int q(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.e, obj, this.c);
        return iBinarySearch >= 0 ? z ? iBinarySearch : iBinarySearch + 1 : ~iBinarySearch;
    }

    public final rnh r(int i, int i2) {
        gkh gkhVar = this.e;
        if (i == 0) {
            if (i2 == gkhVar.size()) {
                return this;
            }
            i = 0;
        }
        Comparator comparator = this.c;
        return i < i2 ? new rnh(gkhVar.subList(i, i2), comparator) : gmh.n(comparator);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.e.size();
    }
}
