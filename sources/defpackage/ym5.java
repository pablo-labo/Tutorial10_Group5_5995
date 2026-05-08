package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ym5 implements xm5 {
    public static final ym5 a;
    public static final ym5 b;
    public static final ym5 c;
    public static final ym5 d;
    public static final /* synthetic */ ym5[] e;

    static {
        ym5 ym5Var = new ym5("Active", 0);
        a = ym5Var;
        ym5 ym5Var2 = new ym5("ActiveParent", 1);
        b = ym5Var2;
        ym5 ym5Var3 = new ym5("Captured", 2);
        c = ym5Var3;
        ym5 ym5Var4 = new ym5("Inactive", 3);
        d = ym5Var4;
        e = new ym5[]{ym5Var, ym5Var2, ym5Var3, ym5Var4};
    }

    public ym5() {
        throw null;
    }

    public static ym5 valueOf(String str) {
        return (ym5) Enum.valueOf(ym5.class, str);
    }

    public static ym5[] values() {
        return (ym5[]) e.clone();
    }

    @Override // defpackage.xm5
    public final boolean a() {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return false;
                }
                l.g();
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.xm5
    public final boolean c() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3) {
            return false;
        }
        l.g();
        return false;
    }
}
