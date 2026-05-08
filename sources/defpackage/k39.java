package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum k39 {
    Warn("WARN"),
    Error("ERROR");

    private final String level;

    k39(String str) {
        this.level = str;
    }

    public final String a() {
        return this.level;
    }
}
