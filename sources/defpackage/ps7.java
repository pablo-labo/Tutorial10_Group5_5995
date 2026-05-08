package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ps7 {
    public static final ps7 a;
    public static final ps7 b;
    public static final ps7 c;
    public static final ps7 d;
    public static final ps7 e;
    public static final /* synthetic */ ps7[] f;

    static {
        ps7 ps7Var = new ps7("RESUME_ITEM_BUILT", 0);
        a = ps7Var;
        ps7 ps7Var2 = new ps7("COMPLETED", 1);
        b = ps7Var2;
        ps7 ps7Var3 = new ps7("DELETED", 2);
        c = ps7Var3;
        ps7 ps7Var4 = new ps7("CANCELLED", 3);
        d = ps7Var4;
        ps7 ps7Var5 = new ps7("ERROR", 4);
        e = ps7Var5;
        f = new ps7[]{ps7Var, ps7Var2, ps7Var3, ps7Var4, ps7Var5};
    }

    public ps7() {
        throw null;
    }

    public static ps7 valueOf(String str) {
        return (ps7) Enum.valueOf(ps7.class, str);
    }

    public static ps7[] values() {
        return (ps7[]) f.clone();
    }
}
