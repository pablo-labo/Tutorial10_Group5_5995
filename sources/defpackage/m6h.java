package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum m6h {
    UNDEFINED(0),
    EXACTLY(1),
    AT_MOST(2);

    private final int mIntValue;

    m6h(int i) {
        this.mIntValue = i;
    }

    public static m6h a(int i) {
        if (i == 0) {
            return UNDEFINED;
        }
        if (i == 1) {
            return EXACTLY;
        }
        if (i == 2) {
            return AT_MOST;
        }
        l5.q(p6.c(i, "Unknown enum value: "));
        return null;
    }
}
