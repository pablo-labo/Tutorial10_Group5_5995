package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class wn6 {
    public static final wn6 a;
    public static final wn6 b;
    public static final /* synthetic */ wn6[] c;

    static {
        wn6 wn6Var = new wn6("SORT", 0);
        a = wn6Var;
        wn6 wn6Var2 = new wn6("SEARCH", 1);
        b = wn6Var2;
        c = new wn6[]{wn6Var, wn6Var2};
    }

    public wn6() {
        throw null;
    }

    public static wn6 valueOf(String str) {
        return (wn6) Enum.valueOf(wn6.class, str);
    }

    public static wn6[] values() {
        return (wn6[]) c.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "sort";
        }
        if (iOrdinal == 1) {
            return "search";
        }
        o6.h();
        return null;
    }
}
