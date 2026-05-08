package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class kg9 {
    public static final kg9 a;
    public static final kg9 b;
    public static final /* synthetic */ kg9[] c;

    static {
        kg9 kg9Var = new kg9("Width", 0);
        a = kg9Var;
        kg9 kg9Var2 = new kg9("Height", 1);
        b = kg9Var2;
        c = new kg9[]{kg9Var, kg9Var2};
    }

    public kg9() {
        throw null;
    }

    public static kg9 valueOf(String str) {
        return (kg9) Enum.valueOf(kg9.class, str);
    }

    public static kg9[] values() {
        return (kg9[]) c.clone();
    }
}
