package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class yn6 {
    public static final yn6 a;
    public static final /* synthetic */ yn6[] b;

    /* JADX INFO: Fake field, exist only in values array */
    yn6 EF0;

    static {
        yn6 yn6Var = new yn6("NUMERIC", 0);
        yn6 yn6Var2 = new yn6("DIGIT2", 1);
        yn6 yn6Var3 = new yn6("UNDEFINED", 2);
        a = yn6Var3;
        b = new yn6[]{yn6Var, yn6Var2, yn6Var3};
    }

    public yn6() {
        throw null;
    }

    public static yn6 valueOf(String str) {
        return (yn6) Enum.valueOf(yn6.class, str);
    }

    public static yn6[] values() {
        return (yn6[]) b.clone();
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
