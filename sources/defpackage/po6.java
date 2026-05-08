package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class po6 {
    public static final po6 a;
    public static final /* synthetic */ po6[] b;

    static {
        po6 po6Var = new po6("AUTO", 0);
        a = po6Var;
        b = new po6[]{po6Var, new po6("ALWAYS", 1), new po6("NEVER", 2), new po6("EXCEPTZERO", 3)};
    }

    public po6() {
        throw null;
    }

    public static po6 valueOf(String str) {
        return (po6) Enum.valueOf(po6.class, str);
    }

    public static po6[] values() {
        return (po6[]) b.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "auto";
        }
        if (iOrdinal == 1) {
            return "always";
        }
        if (iOrdinal == 2) {
            return "never";
        }
        if (iOrdinal == 3) {
            return "exceptZero";
        }
        o6.h();
        return null;
    }
}
