package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class l48 {
    public static final a a;
    public static final l48 b;
    public static final l48 c;
    public static final /* synthetic */ l48[] d;
    public static final /* synthetic */ wv4 e;
    private final String rawValue;

    public static final class a {
    }

    static {
        l48 l48Var = new l48("INDEED_RESUME", 0, "INDEED_RESUME");
        l48 l48Var2 = new l48("PARSED", 1, "PARSED");
        b = l48Var2;
        l48 l48Var3 = new l48("GLASSDOOR", 2, "GLASSDOOR");
        l48 l48Var4 = new l48("SIMPLYHIRED", 3, "SIMPLYHIRED");
        l48 l48Var5 = new l48("RESUMECOM", 4, "RESUMECOM");
        l48 l48Var6 = new l48("RECRUIT", 5, "RECRUIT");
        l48 l48Var7 = new l48("UNKNOWN__", 6, "UNKNOWN__");
        c = l48Var7;
        l48[] l48VarArr = {l48Var, l48Var2, l48Var3, l48Var4, l48Var5, l48Var6, l48Var7};
        d = l48VarArr;
        e = new wv4(l48VarArr);
        a = new a();
        new bw4("JobSeekerProfileResumeType", u63.a0("INDEED_RESUME", "PARSED", "GLASSDOOR", "SIMPLYHIRED", "RESUMECOM", "RECRUIT"));
    }

    public l48(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static l48 valueOf(String str) {
        return (l48) Enum.valueOf(l48.class, str);
    }

    public static l48[] values() {
        return (l48[]) d.clone();
    }

    public final String a() {
        return this.rawValue;
    }
}
