package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum a92 {
    IMMEDIATE(0),
    ON_NEXT_RESTART(1),
    ON_NEXT_RESUME(2),
    ON_NEXT_SUSPEND(3);

    private final int value;

    a92(int i) {
        this.value = i;
    }

    public final int a() {
        return this.value;
    }
}
