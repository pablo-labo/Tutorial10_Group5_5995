package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class w28 {
    public static final a a;
    public static final w28 b;
    public static final /* synthetic */ w28[] c;
    public static final /* synthetic */ wv4 d;
    private final String rawValue;

    public static final class a {
    }

    static {
        w28 w28Var = new w28("NO_EXPERIENCE", 0, "NO_EXPERIENCE");
        w28 w28Var2 = new w28("STUDENT", 1, "STUDENT");
        w28 w28Var3 = new w28("NEW_GRAD", 2, "NEW_GRAD");
        w28 w28Var4 = new w28("EXPERIENCED", 3, "EXPERIENCED");
        w28 w28Var5 = new w28("EXECUTIVE", 4, "EXECUTIVE");
        w28 w28Var6 = new w28("UNKNOWN__", 5, "UNKNOWN__");
        b = w28Var6;
        w28[] w28VarArr = {w28Var, w28Var2, w28Var3, w28Var4, w28Var5, w28Var6};
        c = w28VarArr;
        d = new wv4(w28VarArr);
        a = new a();
        new bw4("JobSeekerProfileInternationalHighestCareerLevel", u63.a0("NO_EXPERIENCE", "STUDENT", "NEW_GRAD", "EXPERIENCED", "EXECUTIVE"));
    }

    public w28(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static w28 valueOf(String str) {
        return (w28) Enum.valueOf(w28.class, str);
    }

    public static w28[] values() {
        return (w28[]) c.clone();
    }

    public final String a() {
        return this.rawValue;
    }
}
