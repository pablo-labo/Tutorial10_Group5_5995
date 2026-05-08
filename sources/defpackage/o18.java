package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class o18 {
    public static final /* synthetic */ o18[] V;
    public static final /* synthetic */ wv4 W;
    public static final a a;
    public static final bw4 b;
    public static final o18 c;
    public static final o18 d;
    public static final o18 e;
    public static final o18 f;
    private final String rawValue;

    public static final class a {
    }

    static {
        o18 o18Var = new o18("UNKNOWN", 0, "UNKNOWN");
        c = o18Var;
        o18 o18Var2 = new o18("INELIGIBLE", 1, "INELIGIBLE");
        o18 o18Var3 = new o18("ELIGIBLE", 2, "ELIGIBLE");
        d = o18Var3;
        o18 o18Var4 = new o18("WITH_SPONSORSHIP", 3, "WITH_SPONSORSHIP");
        e = o18Var4;
        o18 o18Var5 = new o18("UNKNOWN__", 4, "UNKNOWN__");
        f = o18Var5;
        o18[] o18VarArr = {o18Var, o18Var2, o18Var3, o18Var4, o18Var5};
        V = o18VarArr;
        W = new wv4(o18VarArr);
        a = new a();
        b = new bw4("JobSeekerProfileEmploymentEligibility", u63.a0("UNKNOWN", "INELIGIBLE", "ELIGIBLE", "WITH_SPONSORSHIP"));
    }

    public o18(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static o18 valueOf(String str) {
        return (o18) Enum.valueOf(o18.class, str);
    }

    public static o18[] values() {
        return (o18[]) V.clone();
    }

    public final String a() {
        return this.rawValue;
    }
}
