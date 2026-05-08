package defpackage;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ze0 {
    public static final <T> T a(Class<T> cls, Map<String, ? extends Object> map, List<Method> list) {
        cls.getClass();
        list.getClass();
        d2f d2fVar = new d2f(new ve0(map, 0));
        T t = (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new xe0(cls, map, new d2f(new we0(0, cls, map)), d2fVar, list));
        t.getClass();
        return t;
    }
}
