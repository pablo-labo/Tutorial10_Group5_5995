package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum mu9 {
    IP("IP"),
    COUNTRY_SETTING("COUNTRY_SETTING"),
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN__("UNKNOWN__");

    private final String rawValue;

    public static final class a {
    }

    static {
        new bw4("MobileAppCountrySelectionMethod", u63.a0("IP", "COUNTRY_SETTING"));
    }

    mu9(String str) {
        this.rawValue = str;
    }

    public final String a() {
        return this.rawValue;
    }
}
