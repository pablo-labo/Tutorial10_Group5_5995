package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum z63 {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_CREDENTIAL_TYPE("UNKNOWN_CREDENTIAL_TYPE"),
    /* JADX INFO: Fake field, exist only in values array */
    GCM("GCM"),
    /* JADX INFO: Fake field, exist only in values array */
    APNS("APNS"),
    FIREBASE("FIREBASE"),
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN__("UNKNOWN__");

    private final String rawValue;

    public static final class a {
    }

    static {
        new bw4("CredentialType", u63.a0("UNKNOWN_CREDENTIAL_TYPE", "GCM", "APNS", "FIREBASE"));
    }

    z63(String str) {
        this.rawValue = str;
    }

    public final String a() {
        return this.rawValue;
    }
}
