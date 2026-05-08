package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class rl6 {
    public static final rl6 a;
    public static final rl6 b;
    public static final /* synthetic */ rl6[] c;

    static {
        rl6 rl6Var = new rl6("GET", 0);
        a = rl6Var;
        rl6 rl6Var2 = new rl6("POST", 1);
        b = rl6Var2;
        c = new rl6[]{rl6Var, rl6Var2};
    }

    public rl6() {
        throw null;
    }

    public static rl6 valueOf(String str) {
        return (rl6) Enum.valueOf(rl6.class, str);
    }

    public static rl6[] values() {
        return (rl6[]) c.clone();
    }
}
