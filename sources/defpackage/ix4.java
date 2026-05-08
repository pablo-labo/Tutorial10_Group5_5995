package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum ix4 {
    JS("JS"),
    NATIVE("Native");

    private final String displayName;

    ix4(String str) {
        this.displayName = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.displayName;
    }
}
