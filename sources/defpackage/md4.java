package defpackage;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class md4<T> implements r6e<T> {
    public final r6e<T> a;
    public final Function1<T, Boolean> b;

    public static final class a implements Iterator<T>, ze8 {
        public final Iterator<T> a;
        public int b = -1;
        public T c;
        public final /* synthetic */ md4<T> d;

        public a(md4<T> md4Var) {
            this.d = md4Var;
            this.a = md4Var.a.iterator();
        }

        public final void a() {
            T next;
            do {
                Iterator<T> it = this.a;
                if (!it.hasNext()) {
                    this.b = 0;
                    return;
                }
                next = it.next();
            } while (this.d.b.invoke(next).booleanValue());
            this.c = next;
            this.b = 1;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.b == -1) {
                a();
            }
            return this.b == 1 || this.a.hasNext();
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.b == -1) {
                a();
            }
            if (this.b != 1) {
                return this.a.next();
            }
            T t = this.c;
            this.c = null;
            this.b = 0;
            return t;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public md4(r6e<? extends T> r6eVar, Function1<? super T, Boolean> function1) {
        function1.getClass();
        this.a = r6eVar;
        this.b = function1;
    }

    @Override // defpackage.r6e
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
