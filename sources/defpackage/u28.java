package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class u28 {
    public static final a a;
    public static final u28 b;
    public static final /* synthetic */ u28[] c;
    public static final /* synthetic */ wv4 d;
    private final String rawValue;

    public static final class a {
    }

    static {
        u28 u28Var = new u28("NONE", 0, "NONE");
        u28 u28Var2 = new u28("MALE", 1, "MALE");
        u28 u28Var3 = new u28("FEMALE", 2, "FEMALE");
        u28 u28Var4 = new u28("UNKNOWN__", 3, "UNKNOWN__");
        b = u28Var4;
        u28[] u28VarArr = {u28Var, u28Var2, u28Var3, u28Var4};
        c = u28VarArr;
        d = new wv4(u28VarArr);
        a = new a();
        new bw4("JobSeekerProfileInternationalGender", u63.a0("NONE", "MALE", "FEMALE"));
    }

    public u28(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static u28 valueOf(String str) {
        return (u28) Enum.valueOf(u28.class, str);
    }

    public static u28[] values() {
        return (u28[]) c.clone();
    }

    public final String a() {
        return this.rawValue;
    }
}
