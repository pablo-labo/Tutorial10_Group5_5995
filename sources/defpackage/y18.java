package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class y18 {
    public static final a a;
    public static final bw4 b;
    public static final y18 c;
    public static final y18 d;
    public static final /* synthetic */ y18[] e;
    public static final /* synthetic */ wv4 f;
    private final String rawValue;

    public static final class a {
    }

    static {
        y18 y18Var = new y18("IS_FRAUD", 0, "IS_FRAUD");
        c = y18Var;
        y18 y18Var2 = new y18("IS_LEGIT", 1, "IS_LEGIT");
        y18 y18Var3 = new y18("UNKNOWN__", 2, "UNKNOWN__");
        d = y18Var3;
        y18[] y18VarArr = {y18Var, y18Var2, y18Var3};
        e = y18VarArr;
        f = new wv4(y18VarArr);
        a = new a();
        b = new bw4("JobSeekerProfileFraudMetadataState", u63.a0("IS_FRAUD", "IS_LEGIT"));
    }

    public y18(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static y18 valueOf(String str) {
        return (y18) Enum.valueOf(y18.class, str);
    }

    public static y18[] values() {
        return (y18[]) e.clone();
    }

    public final String a() {
        return this.rawValue;
    }
}
