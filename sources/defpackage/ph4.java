package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ph4 {
    public static final ph4 a;
    public static final ph4 b;
    public static final /* synthetic */ ph4[] c;

    static {
        ph4 ph4Var = new ph4("HOME", 0);
        a = ph4Var;
        ph4 ph4Var2 = new ph4("TITLE", 1);
        b = ph4Var2;
        c = new ph4[]{ph4Var, ph4Var2};
    }

    public ph4() {
        throw null;
    }

    public static ph4 valueOf(String str) {
        return (ph4) Enum.valueOf(ph4.class, str);
    }

    public static ph4[] values() {
        return (ph4[]) c.clone();
    }
}
