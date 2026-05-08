package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class wvc extends mvc implements ku7, pw7 {
    public final TypeVariable<?> a;

    public wvc(TypeVariable<?> typeVariable) {
        typeVariable.getClass();
        this.a = typeVariable;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wvc) {
            return wl7.b(this.a, ((wvc) obj).a);
        }
        return false;
    }

    @Override // defpackage.ku7
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        TypeVariable<?> typeVariable = this.a;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        return (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) ? zr4.a : r03.n(declaredAnnotations);
    }

    @Override // defpackage.kv7
    public final n8a getName() {
        return n8a.h(this.a.getName());
    }

    @Override // defpackage.pw7
    public final Collection getUpperBounds() {
        Type[] bounds = this.a.getBounds();
        bounds.getClass();
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type : bounds) {
            arrayList.add(new kvc(type));
        }
        kvc kvcVar = (kvc) z92.m1(arrayList);
        Collection collection = arrayList;
        if (wl7.b(kvcVar != null ? kvcVar.a : null, Object.class)) {
            collection = zr4.a;
        }
        return collection;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.ku7
    public final fu7 p(mq5 mq5Var) {
        Annotation[] declaredAnnotations;
        mq5Var.getClass();
        TypeVariable<?> typeVariable = this.a;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        if (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) {
            return null;
        }
        return r03.k(declaredAnnotations, mq5Var);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        u40.k(wvc.class, sb, ": ");
        sb.append(this.a);
        return sb.toString();
    }
}
