package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class t18 {
    public static final a a;
    public static final bw4 b;
    public static final t18 c;
    public static final /* synthetic */ t18[] d;
    public static final /* synthetic */ wv4 e;
    private final String rawValue;

    public static final class a {
    }

    static {
        t18 t18Var = new t18("RESUME", 0, "RESUME");
        t18 t18Var2 = new t18("RESUME_CONVERTED", 1, "RESUME_CONVERTED");
        t18 t18Var3 = new t18("COVER_LETTER", 2, "COVER_LETTER");
        t18 t18Var4 = new t18("PROFILE_PHOTO", 3, "PROFILE_PHOTO");
        t18 t18Var5 = new t18("UNKNOWN__", 4, "UNKNOWN__");
        c = t18Var5;
        t18[] t18VarArr = {t18Var, t18Var2, t18Var3, t18Var4, t18Var5};
        d = t18VarArr;
        e = new wv4(t18VarArr);
        a = new a();
        b = new bw4("JobSeekerProfileFileType", u63.a0("RESUME", "RESUME_CONVERTED", "COVER_LETTER", "PROFILE_PHOTO"));
    }

    public t18(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static t18 valueOf(String str) {
        return (t18) Enum.valueOf(t18.class, str);
    }

    public static t18[] values() {
        return (t18[]) d.clone();
    }

    public final String a() {
        return this.rawValue;
    }
}
