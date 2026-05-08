package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class x49 {
    public static final x49 a;
    public static final x49 b;
    public static final /* synthetic */ x49[] c;

    static {
        x49 x49Var = new x49("CANCELLED", 0);
        a = x49Var;
        x49 x49Var2 = new x49("COMPLETED", 1);
        b = x49Var2;
        c = new x49[]{x49Var, x49Var2};
    }

    public x49() {
        throw null;
    }

    public static x49 valueOf(String str) {
        return (x49) Enum.valueOf(x49.class, str);
    }

    public static x49[] values() {
        return (x49[]) c.clone();
    }
}
