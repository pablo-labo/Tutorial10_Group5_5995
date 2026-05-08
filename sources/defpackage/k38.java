package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class k38 {
    public static final /* synthetic */ k38[] V;
    public static final /* synthetic */ wv4 W;
    public static final a a;
    public static final bw4 b;
    public static final k38 c;
    public static final k38 d;
    public static final k38 e;
    public static final k38 f;
    private final String rawValue;

    public static final class a {
    }

    static {
        k38 k38Var = new k38("ACCOUNTING_LICENSE", 0, "ACCOUNTING_LICENSE");
        c = k38Var;
        k38 k38Var2 = new k38("DRIVERS_LICENSE", 1, "DRIVERS_LICENSE");
        d = k38Var2;
        k38 k38Var3 = new k38("NURSES_LICENSE", 2, "NURSES_LICENSE");
        e = k38Var3;
        k38 k38Var4 = new k38("UNKNOWN", 3, "UNKNOWN");
        k38 k38Var5 = new k38("UNKNOWN__", 4, "UNKNOWN__");
        f = k38Var5;
        k38[] k38VarArr = {k38Var, k38Var2, k38Var3, k38Var4, k38Var5};
        V = k38VarArr;
        W = new wv4(k38VarArr);
        a = new a();
        b = new bw4("JobSeekerProfileLicenseType", u63.a0("ACCOUNTING_LICENSE", "DRIVERS_LICENSE", "NURSES_LICENSE", "UNKNOWN"));
    }

    public k38(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static k38 valueOf(String str) {
        return (k38) Enum.valueOf(k38.class, str);
    }

    public static k38[] values() {
        return (k38[]) V.clone();
    }

    public final String a() {
        return this.rawValue;
    }
}
