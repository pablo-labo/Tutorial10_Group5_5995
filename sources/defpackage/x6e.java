package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class x6e implements Iterator<Object>, ze8 {
    public boolean a = true;
    public final /* synthetic */ Object b;

    public x6e(Object obj) {
        this.b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.a) {
            this.a = false;
            return this.b;
        }
        k20.p();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
