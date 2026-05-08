package com.google.android.recaptcha.internal;

import defpackage.j6g;
import defpackage.wl7;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzjw implements InvocationHandler {
    private final Object zza;

    public zzjw(Object obj) {
        this.zza = obj;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if (wl7.b(method.getName(), "toString") && method.getParameterTypes().length == 0) {
            return "Proxy@".concat(String.valueOf(Integer.toHexString(obj.hashCode())));
        }
        if (wl7.b(method.getName(), "hashCode") && method.getParameterTypes().length == 0) {
            return Integer.valueOf(System.identityHashCode(obj));
        }
        if (wl7.b(method.getName(), "equals") && method.getParameterTypes().length != 0) {
            boolean z = false;
            if (objArr != null && objArr.length != 0) {
                Object obj2 = objArr[0];
                if ((obj2 != null ? obj2.hashCode() : 0) == obj.hashCode()) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
        if (!zza(obj, method, objArr)) {
            return j6g.a;
        }
        Object obj3 = this.zza;
        if ((obj3 == null && wl7.b(method.getReturnType(), Void.TYPE)) || (obj3 != null && wl7.b(zzqm.zza(obj3.getClass()), zzqm.zza(method.getReturnType())))) {
            return obj3 == null ? j6g.a : obj3;
        }
        throw new IllegalArgumentException(obj3 + " cannot be returned from method with return type " + method.getReturnType());
    }

    public abstract boolean zza(Object obj, Method method, Object[] objArr);
}
