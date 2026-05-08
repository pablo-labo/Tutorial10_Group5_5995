package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class sr4 extends it0 {
    public static final sr4 a = new sr4();

    public static final class a implements Iterator, ze8 {
        @Override // java.util.Iterator
        public final boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public final Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // defpackage.it0
    public final int a() {
        return 0;
    }

    @Override // defpackage.it0
    public final void b(int i, Object obj) {
        throw new IllegalStateException();
    }

    @Override // defpackage.it0
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return null;
    }

    @Override // defpackage.it0, java.lang.Iterable
    public final Iterator iterator() {
        return new a();
    }
}
