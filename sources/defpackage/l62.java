package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class l62 {
    public static Class<?> a(ClassLoader classLoader, String str) throws ClassNotFoundException {
        Class<?> cls;
        Class<?> cls2 = null;
        if (classLoader == null || str == null) {
            cls = null;
        } else {
            try {
                cls = Class.forName(str, true, classLoader);
            } catch (ClassNotFoundException unused) {
                cls = null;
            }
        }
        if (cls == null && Thread.currentThread().getContextClassLoader() != null) {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            if (contextClassLoader != null && str != null) {
                try {
                    cls2 = Class.forName(str, true, contextClassLoader);
                } catch (ClassNotFoundException unused2) {
                }
            }
            cls = cls2;
        }
        if (cls != null) {
            return cls;
        }
        throw new ClassNotFoundException(l5.l("Failed to load class", str));
    }
}
