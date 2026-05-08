package defpackage;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class hh5<T, R, E> implements r6e<E> {
    public final r6e<T> a;
    public final Function1<T, R> b;
    public final Function1<R, Iterator<E>> c;

    public static final class a implements Iterator<E>, ze8 {
        public final Iterator<T> a;
        public Iterator<? extends E> b;
        public int c;
        public final /* synthetic */ hh5<T, R, E> d;

        public a(hh5<T, R, E> hh5Var) {
            this.d = hh5Var;
            this.a = hh5Var.a.iterator();
        }

        public final boolean a() {
            Iterator<? extends E> it;
            Iterator<? extends E> it2 = this.b;
            if (it2 != null && it2.hasNext()) {
                this.c = 1;
                return true;
            }
            do {
                Iterator<T> it3 = this.a;
                if (!it3.hasNext()) {
                    this.c = 2;
                    this.b = null;
                    return false;
                }
                T next = it3.next();
                hh5<T, R, E> hh5Var = this.d;
                it = (Iterator) hh5Var.c.invoke(hh5Var.b.invoke(next));
            } while (!it.hasNext());
            this.b = it;
            this.c = 1;
            return true;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i = this.c;
            if (i == 1) {
                return true;
            }
            if (i == 2) {
                return false;
            }
            return a();
        }

        @Override // java.util.Iterator
        public final E next() {
            int i = this.c;
            if (i == 2) {
                k20.p();
                return null;
            }
            if (i == 0 && !a()) {
                k20.p();
                return null;
            }
            this.c = 0;
            Iterator<? extends E> it = this.b;
            it.getClass();
            return it.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public hh5(r6e<? extends T> r6eVar, Function1<? super T, ? extends R> function1, Function1<? super R, ? extends Iterator<? extends E>> function12) {
        function1.getClass();
        function12.getClass();
        this.a = r6eVar;
        this.b = function1;
        this.c = function12;
    }

    @Override // defpackage.r6e
    public final Iterator<E> iterator() {
        return new a(this);
    }
}
