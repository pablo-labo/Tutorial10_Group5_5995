package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum oud {
    VISIBLE("visible"),
    HIDDEN("hidden");

    private final String status;

    oud(String str) {
        this.status = str;
    }

    public final String a() {
        return this.status;
    }
}
