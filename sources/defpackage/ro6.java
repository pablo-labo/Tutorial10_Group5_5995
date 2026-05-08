package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ro6 {
    public static final /* synthetic */ ro6[] a = {new ro6("SHORT", 0), new ro6("NARROW", 1), new ro6("LONG", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    ro6 EF5;

    public ro6() {
        throw null;
    }

    public static ro6 valueOf(String str) {
        return (ro6) Enum.valueOf(ro6.class, str);
    }

    public static ro6[] values() {
        return (ro6[]) a.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "short";
        }
        if (iOrdinal == 1) {
            return "narrow";
        }
        if (iOrdinal == 2) {
            return "long";
        }
        o6.h();
        return null;
    }
}
