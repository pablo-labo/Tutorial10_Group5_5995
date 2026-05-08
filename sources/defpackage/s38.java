package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class s38 {
    public static final s38 V;
    public static final s38 W;
    public static final s38 X;
    public static final s38 Y;
    public static final s38 Z;
    public static final a a;
    public static final s38 a0;
    public static final bw4 b;
    public static final s38 b0;
    public static final s38 c;
    public static final s38 c0;
    public static final s38 d;
    public static final s38 d0;
    public static final s38 e;
    public static final s38 e0;
    public static final s38 f;
    public static final /* synthetic */ s38[] f0;
    public static final /* synthetic */ wv4 g0;
    private final String rawValue;

    public static final class a {
        @sy3
        public static s38[] a() {
            return (s38[]) u63.a0(s38.c, s38.d, s38.e, s38.f, s38.V, s38.W, s38.X, s38.Y, s38.Z, s38.a0, s38.b0, s38.c0, s38.d0).toArray(new s38[0]);
        }
    }

    static {
        s38 s38Var = new s38("NOT_SPECIFIED", 0, "NOT_SPECIFIED");
        c = s38Var;
        s38 s38Var2 = new s38("JANUARY", 1, "JANUARY");
        d = s38Var2;
        s38 s38Var3 = new s38("FEBRUARY", 2, "FEBRUARY");
        e = s38Var3;
        s38 s38Var4 = new s38("MARCH", 3, "MARCH");
        f = s38Var4;
        s38 s38Var5 = new s38("APRIL", 4, "APRIL");
        V = s38Var5;
        s38 s38Var6 = new s38("MAY", 5, "MAY");
        W = s38Var6;
        s38 s38Var7 = new s38("JUNE", 6, "JUNE");
        X = s38Var7;
        s38 s38Var8 = new s38("JULY", 7, "JULY");
        Y = s38Var8;
        s38 s38Var9 = new s38("AUGUST", 8, "AUGUST");
        Z = s38Var9;
        s38 s38Var10 = new s38("SEPTEMBER", 9, "SEPTEMBER");
        a0 = s38Var10;
        s38 s38Var11 = new s38("OCTOBER", 10, "OCTOBER");
        b0 = s38Var11;
        s38 s38Var12 = new s38("NOVEMBER", 11, "NOVEMBER");
        c0 = s38Var12;
        s38 s38Var13 = new s38("DECEMBER", 12, "DECEMBER");
        d0 = s38Var13;
        s38 s38Var14 = new s38("UNKNOWN__", 13, "UNKNOWN__");
        e0 = s38Var14;
        s38[] s38VarArr = {s38Var, s38Var2, s38Var3, s38Var4, s38Var5, s38Var6, s38Var7, s38Var8, s38Var9, s38Var10, s38Var11, s38Var12, s38Var13, s38Var14};
        f0 = s38VarArr;
        g0 = new wv4(s38VarArr);
        a = new a();
        b = new bw4("JobSeekerProfileMonthType", u63.a0("NOT_SPECIFIED", "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"));
    }

    public s38(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static s38 valueOf(String str) {
        return (s38) Enum.valueOf(s38.class, str);
    }

    public static s38[] values() {
        return (s38[]) f0.clone();
    }

    public final String a() {
        return this.rawValue;
    }
}
