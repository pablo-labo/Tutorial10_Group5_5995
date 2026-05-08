package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n9b<E> extends m9b<E> {
    public int V;
    public final l9b<E> d;
    public E e;
    public boolean f;

    /* JADX WARN: Illegal instructions before constructor call */
    public n9b(l9b<E> l9bVar) {
        Object obj = l9bVar.b;
        w8b<E, fy8> w8bVar = l9bVar.d;
        super(obj, w8bVar);
        this.d = l9bVar;
        this.V = w8bVar.e;
    }

    @Override // defpackage.m9b, java.util.Iterator
    public final E next() {
        if (this.d.d.e != this.V) {
            q6.h();
            return null;
        }
        E e = (E) super.next();
        this.e = e;
        this.f = true;
        return e;
    }

    @Override // defpackage.m9b, java.util.Iterator
    public final void remove() {
        if (!this.f) {
            bg.h();
            return;
        }
        E e = this.e;
        l9b<E> l9bVar = this.d;
        pxf.a(l9bVar).remove(e);
        this.e = null;
        this.f = false;
        this.V = l9bVar.d.e;
        this.c--;
    }
}
