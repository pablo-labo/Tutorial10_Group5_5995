package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum zsa {
    JOBSEEKER("JOBSEEKER"),
    EMPLOYER("EMPLOYER"),
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN__("UNKNOWN__");

    private final String rawValue;

    public static final class a {
    }

    static {
        new bw4("OnlineStatusAccountType", u63.a0("JOBSEEKER", "EMPLOYER"));
    }

    zsa(String str) {
        this.rawValue = str;
    }

    public final String a() {
        return this.rawValue;
    }
}
