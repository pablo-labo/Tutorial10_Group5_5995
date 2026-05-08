package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum yab {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_PLATFORM("UNKNOWN_PLATFORM"),
    /* JADX INFO: Fake field, exist only in values array */
    IOS("IOS"),
    ANDROID("ANDROID"),
    /* JADX INFO: Fake field, exist only in values array */
    WEB("WEB"),
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN__("UNKNOWN__");

    private final String rawValue;

    public static final class a {
    }

    static {
        new bw4("Platform", u63.a0("UNKNOWN_PLATFORM", "IOS", "ANDROID", "WEB"));
    }

    yab(String str) {
        this.rawValue = str;
    }

    public final String a() {
        return this.rawValue;
    }
}
