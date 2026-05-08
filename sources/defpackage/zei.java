package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public enum zei {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(h0i.a),
    ENUM(null),
    MESSAGE(null);

    private final Object zzuq;

    zei(Serializable serializable) {
        this.zzuq = serializable;
    }
}
