package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public interface ls8 {
    static /* synthetic */ void d(ls8 ls8Var, int i, Function1 function1, ah2 ah2Var, int i2) {
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        ls8Var.c(i, function1, y32.d, ah2Var);
    }

    static /* synthetic */ void e(ls8 ls8Var, String str, ah2 ah2Var, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        ls8Var.b(str, ah2Var);
    }

    default void b(Object obj, ah2 ah2Var) {
        throw new IllegalStateException("The method is not implemented");
    }

    default void c(int i, Function1 function1, Function1 function12, ah2 ah2Var) {
        throw new IllegalStateException("The method is not implemented");
    }
}
