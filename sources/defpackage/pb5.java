package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public enum pb5 {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN("unknown"),
    /* JADX INFO: Fake field, exist only in values array */
    DUPLICATE("duplicate"),
    /* JADX INFO: Fake field, exist only in values array */
    WRAP("wrap"),
    /* JADX INFO: Fake field, exist only in values array */
    NONE("none");

    public static final HashMap a = new HashMap();
    private final String edgeMode;

    static {
        for (pb5 pb5Var : values()) {
            a.put(pb5Var.edgeMode, pb5Var);
        }
    }

    pb5(String str) {
        this.edgeMode = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.edgeMode;
    }
}
