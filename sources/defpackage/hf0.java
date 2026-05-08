package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum hf0 {
    /* JADX INFO: Fake field, exist only in values array */
    ALL(null),
    FIELD(null),
    FILE(null),
    PROPERTY(null),
    PROPERTY_GETTER("get"),
    PROPERTY_SETTER("set"),
    RECEIVER(null),
    CONSTRUCTOR_PARAMETER("param"),
    SETTER_PARAMETER("setparam"),
    PROPERTY_DELEGATE_FIELD("delegate");

    private final String renderName;

    hf0(String str) {
        this.renderName = str == null ? ie7.A(name()) : str;
    }

    public final String a() {
        return this.renderName;
    }
}
