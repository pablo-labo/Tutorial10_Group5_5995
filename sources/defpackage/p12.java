package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class p12 {
    public static final p12 a;
    public static final p12 b;
    public static final p12 c;
    public static final p12 d;
    public static final /* synthetic */ p12[] e;

    static {
        p12 p12Var = new p12("LIST_SWIPE", 0);
        a = p12Var;
        p12 p12Var2 = new p12("LIST_LONG_PRESS", 1);
        b = p12Var2;
        p12 p12Var3 = new p12("CONVERSATION_DETAILS_BUTTON", 2);
        c = p12Var3;
        p12 p12Var4 = new p12("COMPOSE_BOX_BUTTON", 3);
        d = p12Var4;
        e = new p12[]{p12Var, p12Var2, p12Var3, p12Var4};
    }

    public p12() {
        throw null;
    }

    public static p12 valueOf(String str) {
        return (p12) Enum.valueOf(p12.class, str);
    }

    public static p12[] values() {
        return (p12[]) e.clone();
    }
}
