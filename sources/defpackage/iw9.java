package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class iw9 {
    public static final iw9 a;
    public static final iw9 b;
    public static final iw9 c;
    public static final /* synthetic */ iw9[] d;

    static {
        iw9 iw9Var = new iw9("Hidden", 0);
        a = iw9Var;
        iw9 iw9Var2 = new iw9("Expanded", 1);
        b = iw9Var2;
        iw9 iw9Var3 = new iw9("HalfExpanded", 2);
        c = iw9Var3;
        d = new iw9[]{iw9Var, iw9Var2, iw9Var3};
    }

    public iw9() {
        throw null;
    }

    public static iw9 valueOf(String str) {
        return (iw9) Enum.valueOf(iw9.class, str);
    }

    public static iw9[] values() {
        return (iw9[]) d.clone();
    }
}
