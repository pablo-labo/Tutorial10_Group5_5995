package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ft7 {
    public static final ft7 a;
    public static final ft7 b;
    public static final ft7 c;
    public static final /* synthetic */ ft7[] d;

    static {
        ft7 ft7Var = new ft7("NotDetermined", 0);
        a = ft7Var;
        ft7 ft7Var2 = new ft7("Denied", 1);
        b = ft7Var2;
        ft7 ft7Var3 = new ft7("Authorized", 2);
        c = ft7Var3;
        d = new ft7[]{ft7Var, ft7Var2, ft7Var3};
    }

    public ft7() {
        throw null;
    }

    public static ft7 valueOf(String str) {
        return (ft7) Enum.valueOf(ft7.class, str);
    }

    public static ft7[] values() {
        return (ft7[]) d.clone();
    }
}
