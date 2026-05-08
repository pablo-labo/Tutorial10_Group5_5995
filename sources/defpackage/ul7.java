package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ul7 {
    public static final ul7 a;
    public static final ul7 b;
    public static final /* synthetic */ ul7[] c;

    static {
        ul7 ul7Var = new ul7("Width", 0);
        a = ul7Var;
        ul7 ul7Var2 = new ul7("Height", 1);
        b = ul7Var2;
        c = new ul7[]{ul7Var, ul7Var2};
    }

    public ul7() {
        throw null;
    }

    public static ul7 valueOf(String str) {
        return (ul7) Enum.valueOf(ul7.class, str);
    }

    public static ul7[] values() {
        return (ul7[]) c.clone();
    }
}
