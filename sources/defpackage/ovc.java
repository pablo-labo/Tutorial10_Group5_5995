package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* JADX INFO: loaded from: classes3.dex */
public final class ovc extends qvc implements bv7 {
    public final Field a;

    public ovc(Field field) {
        field.getClass();
        this.a = field;
    }

    @Override // defpackage.bv7
    public final jw7 getType() {
        Type genericType = this.a.getGenericType();
        genericType.getClass();
        boolean z = genericType instanceof Class;
        if (z) {
            Class cls = (Class) genericType;
            if (cls.isPrimitive()) {
                return new tvc(cls);
            }
        }
        return ((genericType instanceof GenericArrayType) || (z && ((Class) genericType).isArray())) ? new bvc(genericType) : genericType instanceof WildcardType ? new yvc((WildcardType) genericType) : new kvc(genericType);
    }

    @Override // defpackage.bv7
    public final boolean q() {
        return this.a.isEnumConstant();
    }

    @Override // defpackage.qvc
    public final Member s() {
        return this.a;
    }
}
