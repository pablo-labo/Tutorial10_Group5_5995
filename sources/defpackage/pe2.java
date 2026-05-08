package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class pe2 {
    public static final a a;
    public static final pe2 b;
    public static final /* synthetic */ pe2[] c;
    public static final /* synthetic */ wv4 d;
    private final String rawValue;

    public static final class a {
    }

    static {
        pe2 pe2Var = new pe2("REQUIRED", 0, "REQUIRED");
        pe2 pe2Var2 = new pe2("OPTIONAL", 1, "OPTIONAL");
        pe2 pe2Var3 = new pe2("HIDDEN", 2, "HIDDEN");
        pe2 pe2Var4 = new pe2("UNKNOWN__", 3, "UNKNOWN__");
        b = pe2Var4;
        pe2[] pe2VarArr = {pe2Var, pe2Var2, pe2Var3, pe2Var4};
        c = pe2VarArr;
        d = new wv4(pe2VarArr);
        a = new a();
        new bw4("CompleteButtonParametersFieldRequirementType", u63.a0("REQUIRED", "OPTIONAL", "HIDDEN"));
    }

    public pe2(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static pe2 valueOf(String str) {
        return (pe2) Enum.valueOf(pe2.class, str);
    }

    public static pe2[] values() {
        return (pe2[]) c.clone();
    }

    public final String a() {
        return this.rawValue;
    }
}
