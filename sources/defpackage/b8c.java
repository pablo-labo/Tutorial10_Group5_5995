package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum b8c {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_TYPE("UNKNOWN_TYPE"),
    MOBILE("MOBILE"),
    TABLET("TABLET"),
    /* JADX INFO: Fake field, exist only in values array */
    COMPUTER("COMPUTER"),
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN__("UNKNOWN__");

    private final String rawValue;

    public static final class a {
    }

    static {
        new bw4("PushCredentialsDeviceType", u63.a0("UNKNOWN_TYPE", "MOBILE", "TABLET", "COMPUTER"));
    }

    b8c(String str) {
        this.rawValue = str;
    }

    public final String a() {
        return this.rawValue;
    }
}
