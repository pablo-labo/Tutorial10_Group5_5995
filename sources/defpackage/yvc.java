package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class yvc extends vvc implements jw7 {
    public final WildcardType a;
    public final zr4 b = zr4.a;

    public yvc(WildcardType wildcardType) {
        this.a = wildcardType;
    }

    @Override // defpackage.ku7
    public final Collection<fu7> getAnnotations() {
        return this.b;
    }

    @Override // defpackage.vvc
    public final Type s() {
        return this.a;
    }

    public final vvc t() {
        WildcardType wildcardType = this.a;
        Type[] upperBounds = wildcardType.getUpperBounds();
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            l5.p(wildcardType, "Wildcard types with many bounds are not yet supported: ");
            return null;
        }
        if (lowerBounds.length == 1) {
            Object objX0 = ut0.x0(lowerBounds);
            objX0.getClass();
            Type type = (Type) objX0;
            boolean z = type instanceof Class;
            if (z) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new tvc(cls);
                }
            }
            return ((type instanceof GenericArrayType) || (z && ((Class) type).isArray())) ? new bvc(type) : type instanceof WildcardType ? new yvc((WildcardType) type) : new kvc(type);
        }
        if (upperBounds.length == 1) {
            Type type2 = (Type) ut0.x0(upperBounds);
            if (!wl7.b(type2, Object.class)) {
                type2.getClass();
                boolean z2 = type2 instanceof Class;
                if (z2) {
                    Class cls2 = (Class) type2;
                    if (cls2.isPrimitive()) {
                        return new tvc(cls2);
                    }
                }
                return ((type2 instanceof GenericArrayType) || (z2 && ((Class) type2).isArray())) ? new bvc(type2) : type2 instanceof WildcardType ? new yvc((WildcardType) type2) : new kvc(type2);
            }
        }
        return null;
    }

    public final boolean u() {
        this.a.getUpperBounds().getClass();
        return !wl7.b(ut0.k0(r1), Object.class);
    }
}
