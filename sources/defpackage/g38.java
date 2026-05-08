package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class g38 {
    public static final a a;
    public static final g38 b;
    public static final /* synthetic */ g38[] c;
    public static final /* synthetic */ wv4 d;
    private final String rawValue;

    public static final class a {
    }

    static {
        g38 g38Var = new g38("YES", 0, "YES");
        g38 g38Var2 = new g38("NO", 1, "NO");
        g38 g38Var3 = new g38("DEPENDS_ON_OPPORTUNITY", 2, "DEPENDS_ON_OPPORTUNITY");
        g38 g38Var4 = new g38("UNKNOWN__", 3, "UNKNOWN__");
        b = g38Var4;
        g38[] g38VarArr = {g38Var, g38Var2, g38Var3, g38Var4};
        c = g38VarArr;
        d = new wv4(g38VarArr);
        a = new a();
        new bw4("JobSeekerProfileInternationalWillingToTravel", u63.a0("YES", "NO", "DEPENDS_ON_OPPORTUNITY"));
    }

    public g38(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static g38 valueOf(String str) {
        return (g38) Enum.valueOf(g38.class, str);
    }

    public static g38[] values() {
        return (g38[]) c.clone();
    }

    public final String a() {
        return this.rawValue;
    }
}
