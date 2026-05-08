package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class hj7 {
    public static final /* synthetic */ hj7[] V;
    public static final a a;
    public static final hj7 b;
    public static final hj7 c;
    public static final hj7 d;
    public static final hj7 e;
    public static final hj7 f;

    public static final class a {
    }

    static {
        hj7 hj7Var = new hj7("LINEAR", 0);
        b = hj7Var;
        hj7 hj7Var2 = new hj7("EASE_IN", 1);
        c = hj7Var2;
        hj7 hj7Var3 = new hj7("EASE_OUT", 2);
        d = hj7Var3;
        hj7 hj7Var4 = new hj7("EASE_IN_EASE_OUT", 3);
        e = hj7Var4;
        hj7 hj7Var5 = new hj7("SPRING", 4);
        f = hj7Var5;
        V = new hj7[]{hj7Var, hj7Var2, hj7Var3, hj7Var4, hj7Var5};
        a = new a();
    }

    public hj7() {
        throw null;
    }

    public static hj7 valueOf(String str) {
        return (hj7) Enum.valueOf(hj7.class, str);
    }

    public static hj7[] values() {
        return (hj7[]) V.clone();
    }
}
