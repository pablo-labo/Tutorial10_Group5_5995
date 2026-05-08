package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class we3 {
    public static final we3 a;
    public static final we3 b;
    public static final we3 c;
    public static final we3 d;
    public static final /* synthetic */ we3[] e;

    static {
        we3 we3Var = new we3("MEMORY_CACHE", 0);
        a = we3Var;
        we3 we3Var2 = new we3("MEMORY", 1);
        b = we3Var2;
        we3 we3Var3 = new we3("DISK", 2);
        c = we3Var3;
        we3 we3Var4 = new we3("NETWORK", 3);
        d = we3Var4;
        e = new we3[]{we3Var, we3Var2, we3Var3, we3Var4};
    }

    public we3() {
        throw null;
    }

    public static we3 valueOf(String str) {
        return (we3) Enum.valueOf(we3.class, str);
    }

    public static we3[] values() {
        return (we3[]) e.clone();
    }
}
