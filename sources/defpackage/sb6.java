package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class sb6 {
    public static final sb6 a;
    public static final sb6 b;
    public static final /* synthetic */ sb6[] c;

    static {
        sb6 sb6Var = new sb6("LINEAR", 0);
        a = sb6Var;
        sb6 sb6Var2 = new sb6("RADIAL", 1);
        b = sb6Var2;
        c = new sb6[]{sb6Var, sb6Var2};
    }

    public sb6() {
        throw null;
    }

    public static sb6 valueOf(String str) {
        return (sb6) Enum.valueOf(sb6.class, str);
    }

    public static sb6[] values() {
        return (sb6[]) c.clone();
    }
}
