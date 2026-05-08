package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum o8b {
    GRANTED("granted"),
    UNDETERMINED("undetermined"),
    DENIED("denied");

    private final String status;

    o8b(String str) {
        this.status = str;
    }

    public final String a() {
        return this.status;
    }
}
