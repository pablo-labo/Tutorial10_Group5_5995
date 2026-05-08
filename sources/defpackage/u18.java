package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class u18 {
    public static final a a;
    public static final bw4 b;
    public static final u18 c;
    public static final u18 d;
    public static final /* synthetic */ u18[] e;
    public static final /* synthetic */ wv4 f;
    private final String rawValue;

    public static final class a {
    }

    static {
        u18 u18Var = new u18("RESUME", 0, "RESUME");
        c = u18Var;
        u18 u18Var2 = new u18("RESUME_CONVERTED", 1, "RESUME_CONVERTED");
        u18 u18Var3 = new u18("COVER_LETTER", 2, "COVER_LETTER");
        u18 u18Var4 = new u18("PROFILE_PHOTO", 3, "PROFILE_PHOTO");
        u18 u18Var5 = new u18("UNKNOWN__", 4, "UNKNOWN__");
        d = u18Var5;
        u18[] u18VarArr = {u18Var, u18Var2, u18Var3, u18Var4, u18Var5};
        e = u18VarArr;
        f = new wv4(u18VarArr);
        a = new a();
        b = new bw4("JobSeekerProfileFileType", u63.a0("RESUME", "RESUME_CONVERTED", "COVER_LETTER", "PROFILE_PHOTO"));
    }

    public u18(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static u18 valueOf(String str) {
        return (u18) Enum.valueOf(u18.class, str);
    }

    public static u18[] values() {
        return (u18[]) e.clone();
    }

    public final String a() {
        return this.rawValue;
    }
}
