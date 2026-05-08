package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ce2 {
    public static final /* synthetic */ wv4 V;
    public static final a a;
    public static final ce2 b;
    public static final ce2 c;
    public static final ce2 d;
    public static final ce2 e;
    public static final /* synthetic */ ce2[] f;
    private final String rawValue;

    public static final class a {
    }

    static {
        ce2 ce2Var = new ce2("CONFIRM", 0, "CONFIRM");
        b = ce2Var;
        ce2 ce2Var2 = new ce2("SUGGESTTIME", 1, "SUGGESTTIME");
        ce2 ce2Var3 = new ce2("CANCEL", 2, "CANCEL");
        c = ce2Var3;
        ce2 ce2Var4 = new ce2("RESCHEDULE", 3, "RESCHEDULE");
        d = ce2Var4;
        ce2 ce2Var5 = new ce2("UNKNOWN__", 4, "UNKNOWN__");
        e = ce2Var5;
        ce2[] ce2VarArr = {ce2Var, ce2Var2, ce2Var3, ce2Var4, ce2Var5};
        f = ce2VarArr;
        V = new wv4(ce2VarArr);
        a = new a();
        new bw4("CompleteButtonParameterDestinationType", u63.a0("CONFIRM", "SUGGESTTIME", "CANCEL", "RESCHEDULE"));
    }

    public ce2(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static ce2 valueOf(String str) {
        return (ce2) Enum.valueOf(ce2.class, str);
    }

    public static ce2[] values() {
        return (ce2[]) f.clone();
    }

    public final String a() {
        return this.rawValue;
    }
}
