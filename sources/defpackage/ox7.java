package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ox7 {
    public static final ox7 a;
    public static final ox7 b;
    public static final ox7 c;
    public static final /* synthetic */ ox7[] d;

    static {
        ox7 ox7Var = new ox7("APPLIED", 0);
        a = ox7Var;
        ox7 ox7Var2 = new ox7("ARCHIVED", 1);
        b = ox7Var2;
        ox7 ox7Var3 = new ox7("SAVED", 2);
        c = ox7Var3;
        d = new ox7[]{ox7Var, ox7Var2, ox7Var3};
    }

    public ox7() {
        throw null;
    }

    public static ox7 valueOf(String str) {
        return (ox7) Enum.valueOf(ox7.class, str);
    }

    public static ox7[] values() {
        return (ox7[]) d.clone();
    }
}
