package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class jf6 {
    public static final jf6 a;
    public static final jf6 b;
    public static final jf6 c;
    public static final /* synthetic */ jf6[] d;

    static {
        jf6 jf6Var = new jf6("Cursor", 0);
        a = jf6Var;
        jf6 jf6Var2 = new jf6("SelectionStart", 1);
        b = jf6Var2;
        jf6 jf6Var3 = new jf6("SelectionEnd", 2);
        c = jf6Var3;
        d = new jf6[]{jf6Var, jf6Var2, jf6Var3};
    }

    public jf6() {
        throw null;
    }

    public static jf6 valueOf(String str) {
        return (jf6) Enum.valueOf(jf6.class, str);
    }

    public static jf6[] values() {
        return (jf6[]) d.clone();
    }
}
