package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes3.dex */
public final class al1 {

    public static class a implements InvocationHandler {
        public final tug a;

        public a(tug tugVar) {
            this.a = tugVar;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            try {
                return Class.forName(method.getDeclaringClass().getName(), true, tug.class.getClassLoader()).getDeclaredMethod(method.getName(), method.getParameterTypes()).invoke(this.a, objArr);
            } catch (InvocationTargetException e) {
                throw e.getTargetException();
            } catch (ReflectiveOperationException e2) {
                throw new RuntimeException("Reflection failed for method " + method, e2);
            }
        }
    }

    public static <T> T a(Class<T> cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(al1.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }
}
