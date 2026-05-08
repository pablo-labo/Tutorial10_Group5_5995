package defpackage;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class xrf<T, R> implements r6e<R> {
    public final r6e<T> a;
    public final Function1<T, R> b;

    public static final class a implements Iterator<R>, ze8 {
        public final Iterator<T> a;
        public final /* synthetic */ xrf<T, R> b;

        public a(xrf<T, R> xrfVar) {
            this.b = xrfVar;
            this.a = xrfVar.a.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.a.hasNext();
        }

        @Override // java.util.Iterator
        public final R next() {
            return (R) this.b.b.invoke(this.a.next());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public xrf(r6e<? extends T> r6eVar, Function1<? super T, ? extends R> function1) {
        function1.getClass();
        this.a = r6eVar;
        this.b = function1;
    }

    @Override // defpackage.r6e
    public final Iterator<R> iterator() {
        return new a(this);
    }
}
