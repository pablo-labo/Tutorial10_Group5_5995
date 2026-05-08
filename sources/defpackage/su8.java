package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum su8 {
    /* JADX INFO: Fake field, exist only in values array */
    ERROR(40, "ERROR"),
    WARN(30, "WARN"),
    /* JADX INFO: Fake field, exist only in values array */
    INFO(20, "INFO"),
    DEBUG(10, "DEBUG"),
    /* JADX INFO: Fake field, exist only in values array */
    TRACE(0, "TRACE");

    private final int levelInt;
    private final String levelStr;

    su8(int i, String str) {
        this.levelInt = i;
        this.levelStr = str;
    }

    public final int a() {
        return this.levelInt;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.levelStr;
    }
}
