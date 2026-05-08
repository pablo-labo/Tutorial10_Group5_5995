package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class xuc extends mvc implements fu7 {
    public final Annotation a;

    public xuc(Annotation annotation) {
        annotation.getClass();
        this.a = annotation;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xuc) {
            return this.a == ((xuc) obj).a;
        }
        return false;
    }

    @Override // defpackage.fu7
    public final ArrayList g() throws IllegalAccessException, InvocationTargetException {
        Annotation annotation = this.a;
        Method[] declaredMethods = jh2.p(jh2.m(annotation)).getDeclaredMethods();
        declaredMethods.getClass();
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            Object objInvoke = method.invoke(annotation, null);
            objInvoke.getClass();
            n8a n8aVarH = n8a.h(method.getName());
            Class<?> cls = objInvoke.getClass();
            List<yd8<? extends Object>> list = wuc.a;
            arrayList.add(Enum.class.isAssignableFrom(cls) ? new nvc(n8aVarH, (Enum) objInvoke) : objInvoke instanceof Annotation ? new zuc(n8aVarH, (Annotation) objInvoke) : objInvoke instanceof Object[] ? new avc(n8aVarH, (Object[]) objInvoke) : objInvoke instanceof Class ? new jvc(n8aVarH, (Class) objInvoke) : new pvc(n8aVarH, objInvoke));
        }
        return arrayList;
    }

    public final int hashCode() {
        return System.identityHashCode(this.a);
    }

    @Override // defpackage.fu7
    public final a62 j() {
        return wuc.a(jh2.p(jh2.m(this.a)));
    }

    @Override // defpackage.fu7
    public final hvc k() {
        return new hvc(jh2.p(jh2.m(this.a)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        u40.k(xuc.class, sb, ": ");
        sb.append(this.a);
        return sb.toString();
    }
}
