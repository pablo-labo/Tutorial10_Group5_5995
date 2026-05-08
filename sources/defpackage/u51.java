package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class u51 {
    public static final u51 a;
    public static final u51 b;
    public static final /* synthetic */ u51[] c;
    public static final /* synthetic */ wv4 d;

    static {
        u51 u51Var = new u51("NEUTRAL", 0);
        a = u51Var;
        u51 u51Var2 = new u51("EARTH", 1);
        u51 u51Var3 = new u51("ORANGE", 2);
        u51 u51Var4 = new u51("MAGENTA", 3);
        u51 u51Var5 = new u51("PURPLE", 4);
        u51 u51Var6 = new u51("BLUE", 5);
        b = u51Var6;
        u51[] u51VarArr = {u51Var, u51Var2, u51Var3, u51Var4, u51Var5, u51Var6, new u51("AQUA", 6), new u51("GREEN", 7)};
        c = u51VarArr;
        d = new wv4(u51VarArr);
    }

    public u51() {
        throw null;
    }

    public static u51 valueOf(String str) {
        return (u51) Enum.valueOf(u51.class, str);
    }

    public static u51[] values() {
        return (u51[]) c.clone();
    }
}
