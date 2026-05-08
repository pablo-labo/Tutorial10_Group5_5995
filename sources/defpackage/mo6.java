package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class mo6 {
    public static final mo6 a;
    public static final mo6 b;
    public static final /* synthetic */ mo6[] c;

    static {
        mo6 mo6Var = new mo6("STANDARD", 0);
        a = mo6Var;
        mo6 mo6Var2 = new mo6("ACCOUNTING", 1);
        b = mo6Var2;
        c = new mo6[]{mo6Var, mo6Var2};
    }

    public mo6() {
        throw null;
    }

    public static mo6 valueOf(String str) {
        return (mo6) Enum.valueOf(mo6.class, str);
    }

    public static mo6[] values() {
        return (mo6[]) c.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "standard";
        }
        if (iOrdinal == 1) {
            return "accounting";
        }
        o6.h();
        return null;
    }
}
