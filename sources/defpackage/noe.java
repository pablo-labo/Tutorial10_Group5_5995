package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class noe implements Iterator<Object>, ze8 {
    public int a;
    public final /* synthetic */ loe<Object> b;

    public noe(loe<Object> loeVar) {
        this.b = loeVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.h();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        this.a = i + 1;
        return this.b.i(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
