package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class bvc extends vvc implements jw7 {
    public final Type a;
    public final vvc b;
    public final zr4 c;

    /* JADX WARN: Multi-variable type inference failed */
    public bvc(Type type) {
        vvc tvcVar;
        vvc tvcVar2;
        this.a = type;
        if (!(type instanceof GenericArrayType)) {
            if (type instanceof Class) {
                Class cls = (Class) type;
                if (cls.isArray()) {
                    Class<?> componentType = cls.getComponentType();
                    componentType.getClass();
                    tvcVar = componentType.isPrimitive() ? new tvc(componentType) : ((componentType instanceof GenericArrayType) || componentType.isArray()) ? new bvc(componentType) : componentType instanceof WildcardType ? new yvc((WildcardType) componentType) : new kvc(componentType);
                }
            }
            ia.q("Not an array type (", type.getClass(), "): ", type);
            throw null;
        }
        Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
        genericComponentType.getClass();
        boolean z = genericComponentType instanceof Class;
        if (z) {
            Class cls2 = (Class) genericComponentType;
            if (cls2.isPrimitive()) {
                tvcVar2 = new tvc(cls2);
                this.b = tvcVar2;
                this.c = zr4.a;
            }
        }
        tvcVar = ((genericComponentType instanceof GenericArrayType) || (z && ((Class) genericComponentType).isArray())) ? new bvc(genericComponentType) : genericComponentType instanceof WildcardType ? new yvc((WildcardType) genericComponentType) : new kvc(genericComponentType);
        tvcVar2 = tvcVar;
        this.b = tvcVar2;
        this.c = zr4.a;
    }

    @Override // defpackage.ku7
    public final Collection<fu7> getAnnotations() {
        return this.c;
    }

    @Override // defpackage.vvc
    public final Type s() {
        return this.a;
    }

    public final vvc t() {
        return this.b;
    }
}
