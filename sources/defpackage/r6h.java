package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum r6h {
    UNDEFINED(0),
    POINT(1),
    PERCENT(2),
    AUTO(3),
    MAX_CONTENT(4),
    FIT_CONTENT(5),
    STRETCH(6);

    private final int mIntValue;

    r6h(int i) {
        this.mIntValue = i;
    }

    public final int a() {
        return this.mIntValue;
    }
}
