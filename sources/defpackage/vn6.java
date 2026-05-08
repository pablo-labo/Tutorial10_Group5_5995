package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class vn6 {
    public static final vn6 a;
    public static final vn6 b;
    public static final vn6 c;
    public static final vn6 d;
    public static final vn6 e;
    public static final /* synthetic */ vn6[] f;

    static {
        vn6 vn6Var = new vn6("BASE", 0);
        a = vn6Var;
        vn6 vn6Var2 = new vn6("ACCENT", 1);
        b = vn6Var2;
        vn6 vn6Var3 = new vn6("CASE", 2);
        c = vn6Var3;
        vn6 vn6Var4 = new vn6("VARIANT", 3);
        d = vn6Var4;
        vn6 vn6Var5 = new vn6("LOCALE", 4);
        e = vn6Var5;
        f = new vn6[]{vn6Var, vn6Var2, vn6Var3, vn6Var4, vn6Var5};
    }

    public vn6() {
        throw null;
    }

    public static vn6 valueOf(String str) {
        return (vn6) Enum.valueOf(vn6.class, str);
    }

    public static vn6[] values() {
        return (vn6[]) f.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "base";
        }
        if (iOrdinal == 1) {
            return "accent";
        }
        if (iOrdinal == 2) {
            return "case";
        }
        if (iOrdinal == 3) {
            return "variant";
        }
        if (iOrdinal == 4) {
            return "";
        }
        o6.h();
        return null;
    }
}
