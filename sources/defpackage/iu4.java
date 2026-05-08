package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class iu4 {
    public static final iu4 a;
    public static final iu4 b;
    public static final iu4 c;
    public static final /* synthetic */ iu4[] d;

    static {
        iu4 iu4Var = new iu4("PreEnter", 0);
        a = iu4Var;
        iu4 iu4Var2 = new iu4("Visible", 1);
        b = iu4Var2;
        iu4 iu4Var3 = new iu4("PostExit", 2);
        c = iu4Var3;
        d = new iu4[]{iu4Var, iu4Var2, iu4Var3};
    }

    public iu4() {
        throw null;
    }

    public static iu4 valueOf(String str) {
        return (iu4) Enum.valueOf(iu4.class, str);
    }

    public static iu4[] values() {
        return (iu4[]) d.clone();
    }
}
