package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class jo6 {
    public static final jo6 a;
    public static final /* synthetic */ jo6[] b;

    /* JADX INFO: Fake field, exist only in values array */
    jo6 EF0;

    static {
        jo6 jo6Var = new jo6("NUMERIC", 0);
        jo6 jo6Var2 = new jo6("DIGIT2", 1);
        jo6 jo6Var3 = new jo6("UNDEFINED", 2);
        a = jo6Var3;
        b = new jo6[]{jo6Var, jo6Var2, jo6Var3};
    }

    public jo6() {
        throw null;
    }

    public static jo6 valueOf(String str) {
        return (jo6) Enum.valueOf(jo6.class, str);
    }

    public static jo6[] values() {
        return (jo6[]) b.clone();
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
