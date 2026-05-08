package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum e77 {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_INDEED_APP("UNKNOWN_INDEED_APP"),
    JOBSEARCH("JOBSEARCH"),
    /* JADX INFO: Fake field, exist only in values array */
    EMPLOYER("EMPLOYER"),
    /* JADX INFO: Fake field, exist only in values array */
    JOBSPOTTER("JOBSPOTTER"),
    /* JADX INFO: Fake field, exist only in values array */
    WEB_DEFAULT("WEB_DEFAULT"),
    /* JADX INFO: Fake field, exist only in values array */
    HQM_JOBSEARCH("HQM_JOBSEARCH"),
    /* JADX INFO: Fake field, exist only in values array */
    HQM_EMPLOYER("HQM_EMPLOYER"),
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN__("UNKNOWN__");

    private final String rawValue;

    public static final class a {
    }

    static {
        new bw4("IndeedApp", u63.a0("UNKNOWN_INDEED_APP", "JOBSEARCH", "EMPLOYER", "JOBSPOTTER", "WEB_DEFAULT", "HQM_JOBSEARCH", "HQM_EMPLOYER"));
    }

    e77(String str) {
        this.rawValue = str;
    }

    public final String a() {
        return this.rawValue;
    }
}
