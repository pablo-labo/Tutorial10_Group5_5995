package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ud0 {
    public static final ud0 a;
    public static final ud0 b;
    public static final /* synthetic */ ud0[] c;

    static {
        ud0 ud0Var = new ud0("BoundReached", 0);
        a = ud0Var;
        ud0 ud0Var2 = new ud0("Finished", 1);
        b = ud0Var2;
        c = new ud0[]{ud0Var, ud0Var2};
    }

    public ud0() {
        throw null;
    }

    public static ud0 valueOf(String str) {
        return (ud0) Enum.valueOf(ud0.class, str);
    }

    public static ud0[] values() {
        return (ud0[]) c.clone();
    }
}
