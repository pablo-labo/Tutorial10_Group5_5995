package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class nj8 {
    public static final nj8 a;
    public static final nj8 b;
    public static final /* synthetic */ nj8[] c;

    static {
        nj8 nj8Var = new nj8("ENGLISH", 0);
        a = nj8Var;
        nj8 nj8Var2 = new nj8("HINDI", 1);
        b = nj8Var2;
        c = new nj8[]{nj8Var, nj8Var2, new nj8("NONE", 2)};
    }

    public nj8() {
        throw null;
    }

    public static nj8 valueOf(String str) {
        return (nj8) Enum.valueOf(nj8.class, str);
    }

    public static nj8[] values() {
        return (nj8[]) c.clone();
    }
}
