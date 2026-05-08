package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum nyf {
    IN("in"),
    OUT("out"),
    INV("");

    private final String presentation;

    nyf(String str) {
        this.presentation = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.presentation;
    }
}
