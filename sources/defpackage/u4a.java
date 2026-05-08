package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class u4a {
    public final AtomicReference<a> a = new AtomicReference<>(null);
    public final a5a b = pnb.i();

    public static final class a {
        public final o4a a;
        public final ex7 b;

        public a(o4a o4aVar, ex7 ex7Var) {
            this.a = o4aVar;
            this.b = ex7Var;
        }
    }

    public static Object a(u4a u4aVar, Function1 function1, lu2 lu2Var) {
        u4aVar.getClass();
        return f13.d(new w4a(o4a.a, u4aVar, function1, null), lu2Var);
    }
}
