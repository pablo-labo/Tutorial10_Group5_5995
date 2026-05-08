package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class m9b<E> implements Iterator<E>, ze8 {
    public Object a;
    public final Map<E, fy8> b;
    public int c;

    public m9b(Object obj, Map<E, fy8> map) {
        this.a = obj;
        this.b = map;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c < this.b.size();
    }

    @Override // java.util.Iterator
    public E next() {
        if (!hasNext()) {
            k20.p();
            return null;
        }
        E e = (E) this.a;
        this.c++;
        fy8 fy8Var = this.b.get(e);
        if (fy8Var == null) {
            throw new ConcurrentModificationException(v40.e(e, "Hash code of an element (", ") has changed after it was added to the persistent set."));
        }
        this.a = fy8Var.b;
        return e;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
