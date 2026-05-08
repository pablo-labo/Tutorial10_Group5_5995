package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ff7 {
    public static final ff7 a;
    public static final ff7 b;
    public static final ff7 c;
    public static final /* synthetic */ ff7[] d;

    static {
        ff7 ff7Var = new ff7("Focused", 0);
        a = ff7Var;
        ff7 ff7Var2 = new ff7("UnfocusedEmpty", 1);
        b = ff7Var2;
        ff7 ff7Var3 = new ff7("UnfocusedNotEmpty", 2);
        c = ff7Var3;
        d = new ff7[]{ff7Var, ff7Var2, ff7Var3};
    }

    public ff7() {
        throw null;
    }

    public static ff7 valueOf(String str) {
        return (ff7) Enum.valueOf(ff7.class, str);
    }

    public static ff7[] values() {
        return (ff7[]) d.clone();
    }
}
