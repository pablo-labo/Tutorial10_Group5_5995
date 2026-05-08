package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class e29 {
    public static final e29 a;
    public static final e29 b;
    public static final /* synthetic */ e29[] c;

    static {
        e29 e29Var = new e29("FusedCurrent", 0);
        a = e29Var;
        e29 e29Var2 = new e29("FusedLast", 1);
        b = e29Var2;
        c = new e29[]{e29Var, e29Var2, new e29("Faked", 2)};
    }

    public e29() {
        throw null;
    }

    public static e29 valueOf(String str) {
        return (e29) Enum.valueOf(e29.class, str);
    }

    public static e29[] values() {
        return (e29[]) c.clone();
    }
}
