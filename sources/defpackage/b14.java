package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class b14 {
    public static final b14 a;
    public static final b14 b;
    public static final /* synthetic */ b14[] c;

    static {
        b14 b14Var = new b14("STABLE", 0);
        a = b14Var;
        b14 b14Var2 = new b14("UNSTABLE", 1);
        b = b14Var2;
        c = new b14[]{b14Var, b14Var2};
    }

    public b14() {
        throw null;
    }

    public static b14 valueOf(String str) {
        return (b14) Enum.valueOf(b14.class, str);
    }

    public static b14[] values() {
        return (b14[]) c.clone();
    }
}
