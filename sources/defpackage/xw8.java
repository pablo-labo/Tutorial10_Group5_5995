package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class xw8 {
    public static final /* synthetic */ xw8[] V;
    public static final xw8 a;
    public static final xw8 b;
    public static final xw8 c;
    public static final xw8 d;
    public static final xw8 e;
    public static final xw8 f;

    static {
        xw8 xw8Var = new xw8("SUCCESS", 0);
        a = xw8Var;
        xw8 xw8Var2 = new xw8("CANCEL", 1);
        b = xw8Var2;
        xw8 xw8Var3 = new xw8("NETWORK_ERROR", 2);
        c = xw8Var3;
        xw8 xw8Var4 = new xw8("SERVER_ERROR", 3);
        d = xw8Var4;
        xw8 xw8Var5 = new xw8("AUTHENTICATION_AGENT_ERROR", 4);
        e = xw8Var5;
        xw8 xw8Var6 = new xw8("INTERNAL_ERROR", 5);
        f = xw8Var6;
        V = new xw8[]{xw8Var, xw8Var2, xw8Var3, xw8Var4, xw8Var5, xw8Var6};
    }

    public xw8() {
        throw null;
    }

    public static xw8 valueOf(String str) {
        return (xw8) Enum.valueOf(xw8.class, str);
    }

    public static xw8[] values() {
        return (xw8[]) V.clone();
    }
}
