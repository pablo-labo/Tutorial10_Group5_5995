package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class c38 {
    public static final a a;
    public static final c38 b;
    public static final /* synthetic */ c38[] c;
    public static final /* synthetic */ wv4 d;
    private final String rawValue;

    public static final class a {
    }

    static {
        c38 c38Var = new c38("NOT_APPLICABLE", 0, "NOT_APPLICABLE");
        c38 c38Var2 = new c38("COMPLETED", 1, "COMPLETED");
        c38 c38Var3 = new c38("ONGOING", 2, "ONGOING");
        c38 c38Var4 = new c38("UNKNOWN__", 3, "UNKNOWN__");
        b = c38Var4;
        c38[] c38VarArr = {c38Var, c38Var2, c38Var3, c38Var4};
        c = c38VarArr;
        d = new wv4(c38VarArr);
        a = new a();
        new bw4("JobSeekerProfileInternationalNYSCStatus", u63.a0("NOT_APPLICABLE", "COMPLETED", "ONGOING"));
    }

    public c38(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static c38 valueOf(String str) {
        return (c38) Enum.valueOf(c38.class, str);
    }

    public static c38[] values() {
        return (c38[]) c.clone();
    }

    public final String a() {
        return this.rawValue;
    }
}
