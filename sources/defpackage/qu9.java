package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum qu9 {
    /* JADX INFO: Fake field, exist only in values array */
    IOS("IOS"),
    ANDROID("ANDROID"),
    /* JADX INFO: Fake field, exist only in values array */
    WINDOWS("WINDOWS"),
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN__("UNKNOWN__");

    private final String rawValue;

    public static final class a {
    }

    static {
        new bw4("MobileAppPlatform", u63.a0("IOS", "ANDROID", "WINDOWS"));
    }

    qu9(String str) {
        this.rawValue = str;
    }

    public final String a() {
        return this.rawValue;
    }
}
