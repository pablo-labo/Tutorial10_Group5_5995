package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class eo6 {
    public static final eo6 a;
    public static final /* synthetic */ eo6[] b;

    /* JADX INFO: Fake field, exist only in values array */
    eo6 EF0;

    static {
        eo6 eo6Var = new eo6("NUMERIC", 0);
        eo6 eo6Var2 = new eo6("DIGIT2", 1);
        eo6 eo6Var3 = new eo6("LONG", 2);
        eo6 eo6Var4 = new eo6("SHORT", 3);
        eo6 eo6Var5 = new eo6("NARROW", 4);
        eo6 eo6Var6 = new eo6("UNDEFINED", 5);
        a = eo6Var6;
        b = new eo6[]{eo6Var, eo6Var2, eo6Var3, eo6Var4, eo6Var5, eo6Var6};
    }

    public eo6() {
        throw null;
    }

    public static eo6 valueOf(String str) {
        return (eo6) Enum.valueOf(eo6.class, str);
    }

    public static eo6[] values() {
        return (eo6[]) b.clone();
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
            return "long";
        }
        if (iOrdinal == 3) {
            return "short";
        }
        if (iOrdinal == 4) {
            return "narrow";
        }
        if (iOrdinal == 5) {
            return "";
        }
        o6.h();
        return null;
    }
}
