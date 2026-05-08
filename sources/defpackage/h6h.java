package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum h6h {
    /* JADX INFO: Fake field, exist only in values array */
    NONE(0),
    /* JADX INFO: Fake field, exist only in values array */
    STRETCH_FLEX_BASIS(1),
    /* JADX INFO: Fake field, exist only in values array */
    ABSOLUTE_POSITION_WITHOUT_INSETS_EXCLUDES_PADDING(2),
    /* JADX INFO: Fake field, exist only in values array */
    ABSOLUTE_PERCENT_AGAINST_INNER_SIZE(4),
    ALL(Integer.MAX_VALUE),
    /* JADX INFO: Fake field, exist only in values array */
    CLASSIC(2147483646);

    private final int mIntValue;

    h6h(int i) {
        this.mIntValue = i;
    }

    public final int a() {
        return this.mIntValue;
    }
}
