package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class oa7<T> implements Iterator<ma7<? extends T>>, ze8 {
    public final Iterator<T> a;
    public int b;

    /* JADX WARN: Multi-variable type inference failed */
    public oa7(Iterator<? extends T> it) {
        it.getClass();
        this.a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.b;
        this.b = i + 1;
        if (i >= 0) {
            return new ma7(i, this.a.next());
        }
        u63.o0();
        throw null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
