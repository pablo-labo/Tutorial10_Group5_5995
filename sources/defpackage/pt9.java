package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class pt9 {
    public static final /* synthetic */ pt9[] V;
    public static final pt9 a;
    public static final pt9 b;
    public static final pt9 c;
    public static final pt9 d;
    public static final pt9 e;
    public static final pt9 f;

    static {
        pt9 pt9Var = new pt9("COUNTRY_OF_SERVICE", 0);
        a = pt9Var;
        pt9 pt9Var2 = new pt9("COUNTRY_SELECTOR", 1);
        b = pt9Var2;
        pt9 pt9Var3 = new pt9("BRANCH", 2);
        c = pt9Var3;
        pt9 pt9Var4 = new pt9("RANK", 3);
        d = pt9Var4;
        pt9 pt9Var5 = new pt9("TIME_PERIOD", 4);
        e = pt9Var5;
        pt9 pt9Var6 = new pt9("DESCRIPTION", 5);
        f = pt9Var6;
        V = new pt9[]{pt9Var, pt9Var2, pt9Var3, pt9Var4, pt9Var5, pt9Var6, new pt9("EDIT_ROOT_PAGE", 6)};
    }

    public pt9() {
        throw null;
    }

    public static pt9 valueOf(String str) {
        return (pt9) Enum.valueOf(pt9.class, str);
    }

    public static pt9[] values() {
        return (pt9[]) V.clone();
    }
}
