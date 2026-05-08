package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class i05 {
    public static final i05 V;
    public static final i05 W;
    public static final /* synthetic */ i05[] X;
    public static final i05 a;
    public static final i05 b;
    public static final i05 c;
    public static final i05 d;
    public static final i05 e;
    public static final i05 f;

    static {
        i05 i05Var = new i05("MODULE_CREATE", 0);
        a = i05Var;
        i05 i05Var2 = new i05("MODULE_DESTROY", 1);
        b = i05Var2;
        i05 i05Var3 = new i05("ACTIVITY_ENTERS_FOREGROUND", 2);
        c = i05Var3;
        i05 i05Var4 = new i05("ACTIVITY_ENTERS_BACKGROUND", 3);
        d = i05Var4;
        i05 i05Var5 = new i05("ACTIVITY_DESTROYS", 4);
        e = i05Var5;
        i05 i05Var6 = new i05("ON_NEW_INTENT", 5);
        f = i05Var6;
        i05 i05Var7 = new i05("ON_ACTIVITY_RESULT", 6);
        V = i05Var7;
        i05 i05Var8 = new i05("ON_USER_LEAVES_ACTIVITY", 7);
        W = i05Var8;
        X = new i05[]{i05Var, i05Var2, i05Var3, i05Var4, i05Var5, i05Var6, i05Var7, i05Var8};
    }

    public i05() {
        throw null;
    }

    public static i05 valueOf(String str) {
        return (i05) Enum.valueOf(i05.class, str);
    }

    public static i05[] values() {
        return (i05[]) X.clone();
    }
}
