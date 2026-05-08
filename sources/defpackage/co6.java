package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class co6 {
    public static final co6 a;
    public static final co6 b;
    public static final co6 c;
    public static final co6 d;
    public static final co6 e;
    public static final /* synthetic */ co6[] f;

    static {
        co6 co6Var = new co6("H11", 0);
        a = co6Var;
        co6 co6Var2 = new co6("H12", 1);
        b = co6Var2;
        co6 co6Var3 = new co6("H23", 2);
        c = co6Var3;
        co6 co6Var4 = new co6("H24", 3);
        d = co6Var4;
        co6 co6Var5 = new co6("UNDEFINED", 4);
        e = co6Var5;
        f = new co6[]{co6Var, co6Var2, co6Var3, co6Var4, co6Var5};
    }

    public co6() {
        throw null;
    }

    public static co6 valueOf(String str) {
        return (co6) Enum.valueOf(co6.class, str);
    }

    public static co6[] values() {
        return (co6[]) f.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "h11";
        }
        if (iOrdinal == 1) {
            return "h12";
        }
        if (iOrdinal == 2) {
            return "h23";
        }
        if (iOrdinal == 3) {
            return "h24";
        }
        if (iOrdinal == 4) {
            return "";
        }
        o6.h();
        return null;
    }
}
