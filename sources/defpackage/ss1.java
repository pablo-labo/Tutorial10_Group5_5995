package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ss1 {
    public static final a a;
    public static final bw4 b;
    public static final ss1 c;
    public static final /* synthetic */ ss1[] d;
    public static final /* synthetic */ wv4 e;
    private final String rawValue;

    public static final class a {
    }

    static {
        ss1 ss1Var = new ss1("ACCEPT_INVITE", 0, "ACCEPT_INVITE");
        ss1 ss1Var2 = new ss1("DECLINE_INVITE", 1, "DECLINE_INVITE");
        ss1 ss1Var3 = new ss1("TALK_TO_EMPLOYER", 2, "TALK_TO_EMPLOYER");
        ss1 ss1Var4 = new ss1("UNKNOWN__", 3, "UNKNOWN__");
        c = ss1Var4;
        ss1[] ss1VarArr = {ss1Var, ss1Var2, ss1Var3, ss1Var4};
        d = ss1VarArr;
        e = new wv4(ss1VarArr);
        a = new a();
        b = new bw4("CTAButton", u63.a0("ACCEPT_INVITE", "DECLINE_INVITE", "TALK_TO_EMPLOYER"));
    }

    public ss1(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static ss1 valueOf(String str) {
        return (ss1) Enum.valueOf(ss1.class, str);
    }

    public static ss1[] values() {
        return (ss1[]) d.clone();
    }

    public final String a() {
        return this.rawValue;
    }
}
