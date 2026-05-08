package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class j48 {
    public static final a a;
    public static final j48 b;
    public static final /* synthetic */ j48[] c;
    public static final /* synthetic */ wv4 d;
    private final String rawValue;

    public static final class a {
    }

    static {
        j48 j48Var = new j48("PUBLIC", 0, "PUBLIC");
        j48 j48Var2 = new j48("HIDDEN", 1, "HIDDEN");
        j48 j48Var3 = new j48("DELETED", 2, "DELETED");
        j48 j48Var4 = new j48("UNKNOWN__", 3, "UNKNOWN__");
        b = j48Var4;
        j48[] j48VarArr = {j48Var, j48Var2, j48Var3, j48Var4};
        c = j48VarArr;
        d = new wv4(j48VarArr);
        a = new a();
        new bw4("JobSeekerProfileResumeState", u63.a0("PUBLIC", "HIDDEN", "DELETED"));
    }

    public j48(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static j48 valueOf(String str) {
        return (j48) Enum.valueOf(j48.class, str);
    }

    public static j48[] values() {
        return (j48[]) c.clone();
    }

    public final String a() {
        return this.rawValue;
    }
}
