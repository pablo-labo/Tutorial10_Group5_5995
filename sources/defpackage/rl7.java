package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class rl7 {
    public static final rl7 a;
    public static final rl7 b;
    public static final /* synthetic */ rl7[] c;

    static {
        rl7 rl7Var = new rl7("Min", 0);
        a = rl7Var;
        rl7 rl7Var2 = new rl7("Max", 1);
        b = rl7Var2;
        c = new rl7[]{rl7Var, rl7Var2};
    }

    public rl7() {
        throw null;
    }

    public static rl7 valueOf(String str) {
        return (rl7) Enum.valueOf(rl7.class, str);
    }

    public static rl7[] values() {
        return (rl7[]) c.clone();
    }
}
