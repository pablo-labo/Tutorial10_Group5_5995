package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class i28 {
    public static final a a;
    public static final i28 b;
    public static final /* synthetic */ i28[] c;
    public static final /* synthetic */ wv4 d;
    private final String rawValue;

    public static final class a {
    }

    static {
        i28 i28Var = new i28("YES", 0, "YES");
        i28 i28Var2 = new i28("NO", 1, "NO");
        i28 i28Var3 = new i28("EMPLOYMENT_PASS", 2, "EMPLOYMENT_PASS");
        i28 i28Var4 = new i28("CITIZEN", 3, "CITIZEN");
        i28 i28Var5 = new i28("SPONSORSHIP", 4, "SPONSORSHIP");
        i28 i28Var6 = new i28("TRAINING_EMPLOYMENT_PASS", 5, "TRAINING_EMPLOYMENT_PASS");
        i28 i28Var7 = new i28("OTHER", 6, "OTHER");
        i28 i28Var8 = new i28("UNKNOWN__", 7, "UNKNOWN__");
        b = i28Var8;
        i28[] i28VarArr = {i28Var, i28Var2, i28Var3, i28Var4, i28Var5, i28Var6, i28Var7, i28Var8};
        c = i28VarArr;
        d = new wv4(i28VarArr);
        a = new a();
        new bw4("JobSeekerProfileInternationalEmploymentEligibility", u63.a0("YES", "NO", "EMPLOYMENT_PASS", "CITIZEN", "SPONSORSHIP", "TRAINING_EMPLOYMENT_PASS", "OTHER"));
    }

    public i28(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static i28 valueOf(String str) {
        return (i28) Enum.valueOf(i28.class, str);
    }

    public static i28[] values() {
        return (i28[]) c.clone();
    }

    public final String a() {
        return this.rawValue;
    }
}
