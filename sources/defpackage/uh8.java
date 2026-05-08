package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class uh8 {
    public static final uh8 a;
    public static final uh8 b;
    public static final /* synthetic */ uh8[] c;

    static {
        uh8 uh8Var = new uh8("Singleton", 0);
        a = uh8Var;
        uh8 uh8Var2 = new uh8("Factory", 1);
        b = uh8Var2;
        c = new uh8[]{uh8Var, uh8Var2, new uh8("Scoped", 2)};
    }

    public uh8() {
        throw null;
    }

    public static uh8 valueOf(String str) {
        return (uh8) Enum.valueOf(uh8.class, str);
    }

    public static uh8[] values() {
        return (uh8[]) c.clone();
    }
}
