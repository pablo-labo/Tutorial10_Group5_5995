package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum q6d {
    INITIALIZED(0),
    STARTED(1),
    RESPONSE_RECEIVED(2),
    BODY_COMPLETED(3),
    BODY_STREAMING_STARTED(4),
    BODY_STREAMING_CANCELED(5),
    ERROR_RECEIVED(6);

    private final int intValue;

    q6d(int i) {
        this.intValue = i;
    }

    public final int a() {
        return this.intValue;
    }
}
