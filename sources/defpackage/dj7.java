package defpackage;

import defpackage.pv1;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dj7 implements pv1<Method> {
    public final Method a;
    public final List<Type> b;
    public final Class c;

    public static final class a extends dj7 implements yk1 {
        public final Object d;

        public a(Object obj, Method method) {
            super(method, zr4.a);
            this.d = obj;
        }

        @Override // defpackage.pv1
        public final Object call(Object[] objArr) {
            objArr.getClass();
            pv1.a.a(this, objArr);
            return this.a.invoke(this.d, Arrays.copyOf(objArr, objArr.length));
        }
    }

    public static final class b extends dj7 {
        @Override // defpackage.pv1
        public final Object call(Object[] objArr) {
            objArr.getClass();
            pv1.a.a(this, objArr);
            Object obj = objArr[0];
            Object[] objArrN = objArr.length <= 1 ? new Object[0] : pyd.n(objArr, 1, objArr.length);
            return this.a.invoke(obj, Arrays.copyOf(objArrN, objArrN.length));
        }
    }

    public dj7(Method method, List list) {
        this.a = method;
        this.b = list;
        Class<?> returnType = method.getReturnType();
        returnType.getClass();
        this.c = returnType;
    }

    @Override // defpackage.pv1
    public final List<Type> a() {
        return this.b;
    }

    @Override // defpackage.pv1
    public final boolean b() {
        return false;
    }

    @Override // defpackage.pv1
    public final /* bridge */ /* synthetic */ Member getMember() {
        return null;
    }

    @Override // defpackage.pv1
    public final Type getReturnType() {
        return this.c;
    }
}
