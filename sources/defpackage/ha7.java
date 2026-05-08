package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class ha7<T> implements Iterator<T>, ze8 {
    public int a;
    public int b;
    public boolean c;

    public ha7(int i) {
        this.a = i;
    }

    public abstract T a(int i);

    public abstract void b(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            k20.p();
            return null;
        }
        T tA = a(this.b);
        this.b++;
        this.c = true;
        return tA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.c) {
            r6.g("Call next() before removing an element.");
            return;
        }
        int i = this.b - 1;
        this.b = i;
        b(i);
        this.a--;
        this.c = false;
    }
}
