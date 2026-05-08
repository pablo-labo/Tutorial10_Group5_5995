package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class o28 {
    public static final a a;
    public static final o28 b;
    public static final /* synthetic */ o28[] c;
    public static final /* synthetic */ wv4 d;
    private final String rawValue;

    public static final class a {
    }

    static {
        o28 o28Var = new o28("APPLICABLE", 0, "APPLICABLE");
        o28 o28Var2 = new o28("NOT_APPLICABLE", 1, "NOT_APPLICABLE");
        o28 o28Var3 = new o28("UNKNOWN__", 2, "UNKNOWN__");
        b = o28Var3;
        o28[] o28VarArr = {o28Var, o28Var2, o28Var3};
        c = o28VarArr;
        d = new wv4(o28VarArr);
        a = new a();
        new bw4("JobSeekerProfileInternationalEmploymentSupportStatus", u63.a0("APPLICABLE", "NOT_APPLICABLE"));
    }

    public o28(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static o28 valueOf(String str) {
        return (o28) Enum.valueOf(o28.class, str);
    }

    public static o28[] values() {
        return (o28[]) c.clone();
    }

    public final String a() {
        return this.rawValue;
    }
}
