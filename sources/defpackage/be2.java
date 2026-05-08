package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class be2 {
    public static final /* synthetic */ wv4 V;
    public static final a a;
    public static final be2 b;
    public static final be2 c;
    public static final be2 d;
    public static final be2 e;
    public static final /* synthetic */ be2[] f;
    private final String rawValue;

    public static final class a {
    }

    static {
        be2 be2Var = new be2("CONFIRM", 0, "CONFIRM");
        be2 be2Var2 = new be2("SUGGESTTIME", 1, "SUGGESTTIME");
        b = be2Var2;
        be2 be2Var3 = new be2("CANCEL", 2, "CANCEL");
        c = be2Var3;
        be2 be2Var4 = new be2("RESCHEDULE", 3, "RESCHEDULE");
        d = be2Var4;
        be2 be2Var5 = new be2("UNKNOWN__", 4, "UNKNOWN__");
        e = be2Var5;
        be2[] be2VarArr = {be2Var, be2Var2, be2Var3, be2Var4, be2Var5};
        f = be2VarArr;
        V = new wv4(be2VarArr);
        a = new a();
        new bw4("CompleteButtonParameterDestinationType", u63.a0("CONFIRM", "SUGGESTTIME", "CANCEL", "RESCHEDULE"));
    }

    public be2(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static be2 valueOf(String str) {
        return (be2) Enum.valueOf(be2.class, str);
    }

    public static be2[] values() {
        return (be2[]) f.clone();
    }

    public final String a() {
        return this.rawValue;
    }
}
