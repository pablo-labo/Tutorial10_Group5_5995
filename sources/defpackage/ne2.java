package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum ne2 {
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

    ne2(String str) {
        this.rawValue = str;
    }

    public final String a() {
        return this.rawValue;
    }
}
