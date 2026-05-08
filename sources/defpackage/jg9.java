package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class jg9 {
    public static final jg9 a;
    public static final jg9 b;
    public static final /* synthetic */ jg9[] c;

    static {
        jg9 jg9Var = new jg9("Min", 0);
        a = jg9Var;
        jg9 jg9Var2 = new jg9("Max", 1);
        b = jg9Var2;
        c = new jg9[]{jg9Var, jg9Var2};
    }

    public jg9() {
        throw null;
    }

    public static jg9 valueOf(String str) {
        return (jg9) Enum.valueOf(jg9.class, str);
    }

    public static jg9[] values() {
        return (jg9[]) c.clone();
    }
}
