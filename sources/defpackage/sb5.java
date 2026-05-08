package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public enum sb5 {
    /* JADX INFO: Fake field, exist only in values array */
    OVER("over"),
    /* JADX INFO: Fake field, exist only in values array */
    IN("in"),
    /* JADX INFO: Fake field, exist only in values array */
    OUT("out"),
    /* JADX INFO: Fake field, exist only in values array */
    ATOP("atop"),
    /* JADX INFO: Fake field, exist only in values array */
    XOR("xor"),
    ARITHMETIC("arithmetic");

    public static final HashMap b = new HashMap();
    private final String type;

    static {
        for (sb5 sb5Var : values()) {
            b.put(sb5Var.type, sb5Var);
        }
    }

    sb5(String str) {
        this.type = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.type;
    }
}
