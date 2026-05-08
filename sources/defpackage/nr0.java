package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public interface nr0<N> {
    default void b(Object obj, Function2 function2) {
        function2.invoke(c(), obj);
    }

    N c();

    void clear();

    void e(int i, int i2, int i3);

    void f(int i, int i2);

    void g(int i, N n);

    default void h() {
    }

    void l(int i, N n);

    void m(N n);

    default void n() {
        N nC = c();
        wk2 wk2Var = nC instanceof wk2 ? (wk2) nC : null;
        if (wk2Var != null) {
            wk2Var.f();
        }
    }

    void p();
}
