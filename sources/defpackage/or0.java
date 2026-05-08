package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum or0 {
    INDEED("INDEED"),
    /* JADX INFO: Fake field, exist only in values array */
    THIRD_PARTY("THIRD_PARTY"),
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN__("UNKNOWN__");

    private final String rawValue;

    public static final class a {
    }

    static {
        new bw4("ApplyDomainProperty", u63.a0("INDEED", "THIRD_PARTY"));
    }

    or0(String str) {
        this.rawValue = str;
    }

    public final String a() {
        return this.rawValue;
    }
}
