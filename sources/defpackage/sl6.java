package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class sl6 {
    public static final sl6 a;
    public static final sl6 b;
    public static final /* synthetic */ sl6[] c;

    static {
        sl6 sl6Var = new sl6("Get", 0);
        a = sl6Var;
        sl6 sl6Var2 = new sl6("Post", 1);
        b = sl6Var2;
        c = new sl6[]{sl6Var, sl6Var2};
    }

    public sl6() {
        throw null;
    }

    public static sl6 valueOf(String str) {
        return (sl6) Enum.valueOf(sl6.class, str);
    }

    public static sl6[] values() {
        return (sl6[]) c.clone();
    }
}
