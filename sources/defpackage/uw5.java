package defpackage;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class uw5<T> implements r6e<T> {
    public final gu5<T> a;
    public final Function1<T, T> b;

    public static final class a implements Iterator<T>, ze8 {
        public T a;
        public int b = -2;
        public final /* synthetic */ uw5<T> c;

        public a(uw5<T> uw5Var) {
            this.c = uw5Var;
        }

        public final void a() {
            T tInvoke;
            int i = this.b;
            uw5<T> uw5Var = this.c;
            if (i == -2) {
                tInvoke = uw5Var.a.invoke();
            } else {
                Function1<T, T> function1 = uw5Var.b;
                T t = this.a;
                t.getClass();
                tInvoke = function1.invoke(t);
            }
            this.a = tInvoke;
            this.b = tInvoke == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.b < 0) {
                a();
            }
            return this.b == 1;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.b < 0) {
                a();
            }
            if (this.b == 0) {
                k20.p();
                return null;
            }
            T t = this.a;
            t.getClass();
            this.b = -1;
            return t;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public uw5(Function1 function1, gu5 gu5Var) {
        gu5Var.getClass();
        function1.getClass();
        this.a = gu5Var;
        this.b = function1;
    }

    @Override // defpackage.r6e
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
