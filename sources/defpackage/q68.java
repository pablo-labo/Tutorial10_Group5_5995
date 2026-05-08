package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class q68 {
    public static final a a;
    public static final bw4 b;
    public static final q68 c;
    public static final q68 d;
    public static final /* synthetic */ q68[] e;
    public static final /* synthetic */ wv4 f;
    private final String rawValue;

    public static final class a {
    }

    static {
        q68 q68Var = new q68("Years", 0, "Years");
        c = q68Var;
        q68 q68Var2 = new q68("Months", 1, "Months");
        q68 q68Var3 = new q68("Weeks", 2, "Weeks");
        q68 q68Var4 = new q68("Days", 3, "Days");
        q68 q68Var5 = new q68("UNKNOWN__", 4, "UNKNOWN__");
        d = q68Var5;
        q68[] q68VarArr = {q68Var, q68Var2, q68Var3, q68Var4, q68Var5};
        e = q68VarArr;
        f = new wv4(q68VarArr);
        a = new a();
        b = new bw4("JobSeekerProfileTypeUnit", u63.a0("Years", "Months", "Weeks", "Days"));
    }

    public q68(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static q68 valueOf(String str) {
        return (q68) Enum.valueOf(q68.class, str);
    }

    public static q68[] values() {
        return (q68[]) e.clone();
    }

    public final String a() {
        return this.rawValue;
    }
}
