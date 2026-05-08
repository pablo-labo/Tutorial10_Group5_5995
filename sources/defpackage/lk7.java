package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class lk7 {
    public static final lk7 a;
    public static final lk7 b;
    public static final lk7 c;
    public static final /* synthetic */ lk7[] d;

    static {
        lk7 lk7Var = new lk7("UPCOMING", 0);
        a = lk7Var;
        lk7 lk7Var2 = new lk7("COMPLETED", 1);
        b = lk7Var2;
        lk7 lk7Var3 = new lk7("CANCELLED", 2);
        c = lk7Var3;
        d = new lk7[]{lk7Var, lk7Var2, lk7Var3};
    }

    public lk7() {
        throw null;
    }

    public static lk7 valueOf(String str) {
        return (lk7) Enum.valueOf(lk7.class, str);
    }

    public static lk7[] values() {
        return (lk7[]) d.clone();
    }
}
