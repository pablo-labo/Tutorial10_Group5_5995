package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum na5 {
    DEX_FILES(0),
    /* JADX INFO: Fake field, exist only in values array */
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    /* JADX INFO: Fake field, exist only in values array */
    AGGREGATION_COUNT(4);

    private final long mValue;

    na5(long j) {
        this.mValue = j;
    }

    public final long a() {
        return this.mValue;
    }
}
