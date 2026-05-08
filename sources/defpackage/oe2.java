package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum oe2 {
    INDEED("INDEED"),
    /* JADX INFO: Fake field, exist only in values array */
    THIRD_PARTY("THIRD_PARTY"),
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN__("UNKNOWN__");

    private final String rawValue;

    public static final class a {
    }

    static {
        new bw4("CompleteButtonParametersApplyDomain", u63.a0("INDEED", "THIRD_PARTY"));
    }

    oe2(String str) {
        this.rawValue = str;
    }

    public final String a() {
        return this.rawValue;
    }
}
