package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class io4 {
    public static final io4 V;
    public static final /* synthetic */ io4[] W;
    public static final io4 a;
    public static final io4 b;
    public static final io4 c;
    public static final io4 d;
    public static final io4 e;
    public static final io4 f;

    static {
        io4 io4Var = new io4("EDUCATION_LEVEL", 0);
        a = io4Var;
        io4 io4Var2 = new io4("FIELD_OF_STUDY", 1);
        b = io4Var2;
        io4 io4Var3 = new io4("SCHOOL_NAME", 2);
        c = io4Var3;
        io4 io4Var4 = new io4("SCHOOL_COUNTRY", 3);
        d = io4Var4;
        io4 io4Var5 = new io4("SCHOOL_COUNTRY_SELECTOR", 4);
        e = io4Var5;
        io4 io4Var6 = new io4("SCHOOL_LOCATION", 5);
        f = io4Var6;
        io4 io4Var7 = new io4("SCHOOL_TIME_PERIOD", 6);
        V = io4Var7;
        W = new io4[]{io4Var, io4Var2, io4Var3, io4Var4, io4Var5, io4Var6, io4Var7};
    }

    public io4() {
        throw null;
    }

    public static io4 valueOf(String str) {
        return (io4) Enum.valueOf(io4.class, str);
    }

    public static io4[] values() {
        return (io4[]) W.clone();
    }
}
