package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class tu8 {
    public static final tu8 a;
    public static final tu8 b;
    public static final tu8 c;
    public static final tu8 d;
    public static final tu8 e;
    public static final /* synthetic */ tu8[] f;

    static {
        tu8 tu8Var = new tu8("DEBUG", 0);
        a = tu8Var;
        tu8 tu8Var2 = new tu8("INFO", 1);
        b = tu8Var2;
        tu8 tu8Var3 = new tu8("WARNING", 2);
        c = tu8Var3;
        tu8 tu8Var4 = new tu8("ERROR", 3);
        d = tu8Var4;
        tu8 tu8Var5 = new tu8("NONE", 4);
        e = tu8Var5;
        f = new tu8[]{tu8Var, tu8Var2, tu8Var3, tu8Var4, tu8Var5};
    }

    public tu8() {
        throw null;
    }

    public static tu8 valueOf(String str) {
        return (tu8) Enum.valueOf(tu8.class, str);
    }

    public static tu8[] values() {
        return (tu8[]) f.clone();
    }
}
