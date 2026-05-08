package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class i13 {
    public static final i13 a;
    public static final i13 b;
    public static final i13 c;
    public static final i13 d;
    public static final /* synthetic */ i13[] e;

    static {
        i13 i13Var = new i13("DEFAULT", 0);
        a = i13Var;
        i13 i13Var2 = new i13("LAZY", 1);
        b = i13Var2;
        i13 i13Var3 = new i13("ATOMIC", 2);
        c = i13Var3;
        i13 i13Var4 = new i13("UNDISPATCHED", 3);
        d = i13Var4;
        e = new i13[]{i13Var, i13Var2, i13Var3, i13Var4};
    }

    public i13() {
        throw null;
    }

    public static i13 valueOf(String str) {
        return (i13) Enum.valueOf(i13.class, str);
    }

    public static i13[] values() {
        return (i13[]) e.clone();
    }
}
