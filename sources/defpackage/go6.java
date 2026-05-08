package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class go6 {
    public static final go6 a;
    public static final /* synthetic */ go6[] b;

    /* JADX INFO: Fake field, exist only in values array */
    go6 EF0;

    static {
        go6 go6Var = new go6("FULL", 0);
        go6 go6Var2 = new go6("LONG", 1);
        go6 go6Var3 = new go6("MEDIUM", 2);
        go6 go6Var4 = new go6("SHORT", 3);
        go6 go6Var5 = new go6("UNDEFINED", 4);
        a = go6Var5;
        b = new go6[]{go6Var, go6Var2, go6Var3, go6Var4, go6Var5};
    }

    public go6() {
        throw null;
    }

    public static go6 valueOf(String str) {
        return (go6) Enum.valueOf(go6.class, str);
    }

    public static go6[] values() {
        return (go6[]) b.clone();
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
