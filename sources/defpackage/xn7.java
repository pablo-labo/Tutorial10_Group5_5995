package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class xn7 {
    public static final a a;
    public static final bw4 b;
    public static final xn7 c;
    public static final /* synthetic */ xn7[] d;
    public static final /* synthetic */ wv4 e;
    private final String rawValue;

    public static final class a {
    }

    static {
        xn7 xn7Var = new xn7("INTERVIEW", 0, "INTERVIEW");
        xn7 xn7Var2 = new xn7("EMAIL", 1, "EMAIL");
        xn7 xn7Var3 = new xn7("UNKNOWN__", 2, "UNKNOWN__");
        c = xn7Var3;
        xn7[] xn7VarArr = {xn7Var, xn7Var2, xn7Var3};
        d = xn7VarArr;
        e = new wv4(xn7VarArr);
        a = new a();
        b = new bw4("InviteType", u63.a0("INTERVIEW", "EMAIL"));
    }

    public xn7(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static xn7 valueOf(String str) {
        return (xn7) Enum.valueOf(xn7.class, str);
    }

    public static xn7[] values() {
        return (xn7[]) d.clone();
    }

    public final String a() {
        return this.rawValue;
    }
}
