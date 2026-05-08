package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class zs7 {
    public static final zs7 a;
    public static final zs7 b;
    public static final zs7 c;
    public static final zs7 d;
    public static final /* synthetic */ zs7[] e;

    static {
        zs7 zs7Var = new zs7("CanceledAuthState", 0);
        a = zs7Var;
        zs7 zs7Var2 = new zs7("CanceledRules", 1);
        b = zs7Var2;
        zs7 zs7Var3 = new zs7("Snooze", 2);
        c = zs7Var3;
        zs7 zs7Var4 = new zs7("AllowNotifications", 3);
        d = zs7Var4;
        e = new zs7[]{zs7Var, zs7Var2, zs7Var3, zs7Var4};
    }

    public zs7() {
        throw null;
    }

    public static zs7 valueOf(String str) {
        return (zs7) Enum.valueOf(zs7.class, str);
    }

    public static zs7[] values() {
        return (zs7[]) e.clone();
    }
}
