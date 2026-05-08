package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum vie {
    /* JADX INFO: Fake field, exist only in values array */
    Snappy(500),
    /* JADX INFO: Fake field, exist only in values array */
    Quick(1000),
    Normal(1500),
    /* JADX INFO: Fake field, exist only in values array */
    Slow(2000),
    /* JADX INFO: Fake field, exist only in values array */
    Slowest(2500);

    private final int value;

    vie(int i) {
        this.value = i;
    }

    public final int a() {
        return this.value;
    }
}
