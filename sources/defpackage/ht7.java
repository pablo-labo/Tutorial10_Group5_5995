package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ht7 {
    public static final ht7 a;
    public static final ht7 b;
    public static final /* synthetic */ ht7[] c;

    static {
        ht7 ht7Var = new ht7("ALERT_DIALOG", 0);
        a = ht7Var;
        ht7 ht7Var2 = new ht7("BOTTOM_SHEET", 1);
        b = ht7Var2;
        c = new ht7[]{ht7Var, ht7Var2};
    }

    public ht7() {
        throw null;
    }

    public static ht7 valueOf(String str) {
        return (ht7) Enum.valueOf(ht7.class, str);
    }

    public static ht7[] values() {
        return (ht7[]) c.clone();
    }
}
