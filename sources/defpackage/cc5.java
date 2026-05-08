package defpackage;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class cc5<T> implements r6e<T> {
    public final r6e<T> a;
    public final boolean b;
    public final Function1<T, Boolean> c;

    public static final class a implements Iterator<T>, ze8 {
        public final Iterator<T> a;
        public int b = -1;
        public T c;
        public final /* synthetic */ cc5<T> d;

        public a(cc5<T> cc5Var) {
            this.d = cc5Var;
            this.a = cc5Var.a.iterator();
        }

        public final void a() {
            T next;
            cc5<T> cc5Var;
            do {
                Iterator<T> it = this.a;
                if (!it.hasNext()) {
                    this.b = 0;
                    return;
                } else {
                    next = it.next();
                    cc5Var = this.d;
                }
            } while (cc5Var.c.invoke(next).booleanValue() != cc5Var.b);
            this.c = next;
            this.b = 1;
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
    public cc5(r6e<? extends T> r6eVar, boolean z, Function1<? super T, Boolean> function1) {
        r6eVar.getClass();
        function1.getClass();
        this.a = r6eVar;
        this.b = z;
        this.c = function1;
    }

    @Override // defpackage.r6e
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
