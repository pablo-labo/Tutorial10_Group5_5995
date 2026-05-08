package defpackage;

import defpackage.c47;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class r3<E> extends w2<E> implements c47<Object>, Collection, ze8 {
    public abstract r3 b(int i, Object obj);

    @Override // defpackage.l1, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.l1, java.util.Collection
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

    public abstract r3 d(Object obj);

    public r3 f(Collection<? extends E> collection) {
        q9b q9bVarG = g();
        q9bVarG.addAll(collection);
        return q9bVarG.d();
    }

    public abstract q9b g();

    public abstract r3 i(q3 q3Var);

    @Override // defpackage.w2, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    public abstract r3 j(int i);

    public abstract r3 k(int i, Object obj);

    @Override // defpackage.w2, java.util.List
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // defpackage.w2, java.util.List
    public final List subList(int i, int i2) {
        return new c47.a(this, i, i2);
    }
}
