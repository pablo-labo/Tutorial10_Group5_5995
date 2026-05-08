package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class lo6 {
    public static final lo6 a;
    public static final lo6 b;
    public static final /* synthetic */ lo6[] c;

    static {
        lo6 lo6Var = new lo6("SYMBOL", 0);
        a = lo6Var;
        lo6 lo6Var2 = new lo6("NARROWSYMBOL", 1);
        lo6 lo6Var3 = new lo6("CODE", 2);
        b = lo6Var3;
        c = new lo6[]{lo6Var, lo6Var2, lo6Var3, new lo6("NAME", 3)};
    }

    public lo6() {
        throw null;
    }

    public static lo6 valueOf(String str) {
        return (lo6) Enum.valueOf(lo6.class, str);
    }

    public static lo6[] values() {
        return (lo6[]) c.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "symbol";
        }
        if (iOrdinal == 1) {
            return "narrowSymbol";
        }
        if (iOrdinal == 2) {
            return "code";
        }
        if (iOrdinal == 3) {
            return "name";
        }
        o6.h();
        return null;
    }
}
