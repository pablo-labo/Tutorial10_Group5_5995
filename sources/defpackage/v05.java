package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum v05 implements yma {
    /* JADX INFO: Fake field, exist only in values array */
    EVENT_TYPE_UNKNOWN(0),
    SESSION_START(1);

    private final int number;

    v05(int i) {
        this.number = i;
    }

    @Override // defpackage.yma
    public final int getNumber() {
        return this.number;
    }
}
