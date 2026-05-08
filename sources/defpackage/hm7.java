package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class hm7 {
    public static final hm7 a;
    public static final hm7 b;
    public static final hm7 c;
    public static final hm7 d;
    public static final /* synthetic */ hm7[] e;

    static {
        hm7 hm7Var = new hm7("LookaheadMeasurement", 0);
        a = hm7Var;
        hm7 hm7Var2 = new hm7("LookaheadPlacement", 1);
        b = hm7Var2;
        hm7 hm7Var3 = new hm7("Measurement", 2);
        c = hm7Var3;
        hm7 hm7Var4 = new hm7("Placement", 3);
        d = hm7Var4;
        e = new hm7[]{hm7Var, hm7Var2, hm7Var3, hm7Var4};
    }

    public hm7() {
        throw null;
    }

    public static hm7 valueOf(String str) {
        return (hm7) Enum.valueOf(hm7.class, str);
    }

    public static hm7[] values() {
        return (hm7[]) e.clone();
    }
}
