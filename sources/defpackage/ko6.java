package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ko6 {
    public static final ko6 a;
    public static final /* synthetic */ ko6[] b;

    static {
        ko6 ko6Var = new ko6("SHORT", 0);
        a = ko6Var;
        b = new ko6[]{ko6Var, new ko6("LONG", 1)};
    }

    public ko6() {
        throw null;
    }

    public static ko6 valueOf(String str) {
        return (ko6) Enum.valueOf(ko6.class, str);
    }

    public static ko6[] values() {
        return (ko6[]) b.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "short";
        }
        if (iOrdinal == 1) {
            return "long";
        }
        o6.h();
        return null;
    }
}
