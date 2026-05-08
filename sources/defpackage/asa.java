package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class asa<T> extends it0<T> {
    public final ewf a;
    public final int b;

    public static final class a implements Iterator<T>, ze8 {
        public boolean a = true;
        public final /* synthetic */ asa<T> b;

        public a(asa<T> asaVar) {
            this.b = asaVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.a;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.a) {
                this.a = false;
                return (T) this.b.a;
            }
            k20.p();
            return null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public asa(ewf ewfVar, int i) {
        this.a = ewfVar;
        this.b = i;
    }

    @Override // defpackage.it0
    public final int a() {
        return 1;
    }

    @Override // defpackage.it0
    public final void b(int i, T t) {
        throw new IllegalStateException();
    }

    @Override // defpackage.it0
    public final T get(int i) {
        if (i == this.b) {
            return (T) this.a;
        }
        return null;
    }

    @Override // defpackage.it0, java.lang.Iterable
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
