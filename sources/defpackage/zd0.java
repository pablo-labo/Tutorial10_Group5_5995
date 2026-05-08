package defpackage;

import defpackage.ph8;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class zd0 {
    public static ic7 a(xd4 xd4Var, int i) {
        return new ic7(xd4Var, b2d.a);
    }

    public static final <T> ph8<T> b(Function1<? super ph8.b<T>, j6g> function1) {
        ph8.b bVar = new ph8.b();
        function1.invoke(bVar);
        return new ph8<>(bVar);
    }

    public static vpe c(float f, Object obj, int i) {
        if ((i & 2) != 0) {
            f = 1500.0f;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        return new vpe(1.0f, f, obj);
    }

    public static dvf d(int i, int i2, af4 af4Var, int i3) {
        if ((i3 & 1) != 0) {
            i = 300;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            af4Var = bf4.a;
        }
        return new dvf(i, i2, af4Var);
    }
}
