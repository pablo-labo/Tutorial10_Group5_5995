package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class na3 {
    public static final na3 a;
    public static final na3 b;
    public static final na3 c;
    public static final /* synthetic */ na3[] d;

    static {
        na3 na3Var = new na3("None", 0);
        a = na3Var;
        na3 na3Var2 = new na3("Cancelled", 1);
        b = na3Var2;
        na3 na3Var3 = new na3("Redirected", 2);
        c = na3Var3;
        d = new na3[]{na3Var, na3Var2, na3Var3, new na3("RedirectCancelled", 3)};
    }

    public na3() {
        throw null;
    }

    public static na3 valueOf(String str) {
        return (na3) Enum.valueOf(na3.class, str);
    }

    public static na3[] values() {
        return (na3[]) d.clone();
    }
}
