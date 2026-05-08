package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class n12 {
    public static final n12 a;
    public static final n12 b;
    public static final n12 c;
    public static final /* synthetic */ n12[] d;

    static {
        n12 n12Var = new n12("READY", 0);
        a = n12Var;
        n12 n12Var2 = new n12("LOADING", 1);
        b = n12Var2;
        n12 n12Var3 = new n12("ERROR", 2);
        c = n12Var3;
        d = new n12[]{n12Var, n12Var2, n12Var3};
    }

    public n12() {
        throw null;
    }

    public static n12 valueOf(String str) {
        return (n12) Enum.valueOf(n12.class, str);
    }

    public static n12[] values() {
        return (n12[]) d.clone();
    }
}
