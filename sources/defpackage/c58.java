package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class c58 {
    public static final a a;
    public static final bw4 b;
    public static final c58 c;
    public static final c58 d;
    public static final /* synthetic */ c58[] e;
    public static final /* synthetic */ wv4 f;
    private final String rawValue;

    public static final class a {
    }

    static {
        c58 c58Var = new c58("PROFILE", 0, "PROFILE");
        c = c58Var;
        c58 c58Var2 = new c58("SCREENER_QUESTION", 1, "SCREENER_QUESTION");
        c58 c58Var3 = new c58("UNKNOWN__", 2, "UNKNOWN__");
        d = c58Var3;
        c58[] c58VarArr = {c58Var, c58Var2, c58Var3};
        e = c58VarArr;
        f = new wv4(c58VarArr);
        a = new a();
        b = new bw4("JobSeekerProfileStructuredDataFactSourceEnum", u63.a0("PROFILE", "SCREENER_QUESTION"));
    }

    public c58(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static c58 valueOf(String str) {
        return (c58) Enum.valueOf(c58.class, str);
    }

    public static c58[] values() {
        return (c58[]) e.clone();
    }

    public final String a() {
        return this.rawValue;
    }
}
