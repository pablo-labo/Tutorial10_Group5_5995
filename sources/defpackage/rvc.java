package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class rvc extends qvc implements hv7 {
    public final Method a;

    public rvc(Method method) {
        method.getClass();
        this.a = method;
    }

    @Override // defpackage.qw7
    public final ArrayList getTypeParameters() {
        TypeVariable<Method>[] typeParameters = this.a.getTypeParameters();
        typeParameters.getClass();
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new wvc(typeVariable));
        }
        return arrayList;
    }

    @Override // defpackage.hv7
    public final List<xw7> i() {
        Method method = this.a;
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        genericParameterTypes.getClass();
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        parameterAnnotations.getClass();
        return t(genericParameterTypes, parameterAnnotations, method.isVarArgs());
    }

    @Override // defpackage.hv7
    public final vvc l() {
        Type genericReturnType = this.a.getGenericReturnType();
        genericReturnType.getClass();
        boolean z = genericReturnType instanceof Class;
        if (z) {
            Class cls = (Class) genericReturnType;
            if (cls.isPrimitive()) {
                return new tvc(cls);
            }
        }
        return ((genericReturnType instanceof GenericArrayType) || (z && ((Class) genericReturnType).isArray())) ? new bvc(genericReturnType) : genericReturnType instanceof WildcardType ? new yvc((WildcardType) genericReturnType) : new kvc(genericReturnType);
    }

    @Override // defpackage.hv7
    public final boolean r() {
        Object defaultValue = this.a.getDefaultValue();
        Object nvcVar = null;
        if (defaultValue != null) {
            Class<?> cls = defaultValue.getClass();
            List<yd8<? extends Object>> list = wuc.a;
            nvcVar = Enum.class.isAssignableFrom(cls) ? new nvc(null, (Enum) defaultValue) : defaultValue instanceof Annotation ? new zuc(null, (Annotation) defaultValue) : defaultValue instanceof Object[] ? new avc(null, (Object[]) defaultValue) : defaultValue instanceof Class ? new jvc(null, (Class) defaultValue) : new pvc(null, defaultValue);
        }
        return nvcVar != null;
    }

    @Override // defpackage.qvc
    public final Member s() {
        return this.a;
    }
}
