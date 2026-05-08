package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class tsb {
    public static final /* synthetic */ tsb[] a = {new tsb("PREFERRED_JOB_TITLES", 0), new tsb("MINIMUM_BASE_PAY", 1), new tsb("RELOCATION", 2), new tsb("REMOTE", 3), new tsb("MAX_COMMUTE_TIME", 4), new tsb("WORK_AREAS", 5)};

    /* JADX INFO: Fake field, exist only in values array */
    tsb EF5;

    public tsb() {
        throw null;
    }

    public static tsb valueOf(String str) {
        return (tsb) Enum.valueOf(tsb.class, str);
    }

    public static tsb[] values() {
        return (tsb[]) a.clone();
    }
}
