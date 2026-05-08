package defpackage;

import defpackage.zsg;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public abstract class qvc extends mvc implements ku7, jv7, gv7 {
    @Override // defpackage.jv7
    public final boolean b() {
        return Modifier.isStatic(s().getModifiers());
    }

    @Override // defpackage.gv7
    public final hvc c() {
        Class<?> declaringClass = s().getDeclaringClass();
        declaringClass.getClass();
        return new hvc(declaringClass);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof qvc) && wl7.b(s(), ((qvc) obj).s());
    }

    @Override // defpackage.ku7
    public final Collection getAnnotations() {
        Member memberS = s();
        memberS.getClass();
        Annotation[] declaredAnnotations = ((AnnotatedElement) memberS).getDeclaredAnnotations();
        return declaredAnnotations != null ? r03.n(declaredAnnotations) : zr4.a;
    }

    @Override // defpackage.kv7
    public final n8a getName() {
        String name = s().getName();
        return name != null ? n8a.h(name) : toe.a;
    }

    @Override // defpackage.jv7
    public final i7 getVisibility() {
        int modifiers = s().getModifiers();
        return Modifier.isPublic(modifiers) ? zsg.h.d : Modifier.isPrivate(modifiers) ? zsg.e.d : Modifier.isProtected(modifiers) ? Modifier.isStatic(modifiers) ? bx7.d : ax7.d : zw7.d;
    }

    public final int hashCode() {
        return s().hashCode();
    }

    @Override // defpackage.jv7
    public final boolean isAbstract() {
        return Modifier.isAbstract(s().getModifiers());
    }

    @Override // defpackage.jv7
    public final boolean isFinal() {
        return Modifier.isFinal(s().getModifiers());
    }

    @Override // defpackage.ku7
    public final fu7 p(mq5 mq5Var) {
        mq5Var.getClass();
        Member memberS = s();
        memberS.getClass();
        Annotation[] declaredAnnotations = ((AnnotatedElement) memberS).getDeclaredAnnotations();
        if (declaredAnnotations != null) {
            return r03.k(declaredAnnotations, mq5Var);
        }
        return null;
    }

    public abstract Member s();

    /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList t(java.lang.reflect.Type[] r13, java.lang.annotation.Annotation[][] r14, boolean r15) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qvc.t(java.lang.reflect.Type[], java.lang.annotation.Annotation[][], boolean):java.util.ArrayList");
    }

    public final String toString() {
        return getClass().getName() + ": " + s();
    }
}
