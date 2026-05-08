package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ex4 {
    public static final ex4 a;
    public static final ex4 b;
    public static final ex4 c;
    public static final /* synthetic */ ex4[] d;

    static {
        ex4 ex4Var = new ex4("HTTP", 0);
        a = ex4Var;
        ex4 ex4Var2 = new ex4("NETWORK", 1);
        b = ex4Var2;
        ex4 ex4Var3 = new ex4("NONE", 2);
        c = ex4Var3;
        d = new ex4[]{ex4Var, ex4Var2, ex4Var3};
    }

    public ex4() {
        throw null;
    }

    public static ex4 valueOf(String str) {
        return (ex4) Enum.valueOf(ex4.class, str);
    }

    public static ex4[] values() {
        return (ex4[]) d.clone();
    }
}
