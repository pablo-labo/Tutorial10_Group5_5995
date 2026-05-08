package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class io6 {
    public static final io6 a;
    public static final /* synthetic */ io6[] b;

    /* JADX INFO: Fake field, exist only in values array */
    io6 EF0;

    static {
        io6 io6Var = new io6("LONG", 0);
        io6 io6Var2 = new io6("SHORT", 1);
        io6 io6Var3 = new io6("NARROW", 2);
        io6 io6Var4 = new io6("UNDEFINED", 3);
        a = io6Var4;
        b = new io6[]{io6Var, io6Var2, io6Var3, io6Var4};
    }

    public io6() {
        throw null;
    }

    public static io6 valueOf(String str) {
        return (io6) Enum.valueOf(io6.class, str);
    }

    public static io6[] values() {
        return (io6[]) b.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "long";
        }
        if (iOrdinal == 1) {
            return "short";
        }
        if (iOrdinal == 2) {
            return "narrow";
        }
        if (iOrdinal == 3) {
            return "";
        }
        o6.h();
        return null;
    }
}
