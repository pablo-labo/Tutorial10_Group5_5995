package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class gy2 {
    public static final gy2 V;
    public static final /* synthetic */ gy2[] W;
    public static final /* synthetic */ wv4 X;
    public static final a a;
    public static final bw4 b;
    public static final gy2 c;
    public static final gy2 d;
    public static final gy2 e;
    public static final gy2 f;
    private final String rawValue;

    public static final class a {
    }

    static {
        gy2 gy2Var = new gy2("JOB_SEEKER", 0, "JOB_SEEKER");
        c = gy2Var;
        gy2 gy2Var2 = new gy2("EMPLOYER", 1, "EMPLOYER");
        d = gy2Var2;
        gy2 gy2Var3 = new gy2("UNKNOWN", 2, "UNKNOWN");
        e = gy2Var3;
        gy2 gy2Var4 = new gy2("SYSTEM", 3, "SYSTEM");
        f = gy2Var4;
        gy2 gy2Var5 = new gy2("UNKNOWN__", 4, "UNKNOWN__");
        V = gy2Var5;
        gy2[] gy2VarArr = {gy2Var, gy2Var2, gy2Var3, gy2Var4, gy2Var5};
        W = gy2VarArr;
        X = new wv4(gy2VarArr);
        a = new a();
        b = new bw4("ConversationParticipantRole", u63.a0("JOB_SEEKER", "EMPLOYER", "UNKNOWN", "SYSTEM"));
    }

    public gy2(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static gy2 valueOf(String str) {
        return (gy2) Enum.valueOf(gy2.class, str);
    }

    public static gy2[] values() {
        return (gy2[]) W.clone();
    }

    public final String a() {
        return this.rawValue;
    }
}
