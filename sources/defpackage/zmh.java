package defpackage;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class zmh extends hih implements ListIterator {
    public final int b;
    public int c;
    public final mnh d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zmh(mnh mnhVar, int i) {
        super(1);
        int size = mnhVar.size();
        zlh.b(i, size);
        this.b = size;
        this.c = i;
        this.d = mnhVar;
    }

    public final Object a(int i) {
        return this.d.get(i);
    }

    @Override // java.util.ListIterator
    @Deprecated
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.c < this.b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            k20.p();
            return null;
        }
        int i = this.c;
        this.c = i + 1;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            k20.p();
            return null;
        }
        int i = this.c - 1;
        this.c = i;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.c - 1;
    }

    @Override // java.util.ListIterator
    @Deprecated
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
