package defpackage;

import defpackage.gd8;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ad8 {

    public static final class a extends ad8 {
        public final List<Method> a;

        /* JADX INFO: renamed from: ad8$a$a, reason: collision with other inner class name */
        public static final class C0002a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ak2.i(((Method) t).getName(), ((Method) t2).getName());
            }
        }

        public a(Class<?> cls) {
            cls.getClass();
            Object[] declaredMethods = cls.getDeclaredMethods();
            declaredMethods.getClass();
            C0002a c0002a = new C0002a();
            if (declaredMethods.length != 0) {
                declaredMethods = Arrays.copyOf(declaredMethods, declaredMethods.length);
                pyd.Q(declaredMethods, c0002a);
            }
            List<Method> listAsList = Arrays.asList(declaredMethods);
            listAsList.getClass();
            this.a = listAsList;
        }

        @Override // defpackage.ad8
        public final String a() {
            return z92.W0(this.a, "", "<init>(", ")V", pu1.c, 24);
        }
    }

    public static final class b extends ad8 {
        public final Constructor<?> a;

        public b(Constructor<?> constructor) {
            constructor.getClass();
            this.a = constructor;
        }

        @Override // defpackage.ad8
        public final String a() {
            Class<?>[] parameterTypes = this.a.getParameterTypes();
            parameterTypes.getClass();
            return ut0.t0(parameterTypes, "", "<init>(", ")V", qu1.c, 24);
        }
    }

    public static final class c extends ad8 {
        public final Method a;

        public c(Method method) {
            method.getClass();
            this.a = method;
        }

        @Override // defpackage.ad8
        public final String a() {
            return pnb.l(this.a);
        }
    }

    public static final class d extends ad8 {
        public final gd8.b a;
        public final String b;

        public d(gd8.b bVar) {
            this.a = bVar;
            this.b = bVar.a();
        }

        @Override // defpackage.ad8
        public final String a() {
            return this.b;
        }
    }

    public static final class e extends ad8 {
        public final gd8.b a;
        public final String b;

        public e(gd8.b bVar) {
            this.a = bVar;
            this.b = bVar.a();
        }

        @Override // defpackage.ad8
        public final String a() {
            return this.b;
        }
    }

    public abstract String a();
}
