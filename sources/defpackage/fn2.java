package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class fn2<T> implements Iterator<T>, ze8 {
    public final Iterator<T> a;
    public final Iterator<T> b;

    /* JADX WARN: Multi-variable type inference failed */
    public fn2(Iterator<? extends T> it, Iterator<? extends T> it2) {
        it.getClass();
        it2.getClass();
        this.a = it;
        this.b = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext() || this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        Iterator<T> it = this.a;
        return it.hasNext() ? it.next() : this.b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
