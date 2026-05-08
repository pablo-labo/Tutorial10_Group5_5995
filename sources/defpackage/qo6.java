package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class qo6 {
    public static final qo6 a;
    public static final qo6 b;
    public static final qo6 c;
    public static final qo6 d;
    public static final /* synthetic */ qo6[] e;

    static {
        qo6 qo6Var = new qo6("DECIMAL", 0);
        a = qo6Var;
        qo6 qo6Var2 = new qo6("PERCENT", 1);
        b = qo6Var2;
        qo6 qo6Var3 = new qo6("CURRENCY", 2);
        c = qo6Var3;
        qo6 qo6Var4 = new qo6("UNIT", 3);
        d = qo6Var4;
        e = new qo6[]{qo6Var, qo6Var2, qo6Var3, qo6Var4};
    }

    public qo6() {
        throw null;
    }

    public static qo6 valueOf(String str) {
        return (qo6) Enum.valueOf(qo6.class, str);
    }

    public static qo6[] values() {
        return (qo6[]) e.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "decimal";
        }
        if (iOrdinal == 1) {
            return "percent";
        }
        if (iOrdinal == 2) {
            return "currency";
        }
        if (iOrdinal == 3) {
            return "unit";
        }
        o6.h();
        return null;
    }
}
