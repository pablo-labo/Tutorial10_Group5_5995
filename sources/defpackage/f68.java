package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class f68 {
    public static final f68 V;
    public static final f68 W;
    public static final f68 X;
    public static final /* synthetic */ f68[] Y;
    public static final /* synthetic */ wv4 Z;
    public static final a a;
    public static final bw4 b;
    public static final f68 c;
    public static final f68 d;
    public static final f68 e;
    public static final f68 f;
    private final String rawValue;

    public static final class a {
    }

    static {
        f68 f68Var = new f68("HOURLY", 0, "HOURLY");
        c = f68Var;
        f68 f68Var2 = new f68("DAILY", 1, "DAILY");
        d = f68Var2;
        f68 f68Var3 = new f68("WEEKLY", 2, "WEEKLY");
        e = f68Var3;
        f68 f68Var4 = new f68("BIWEEKLY", 3, "BIWEEKLY");
        f = f68Var4;
        f68 f68Var5 = new f68("MONTHLY", 4, "MONTHLY");
        V = f68Var5;
        f68 f68Var6 = new f68("YEARLY", 5, "YEARLY");
        W = f68Var6;
        f68 f68Var7 = new f68("UNKNOWN__", 6, "UNKNOWN__");
        X = f68Var7;
        f68[] f68VarArr = {f68Var, f68Var2, f68Var3, f68Var4, f68Var5, f68Var6, f68Var7};
        Y = f68VarArr;
        Z = new wv4(f68VarArr);
        a = new a();
        b = new bw4("JobSeekerProfileStructuredDataSalaryType", u63.a0("HOURLY", "DAILY", "WEEKLY", "BIWEEKLY", "MONTHLY", "YEARLY"));
    }

    public f68(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static f68 valueOf(String str) {
        return (f68) Enum.valueOf(f68.class, str);
    }

    public static f68[] values() {
        return (f68[]) Y.clone();
    }

    public final String a() {
        return this.rawValue;
    }
}
