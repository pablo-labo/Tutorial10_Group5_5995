package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class y49 {
    public static final y49 a;
    public static final y49 b;
    public static final /* synthetic */ y49[] c;

    static {
        y49 y49Var = new y49("SIGNED_IN", 0);
        a = y49Var;
        y49 y49Var2 = new y49("SIGNED_OUT", 1);
        b = y49Var2;
        c = new y49[]{y49Var, y49Var2};
    }

    public y49() {
        throw null;
    }

    public static y49 valueOf(String str) {
        return (y49) Enum.valueOf(y49.class, str);
    }

    public static y49[] values() {
        return (y49[]) c.clone();
    }
}
