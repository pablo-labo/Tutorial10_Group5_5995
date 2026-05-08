package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class e38 {
    public static final a a;
    public static final e38 b;
    public static final /* synthetic */ e38[] c;
    public static final /* synthetic */ wv4 d;
    private final String rawValue;

    public static final class a {
    }

    static {
        e38 e38Var = new e38("NOT_APPLICABLE", 0, "NOT_APPLICABLE");
        e38 e38Var2 = new e38("APPLICABLE", 1, "APPLICABLE");
        e38 e38Var3 = new e38("UNKNOWN__", 2, "UNKNOWN__");
        b = e38Var3;
        e38[] e38VarArr = {e38Var, e38Var2, e38Var3};
        c = e38VarArr;
        d = new wv4(e38VarArr);
        a = new a();
        new bw4("JobSeekerProfileInternationalVeteranStatus", u63.a0("NOT_APPLICABLE", "APPLICABLE"));
    }

    public e38(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static e38 valueOf(String str) {
        return (e38) Enum.valueOf(e38.class, str);
    }

    public static e38[] values() {
        return (e38[]) c.clone();
    }

    public final String a() {
        return this.rawValue;
    }
}
