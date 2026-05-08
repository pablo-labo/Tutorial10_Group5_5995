package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public interface v03 {

    public interface a extends v03 {

        /* JADX INFO: renamed from: v03$a$a, reason: collision with other inner class name */
        public static final class C0438a {
            /* JADX WARN: Multi-variable type inference failed */
            public static <E extends a> E a(a aVar, b<E> bVar) {
                bVar.getClass();
                if (wl7.b(aVar.getKey(), bVar)) {
                    return aVar;
                }
                return null;
            }

            public static v03 b(a aVar, b<?> bVar) {
                bVar.getClass();
                return wl7.b(aVar.getKey(), bVar) ? vr4.a : aVar;
            }

            public static v03 c(a aVar, v03 v03Var) {
                v03Var.getClass();
                return v03Var == vr4.a ? aVar : (v03) v03Var.j1(aVar, new kk2(1));
            }
        }

        b<?> getKey();
    }

    public interface b<E extends a> {
    }

    v03 P(b<?> bVar);

    v03 d1(v03 v03Var);

    <E extends a> E h1(b<E> bVar);

    <R> R j1(R r, Function2<? super R, ? super a, ? extends R> function2);
}
