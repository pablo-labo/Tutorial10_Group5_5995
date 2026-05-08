package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ms7 {
    public static final ms7 a;
    public static final ms7 b;
    public static final ms7 c;
    public static final /* synthetic */ ms7[] d;

    static {
        ms7 ms7Var = new ms7("CANCEL", 0);
        a = ms7Var;
        ms7 ms7Var2 = new ms7("COMPLETED", 1);
        b = ms7Var2;
        ms7 ms7Var3 = new ms7("ERROR", 2);
        c = ms7Var3;
        d = new ms7[]{ms7Var, ms7Var2, ms7Var3};
    }

    public ms7() {
        throw null;
    }

    public static ms7 valueOf(String str) {
        return (ms7) Enum.valueOf(ms7.class, str);
    }

    public static ms7[] values() {
        return (ms7[]) d.clone();
    }
}
