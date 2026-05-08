package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class qy2 {
    public static final a a;
    public static final bw4 b;
    public static final qy2 c;
    public static final qy2 d;
    public static final /* synthetic */ qy2[] e;
    public static final /* synthetic */ wv4 f;
    private final String rawValue;

    public static final class a {
    }

    static {
        qy2 qy2Var = new qy2("APPLICATION_KEY", 0, "APPLICATION_KEY");
        qy2 qy2Var2 = new qy2("CANDIDATE_KEY", 1, "CANDIDATE_KEY");
        qy2 qy2Var3 = new qy2("JOB_KEY", 2, "JOB_KEY");
        qy2 qy2Var4 = new qy2("JOB_SEEKER_KEY", 3, "JOB_SEEKER_KEY");
        qy2 qy2Var5 = new qy2("ADVERTISER_KEY", 4, "ADVERTISER_KEY");
        c = qy2Var5;
        qy2 qy2Var6 = new qy2("ADVERTISER_USER_KEY", 5, "ADVERTISER_USER_KEY");
        qy2 qy2Var7 = new qy2("JOB_SEEKER_EMAIL", 6, "JOB_SEEKER_EMAIL");
        qy2 qy2Var8 = new qy2("EMPLOYER_EMAIL", 7, "EMPLOYER_EMAIL");
        qy2 qy2Var9 = new qy2("UNKNOWN__", 8, "UNKNOWN__");
        d = qy2Var9;
        qy2[] qy2VarArr = {qy2Var, qy2Var2, qy2Var3, qy2Var4, qy2Var5, qy2Var6, qy2Var7, qy2Var8, qy2Var9};
        e = qy2VarArr;
        f = new wv4(qy2VarArr);
        a = new a();
        b = new bw4("ConversationScopeKey", u63.a0("APPLICATION_KEY", "CANDIDATE_KEY", "JOB_KEY", "JOB_SEEKER_KEY", "ADVERTISER_KEY", "ADVERTISER_USER_KEY", "JOB_SEEKER_EMAIL", "EMPLOYER_EMAIL"));
    }

    public qy2(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static qy2 valueOf(String str) {
        return (qy2) Enum.valueOf(qy2.class, str);
    }

    public static qy2[] values() {
        return (qy2[]) e.clone();
    }

    public final String a() {
        return this.rawValue;
    }
}
