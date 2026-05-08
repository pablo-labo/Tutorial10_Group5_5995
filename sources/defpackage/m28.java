package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class m28 {
    public static final a a;
    public static final m28 b;
    public static final /* synthetic */ m28[] c;
    public static final /* synthetic */ wv4 d;
    private final String rawValue;

    public static final class a {
    }

    static {
        m28 m28Var = new m28("YES", 0, "YES");
        m28 m28Var2 = new m28("NO", 1, "NO");
        m28 m28Var3 = new m28("UNKNOWN__", 2, "UNKNOWN__");
        b = m28Var3;
        m28[] m28VarArr = {m28Var, m28Var2, m28Var3};
        c = m28VarArr;
        d = new wv4(m28VarArr);
        a = new a();
        new bw4("JobSeekerProfileInternationalEmploymentStatus", u63.a0("YES", "NO"));
    }

    public m28(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static m28 valueOf(String str) {
        return (m28) Enum.valueOf(m28.class, str);
    }

    public static m28[] values() {
        return (m28[]) c.clone();
    }

    public final String a() {
        return this.rawValue;
    }
}
