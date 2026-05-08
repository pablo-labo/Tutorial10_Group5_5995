package defpackage;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fld {
    public static final List<Class<?>> a = u63.a0(Application.class, qkd.class);
    public static final List<Class<?>> b = u63.Z(qkd.class);

    public static final <T> Constructor<T> a(Class<T> cls, List<? extends Class<?>> list) {
        list.getClass();
        ct0 ct0VarQ = web.q(cls.getConstructors());
        while (ct0VarQ.hasNext()) {
            Constructor<T> constructor = (Constructor) ct0VarQ.next();
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            parameterTypes.getClass();
            List listE0 = ut0.E0(parameterTypes);
            if (list.equals(listE0)) {
                return constructor;
            }
            if (list.size() == listE0.size() && listE0.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final <T extends brg> T b(Class<T> cls, Constructor<T> constructor, Object... objArr) {
        try {
            return constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            l6.p(m6.f(cls, "Failed to access "), e);
            return null;
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            l6.p(m6.f(cls, "An exception happened in constructor of "), e3.getCause());
            return null;
        }
    }
}
