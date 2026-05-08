package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class b81 {
    public static final b81 a;
    public static final b81 b;
    public static final /* synthetic */ b81[] c;

    static {
        b81 b81Var = new b81("EXPONENTIAL", 0);
        a = b81Var;
        b81 b81Var2 = new b81("LINEAR", 1);
        b = b81Var2;
        c = new b81[]{b81Var, b81Var2};
    }

    public b81() {
        throw null;
    }

    public static b81 valueOf(String str) {
        return (b81) Enum.valueOf(b81.class, str);
    }

    public static b81[] values() {
        return (b81[]) c.clone();
    }
}
