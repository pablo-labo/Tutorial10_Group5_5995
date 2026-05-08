package defpackage;

import app.rive.runtime.kotlin.fonts.Fonts;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public enum cjf {
    Normal(Fonts.Font.STYLE_NORMAL),
    Bold("bold"),
    w100("100"),
    w200("200"),
    w300("300"),
    /* JADX INFO: Fake field, exist only in values array */
    w400("400"),
    w500("500"),
    w600("600"),
    /* JADX INFO: Fake field, exist only in values array */
    w700("700"),
    w800("800"),
    w900("900"),
    Bolder("bolder"),
    Lighter("lighter");

    public static final HashMap a0 = new HashMap();
    private final String weight;

    static {
        for (cjf cjfVar : values()) {
            a0.put(cjfVar.weight, cjfVar);
        }
    }

    cjf(String str) {
        this.weight = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.weight;
    }
}
