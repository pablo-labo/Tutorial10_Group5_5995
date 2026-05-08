package com.fasterxml.jackson.databind.jsontype;

import defpackage.l6;
import defpackage.u40;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class NamedType implements Serializable {
    private static final long serialVersionUID = 1;
    protected final Class<?> _class;
    protected final int _hashCode;
    protected String _name;

    public NamedType(Class<?> cls, String str) {
        this._class = cls;
        this._hashCode = cls.getName().hashCode() + (str == null ? 0 : str.hashCode());
        setName(str);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != NamedType.class) {
            return false;
        }
        NamedType namedType = (NamedType) obj;
        return this._class == namedType._class && Objects.equals(this._name, namedType._name);
    }

    public String getName() {
        return this._name;
    }

    public Class<?> getType() {
        return this._class;
    }

    public boolean hasName() {
        return this._name != null;
    }

    public int hashCode() {
        return this._hashCode;
    }

    public void setName(String str) {
        if (str == null || str.isEmpty()) {
            str = null;
        }
        this._name = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[NamedType, class ");
        u40.k(this._class, sb, ", name: ");
        return l6.i(sb, this._name == null ? "null" : l6.i(new StringBuilder("'"), this._name, "'"), "]");
    }

    public NamedType(Class<?> cls) {
        this(cls, null);
    }
}
