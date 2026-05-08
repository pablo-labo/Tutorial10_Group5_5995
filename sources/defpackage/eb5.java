package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class eb5 {
    public static final eb5 a;
    public static final eb5 b;
    public static final /* synthetic */ eb5[] c;

    static {
        eb5 eb5Var = new eb5("TOP_DOWN", 0);
        a = eb5Var;
        eb5 eb5Var2 = new eb5("BOTTOM_UP", 1);
        b = eb5Var2;
        c = new eb5[]{eb5Var, eb5Var2};
    }

    public eb5() {
        throw null;
    }

    public static eb5 valueOf(String str) {
        return (eb5) Enum.valueOf(eb5.class, str);
    }

    public static eb5[] values() {
        return (eb5[]) c.clone();
    }
}
