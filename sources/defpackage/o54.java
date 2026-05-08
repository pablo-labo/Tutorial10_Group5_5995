package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class o54 {
    public static final o54 a;
    public static final o54 b;
    public static final o54 c;
    public static final /* synthetic */ o54[] d;

    static {
        o54 o54Var = new o54("Vertical", 0);
        a = o54Var;
        o54 o54Var2 = new o54("Horizontal", 1);
        b = o54Var2;
        o54 o54Var3 = new o54("Both", 2);
        c = o54Var3;
        d = new o54[]{o54Var, o54Var2, o54Var3};
    }

    public o54() {
        throw null;
    }

    public static o54 valueOf(String str) {
        return (o54) Enum.valueOf(o54.class, str);
    }

    public static o54[] values() {
        return (o54[]) d.clone();
    }
}
