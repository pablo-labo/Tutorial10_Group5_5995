package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class vn7 {
    public static final a a;
    public static final bw4 b;
    public static final vn7 c;
    public static final /* synthetic */ vn7[] d;
    public static final /* synthetic */ wv4 e;
    private final String rawValue;

    public static final class a {
    }

    static {
        vn7 vn7Var = new vn7("INITIATED", 0, "INITIATED");
        vn7 vn7Var2 = new vn7("INTERESTED", 1, "INTERESTED");
        vn7 vn7Var3 = new vn7("DECLINED", 2, "DECLINED");
        vn7 vn7Var4 = new vn7("UNKNOWN__", 3, "UNKNOWN__");
        c = vn7Var4;
        vn7[] vn7VarArr = {vn7Var, vn7Var2, vn7Var3, vn7Var4};
        d = vn7VarArr;
        e = new wv4(vn7VarArr);
        a = new a();
        b = new bw4("InviteStatus", u63.a0("INITIATED", "INTERESTED", "DECLINED"));
    }

    public vn7(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static vn7 valueOf(String str) {
        return (vn7) Enum.valueOf(vn7.class, str);
    }

    public static vn7[] values() {
        return (vn7[]) d.clone();
    }

    public final String a() {
        return this.rawValue;
    }
}
