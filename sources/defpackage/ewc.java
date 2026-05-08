package defpackage;

import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: classes3.dex */
public final class ewc {

    public static class a<T> extends b<T> implements gu5<T> {
        public final gu5<T> b;
        public volatile SoftReference<Object> c;

        public a(T t, gu5<T> gu5Var) {
            if (gu5Var == null) {
                l5.q("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal.<init> must not be null");
                throw null;
            }
            this.c = null;
            this.b = gu5Var;
            if (t != null) {
                this.c = new SoftReference<>(t);
            }
        }

        @Override // defpackage.gu5
        public final T invoke() {
            T t;
            Object obj = b.a;
            SoftReference<Object> softReference = this.c;
            if (softReference != null && (t = (T) softReference.get()) != null) {
                if (t == obj) {
                    return null;
                }
                return t;
            }
            T tInvoke = this.b.invoke();
            if (tInvoke != null) {
                obj = tInvoke;
            }
            this.c = new SoftReference<>(obj);
            return tInvoke;
        }
    }

    public static abstract class b<T> {
        public static final a a = new a();

        public static class a {
        }
    }

    public static a a(hv1 hv1Var, gu5 gu5Var) {
        if (gu5Var != null) {
            return new a(hv1Var, gu5Var);
        }
        l5.q("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties.lazySoft must not be null");
        return null;
    }
}
