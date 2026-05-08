package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum q6h {
    /* JADX INFO: Fake field, exist only in values array */
    STATIC(0),
    RELATIVE(1),
    ABSOLUTE(2);

    private final int mIntValue;

    q6h(int i) {
        this.mIntValue = i;
    }

    public final int a() {
        return this.mIntValue;
    }
}
