package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class pu8 {
    public static final pu8 a;
    public static final pu8 b;
    public static final /* synthetic */ pu8[] c;

    static {
        pu8 pu8Var = new pu8("POINT", 0);
        a = pu8Var;
        pu8 pu8Var2 = new pu8("PERCENT", 1);
        b = pu8Var2;
        c = new pu8[]{pu8Var, pu8Var2};
    }

    public pu8() {
        throw null;
    }

    public static pu8 valueOf(String str) {
        return (pu8) Enum.valueOf(pu8.class, str);
    }

    public static pu8[] values() {
        return (pu8[]) c.clone();
    }
}
