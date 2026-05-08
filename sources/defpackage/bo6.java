package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class bo6 {
    public static final bo6 a;
    public static final /* synthetic */ bo6[] b;

    /* JADX INFO: Fake field, exist only in values array */
    bo6 EF0;

    static {
        bo6 bo6Var = new bo6("NUMERIC", 0);
        bo6 bo6Var2 = new bo6("DIGIT2", 1);
        bo6 bo6Var3 = new bo6("UNDEFINED", 2);
        a = bo6Var3;
        b = new bo6[]{bo6Var, bo6Var2, bo6Var3};
    }

    public bo6() {
        throw null;
    }

    public static bo6 valueOf(String str) {
        return (bo6) Enum.valueOf(bo6.class, str);
    }

    public static bo6[] values() {
        return (bo6[]) b.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "numeric";
        }
        if (iOrdinal == 1) {
            return "2-digit";
        }
        if (iOrdinal == 2) {
            return "";
        }
        o6.h();
        return null;
    }
}
