package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class h08 {
    public static final a a;
    public static final bw4 b;
    public static final h08 c;
    public static final h08 d;
    public static final /* synthetic */ h08[] e;
    public static final /* synthetic */ wv4 f;
    private final String rawValue;

    public static final class a {
    }

    static {
        h08 h08Var = new h08("INELIGIBLE", 0, "INELIGIBLE");
        h08 h08Var2 = new h08("ELIGIBLE", 1, "ELIGIBLE");
        h08 h08Var3 = new h08("ENABLED", 2, "ENABLED");
        c = h08Var3;
        h08 h08Var4 = new h08("UNKNOWN__", 3, "UNKNOWN__");
        d = h08Var4;
        h08[] h08VarArr = {h08Var, h08Var2, h08Var3, h08Var4};
        e = h08VarArr;
        f = new wv4(h08VarArr);
        a = new a();
        b = new bw4("JobSeekerProStatus", u63.a0("INELIGIBLE", "ELIGIBLE", "ENABLED"));
    }

    public h08(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static h08 valueOf(String str) {
        return (h08) Enum.valueOf(h08.class, str);
    }

    public static h08[] values() {
        return (h08[]) e.clone();
    }

    public final String a() {
        return this.rawValue;
    }
}
