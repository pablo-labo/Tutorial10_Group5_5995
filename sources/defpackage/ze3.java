package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ze3 {
    public static final ze3 a;
    public static final ze3 b;
    public static final ze3 c;
    public static final ze3 d;
    public static final /* synthetic */ ze3[] e;

    static {
        ze3 ze3Var = new ze3("MEMORY_CACHE", 0);
        a = ze3Var;
        ze3 ze3Var2 = new ze3("MEMORY", 1);
        b = ze3Var2;
        ze3 ze3Var3 = new ze3("DISK", 2);
        c = ze3Var3;
        ze3 ze3Var4 = new ze3("NETWORK", 3);
        d = ze3Var4;
        e = new ze3[]{ze3Var, ze3Var2, ze3Var3, ze3Var4};
    }

    public ze3() {
        throw null;
    }

    public static ze3 valueOf(String str) {
        return (ze3) Enum.valueOf(ze3.class, str);
    }

    public static ze3[] values() {
        return (ze3[]) e.clone();
    }
}
