package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class trf<F, T> implements Iterator<T> {
    public final Iterator<? extends F> a;

    public trf(Iterator<? extends F> it) {
        it.getClass();
        this.a = it;
    }

    public abstract T a(F f);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return a(this.a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
    }
}
