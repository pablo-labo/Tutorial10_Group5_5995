package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class xn6 {
    public static final xn6 a;
    public static final /* synthetic */ xn6[] b;

    /* JADX INFO: Fake field, exist only in values array */
    xn6 EF0;

    static {
        xn6 xn6Var = new xn6("FULL", 0);
        xn6 xn6Var2 = new xn6("LONG", 1);
        xn6 xn6Var3 = new xn6("MEDIUM", 2);
        xn6 xn6Var4 = new xn6("SHORT", 3);
        xn6 xn6Var5 = new xn6("UNDEFINED", 4);
        a = xn6Var5;
        b = new xn6[]{xn6Var, xn6Var2, xn6Var3, xn6Var4, xn6Var5};
    }

    public xn6() {
        throw null;
    }

    public static xn6 valueOf(String str) {
        return (xn6) Enum.valueOf(xn6.class, str);
    }

    public static xn6[] values() {
        return (xn6[]) b.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "full";
        }
        if (iOrdinal == 1) {
            return "long";
        }
        if (iOrdinal == 2) {
            return "medium";
        }
        if (iOrdinal == 3) {
            return "short";
        }
        if (iOrdinal == 4) {
            return "";
        }
        o6.h();
        return null;
    }
}
