package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ns2 {
    public static final ns2 a;
    public static final ns2 b;
    public static final /* synthetic */ ns2[] c;

    static {
        ns2 ns2Var = new ns2("VIEW_APPEAR", 0);
        a = ns2Var;
        ns2 ns2Var2 = new ns2("VIEW_DISAPPEAR", 1);
        b = ns2Var2;
        c = new ns2[]{ns2Var, ns2Var2};
    }

    public ns2() {
        throw null;
    }

    public static ns2 valueOf(String str) {
        return (ns2) Enum.valueOf(ns2.class, str);
    }

    public static ns2[] values() {
        return (ns2[]) c.clone();
    }
}
