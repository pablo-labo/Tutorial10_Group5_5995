package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class s6e<T> extends t6e<T> implements Iterator<T>, lu2<j6g>, ze8 {
    public int a;
    public T b;
    public Iterator<? extends T> c;
    public lu2<? super j6g> d;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.t6e
    public final void a(lu2 lu2Var, Object obj) {
        this.b = obj;
        this.a = 3;
        this.d = lu2Var;
        lu2Var.getClass();
    }

    @Override // defpackage.t6e
    public final Object b(Iterator it, n7d n7dVar) {
        if (!it.hasNext()) {
            return j6g.a;
        }
        this.c = it;
        this.a = 2;
        this.d = n7dVar;
        return g13.a;
    }

    public final RuntimeException f() {
        int i = this.a;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.a);
    }

    @Override // defpackage.lu2
    public final v03 getContext() {
        return vr4.a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.a;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw f();
                }
                Iterator<? extends T> it = this.c;
                it.getClass();
                if (it.hasNext()) {
                    this.a = 2;
                    return true;
                }
                this.c = null;
            }
            this.a = 5;
            lu2<? super j6g> lu2Var = this.d;
            lu2Var.getClass();
            this.d = null;
            lu2Var.resumeWith(j6g.a);
        }
    }

    @Override // java.util.Iterator
    public final T next() {
        int i = this.a;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            k20.p();
            return null;
        }
        if (i == 2) {
            this.a = 1;
            Iterator<? extends T> it = this.c;
            it.getClass();
            return it.next();
        }
        if (i != 3) {
            throw f();
        }
        this.a = 0;
        T t = this.b;
        this.b = null;
        return t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // defpackage.lu2
    public final void resumeWith(Object obj) {
        r7d.b(obj);
        this.a = 4;
    }
}
