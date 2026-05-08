package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class h68 {
    public static final a a;
    public static final bw4 b;
    public static final h68 c;
    public static final h68 d;
    public static final /* synthetic */ h68[] e;
    public static final /* synthetic */ wv4 f;
    private final String rawValue;

    public static final class a {
    }

    static {
        h68 h68Var = new h68("POSITIVE", 0, "POSITIVE");
        c = h68Var;
        h68 h68Var2 = new h68("NEGATIVE", 1, "NEGATIVE");
        h68 h68Var3 = new h68("UNKNOWN__", 2, "UNKNOWN__");
        d = h68Var3;
        h68[] h68VarArr = {h68Var, h68Var2, h68Var3};
        e = h68VarArr;
        f = new wv4(h68VarArr);
        a = new a();
        b = new bw4("JobSeekerProfileStructuredDataSentiment", u63.a0("POSITIVE", "NEGATIVE"));
    }

    public h68(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static h68 valueOf(String str) {
        return (h68) Enum.valueOf(h68.class, str);
    }

    public static h68[] values() {
        return (h68[]) e.clone();
    }

    public final String a() {
        return this.rawValue;
    }
}
