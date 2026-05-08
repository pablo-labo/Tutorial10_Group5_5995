package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum ef0 {
    METHOD_RETURN_TYPE("METHOD"),
    VALUE_PARAMETER("PARAMETER"),
    FIELD("FIELD"),
    TYPE_USE("TYPE_USE"),
    TYPE_PARAMETER_BOUNDS("TYPE_USE"),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_PARAMETER("TYPE_PARAMETER");

    private final String javaTarget;

    ef0(String str) {
        this.javaTarget = str;
    }

    public final String a() {
        return this.javaTarget;
    }
}
