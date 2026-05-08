package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class i07<T> {
    public T a;
    public final Function1<T, T> b;
    public final Function2<T, T, j6g> c;

    /* JADX WARN: Multi-variable type inference failed */
    public i07(T t, Function1<? super T, ? extends T> function1, Function2<? super T, ? super T, j6g> function2) {
        this.a = t;
        this.b = function1;
        this.c = function2;
    }

    public final void a(qf8 qf8Var, Object obj) {
        qf8Var.getClass();
        T t = this.a;
        Function1<T, T> function1 = this.b;
        if (wl7.b(t, function1.invoke(obj))) {
            return;
        }
        T t2 = this.a;
        T tInvoke = function1.invoke(obj);
        this.a = tInvoke;
        Function2<T, T, j6g> function2 = this.c;
        if (function2 != null) {
            function2.invoke(tInvoke, t2);
        }
    }

    public /* synthetic */ i07(Object obj, Function2 function2) {
        this(obj, new lg(6), function2);
    }
}
