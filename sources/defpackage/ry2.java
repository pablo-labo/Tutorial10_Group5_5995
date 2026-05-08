package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum ry2 {
    HQM_DRADIS("HQM_DRADIS"),
    /* JADX INFO: Fake field, exist only in values array */
    RESUME("RESUME"),
    /* JADX INFO: Fake field, exist only in values array */
    INQUIRY("INQUIRY"),
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN__("UNKNOWN__");

    private final String rawValue;

    public static final class a {
    }

    static {
        new bw4("ConversationSelectionContext", u63.a0("HQM_DRADIS", "RESUME", "INQUIRY"));
    }

    ry2(String str) {
        this.rawValue = str;
    }

    public final String a() {
        return this.rawValue;
    }
}
