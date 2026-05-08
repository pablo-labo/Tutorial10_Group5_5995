package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum gy3 {
    DEVELOPER(1),
    /* JADX INFO: Fake field, exist only in values array */
    USER_SIDELOAD(2),
    /* JADX INFO: Fake field, exist only in values array */
    TEST_DISTRIBUTION(3),
    APP_STORE(4);

    private final int id;

    gy3(int i) {
        this.id = i;
    }

    public final int a() {
        return this.id;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.id);
    }
}
