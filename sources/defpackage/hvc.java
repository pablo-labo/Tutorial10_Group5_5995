package defpackage;

import defpackage.du7;
import defpackage.zsg;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class hvc extends mvc implements ku7, jv7, su7, qw7 {
    public final Class<?> a;

    public hvc(Class<?> cls) {
        cls.getClass();
        this.a = cls;
    }

    public final boolean A() throws IllegalAccessException, InvocationTargetException {
        Class<?> cls = this.a;
        cls.getClass();
        du7.a aVar = du7.a;
        Boolean bool = null;
        if (aVar == null) {
            try {
                aVar = new du7.a(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null));
            } catch (NoSuchMethodException unused) {
                aVar = new du7.a(null, null, null, null);
            }
            du7.a = aVar;
        }
        Method method = aVar.a;
        if (method != null) {
            Object objInvoke = method.invoke(cls, null);
            objInvoke.getClass();
            bool = (Boolean) objInvoke;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // defpackage.jv7
    public final boolean b() {
        return Modifier.isStatic(this.a.getModifiers());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hvc) {
            return wl7.b(this.a, ((hvc) obj).a);
        }
        return false;
    }

    @Override // defpackage.ku7
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        Class<?> cls = this.a;
        return (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) ? zr4.a : r03.n(declaredAnnotations);
    }

    @Override // defpackage.kv7
    public final n8a getName() {
        Class<?> cls = this.a;
        if (!cls.isAnonymousClass()) {
            return n8a.h(cls.getSimpleName());
        }
        String name = cls.getName();
        int iW = zve.W(name, 0, 6, ".");
        if (iW != -1) {
            name = name.substring(1 + iW, name.length());
        }
        return n8a.h(name);
    }

    @Override // defpackage.qw7
    public final ArrayList getTypeParameters() {
        TypeVariable<Class<?>>[] typeParameters = this.a.getTypeParameters();
        typeParameters.getClass();
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Class<?>> typeVariable : typeParameters) {
            arrayList.add(new wvc(typeVariable));
        }
        return arrayList;
    }

    @Override // defpackage.jv7
    public final i7 getVisibility() {
        int modifiers = this.a.getModifiers();
        return Modifier.isPublic(modifiers) ? zsg.h.d : Modifier.isPrivate(modifiers) ? zsg.e.d : Modifier.isProtected(modifiers) ? Modifier.isStatic(modifiers) ? bx7.d : ax7.d : zw7.d;
    }

    public final mq5 h() {
        return wuc.a(this.a).a();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.jv7
    public final boolean isAbstract() {
        return Modifier.isAbstract(this.a.getModifiers());
    }

    @Override // defpackage.jv7
    public final boolean isFinal() {
        return Modifier.isFinal(this.a.getModifiers());
    }

    @Override // defpackage.ku7
    public final fu7 p(mq5 mq5Var) {
        Annotation[] declaredAnnotations;
        mq5Var.getClass();
        Class<?> cls = this.a;
        if (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) {
            return null;
        }
        return r03.k(declaredAnnotations, mq5Var);
    }

    public final Collection s() {
        Field[] declaredFields = this.a.getDeclaredFields();
        declaredFields.getClass();
        r6e r6eVarE0 = ut0.e0(declaredFields);
        evc evcVar = evc.a;
        evcVar.getClass();
        cc5 cc5Var = new cc5(r6eVarE0, false, evcVar);
        fvc fvcVar = fvc.a;
        fvcVar.getClass();
        return a7e.W(new xrf(cc5Var, fvcVar));
    }

    public final Collection t() {
        Method[] declaredMethods = this.a.getDeclaredMethods();
        declaredMethods.getClass();
        cc5 cc5Var = new cc5(ut0.e0(declaredMethods), true, new wq0(this, 1));
        gvc gvcVar = gvc.a;
        gvcVar.getClass();
        return a7e.W(new xrf(cc5Var, gvcVar));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        u40.k(hvc.class, sb, ": ");
        sb.append(this.a);
        return sb.toString();
    }

    public final hvc u() {
        Class<?> declaringClass = this.a.getDeclaringClass();
        if (declaringClass != null) {
            return new hvc(declaringClass);
        }
        return null;
    }

    public final ArrayList v() {
        Class<?> cls = this.a;
        cls.getClass();
        du7.a aVar = du7.a;
        if (aVar == null) {
            try {
                aVar = new du7.a(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null));
            } catch (NoSuchMethodException unused) {
                aVar = new du7.a(null, null, null, null);
            }
            du7.a = aVar;
        }
        Method method = aVar.d;
        Object[] objArr = method != null ? (Object[]) method.invoke(cls, null) : null;
        if (objArr == null) {
            objArr = new Object[0];
        }
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(new uvc(obj));
        }
        return arrayList;
    }

    public final boolean w() {
        return this.a.isAnnotation();
    }

    public final boolean x() {
        return this.a.isEnum();
    }

    public final boolean y() {
        return this.a.isInterface();
    }

    public final boolean z() throws IllegalAccessException, InvocationTargetException {
        Class<?> cls = this.a;
        cls.getClass();
        du7.a aVar = du7.a;
        Boolean bool = null;
        if (aVar == null) {
            try {
                aVar = new du7.a(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null));
            } catch (NoSuchMethodException unused) {
                aVar = new du7.a(null, null, null, null);
            }
            du7.a = aVar;
        }
        Method method = aVar.c;
        if (method != null) {
            Object objInvoke = method.invoke(cls, null);
            objInvoke.getClass();
            bool = (Boolean) objInvoke;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
