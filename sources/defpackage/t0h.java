package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum t0h {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(ur1.a),
    ENUM(null),
    MESSAGE(null);

    private final Object defaultDefault;

    t0h(Object obj) {
        this.defaultDefault = obj;
    }
}
