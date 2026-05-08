package defpackage;

import defpackage.ere;
import defpackage.oi8;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class vuc {
    public static d62 a(Class cls) {
        int i = 0;
        while (cls.isArray()) {
            i++;
            cls = cls.getComponentType();
            cls.getClass();
        }
        if (!cls.isPrimitive()) {
            a62 a62VarA = wuc.a(cls);
            String str = iw7.a;
            a62 a62VarF = iw7.f(a62VarA.a());
            if (a62VarF != null) {
                a62VarA = a62VarF;
            }
            return new d62(a62VarA, i);
        }
        if (cls.equals(Void.TYPE)) {
            mq5 mq5VarG = ere.a.d.g();
            return new d62(new a62(mq5VarG.b(), mq5VarG.a.f()), i);
        }
        bnb bnbVarH = md8.c(cls.getName()).h();
        bnbVarH.getClass();
        if (i > 0) {
            mq5 mq5VarE = bnbVarH.e();
            mq5VarE.getClass();
            return new d62(new a62(mq5VarE.b(), mq5VarE.a.f()), i - 1);
        }
        mq5 mq5VarH = bnbVarH.h();
        mq5VarH.getClass();
        return new d62(new a62(mq5VarH.b(), mq5VarH.a.f()), i);
    }

    public static void b(oi8.c cVar, Annotation annotation) {
        Class clsP = jh2.p(jh2.m(annotation));
        oi8.a aVarB = cVar.b(wuc.a(clsP), new uuc(annotation));
        if (aVarB != null) {
            c(aVarB, annotation, clsP);
        }
    }

    public static void c(oi8.a aVar, Annotation annotation, Class cls) {
        ct0 ct0VarQ = web.q(cls.getDeclaredMethods());
        while (ct0VarQ.hasNext()) {
            Method method = (Method) ct0VarQ.next();
            try {
                Object objInvoke = method.invoke(annotation, null);
                objInvoke.getClass();
                n8a n8aVarH = n8a.h(method.getName());
                Class<?> enclosingClass = objInvoke.getClass();
                if (enclosingClass.equals(Class.class)) {
                    aVar.b(n8aVarH, a((Class) objInvoke));
                } else if (cwc.a.contains(enclosingClass)) {
                    aVar.f(n8aVarH, objInvoke);
                } else {
                    List<yd8<? extends Object>> list = wuc.a;
                    if (Enum.class.isAssignableFrom(enclosingClass)) {
                        if (!enclosingClass.isEnum()) {
                            enclosingClass = enclosingClass.getEnclosingClass();
                        }
                        enclosingClass.getClass();
                        aVar.d(n8aVarH, wuc.a(enclosingClass), n8a.h(((Enum) objInvoke).name()));
                    } else if (Annotation.class.isAssignableFrom(enclosingClass)) {
                        Class<?>[] interfaces = enclosingClass.getInterfaces();
                        interfaces.getClass();
                        Class cls2 = (Class) ut0.x0(interfaces);
                        cls2.getClass();
                        oi8.a aVarE = aVar.e(wuc.a(cls2), n8aVarH);
                        if (aVarE != null) {
                            c(aVarE, (Annotation) objInvoke, cls2);
                        }
                    } else {
                        if (!enclosingClass.isArray()) {
                            throw new UnsupportedOperationException("Unsupported annotation argument value (" + enclosingClass + "): " + objInvoke);
                        }
                        oi8.b bVarC = aVar.c(n8aVarH);
                        if (bVarC != null) {
                            Class<?> componentType = enclosingClass.getComponentType();
                            int i = 0;
                            if (componentType.isEnum()) {
                                a62 a62VarA = wuc.a(componentType);
                                Object[] objArr = (Object[]) objInvoke;
                                int length = objArr.length;
                                while (i < length) {
                                    Object obj = objArr[i];
                                    obj.getClass();
                                    bVarC.d(a62VarA, n8a.h(((Enum) obj).name()));
                                    i++;
                                }
                            } else if (componentType.equals(Class.class)) {
                                Object[] objArr2 = (Object[]) objInvoke;
                                int length2 = objArr2.length;
                                while (i < length2) {
                                    Object obj2 = objArr2[i];
                                    obj2.getClass();
                                    bVarC.e(a((Class) obj2));
                                    i++;
                                }
                            } else if (Annotation.class.isAssignableFrom(componentType)) {
                                Object[] objArr3 = (Object[]) objInvoke;
                                int length3 = objArr3.length;
                                while (i < length3) {
                                    Object obj3 = objArr3[i];
                                    oi8.a aVarB = bVarC.b(wuc.a(componentType));
                                    if (aVarB != null) {
                                        obj3.getClass();
                                        c(aVarB, (Annotation) obj3, componentType);
                                    }
                                    i++;
                                }
                            } else {
                                Object[] objArr4 = (Object[]) objInvoke;
                                int length4 = objArr4.length;
                                while (i < length4) {
                                    bVarC.c(objArr4[i]);
                                    i++;
                                }
                            }
                            bVarC.a();
                        }
                    }
                }
            } catch (IllegalAccessException unused) {
            }
        }
        aVar.a();
    }
}
