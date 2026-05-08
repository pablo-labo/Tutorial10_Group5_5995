package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class z52 {
    public static final z52 a;
    public static final z52 b;
    public static final /* synthetic */ z52[] c;

    static {
        z52 z52Var = new z52("NONE", 0);
        a = z52Var;
        z52 z52Var2 = new z52("ALL_JSON_OBJECTS", 1);
        z52 z52Var3 = new z52("POLYMORPHIC", 2);
        b = z52Var3;
        c = new z52[]{z52Var, z52Var2, z52Var3};
    }

    public z52() {
        throw null;
    }

    public static z52 valueOf(String str) {
        return (z52) Enum.valueOf(z52.class, str);
    }

    public static z52[] values() {
        return (z52[]) c.clone();
    }
}
