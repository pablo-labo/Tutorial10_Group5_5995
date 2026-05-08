package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ao6 {
    public static final /* synthetic */ ao6[] a = {new ao6("BESTFIT", 0), new ao6("BASIC", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    ao6 EF5;

    public ao6() {
        throw null;
    }

    public static ao6 valueOf(String str) {
        return (ao6) Enum.valueOf(ao6.class, str);
    }

    public static ao6[] values() {
        return (ao6[]) a.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "best fit";
        }
        if (iOrdinal == 1) {
            return "basic";
        }
        o6.h();
        return null;
    }
}
