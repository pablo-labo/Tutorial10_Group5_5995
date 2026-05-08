package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class hx7 {
    public static final hx7 a;
    public static final hx7 b;
    public static final /* synthetic */ hx7[] c;

    static {
        hx7 hx7Var = new hx7("Matched", 0);
        a = hx7Var;
        hx7 hx7Var2 = new hx7("Neutral", 1);
        b = hx7Var2;
        c = new hx7[]{hx7Var, hx7Var2, new hx7("Unmatched", 2)};
    }

    public hx7() {
        throw null;
    }

    public static hx7 valueOf(String str) {
        return (hx7) Enum.valueOf(hx7.class, str);
    }

    public static hx7[] values() {
        return (hx7[]) c.clone();
    }
}
