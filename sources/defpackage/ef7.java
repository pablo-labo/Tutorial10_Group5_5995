package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ef7 {
    public static final ef7 a;
    public static final ef7 b;
    public static final ef7 c;
    public static final /* synthetic */ ef7[] d;

    static {
        ef7 ef7Var = new ef7("Focused", 0);
        a = ef7Var;
        ef7 ef7Var2 = new ef7("UnfocusedEmpty", 1);
        b = ef7Var2;
        ef7 ef7Var3 = new ef7("UnfocusedNotEmpty", 2);
        c = ef7Var3;
        d = new ef7[]{ef7Var, ef7Var2, ef7Var3};
    }

    public ef7() {
        throw null;
    }

    public static ef7 valueOf(String str) {
        return (ef7) Enum.valueOf(ef7.class, str);
    }

    public static ef7[] values() {
        return (ef7[]) d.clone();
    }
}
