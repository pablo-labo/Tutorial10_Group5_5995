package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tge<E> extends x2<E> {
    public final E c;

    public tge(E e, int i) {
        super(i, 1);
        this.c = e;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final E next() {
        if (hasNext()) {
            this.a++;
            return this.c;
        }
        k20.p();
        return null;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            this.a--;
            return this.c;
        }
        k20.p();
        return null;
    }
}
