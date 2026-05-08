package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum kea {
    JOBSEEKER_MOBILE_APP("JOBSEEKER_MOBILE_APP"),
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN__("UNKNOWN__");

    private final String rawValue;

    public static final class a {
    }

    static {
        new bw4("NavigationMenuVariant", u63.Z("JOBSEEKER_MOBILE_APP"));
    }

    kea(String str) {
        this.rawValue = str;
    }

    public final String a() {
        return this.rawValue;
    }
}
