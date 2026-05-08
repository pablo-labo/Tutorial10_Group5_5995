package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum aoe {
    OPT_OUT("OPT_OUT"),
    OPT_IN("OPT_IN"),
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN__("UNKNOWN__");

    private final String rawValue;

    public static final class a {
    }

    static {
        new bw4("SourcingElectionInput", u63.a0("OPT_OUT", "OPT_IN"));
    }

    aoe(String str) {
        this.rawValue = str;
    }

    public final String a() {
        return this.rawValue;
    }
}
