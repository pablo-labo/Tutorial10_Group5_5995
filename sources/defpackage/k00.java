package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class k00 {
    public static final k00 a;
    public static final k00 b;
    public static final /* synthetic */ k00[] c;

    static {
        k00 k00Var = new k00("WEAK", 0);
        a = k00Var;
        k00 k00Var2 = new k00("STRONG", 1);
        b = k00Var2;
        c = new k00[]{k00Var, k00Var2};
    }

    public k00() {
        throw null;
    }

    public static k00 valueOf(String str) {
        return (k00) Enum.valueOf(k00.class, str);
    }

    public static k00[] values() {
        return (k00[]) c.clone();
    }
}
