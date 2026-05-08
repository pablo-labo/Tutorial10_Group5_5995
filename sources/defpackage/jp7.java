package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class jp7 {
    public static final jp7 a;
    public static final jp7 b;
    public static final /* synthetic */ jp7[] c;

    static {
        jp7 jp7Var = new jp7("DEBUG", 0);
        a = jp7Var;
        jp7 jp7Var2 = new jp7("RELEASE", 1);
        b = jp7Var2;
        c = new jp7[]{jp7Var, jp7Var2};
    }

    public jp7() {
        throw null;
    }

    public static jp7 valueOf(String str) {
        return (jp7) Enum.valueOf(jp7.class, str);
    }

    public static jp7[] values() {
        return (jp7[]) c.clone();
    }
}
