package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ss4 {
    public static final ss4 a;
    public static final ss4 b;
    public static final ss4 c;
    public static final /* synthetic */ ss4[] d;

    static {
        ss4 ss4Var = new ss4("SOURCE", 0);
        a = ss4Var;
        ss4 ss4Var2 = new ss4("TRANSFORMED", 1);
        b = ss4Var2;
        ss4 ss4Var3 = new ss4("NONE", 2);
        c = ss4Var3;
        d = new ss4[]{ss4Var, ss4Var2, ss4Var3};
    }

    public ss4() {
        throw null;
    }

    public static ss4 valueOf(String str) {
        return (ss4) Enum.valueOf(ss4.class, str);
    }

    public static ss4[] values() {
        return (ss4[]) d.clone();
    }
}
