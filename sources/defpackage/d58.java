package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class d58 {
    public static final a a;
    public static final d58 b;
    public static final d58 c;
    public static final /* synthetic */ d58[] d;
    public static final /* synthetic */ wv4 e;
    private final String rawValue;

    public static final class a {
    }

    static {
        d58 d58Var = new d58("PROFILE", 0, "PROFILE");
        b = d58Var;
        d58 d58Var2 = new d58("SCREENER_QUESTION", 1, "SCREENER_QUESTION");
        d58 d58Var3 = new d58("UNKNOWN__", 2, "UNKNOWN__");
        c = d58Var3;
        d58[] d58VarArr = {d58Var, d58Var2, d58Var3};
        d = d58VarArr;
        e = new wv4(d58VarArr);
        a = new a();
        new bw4("JobSeekerProfileStructuredDataFactSourceEnum", u63.a0("PROFILE", "SCREENER_QUESTION"));
    }

    public d58(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static d58 valueOf(String str) {
        return (d58) Enum.valueOf(d58.class, str);
    }

    public static d58[] values() {
        return (d58[]) d.clone();
    }

    public final String a() {
        return this.rawValue;
    }
}
