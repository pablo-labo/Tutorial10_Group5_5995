package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class jt5 {
    public static final jt5 a;
    public static final jt5 b;
    public static final /* synthetic */ jt5[] c;

    static {
        jt5 jt5Var = new jt5("FROM", 0);
        a = jt5Var;
        jt5 jt5Var2 = new jt5("TO", 1);
        b = jt5Var2;
        c = new jt5[]{jt5Var, jt5Var2};
    }

    public jt5() {
        throw null;
    }

    public static jt5 valueOf(String str) {
        return (jt5) Enum.valueOf(jt5.class, str);
    }

    public static jt5[] values() {
        return (jt5[]) c.clone();
    }
}
