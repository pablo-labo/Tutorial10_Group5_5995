package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class fg4 {
    public static final fg4 a;
    public static final fg4 b;
    public static final /* synthetic */ fg4[] c;

    /* JADX INFO: Fake field, exist only in values array */
    fg4 EF0;

    static {
        fg4 fg4Var = new fg4("HOME", 0);
        fg4 fg4Var2 = new fg4("TITLE", 1);
        a = fg4Var2;
        fg4 fg4Var3 = new fg4("STATE_SELECTOR", 2);
        b = fg4Var3;
        c = new fg4[]{fg4Var, fg4Var2, fg4Var3};
    }

    public fg4() {
        throw null;
    }

    public static fg4 valueOf(String str) {
        return (fg4) Enum.valueOf(fg4.class, str);
    }

    public static fg4[] values() {
        return (fg4[]) c.clone();
    }
}
