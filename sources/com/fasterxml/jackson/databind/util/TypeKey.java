package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.JavaType;
import defpackage.u40;
import defpackage.z3;

/* JADX INFO: loaded from: classes2.dex */
public class TypeKey {
    protected Class<?> _class;
    protected int _hashCode;
    protected boolean _isTyped;
    protected JavaType _type;

    public TypeKey(Class<?> cls, boolean z) {
        this._class = cls;
        this._type = null;
        this._isTyped = z;
        this._hashCode = z ? typedHash(cls) : untypedHash(cls);
    }

    public static final int typedHash(Class<?> cls) {
        return cls.getName().hashCode() + 1;
    }

    public static final int untypedHash(Class<?> cls) {
        return cls.getName().hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        TypeKey typeKey = (TypeKey) obj;
        if (typeKey._isTyped != this._isTyped) {
            return false;
        }
        Class<?> cls = this._class;
        return cls != null ? typeKey._class == cls : this._type.equals(typeKey._type);
    }

    public Class<?> getRawType() {
        return this._class;
    }

    public JavaType getType() {
        return this._type;
    }

    public final int hashCode() {
        return this._hashCode;
    }

    public boolean isTyped() {
        return this._isTyped;
    }

    public final String toString() {
        if (this._class != null) {
            StringBuilder sb = new StringBuilder("{class: ");
            u40.k(this._class, sb, ", typed? ");
            return z3.o(sb, this._isTyped, "}");
        }
        StringBuilder sb2 = new StringBuilder("{type: ");
        sb2.append(this._type);
        sb2.append(", typed? ");
        return z3.o(sb2, this._isTyped, "}");
    }

    public static final int untypedHash(JavaType javaType) {
        return javaType.hashCode() - 1;
    }

    public static final int typedHash(JavaType javaType) {
        return javaType.hashCode() - 2;
    }

    public TypeKey() {
    }

    public TypeKey(JavaType javaType, boolean z) {
        this._type = javaType;
        this._class = null;
        this._isTyped = z;
        this._hashCode = z ? typedHash(javaType) : untypedHash(javaType);
    }
}
