package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class vy3 {
    public static final vy3 a;
    public static final /* synthetic */ vy3[] b;

    /* JADX INFO: Fake field, exist only in values array */
    vy3 EF0;

    static {
        vy3 vy3Var = new vy3("WARNING", 0);
        vy3 vy3Var2 = new vy3("ERROR", 1);
        a = vy3Var2;
        b = new vy3[]{vy3Var, vy3Var2, new vy3("HIDDEN", 2)};
    }

    public vy3() {
        throw null;
    }

    public static vy3 valueOf(String str) {
        return (vy3) Enum.valueOf(vy3.class, str);
    }

    public static vy3[] values() {
        return (vy3[]) b.clone();
    }
}
