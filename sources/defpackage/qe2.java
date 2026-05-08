package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class qe2 {
    public static final a a;
    public static final qe2 b;
    public static final /* synthetic */ qe2[] c;
    public static final /* synthetic */ wv4 d;
    private final String rawValue;

    public static final class a {
    }

    static {
        qe2 qe2Var = new qe2("REQUIRED", 0, "REQUIRED");
        qe2 qe2Var2 = new qe2("OPTIONAL", 1, "OPTIONAL");
        qe2 qe2Var3 = new qe2("HIDDEN", 2, "HIDDEN");
        qe2 qe2Var4 = new qe2("UNKNOWN__", 3, "UNKNOWN__");
        b = qe2Var4;
        qe2[] qe2VarArr = {qe2Var, qe2Var2, qe2Var3, qe2Var4};
        c = qe2VarArr;
        d = new wv4(qe2VarArr);
        a = new a();
        new bw4("CompleteButtonParametersFieldRequirementType", u63.a0("REQUIRED", "OPTIONAL", "HIDDEN"));
    }

    public qe2(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static qe2 valueOf(String str) {
        return (qe2) Enum.valueOf(qe2.class, str);
    }

    public static qe2[] values() {
        return (qe2[]) c.clone();
    }

    public final String a() {
        return this.rawValue;
    }
}
