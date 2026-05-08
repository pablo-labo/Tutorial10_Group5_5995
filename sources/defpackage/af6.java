package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class af6 {
    public static final af6 a;
    public static final af6 b;
    public static final af6 c;
    public static final /* synthetic */ af6[] d;

    static {
        af6 af6Var = new af6("READY", 0);
        a = af6Var;
        af6 af6Var2 = new af6("LOADING", 1);
        b = af6Var2;
        af6 af6Var3 = new af6("ERROR", 2);
        c = af6Var3;
        d = new af6[]{af6Var, af6Var2, af6Var3};
    }

    public af6() {
        throw null;
    }

    public static af6 valueOf(String str) {
        return (af6) Enum.valueOf(af6.class, str);
    }

    public static af6[] values() {
        return (af6[]) d.clone();
    }
}
