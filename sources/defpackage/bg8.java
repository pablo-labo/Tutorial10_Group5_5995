package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes3.dex */
public final class bg8 implements gu5 {
    public final cg8 a;
    public final int b;
    public final Lazy c;

    public bg8(cg8 cg8Var, int i, Lazy lazy) {
        this.a = cg8Var;
        this.b = i;
        this.c = lazy;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        cg8 cg8Var = this.a;
        Type typeL = cg8Var.l();
        if (typeL instanceof Class) {
            Class cls = (Class) typeL;
            Class componentType = cls.isArray() ? cls.getComponentType() : Object.class;
            componentType.getClass();
            return componentType;
        }
        boolean z = typeL instanceof GenericArrayType;
        int i = this.b;
        if (z) {
            if (i != 0) {
                s6.i(cg8Var, "Array type has been queried for a non-0th argument: ");
                return null;
            }
            Type genericComponentType = ((GenericArrayType) typeL).getGenericComponentType();
            genericComponentType.getClass();
            return genericComponentType;
        }
        if (!(typeL instanceof ParameterizedType)) {
            s6.i(cg8Var, "Non-generic type has been queried for arguments: ");
            return null;
        }
        Type type = (Type) ((List) this.c.getValue()).get(i);
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        lowerBounds.getClass();
        Type type2 = (Type) ut0.k0(lowerBounds);
        if (type2 == null) {
            Type[] upperBounds = wildcardType.getUpperBounds();
            upperBounds.getClass();
            type2 = (Type) ut0.j0(upperBounds);
        }
        type2.getClass();
        return type2;
    }
}
