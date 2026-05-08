package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum z29 implements yma {
    /* JADX INFO: Fake field, exist only in values array */
    LOG_ENVIRONMENT_UNKNOWN(0),
    /* JADX INFO: Fake field, exist only in values array */
    LOG_ENVIRONMENT_AUTOPUSH(1),
    /* JADX INFO: Fake field, exist only in values array */
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);

    private final int number;

    z29(int i) {
        this.number = i;
    }

    @Override // defpackage.yma
    public final int getNumber() {
        return this.number;
    }
}
