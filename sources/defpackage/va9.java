package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class va9 {
    public static m96 a(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                Object objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
                if (objNewInstance instanceof m96) {
                    return (m96) objNewInstance;
                }
                b0.o(t40.i(objNewInstance, "Expected instanceof GlideModule, but found: "));
                return null;
            } catch (IllegalAccessException e) {
                b(cls, e);
                throw null;
            } catch (InstantiationException e2) {
                b(cls, e2);
                throw null;
            } catch (NoSuchMethodException e3) {
                b(cls, e3);
                throw null;
            } catch (InvocationTargetException e4) {
                b(cls, e4);
                throw null;
            }
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    public static void b(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException(m6.f(cls, "Unable to instantiate GlideModule implementation for "), reflectiveOperationException);
    }
}
