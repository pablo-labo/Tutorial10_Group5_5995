package defpackage;

import app.rive.runtime.kotlin.fonts.Fonts;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public enum qb5 {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN("unknown"),
    /* JADX INFO: Fake field, exist only in values array */
    NORMAL(Fonts.Font.STYLE_NORMAL),
    MULTIPLY("multiply"),
    /* JADX INFO: Fake field, exist only in values array */
    SCREEN("screen"),
    /* JADX INFO: Fake field, exist only in values array */
    DARKEN("darken"),
    /* JADX INFO: Fake field, exist only in values array */
    LIGHTEN("lighten");

    public static final HashMap b = new HashMap();
    private final String mode;

    static {
        for (qb5 qb5Var : values()) {
            b.put(qb5Var.mode, qb5Var);
        }
    }

    qb5(String str) {
        this.mode = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.mode;
    }
}
