package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public enum rb5 {
    /* JADX INFO: Fake field, exist only in values array */
    MATRIX("matrix"),
    /* JADX INFO: Fake field, exist only in values array */
    SATURATE("saturate"),
    /* JADX INFO: Fake field, exist only in values array */
    HUE_ROTATE("hueRotate"),
    /* JADX INFO: Fake field, exist only in values array */
    LUMINANCE_TO_ALPHA("luminanceToAlpha");

    public static final HashMap a = new HashMap();
    private final String type;

    static {
        for (rb5 rb5Var : values()) {
            a.put(rb5Var.type, rb5Var);
        }
    }

    rb5(String str) {
        this.type = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.type;
    }
}
