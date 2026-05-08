package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum vt1 {
    a(true, true),
    /* JADX INFO: Fake field, exist only in values array */
    EF2(true, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF4(false, true),
    b(false, false);

    private final boolean readEnabled;
    private final boolean writeEnabled;

    vt1(boolean z, boolean z2) {
        this.readEnabled = z;
        this.writeEnabled = z2;
    }

    public final boolean a() {
        return this.readEnabled;
    }

    public final boolean c() {
        return this.writeEnabled;
    }
}
