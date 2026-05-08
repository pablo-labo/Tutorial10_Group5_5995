package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class jw2 {
    public static final a a;
    public static final bw4 b;
    public static final jw2 c;
    public static final jw2 d;
    public static final /* synthetic */ jw2[] e;
    public static final /* synthetic */ wv4 f;
    private final String rawValue;

    public static final class a {
    }

    static {
        jw2 jw2Var = new jw2("PLAIN", 0, "PLAIN");
        jw2 jw2Var2 = new jw2("HTML", 1, "HTML");
        c = jw2Var2;
        jw2 jw2Var3 = new jw2("UNKNOWN", 2, "UNKNOWN");
        jw2 jw2Var4 = new jw2("UNKNOWN__", 3, "UNKNOWN__");
        d = jw2Var4;
        jw2[] jw2VarArr = {jw2Var, jw2Var2, jw2Var3, jw2Var4};
        e = jw2VarArr;
        f = new wv4(jw2VarArr);
        a = new a();
        b = new bw4("ConversationEventMessageContentFormat", u63.a0("PLAIN", "HTML", "UNKNOWN"));
    }

    public jw2(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static jw2 valueOf(String str) {
        return (jw2) Enum.valueOf(jw2.class, str);
    }

    public static jw2[] values() {
        return (jw2[]) e.clone();
    }

    public final String a() {
        return this.rawValue;
    }
}
