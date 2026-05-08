package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ha3 {
    public static final a a;
    public static final ha3 b;
    public static final /* synthetic */ ha3[] c;
    public static final /* synthetic */ wv4 d;
    private final String rawValue;

    public static final class a {
    }

    static {
        ha3 ha3Var = new ha3("AND", 0, "AND");
        ha3 ha3Var2 = new ha3("OR", 1, "OR");
        ha3 ha3Var3 = new ha3("UNKNOWN__", 2, "UNKNOWN__");
        b = ha3Var3;
        ha3[] ha3VarArr = {ha3Var, ha3Var2, ha3Var3};
        c = ha3VarArr;
        d = new wv4(ha3VarArr);
        a = new a();
        new bw4("CustomClassFilterOperation", u63.a0("AND", "OR"));
    }

    public ha3(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static ha3 valueOf(String str) {
        return (ha3) Enum.valueOf(ha3.class, str);
    }

    public static ha3[] values() {
        return (ha3[]) c.clone();
    }

    public final String a() {
        return this.rawValue;
    }
}
