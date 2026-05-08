package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum ut1 {
    a(true, true),
    /* JADX INFO: Fake field, exist only in values array */
    EF15(true, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF23(false, true),
    /* JADX INFO: Fake field, exist only in values array */
    EF31(false, false);

    private final boolean readEnabled;
    private final boolean writeEnabled;

    ut1(boolean z, boolean z2) {
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
