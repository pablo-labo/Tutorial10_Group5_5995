package defpackage;

import defpackage.cu7;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class uvc extends qvc implements qv7 {
    public final Object a;

    public uvc(Object obj) {
        obj.getClass();
        this.a = obj;
    }

    @Override // defpackage.qv7
    public final jw7 getType() throws IllegalAccessException, InvocationTargetException {
        Object obj = this.a;
        obj.getClass();
        cu7.a aVar = cu7.a;
        Class cls = null;
        if (aVar == null) {
            Class<?> cls2 = obj.getClass();
            try {
                aVar = new cu7.a(cls2.getMethod("getType", null), cls2.getMethod("getAccessor", null));
            } catch (NoSuchMethodException unused) {
                aVar = new cu7.a(null, null);
            }
            cu7.a = aVar;
        }
        Method method = aVar.a;
        if (method != null) {
            Object objInvoke = method.invoke(obj, null);
            objInvoke.getClass();
            cls = (Class) objInvoke;
        }
        if (cls != null) {
            return new kvc(cls);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }

    @Override // defpackage.qvc
    public final Member s() throws IllegalAccessException, InvocationTargetException {
        Object obj = this.a;
        obj.getClass();
        cu7.a aVar = cu7.a;
        Method method = null;
        if (aVar == null) {
            Class<?> cls = obj.getClass();
            try {
                aVar = new cu7.a(cls.getMethod("getType", null), cls.getMethod("getAccessor", null));
            } catch (NoSuchMethodException unused) {
                aVar = new cu7.a(null, null);
            }
            cu7.a = aVar;
        }
        Method method2 = aVar.b;
        if (method2 != null) {
            Object objInvoke = method2.invoke(obj, null);
            objInvoke.getClass();
            method = (Method) objInvoke;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }
}
