package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum fe3 implements yma {
    /* JADX INFO: Fake field, exist only in values array */
    COLLECTION_UNKNOWN(0),
    COLLECTION_SDK_NOT_INSTALLED(1),
    COLLECTION_ENABLED(2),
    COLLECTION_DISABLED(3),
    /* JADX INFO: Fake field, exist only in values array */
    COLLECTION_DISABLED_REMOTE(4),
    /* JADX INFO: Fake field, exist only in values array */
    COLLECTION_SAMPLED(5);

    private final int number;

    fe3(int i) {
        this.number = i;
    }

    @Override // defpackage.yma
    public final int getNumber() {
        return this.number;
    }
}
