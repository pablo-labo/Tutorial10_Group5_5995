package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class un6 {
    public static final /* synthetic */ un6[] a = {new un6("UPPER", 0), new un6("LOWER", 1), new un6("FALSE", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    un6 EF5;

    public un6() {
        throw null;
    }

    public static un6 valueOf(String str) {
        return (un6) Enum.valueOf(un6.class, str);
    }

    public static un6[] values() {
        return (un6[]) a.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "upper";
        }
        if (iOrdinal == 1) {
            return "lower";
        }
        if (iOrdinal == 2) {
            return "false";
        }
        o6.h();
        return null;
    }
}
