package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum j39 {
    OFF(0),
    ERROR(1),
    /* JADX INFO: Fake field, exist only in values array */
    DEBUG(2),
    /* JADX INFO: Fake field, exist only in values array */
    VERBOSE(3);

    private final int level;

    j39(int i) {
        this.level = i;
    }

    public final int a() {
        return this.level;
    }
}
