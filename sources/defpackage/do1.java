package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum do1 {
    Single(1),
    /* JADX INFO: Fake field, exist only in values array */
    SmallGroup(10),
    LargeGroup(25);

    private final int code;

    do1(int i) {
        this.code = i;
    }

    public final int a() {
        return this.code;
    }
}
