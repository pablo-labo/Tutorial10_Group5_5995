package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum c62 {
    CLASS("class"),
    INTERFACE("interface"),
    ENUM_CLASS("enum class"),
    ENUM_ENTRY(null),
    ANNOTATION_CLASS("annotation class"),
    OBJECT("object");

    private final String codeRepresentation;

    c62(String str) {
        this.codeRepresentation = str;
    }

    public final boolean a() {
        return this == OBJECT || this == ENUM_ENTRY;
    }
}
