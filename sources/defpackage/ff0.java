package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ff0 {
    public static final ff0 V;
    public static final /* synthetic */ ff0[] W;
    public static final ff0 a;
    public static final ff0 b;
    public static final ff0 c;
    public static final ff0 d;
    public static final ff0 e;
    public static final ff0 f;

    static {
        ff0 ff0Var = new ff0("Paragraph", 0);
        a = ff0Var;
        ff0 ff0Var2 = new ff0("Span", 1);
        b = ff0Var2;
        ff0 ff0Var3 = new ff0("VerbatimTts", 2);
        c = ff0Var3;
        ff0 ff0Var4 = new ff0("Url", 3);
        d = ff0Var4;
        ff0 ff0Var5 = new ff0("Link", 4);
        e = ff0Var5;
        ff0 ff0Var6 = new ff0("Clickable", 5);
        f = ff0Var6;
        ff0 ff0Var7 = new ff0("String", 6);
        V = ff0Var7;
        W = new ff0[]{ff0Var, ff0Var2, ff0Var3, ff0Var4, ff0Var5, ff0Var6, ff0Var7};
    }

    public ff0() {
        throw null;
    }

    public static ff0 valueOf(String str) {
        return (ff0) Enum.valueOf(ff0.class, str);
    }

    public static ff0[] values() {
        return (ff0[]) W.clone();
    }
}
