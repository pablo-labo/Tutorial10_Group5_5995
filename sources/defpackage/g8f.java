package defpackage;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class g8f<T> implements r6e<T> {
    public final r6e<T> a;
    public final Function1<T, Boolean> b;

    public static final class a implements Iterator<T>, ze8 {
        public final Iterator<T> a;
        public int b = -1;
        public T c;
        public final /* synthetic */ g8f<T> d;

        public a(g8f<T> g8fVar) {
            this.d = g8fVar;
            this.a = g8fVar.a.iterator();
        }

        public final void a() {
            Iterator<T> it = this.a;
            if (it.hasNext()) {
                T next = it.next();
                if (this.d.b.invoke(next).booleanValue()) {
                    this.b = 1;
                    this.c = next;
                    return;
                }
            }
            this.b = 0;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.b == -1) {
                a();
            }
            return this.b == 1;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.b == -1) {
                a();
            }
            if (this.b == 0) {
                k20.p();
                return null;
            }
            T t = this.c;
            this.c = null;
            this.b = -1;
            return t;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g8f(r6e<? extends T> r6eVar, Function1<? super T, Boolean> function1) {
        r6eVar.getClass();
        this.a = r6eVar;
        this.b = function1;
    }

    @Override // defpackage.r6e
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
