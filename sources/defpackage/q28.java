package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class q28 {
    public static final a a;
    public static final q28 b;
    public static final /* synthetic */ q28[] c;
    public static final /* synthetic */ wv4 d;
    private final String rawValue;

    public static final class a {
    }

    static {
        q28 q28Var = new q28("AFRICAN", 0, "AFRICAN");
        q28 q28Var2 = new q28("WHITE", 1, "WHITE");
        q28 q28Var3 = new q28("INDIAN", 2, "INDIAN");
        q28 q28Var4 = new q28("ASIAN", 3, "ASIAN");
        q28 q28Var5 = new q28("COLOURED", 4, "COLOURED");
        q28 q28Var6 = new q28("UNKNOWN__", 5, "UNKNOWN__");
        b = q28Var6;
        q28[] q28VarArr = {q28Var, q28Var2, q28Var3, q28Var4, q28Var5, q28Var6};
        c = q28VarArr;
        d = new wv4(q28VarArr);
        a = new a();
        new bw4("JobSeekerProfileInternationalEthnicity", u63.a0("AFRICAN", "WHITE", "INDIAN", "ASIAN", "COLOURED"));
    }

    public q28(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static q28 valueOf(String str) {
        return (q28) Enum.valueOf(q28.class, str);
    }

    public static q28[] values() {
        return (q28[]) c.clone();
    }

    public final String a() {
        return this.rawValue;
    }
}
