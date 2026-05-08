package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ig8 {
    public static final ig8 a;
    public static final ig8 b;
    public static final ig8 c;
    public static final /* synthetic */ ig8[] d;

    static {
        ig8 ig8Var = new ig8("INVARIANT", 0);
        a = ig8Var;
        ig8 ig8Var2 = new ig8("IN", 1);
        b = ig8Var2;
        ig8 ig8Var3 = new ig8("OUT", 2);
        c = ig8Var3;
        d = new ig8[]{ig8Var, ig8Var2, ig8Var3};
    }

    public ig8() {
        throw null;
    }

    public static ig8 valueOf(String str) {
        return (ig8) Enum.valueOf(ig8.class, str);
    }

    public static ig8[] values() {
        return (ig8[]) d.clone();
    }
}
