package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class si8 {
    public static final si8 a;
    public static final si8 b;
    public static final si8 c;
    public static final /* synthetic */ si8[] d;

    static {
        si8 si8Var = new si8("RUNTIME", 0);
        a = si8Var;
        si8 si8Var2 = new si8("BINARY", 1);
        b = si8Var2;
        si8 si8Var3 = new si8("SOURCE", 2);
        c = si8Var3;
        d = new si8[]{si8Var, si8Var2, si8Var3};
    }

    public si8() {
        throw null;
    }

    public static si8 valueOf(String str) {
        return (si8) Enum.valueOf(si8.class, str);
    }

    public static si8[] values() {
        return (si8[]) d.clone();
    }
}
