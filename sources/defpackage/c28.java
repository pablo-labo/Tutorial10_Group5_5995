package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class c28 {
    public static final a a;
    public static final c28 b;
    public static final /* synthetic */ c28[] c;
    public static final /* synthetic */ wv4 d;
    private final String rawValue;

    public static final class a {
    }

    static {
        c28 c28Var = new c28("FILIPINO", 0, "FILIPINO");
        c28 c28Var2 = new c28("NON_FILIPINO", 1, "NON_FILIPINO");
        c28 c28Var3 = new c28("CITIZEN", 2, "CITIZEN");
        c28 c28Var4 = new c28("NOT_CITIZEN_WITH_WORK_PERMIT", 3, "NOT_CITIZEN_WITH_WORK_PERMIT");
        c28 c28Var5 = new c28("NOT_CITIZEN_NO_WORK_PERMIT", 4, "NOT_CITIZEN_NO_WORK_PERMIT");
        c28 c28Var6 = new c28("SG_NATIONAL", 5, "SG_NATIONAL");
        c28 c28Var7 = new c28("SG_PERMANENT_RESIDENT", 6, "SG_PERMANENT_RESIDENT");
        c28 c28Var8 = new c28("NONE_OF_THE_ABOVE", 7, "NONE_OF_THE_ABOVE");
        c28 c28Var9 = new c28("UNKNOWN__", 8, "UNKNOWN__");
        b = c28Var9;
        c28[] c28VarArr = {c28Var, c28Var2, c28Var3, c28Var4, c28Var5, c28Var6, c28Var7, c28Var8, c28Var9};
        c = c28VarArr;
        d = new wv4(c28VarArr);
        a = new a();
        new bw4("JobSeekerProfileInternationalCitizenship", u63.a0("FILIPINO", "NON_FILIPINO", "CITIZEN", "NOT_CITIZEN_WITH_WORK_PERMIT", "NOT_CITIZEN_NO_WORK_PERMIT", "SG_NATIONAL", "SG_PERMANENT_RESIDENT", "NONE_OF_THE_ABOVE"));
    }

    public c28(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static c28 valueOf(String str) {
        return (c28) Enum.valueOf(c28.class, str);
    }

    public static c28[] values() {
        return (c28[]) c.clone();
    }

    public final String a() {
        return this.rawValue;
    }
}
