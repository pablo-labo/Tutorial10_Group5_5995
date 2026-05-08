package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class fo6 {
    public static final fo6 a;
    public static final /* synthetic */ fo6[] b;

    /* JADX INFO: Fake field, exist only in values array */
    fo6 EF0;

    static {
        fo6 fo6Var = new fo6("NUMERIC", 0);
        fo6 fo6Var2 = new fo6("DIGIT2", 1);
        fo6 fo6Var3 = new fo6("UNDEFINED", 2);
        a = fo6Var3;
        b = new fo6[]{fo6Var, fo6Var2, fo6Var3};
    }

    public fo6() {
        throw null;
    }

    public static fo6 valueOf(String str) {
        return (fo6) Enum.valueOf(fo6.class, str);
    }

    public static fo6[] values() {
        return (fo6[]) b.clone();
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
