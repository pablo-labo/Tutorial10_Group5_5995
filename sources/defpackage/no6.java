package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class no6 {
    public static final no6 a;
    public static final no6 b;
    public static final no6 c;
    public static final /* synthetic */ no6[] d;

    /* JADX INFO: Fake field, exist only in values array */
    no6 EF0;

    static {
        no6 no6Var = new no6("STANDARD", 0);
        no6 no6Var2 = new no6("SCIENTIFIC", 1);
        a = no6Var2;
        no6 no6Var3 = new no6("ENGINEERING", 2);
        b = no6Var3;
        no6 no6Var4 = new no6("COMPACT", 3);
        c = no6Var4;
        d = new no6[]{no6Var, no6Var2, no6Var3, no6Var4};
    }

    public no6() {
        throw null;
    }

    public static no6 valueOf(String str) {
        return (no6) Enum.valueOf(no6.class, str);
    }

    public static no6[] values() {
        return (no6[]) d.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "standard";
        }
        if (iOrdinal == 1) {
            return "scientific";
        }
        if (iOrdinal == 2) {
            return "engineering";
        }
        if (iOrdinal == 3) {
            return "compact";
        }
        o6.h();
        return null;
    }
}
