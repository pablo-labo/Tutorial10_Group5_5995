package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum sig {
    HOME("FIND_JOBS"),
    MY_JOBS("MY_JOBS"),
    ACE("ACE"),
    MESSAGES("MESSAGES"),
    PROFILE("PROFILE"),
    NOTIFICATIONS("NOTIFICATIONS");

    private final String identifier;

    sig(String str) {
        this.identifier = str;
    }

    public final String a() {
        return this.identifier;
    }
}
