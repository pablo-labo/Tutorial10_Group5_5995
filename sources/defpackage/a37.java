package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class a37 {
    public static final a37 a;
    public static final a37 b;
    public static final a37 c;
    public static final a37 d;
    public static final /* synthetic */ a37[] e;

    static {
        a37 a37Var = new a37("AUTO", 0);
        a = a37Var;
        a37 a37Var2 = new a37("RESIZE", 1);
        b = a37Var2;
        a37 a37Var3 = new a37("SCALE", 2);
        c = a37Var3;
        a37 a37Var4 = new a37("NONE", 3);
        d = a37Var4;
        e = new a37[]{a37Var, a37Var2, a37Var3, a37Var4};
    }

    public a37() {
        throw null;
    }

    public static a37 valueOf(String str) {
        return (a37) Enum.valueOf(a37.class, str);
    }

    public static a37[] values() {
        return (a37[]) e.clone();
    }
}
