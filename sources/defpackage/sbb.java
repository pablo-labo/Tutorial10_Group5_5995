package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class sbb {

    public static final class a {
        public static final Method a;
        public static final Method b;

        static {
            Method method;
            Method method2;
            Method[] methods = Throwable.class.getMethods();
            methods.getClass();
            int length = methods.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                method = null;
                if (i2 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i2];
                if (wl7.b(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    parameterTypes.getClass();
                    if (wl7.b(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                        break;
                    }
                }
                i2++;
            }
            a = method2;
            int length2 = methods.length;
            while (true) {
                if (i >= length2) {
                    break;
                }
                Method method3 = methods[i];
                if (wl7.b(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
                i++;
            }
            b = method;
        }
    }

    public void a(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        th.getClass();
        th2.getClass();
        Method method = a.a;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    public List<Throwable> b(Throwable th) {
        Object objInvoke;
        th.getClass();
        Method method = a.b;
        if (method == null || (objInvoke = method.invoke(th, null)) == null) {
            return zr4.a;
        }
        List<Throwable> listAsList = Arrays.asList((Throwable[]) objInvoke);
        listAsList.getClass();
        return listAsList;
    }
}
