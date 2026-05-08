package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ya6 {
    public static final ya6 a;
    public static final ya6 b;
    public static final ya6 c;
    public static final /* synthetic */ ya6[] d;

    static {
        ya6 ya6Var = new ya6("HIDDEN", 0);
        a = ya6Var;
        ya6 ya6Var2 = new ya6("CONTINUE_WITH_GOOGLE_TEXT", 1);
        b = ya6Var2;
        ya6 ya6Var3 = new ya6("SIGN_IN_WITH_GOOGLE_TEXT", 2);
        c = ya6Var3;
        d = new ya6[]{ya6Var, ya6Var2, ya6Var3};
    }

    public ya6() {
        throw null;
    }

    public static ya6 valueOf(String str) {
        return (ya6) Enum.valueOf(ya6.class, str);
    }

    public static ya6[] values() {
        return (ya6[]) d.clone();
    }
}
