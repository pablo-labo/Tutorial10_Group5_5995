package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public final class ww5 implements GenericArrayType, Type {
    public final Type a;

    public ww5(Type type) {
        type.getClass();
        this.a = type;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GenericArrayType) {
            return wl7.b(this.a, ((GenericArrayType) obj).getGenericComponentType());
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.a;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return kzf.a(this.a) + "[]";
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return getTypeName();
    }
}
