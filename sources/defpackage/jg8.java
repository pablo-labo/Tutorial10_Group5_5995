package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class jg8 {
    public static final jg8 a;
    public static final jg8 b;
    public static final jg8 c;
    public static final jg8 d;
    public static final /* synthetic */ jg8[] e;

    static {
        jg8 jg8Var = new jg8("PUBLIC", 0);
        a = jg8Var;
        jg8 jg8Var2 = new jg8("PROTECTED", 1);
        b = jg8Var2;
        jg8 jg8Var3 = new jg8("INTERNAL", 2);
        c = jg8Var3;
        jg8 jg8Var4 = new jg8("PRIVATE", 3);
        d = jg8Var4;
        e = new jg8[]{jg8Var, jg8Var2, jg8Var3, jg8Var4};
    }

    public jg8() {
        throw null;
    }

    public static jg8 valueOf(String str) {
        return (jg8) Enum.valueOf(jg8.class, str);
    }

    public static jg8[] values() {
        return (jg8[]) e.clone();
    }
}
