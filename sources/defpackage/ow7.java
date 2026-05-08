package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ow7 {
    public static final ow7 a;
    public static final ow7 b;
    public static final ow7 c;
    public static final /* synthetic */ ow7[] d;

    static {
        ow7 ow7Var = new ow7("INFLEXIBLE", 0);
        a = ow7Var;
        ow7 ow7Var2 = new ow7("FLEXIBLE_UPPER_BOUND", 1);
        b = ow7Var2;
        ow7 ow7Var3 = new ow7("FLEXIBLE_LOWER_BOUND", 2);
        c = ow7Var3;
        d = new ow7[]{ow7Var, ow7Var2, ow7Var3};
    }

    public ow7() {
        throw null;
    }

    public static ow7 valueOf(String str) {
        return (ow7) Enum.valueOf(ow7.class, str);
    }

    public static ow7[] values() {
        return (ow7[]) d.clone();
    }
}
