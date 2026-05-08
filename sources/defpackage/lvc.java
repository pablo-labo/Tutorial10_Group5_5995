package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class lvc extends qvc implements uu7 {
    public final Constructor<?> a;

    public lvc(Constructor<?> constructor) {
        constructor.getClass();
        this.a = constructor;
    }

    @Override // defpackage.qw7
    public final ArrayList getTypeParameters() {
        TypeVariable<Constructor<?>>[] typeParameters = this.a.getTypeParameters();
        typeParameters.getClass();
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Constructor<?>> typeVariable : typeParameters) {
            arrayList.add(new wvc(typeVariable));
        }
        return arrayList;
    }

    @Override // defpackage.uu7
    public final List<xw7> i() {
        Constructor<?> constructor = this.a;
        Type[] genericParameterTypes = constructor.getGenericParameterTypes();
        genericParameterTypes.getClass();
        if (genericParameterTypes.length == 0) {
            return zr4.a;
        }
        Class<?> declaringClass = constructor.getDeclaringClass();
        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
            genericParameterTypes = (Type[]) pyd.n(genericParameterTypes, 1, genericParameterTypes.length);
        }
        Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
        if (parameterAnnotations.length < genericParameterTypes.length) {
            bg.n(constructor, "Illegal generic signature: ");
            return null;
        }
        if (parameterAnnotations.length > genericParameterTypes.length) {
            parameterAnnotations = (Annotation[][]) pyd.n(parameterAnnotations, parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length);
        }
        return t(genericParameterTypes, parameterAnnotations, constructor.isVarArgs());
    }

    @Override // defpackage.qvc
    public final Member s() {
        return this.a;
    }
}
