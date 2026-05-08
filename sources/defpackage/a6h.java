package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum a6h {
    AUTO(0),
    FLEX_START(1),
    CENTER(2),
    FLEX_END(3),
    STRETCH(4),
    BASELINE(5),
    SPACE_BETWEEN(6),
    SPACE_AROUND(7),
    SPACE_EVENLY(8);

    private final int mIntValue;

    a6h(int i) {
        this.mIntValue = i;
    }

    public final int a() {
        return this.mIntValue;
    }
}
