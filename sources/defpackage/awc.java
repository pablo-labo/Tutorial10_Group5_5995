package defpackage;

import defpackage.oi8;
import defpackage.r0;
import io.jsonwebtoken.JwtParser;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class awc implements oi8 {
    public final Class<?> a;
    public final hi8 b;

    public static final class a {
        /* JADX WARN: Removed duplicated region for block: B:47:0x00d4  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static defpackage.awc a(java.lang.Class r14) {
            /*
                Method dump skipped, instruction units count: 220
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: awc.a.a(java.lang.Class):awc");
        }
    }

    public awc() {
        throw null;
    }

    public awc(Class cls, hi8 hi8Var) {
        this.a = cls;
        this.b = hi8Var;
    }

    @Override // defpackage.oi8
    public final hi8 a() {
        return this.b;
    }

    @Override // defpackage.oi8
    public final void b(r0 r0Var) {
        Class<?> cls = this.a;
        cls.getClass();
        ct0 ct0VarQ = web.q(cls.getDeclaredMethods());
        while (true) {
            if (!ct0VarQ.hasNext()) {
                break;
            }
            Method method = (Method) ct0VarQ.next();
            n8a n8aVarH = n8a.h(method.getName());
            StringBuilder sb = new StringBuilder("(");
            ct0 ct0VarQ2 = web.q(method.getParameterTypes());
            while (ct0VarQ2.hasNext()) {
                Class cls2 = (Class) ct0VarQ2.next();
                cls2.getClass();
                sb.append(wuc.b(cls2));
            }
            sb.append(")");
            Class<?> returnType = method.getReturnType();
            returnType.getClass();
            sb.append(wuc.b(returnType));
            r0.a aVarA = r0Var.a(n8aVarH, sb.toString());
            ct0 ct0VarQ3 = web.q(method.getDeclaredAnnotations());
            while (ct0VarQ3.hasNext()) {
                Annotation annotation = (Annotation) ct0VarQ3.next();
                annotation.getClass();
                vuc.b(aVarA, annotation);
            }
            Annotation[][] parameterAnnotations = method.getParameterAnnotations();
            parameterAnnotations.getClass();
            Annotation[][] annotationArr = parameterAnnotations;
            int length = annotationArr.length;
            for (int i = 0; i < length; i++) {
                ct0 ct0VarQ4 = web.q(annotationArr[i]);
                while (ct0VarQ4.hasNext()) {
                    Annotation annotation2 = (Annotation) ct0VarQ4.next();
                    Class clsP = jh2.p(jh2.m(annotation2));
                    lf1 lf1VarC = aVarA.c(i, wuc.a(clsP), new uuc(annotation2));
                    if (lf1VarC != null) {
                        vuc.c(lf1VarC, annotation2, clsP);
                    }
                }
            }
            aVarA.a();
        }
        ct0 ct0VarQ5 = web.q(cls.getDeclaredConstructors());
        while (ct0VarQ5.hasNext()) {
            Constructor constructor = (Constructor) ct0VarQ5.next();
            n8a n8aVar = toe.e;
            constructor.getClass();
            StringBuilder sb2 = new StringBuilder("(");
            ct0 ct0VarQ6 = web.q(constructor.getParameterTypes());
            while (ct0VarQ6.hasNext()) {
                Class cls3 = (Class) ct0VarQ6.next();
                cls3.getClass();
                sb2.append(wuc.b(cls3));
            }
            sb2.append(")V");
            r0.a aVarA2 = r0Var.a(n8aVar, sb2.toString());
            ct0 ct0VarQ7 = web.q(constructor.getDeclaredAnnotations());
            while (ct0VarQ7.hasNext()) {
                Annotation annotation3 = (Annotation) ct0VarQ7.next();
                annotation3.getClass();
                vuc.b(aVarA2, annotation3);
            }
            Annotation[][] parameterAnnotations2 = constructor.getParameterAnnotations();
            parameterAnnotations2.getClass();
            if (parameterAnnotations2.length != 0) {
                int length2 = constructor.getParameterTypes().length - parameterAnnotations2.length;
                int length3 = parameterAnnotations2.length;
                for (int i2 = 0; i2 < length3; i2++) {
                    ct0 ct0VarQ8 = web.q(parameterAnnotations2[i2]);
                    while (ct0VarQ8.hasNext()) {
                        Annotation annotation4 = (Annotation) ct0VarQ8.next();
                        Class clsP2 = jh2.p(jh2.m(annotation4));
                        lf1 lf1VarC2 = aVarA2.c(i2 + length2, wuc.a(clsP2), new uuc(annotation4));
                        if (lf1VarC2 != null) {
                            vuc.c(lf1VarC2, annotation4, clsP2);
                        }
                    }
                }
            }
            aVarA2.a();
        }
        ct0 ct0VarQ9 = web.q(cls.getDeclaredFields());
        while (ct0VarQ9.hasNext()) {
            Field field = (Field) ct0VarQ9.next();
            n8a n8aVarH2 = n8a.h(field.getName());
            Class<?> type = field.getType();
            type.getClass();
            String strB = wuc.b(type);
            String strC = n8aVarH2.c();
            strC.getClass();
            ln9 ln9Var = new ln9(g7.e('#', strC, strB));
            ArrayList arrayList = new ArrayList();
            ct0 ct0VarQ10 = web.q(field.getDeclaredAnnotations());
            while (ct0VarQ10.hasNext()) {
                Annotation annotation5 = (Annotation) ct0VarQ10.next();
                annotation5.getClass();
                Class clsP3 = jh2.p(jh2.m(annotation5));
                lf1 lf1VarQ = r0Var.a.q(wuc.a(clsP3), new uuc(annotation5), arrayList);
                if (lf1VarQ != null) {
                    vuc.c(lf1VarQ, annotation5, clsP3);
                }
            }
            if (!arrayList.isEmpty()) {
                r0Var.b.put(ln9Var, arrayList);
            }
        }
    }

    @Override // defpackage.oi8
    public final void c(oi8.c cVar) {
        Class<?> cls = this.a;
        cls.getClass();
        ct0 ct0VarQ = web.q(cls.getDeclaredAnnotations());
        while (ct0VarQ.hasNext()) {
            Annotation annotation = (Annotation) ct0VarQ.next();
            annotation.getClass();
            vuc.b(cVar, annotation);
        }
        cVar.a();
    }

    @Override // defpackage.oi8
    public final String d() {
        String strReplace = this.a.getName().replace(JwtParser.SEPARATOR_CHAR, '/');
        strReplace.getClass();
        return strReplace.concat(".class");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof awc) {
            return wl7.b(this.a, ((awc) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.oi8
    public final a62 j() {
        return wuc.a(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        u40.k(awc.class, sb, ": ");
        sb.append(this.a);
        return sb.toString();
    }
}
