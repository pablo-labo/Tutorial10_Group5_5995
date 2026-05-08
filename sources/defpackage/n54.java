package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class n54 {
    public static final n54 a;
    public static final n54 b;
    public static final n54 c;
    public static final /* synthetic */ n54[] d;

    static {
        n54 n54Var = new n54("BEFORE", 0);
        a = n54Var;
        n54 n54Var2 = new n54("ON", 1);
        b = n54Var2;
        n54 n54Var3 = new n54("AFTER", 2);
        c = n54Var3;
        d = new n54[]{n54Var, n54Var2, n54Var3};
    }

    public n54() {
        throw null;
    }

    public static n54 valueOf(String str) {
        return (n54) Enum.valueOf(n54.class, str);
    }

    public static n54[] values() {
        return (n54[]) d.clone();
    }
}
