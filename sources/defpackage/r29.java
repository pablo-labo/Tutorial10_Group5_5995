package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class r29 {
    public static final /* synthetic */ r29[] V;
    public static final /* synthetic */ wv4 W;
    public static final a a;
    public static final bw4 b;
    public static final r29 c;
    public static final r29 d;
    public static final r29 e;
    public static final r29 f;
    private final String rawValue;

    public static final class a {
    }

    static {
        r29 r29Var = new r29("BROADCAST_INELIGIBLE", 0, "BROADCAST_INELIGIBLE");
        c = r29Var;
        r29 r29Var2 = new r29("DEPRECATED_PRODUCT", 1, "DEPRECATED_PRODUCT");
        d = r29Var2;
        r29 r29Var3 = new r29("IMS_NOT_MIGRATED", 2, "IMS_NOT_MIGRATED");
        e = r29Var3;
        r29 r29Var4 = new r29("UNKNOWN__", 3, "UNKNOWN__");
        f = r29Var4;
        r29[] r29VarArr = {r29Var, r29Var2, r29Var3, r29Var4};
        V = r29VarArr;
        W = new wv4(r29VarArr);
        a = new a();
        b = new bw4("LockReason", u63.a0("BROADCAST_INELIGIBLE", "DEPRECATED_PRODUCT", "IMS_NOT_MIGRATED"));
    }

    public r29(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static r29 valueOf(String str) {
        return (r29) Enum.valueOf(r29.class, str);
    }

    public static r29[] values() {
        return (r29[]) V.clone();
    }

    public final String a() {
        return this.rawValue;
    }
}
