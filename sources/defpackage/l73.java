package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class l73 {
    public static final l73 a;
    public static final l73 b;
    public static final l73 c;
    public static final /* synthetic */ l73[] d;

    static {
        l73 l73Var = new l73("CROSSED", 0);
        a = l73Var;
        l73 l73Var2 = new l73("NOT_CROSSED", 1);
        b = l73Var2;
        l73 l73Var3 = new l73("COLLAPSED", 2);
        c = l73Var3;
        d = new l73[]{l73Var, l73Var2, l73Var3};
    }

    public l73() {
        throw null;
    }

    public static l73 valueOf(String str) {
        return (l73) Enum.valueOf(l73.class, str);
    }

    public static l73[] values() {
        return (l73[]) d.clone();
    }
}
