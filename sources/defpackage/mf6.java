package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class mf6 {
    public static final mf6 a;
    public static final mf6 b;
    public static final mf6 c;
    public static final /* synthetic */ mf6[] d;

    static {
        mf6 mf6Var = new mf6("None", 0);
        a = mf6Var;
        mf6 mf6Var2 = new mf6("Selection", 1);
        b = mf6Var2;
        mf6 mf6Var3 = new mf6("Cursor", 2);
        c = mf6Var3;
        d = new mf6[]{mf6Var, mf6Var2, mf6Var3};
    }

    public mf6() {
        throw null;
    }

    public static mf6 valueOf(String str) {
        return (mf6) Enum.valueOf(mf6.class, str);
    }

    public static mf6[] values() {
        return (mf6[]) d.clone();
    }
}
