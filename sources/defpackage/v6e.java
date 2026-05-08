package defpackage;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public class v6e extends q92 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class a<T> implements r6e<T> {
        public final /* synthetic */ Iterator a;

        public a(Iterator it) {
            this.a = it;
        }

        @Override // defpackage.r6e
        public final Iterator<T> iterator() {
            return this.a;
        }
    }

    public static <T> r6e<T> L(Iterator<? extends T> it) {
        it.getClass();
        return new vp2(new a(it));
    }

    public static final hh5 M(r6e r6eVar, Function1 function1) {
        if (!(r6eVar instanceof xrf)) {
            return new hh5(r6eVar, new gb(9), function1);
        }
        xrf xrfVar = (xrf) r6eVar;
        return new hh5(xrfVar.a, xrfVar.b, function1);
    }

    public static <T> r6e<T> N(gu5<? extends T> gu5Var) {
        gu5Var.getClass();
        return new vp2(new uw5(new tv(gu5Var, 22), gu5Var));
    }

    public static <T> r6e<T> O(T t, Function1<? super T, ? extends T> function1) {
        function1.getClass();
        return t == null ? hs4.a : new uw5(function1, new n30(t, 16));
    }
}
