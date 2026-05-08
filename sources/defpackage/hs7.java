package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class hs7 {
    public static final hs7 a;
    public static final hs7 b;
    public static final hs7 c;
    public static final hs7 d;
    public static final /* synthetic */ hs7[] e;

    static {
        hs7 hs7Var = new hs7("COMPLETED", 0);
        a = hs7Var;
        hs7 hs7Var2 = new hs7("DELETED", 1);
        b = hs7Var2;
        hs7 hs7Var3 = new hs7("CANCELLED", 2);
        c = hs7Var3;
        hs7 hs7Var4 = new hs7("ERROR", 3);
        d = hs7Var4;
        e = new hs7[]{hs7Var, hs7Var2, hs7Var3, hs7Var4};
    }

    public hs7() {
        throw null;
    }

    public static hs7 valueOf(String str) {
        return (hs7) Enum.valueOf(hs7.class, str);
    }

    public static hs7[] values() {
        return (hs7[]) e.clone();
    }
}
