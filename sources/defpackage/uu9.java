package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class uu9 {
    public static final a a;
    public static final bw4 b;
    public static final uu9 c;
    public static final /* synthetic */ uu9[] d;
    public static final /* synthetic */ wv4 e;
    private final String rawValue;

    public static final class a {
    }

    static {
        uu9 uu9Var = new uu9("DOUBLE_VALUE", 0, "DOUBLE_VALUE");
        uu9 uu9Var2 = new uu9("DOUBLE_ARRAY", 1, "DOUBLE_ARRAY");
        uu9 uu9Var3 = new uu9("LONG_VALUE", 2, "LONG_VALUE");
        uu9 uu9Var4 = new uu9("LONG_ARRAY", 3, "LONG_ARRAY");
        uu9 uu9Var5 = new uu9("STRING_VALUE", 4, "STRING_VALUE");
        uu9 uu9Var6 = new uu9("STRING_ARRAY", 5, "STRING_ARRAY");
        uu9 uu9Var7 = new uu9("MAP", 6, "MAP");
        uu9 uu9Var8 = new uu9("JSON", 7, "JSON");
        uu9 uu9Var9 = new uu9("UNKNOWN__", 8, "UNKNOWN__");
        c = uu9Var9;
        uu9[] uu9VarArr = {uu9Var, uu9Var2, uu9Var3, uu9Var4, uu9Var5, uu9Var6, uu9Var7, uu9Var8, uu9Var9};
        d = uu9VarArr;
        e = new wv4(uu9VarArr);
        a = new a();
        b = new bw4("MobileAppProctorPayloadType", u63.a0("DOUBLE_VALUE", "DOUBLE_ARRAY", "LONG_VALUE", "LONG_ARRAY", "STRING_VALUE", "STRING_ARRAY", "MAP", "JSON"));
    }

    public uu9(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static uu9 valueOf(String str) {
        return (uu9) Enum.valueOf(uu9.class, str);
    }

    public static uu9[] values() {
        return (uu9[]) d.clone();
    }

    public final String a() {
        return this.rawValue;
    }
}
