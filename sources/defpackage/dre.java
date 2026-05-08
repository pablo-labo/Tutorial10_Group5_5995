package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum dre {
    /* JADX INFO: Fake field, exist only in values array */
    CR("\r"),
    CRLF("\r\n"),
    LF("\n");

    private final String lineSeparator;

    dre(String str) {
        this.lineSeparator = str;
    }
}
