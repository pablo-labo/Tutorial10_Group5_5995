package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class zn6 {
    public static final zn6 a;
    public static final /* synthetic */ zn6[] b;

    /* JADX INFO: Fake field, exist only in values array */
    zn6 EF0;

    static {
        zn6 zn6Var = new zn6("LONG", 0);
        zn6 zn6Var2 = new zn6("SHORT", 1);
        zn6 zn6Var3 = new zn6("NARROW", 2);
        zn6 zn6Var4 = new zn6("UNDEFINED", 3);
        a = zn6Var4;
        b = new zn6[]{zn6Var, zn6Var2, zn6Var3, zn6Var4};
    }

    public zn6() {
        throw null;
    }

    public static zn6 valueOf(String str) {
        return (zn6) Enum.valueOf(zn6.class, str);
    }

    public static zn6[] values() {
        return (zn6[]) b.clone();
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
