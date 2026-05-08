package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class r48 {
    public static final a a;
    public static final bw4 b;
    public static final r48 c;
    public static final r48 d;
    public static final /* synthetic */ r48[] e;
    public static final /* synthetic */ wv4 f;
    private final String rawValue;

    public static final class a {
    }

    static {
        r48 r48Var = new r48("UNSPECIFIED", 0, "UNSPECIFIED");
        r48 r48Var2 = new r48("OPT_OUT", 1, "OPT_OUT");
        r48 r48Var3 = new r48("OPT_IN", 2, "OPT_IN");
        c = r48Var3;
        r48 r48Var4 = new r48("UNKNOWN__", 3, "UNKNOWN__");
        d = r48Var4;
        r48[] r48VarArr = {r48Var, r48Var2, r48Var3, r48Var4};
        e = r48VarArr;
        f = new wv4(r48VarArr);
        a = new a();
        b = new bw4("JobSeekerProfileSourcingElection", u63.a0("UNSPECIFIED", "OPT_OUT", "OPT_IN"));
    }

    public r48(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static r48 valueOf(String str) {
        return (r48) Enum.valueOf(r48.class, str);
    }

    public static r48[] values() {
        return (r48[]) e.clone();
    }

    public final String a() {
        return this.rawValue;
    }
}
