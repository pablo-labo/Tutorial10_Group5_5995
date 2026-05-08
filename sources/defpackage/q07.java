package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class q07 {
    public static final q07 a;
    public static final q07 b;
    public static final q07 c;
    public static final q07 d;
    public static final /* synthetic */ q07[] e;

    static {
        q07 q07Var = new q07("DEFAULT", 0);
        a = q07Var;
        q07 q07Var2 = new q07("RELOAD", 1);
        b = q07Var2;
        q07 q07Var3 = new q07("FORCE_CACHE", 2);
        c = q07Var3;
        q07 q07Var4 = new q07("ONLY_IF_CACHED", 3);
        d = q07Var4;
        e = new q07[]{q07Var, q07Var2, q07Var3, q07Var4};
    }

    public q07() {
        throw null;
    }

    public static q07 valueOf(String str) {
        return (q07) Enum.valueOf(q07.class, str);
    }

    public static q07[] values() {
        return (q07[]) e.clone();
    }
}
