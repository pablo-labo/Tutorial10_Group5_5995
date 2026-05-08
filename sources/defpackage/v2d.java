package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum v2d {
    IGNORE("ignore"),
    WARN("warn"),
    STRICT("strict");

    private final String description;

    v2d(String str) {
        this.description = str;
    }

    public final String a() {
        return this.description;
    }
}
