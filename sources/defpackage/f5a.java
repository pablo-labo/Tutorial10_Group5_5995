package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class f5a {
    public static final a a;
    public static final /* synthetic */ f5a[] b;
    public static final /* synthetic */ wv4 c;

    public static final class a {
    }

    static {
        f5a[] f5aVarArr = {new f5a("GET_APP_STATUS_JOBS", 0), new f5a("UPDATE_SAVED_JOB", 1), new f5a("DELETE_SAVED_JOB", 2), new f5a("WITHDRAW_APPLICATION", 3), new f5a("GET_INTERVIEWS", 4), new f5a("ACCEPT_INVITATION", 5), new f5a("DECLINE_INVITATION", 6), new f5a("SUBMIT_DECLINE_SURVEY", 7), new f5a("LOG_HOMEPAGE", 8), new f5a("LOG_TAB_MOUNTED", 9), new f5a("LOG_APP_CARD_VIEWED", 10)};
        b = f5aVarArr;
        c = new wv4(f5aVarArr);
        a = new a();
    }

    public f5a() {
        throw null;
    }

    public static f5a valueOf(String str) {
        return (f5a) Enum.valueOf(f5a.class, str);
    }

    public static f5a[] values() {
        return (f5a[]) b.clone();
    }
}
