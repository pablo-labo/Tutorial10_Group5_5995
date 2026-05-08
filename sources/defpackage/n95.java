package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum n95 {
    JSON(".json"),
    ZIP(".zip"),
    /* JADX INFO: Fake field, exist only in values array */
    GZIP(".gz");

    public final String extension;

    n95(String str) {
        this.extension = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.extension;
    }
}
