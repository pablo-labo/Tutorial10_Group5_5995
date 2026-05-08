package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public enum u0h {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(tr1.a),
    ENUM(null),
    MESSAGE(null);

    private final Object defaultDefault;

    u0h(Serializable serializable) {
        this.defaultDefault = serializable;
    }
}
