package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import defpackage.jfe;
import defpackage.l5;

/* JADX INFO: loaded from: classes.dex */
public class i {
    public static final jfe<ClassLoader, jfe<String, Class<?>>> a = new jfe<>();

    public static Class<?> b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        jfe<ClassLoader, jfe<String, Class<?>>> jfeVar = a;
        jfe<String, Class<?>> jfeVar2 = jfeVar.get(classLoader);
        if (jfeVar2 == null) {
            jfeVar2 = new jfe<>();
            jfeVar.put(classLoader, jfeVar2);
        }
        Class<?> cls = jfeVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        jfeVar2.put(str, cls2);
        return cls2;
    }

    public static Class<? extends Fragment> c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e) {
            throw new Fragment.InstantiationException(l5.m("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new Fragment.InstantiationException(l5.m("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    public Fragment a(String str) {
        throw null;
    }
}
