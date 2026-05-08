package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class s28 {
    public static final a a;
    public static final s28 b;
    public static final /* synthetic */ s28[] c;
    public static final /* synthetic */ wv4 d;
    private final String rawValue;

    public static final class a {
    }

    static {
        s28 s28Var = new s28("YES", 0, "YES");
        s28 s28Var2 = new s28("NO", 1, "NO");
        s28 s28Var3 = new s28("UNKNOWN__", 2, "UNKNOWN__");
        b = s28Var3;
        s28[] s28VarArr = {s28Var, s28Var2, s28Var3};
        c = s28VarArr;
        d = new wv4(s28VarArr);
        a = new a();
        new bw4("JobSeekerProfileInternationalEuropeanUnionWorkPermit", u63.a0("YES", "NO"));
    }

    public s28(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static s28 valueOf(String str) {
        return (s28) Enum.valueOf(s28.class, str);
    }

    public static s28[] values() {
        return (s28[]) c.clone();
    }

    public final String a() {
        return this.rawValue;
    }
}
