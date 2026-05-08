package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o2<T> implements Iterator<T>, ze8 {
    public int a;
    public T b;

    public abstract void a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        if (i == 0) {
            this.a = 3;
            a();
            return this.a == 1;
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        l5.q("hasNext called when the iterator is in the FAILED state.");
        return false;
    }

    @Override // java.util.Iterator
    public final T next() {
        int i = this.a;
        if (i == 1) {
            this.a = 0;
            return this.b;
        }
        if (i != 2) {
            this.a = 3;
            a();
            if (this.a == 1) {
                this.a = 0;
                return this.b;
            }
        }
        k20.p();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
