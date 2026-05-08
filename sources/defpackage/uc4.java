package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class uc4 {
    public static final uc4 a;
    public static final /* synthetic */ uc4[] b;

    static {
        uc4 uc4Var = new uc4("Closed", 0);
        a = uc4Var;
        b = new uc4[]{uc4Var, new uc4("Open", 1)};
    }

    public uc4() {
        throw null;
    }

    public static uc4 valueOf(String str) {
        return (uc4) Enum.valueOf(uc4.class, str);
    }

    public static uc4[] values() {
        return (uc4[]) b.clone();
    }
}
