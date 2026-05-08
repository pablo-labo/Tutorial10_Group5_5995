package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class qi3 {
    public static final qi3 a;
    public static final qi3 b;
    public static final qi3 c;
    public static final /* synthetic */ qi3[] d;

    static {
        qi3 qi3Var = new qi3("BASE", 0);
        a = qi3Var;
        qi3 qi3Var2 = new qi3("NAVIGATION", 1);
        qi3 qi3Var3 = new qi3("START_AUTO_APPLY", 2);
        b = qi3Var3;
        qi3 qi3Var4 = new qi3("VIEW_AUTO_APPLIES", 3);
        c = qi3Var4;
        d = new qi3[]{qi3Var, qi3Var2, qi3Var3, qi3Var4};
    }

    public qi3() {
        throw null;
    }

    public static qi3 valueOf(String str) {
        return (qi3) Enum.valueOf(qi3.class, str);
    }

    public static qi3[] values() {
        return (qi3[]) d.clone();
    }
}
