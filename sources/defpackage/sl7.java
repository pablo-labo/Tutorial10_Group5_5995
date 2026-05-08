package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class sl7 {
    public static final sl7 a;
    public static final sl7 b;
    public static final /* synthetic */ sl7[] c;

    static {
        sl7 sl7Var = new sl7("Min", 0);
        a = sl7Var;
        sl7 sl7Var2 = new sl7("Max", 1);
        b = sl7Var2;
        c = new sl7[]{sl7Var, sl7Var2};
    }

    public sl7() {
        throw null;
    }

    public static sl7 valueOf(String str) {
        return (sl7) Enum.valueOf(sl7.class, str);
    }

    public static sl7[] values() {
        return (sl7[]) c.clone();
    }
}
