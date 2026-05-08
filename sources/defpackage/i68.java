package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class i68 {
    public static final a a;
    public static final bw4 b;
    public static final i68 c;
    public static final i68 d;
    public static final /* synthetic */ i68[] e;
    public static final /* synthetic */ wv4 f;
    private final String rawValue;

    public static final class a {
    }

    static {
        i68 i68Var = new i68("POSITIVE", 0, "POSITIVE");
        c = i68Var;
        i68 i68Var2 = new i68("NEGATIVE", 1, "NEGATIVE");
        i68 i68Var3 = new i68("UNKNOWN__", 2, "UNKNOWN__");
        d = i68Var3;
        i68[] i68VarArr = {i68Var, i68Var2, i68Var3};
        e = i68VarArr;
        f = new wv4(i68VarArr);
        a = new a();
        b = new bw4("JobSeekerProfileStructuredDataSentiment", u63.a0("POSITIVE", "NEGATIVE"));
    }

    public i68(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static i68 valueOf(String str) {
        return (i68) Enum.valueOf(i68.class, str);
    }

    public static i68[] values() {
        return (i68[]) e.clone();
    }

    public final String a() {
        return this.rawValue;
    }
}
