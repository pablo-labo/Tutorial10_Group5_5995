package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class oo6 {
    public static final oo6 a;
    public static final oo6 b;
    public static final oo6 c;
    public static final /* synthetic */ oo6[] d;

    static {
        oo6 oo6Var = new oo6("SIGNIFICANT_DIGITS", 0);
        a = oo6Var;
        oo6 oo6Var2 = new oo6("FRACTION_DIGITS", 1);
        b = oo6Var2;
        oo6 oo6Var3 = new oo6("COMPACT_ROUNDING", 2);
        c = oo6Var3;
        d = new oo6[]{oo6Var, oo6Var2, oo6Var3};
    }

    public oo6() {
        throw null;
    }

    public static oo6 valueOf(String str) {
        return (oo6) Enum.valueOf(oo6.class, str);
    }

    public static oo6[] values() {
        return (oo6[]) d.clone();
    }
}
