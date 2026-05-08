package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum m1g {
    /* JADX INFO: Fake field, exist only in values array */
    LastVisit("LV"),
    /* JADX INFO: Fake field, exist only in values array */
    RecentSearch("RQ"),
    /* JADX INFO: Fake field, exist only in values array */
    Referral("RF");

    private final String key;

    m1g(String str) {
        this.key = str;
    }

    public final String a() {
        return this.key;
    }
}
