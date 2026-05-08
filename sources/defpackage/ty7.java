package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ty7 {
    public static final a a;
    public static final bw4 b;
    public static final ty7 c;
    public static final ty7 d;
    public static final /* synthetic */ ty7[] e;
    public static final /* synthetic */ wv4 f;
    private final String rawValue;

    public static final class a {
    }

    static {
        ty7 ty7Var = new ty7("DESKTOP", 0, "DESKTOP");
        ty7 ty7Var2 = new ty7("MOBILE", 1, "MOBILE");
        c = ty7Var2;
        ty7 ty7Var3 = new ty7("UNKNOWN__", 2, "UNKNOWN__");
        d = ty7Var3;
        ty7[] ty7VarArr = {ty7Var, ty7Var2, ty7Var3};
        e = ty7VarArr;
        f = new wv4(ty7VarArr);
        a = new a();
        b = new bw4("JobIndeedApplyScope", u63.a0("DESKTOP", "MOBILE"));
    }

    public ty7(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static ty7 valueOf(String str) {
        return (ty7) Enum.valueOf(ty7.class, str);
    }

    public static ty7[] values() {
        return (ty7[]) e.clone();
    }

    public final String a() {
        return this.rawValue;
    }
}
