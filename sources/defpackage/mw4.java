package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum mw4 {
    ERROR_CLASS("<Error class: %s>"),
    ERROR_FUNCTION("<Error function>"),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_SCOPE("<Error scope>"),
    ERROR_MODULE("<Error module>"),
    ERROR_PROPERTY("<Error property>"),
    ERROR_TYPE("[Error type: %s]"),
    /* JADX INFO: Fake field, exist only in values array */
    PARENT_OF_ERROR_SCOPE("<Fake parent for error lexical scope>");

    private final String debugText;

    mw4(String str) {
        this.debugText = str;
    }

    public final String a() {
        return this.debugText;
    }
}
