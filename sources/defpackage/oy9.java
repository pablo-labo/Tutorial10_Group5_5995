package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class oy9 {
    public static final oy9 a;
    public static final oy9 b;
    public static final /* synthetic */ oy9[] c;

    static {
        oy9 oy9Var = new oy9("MONTH", 0);
        a = oy9Var;
        oy9 oy9Var2 = new oy9("YEAR", 1);
        b = oy9Var2;
        c = new oy9[]{oy9Var, oy9Var2};
    }

    public oy9() {
        throw null;
    }

    public static oy9 valueOf(String str) {
        return (oy9) Enum.valueOf(oy9.class, str);
    }

    public static oy9[] values() {
        return (oy9[]) c.clone();
    }
}
