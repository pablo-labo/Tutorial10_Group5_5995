package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class e28 {
    public static final a a;
    public static final e28 b;
    public static final /* synthetic */ e28[] c;
    public static final /* synthetic */ wv4 d;
    private final String rawValue;

    public static final class a {
    }

    static {
        e28 e28Var = new e28("NO", 0, "NO");
        e28 e28Var2 = new e28("YES", 1, "YES");
        e28 e28Var3 = new e28("SPEECH", 2, "SPEECH");
        e28 e28Var4 = new e28("PHYSICAL", 3, "PHYSICAL");
        e28 e28Var5 = new e28("COGNITIVE", 4, "COGNITIVE");
        e28 e28Var6 = new e28("VISION", 5, "VISION");
        e28 e28Var7 = new e28("MULTIPLE", 6, "MULTIPLE");
        e28 e28Var8 = new e28("OTHER", 7, "OTHER");
        e28 e28Var9 = new e28("UNKNOWN__", 8, "UNKNOWN__");
        b = e28Var9;
        e28[] e28VarArr = {e28Var, e28Var2, e28Var3, e28Var4, e28Var5, e28Var6, e28Var7, e28Var8, e28Var9};
        c = e28VarArr;
        d = new wv4(e28VarArr);
        a = new a();
        new bw4("JobSeekerProfileInternationalDisability", u63.a0("NO", "YES", "SPEECH", "PHYSICAL", "COGNITIVE", "VISION", "MULTIPLE", "OTHER"));
    }

    public e28(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static e28 valueOf(String str) {
        return (e28) Enum.valueOf(e28.class, str);
    }

    public static e28[] values() {
        return (e28[]) c.clone();
    }

    public final String a() {
        return this.rawValue;
    }
}
