package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class iq7 {
    public static final iq7 a;
    public static final iq7 b;
    public static final /* synthetic */ iq7[] c;

    static {
        iq7 iq7Var = new iq7("CANCEL", 0);
        a = iq7Var;
        iq7 iq7Var2 = new iq7("SUCCESS", 1);
        b = iq7Var2;
        c = new iq7[]{iq7Var, iq7Var2};
    }

    public iq7() {
        throw null;
    }

    public static iq7 valueOf(String str) {
        return (iq7) Enum.valueOf(iq7.class, str);
    }

    public static iq7[] values() {
        return (iq7[]) c.clone();
    }
}
