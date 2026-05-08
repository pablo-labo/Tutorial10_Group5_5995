package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class av2 {
    public static final /* synthetic */ av2[] V;
    public static final /* synthetic */ wv4 W;
    public static final a a;
    public static final bw4 b;
    public static final av2 c;
    public static final av2 d;
    public static final av2 e;
    public static final av2 f;
    private final String rawValue;

    public static final class a {
    }

    static {
        av2 av2Var = new av2("UNKNOWN", 0, "UNKNOWN");
        c = av2Var;
        av2 av2Var2 = new av2("HQM", 1, "HQM");
        av2 av2Var3 = new av2("HQM_PREAPPLY", 2, "HQM_PREAPPLY");
        av2 av2Var4 = new av2("APPLICATION", 3, "APPLICATION");
        d = av2Var4;
        av2 av2Var5 = new av2("RESUME_CONTACT", 4, "RESUME_CONTACT");
        e = av2Var5;
        av2 av2Var6 = new av2("I2A", 5, "I2A");
        av2 av2Var7 = new av2("INDEED_APPLY", 6, "INDEED_APPLY");
        av2 av2Var8 = new av2("INQUIRY", 7, "INQUIRY");
        av2 av2Var9 = new av2("IHP", 8, "IHP");
        av2 av2Var10 = new av2("FLEX", 9, "FLEX");
        av2 av2Var11 = new av2("ELEPHANT", 10, "ELEPHANT");
        av2 av2Var12 = new av2("TESTING_CONTEXT", 11, "TESTING_CONTEXT");
        av2 av2Var13 = new av2("UNKNOWN__", 12, "UNKNOWN__");
        f = av2Var13;
        av2[] av2VarArr = {av2Var, av2Var2, av2Var3, av2Var4, av2Var5, av2Var6, av2Var7, av2Var8, av2Var9, av2Var10, av2Var11, av2Var12, av2Var13};
        V = av2VarArr;
        W = new wv4(av2VarArr);
        a = new a();
        b = new bw4("ConversationContext", u63.a0("UNKNOWN", "HQM", "HQM_PREAPPLY", "APPLICATION", "RESUME_CONTACT", "I2A", "INDEED_APPLY", "INQUIRY", "IHP", "FLEX", "ELEPHANT", "TESTING_CONTEXT"));
    }

    public av2(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static av2 valueOf(String str) {
        return (av2) Enum.valueOf(av2.class, str);
    }

    public static av2[] values() {
        return (av2[]) V.clone();
    }

    public final String a() {
        return this.rawValue;
    }
}
