package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class g13 {
    public static final g13 a;
    public static final g13 b;
    public static final g13 c;
    public static final /* synthetic */ g13[] d;

    static {
        g13 g13Var = new g13("COROUTINE_SUSPENDED", 0);
        a = g13Var;
        g13 g13Var2 = new g13("UNDECIDED", 1);
        b = g13Var2;
        g13 g13Var3 = new g13("RESUMED", 2);
        c = g13Var3;
        d = new g13[]{g13Var, g13Var2, g13Var3};
    }

    public g13() {
        throw null;
    }

    public static g13 valueOf(String str) {
        return (g13) Enum.valueOf(g13.class, str);
    }

    public static g13[] values() {
        return (g13[]) d.clone();
    }
}
