package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class do6 {
    public static final do6 a;
    public static final /* synthetic */ do6[] b;

    /* JADX INFO: Fake field, exist only in values array */
    do6 EF0;

    static {
        do6 do6Var = new do6("NUMERIC", 0);
        do6 do6Var2 = new do6("DIGIT2", 1);
        do6 do6Var3 = new do6("UNDEFINED", 2);
        a = do6Var3;
        b = new do6[]{do6Var, do6Var2, do6Var3};
    }

    public do6() {
        throw null;
    }

    public static do6 valueOf(String str) {
        return (do6) Enum.valueOf(do6.class, str);
    }

    public static do6[] values() {
        return (do6[]) b.clone();
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
