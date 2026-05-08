package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class zk4 {
    public static final zk4 a;
    public static final zk4 b;
    public static final /* synthetic */ zk4[] c;

    /* JADX INFO: Fake field, exist only in values array */
    zk4 EF0;

    static {
        zk4 zk4Var = new zk4("HOME", 0);
        zk4 zk4Var2 = new zk4("LICENSE_TYPE_SELECTOR", 1);
        a = zk4Var2;
        zk4 zk4Var3 = new zk4("STATE_SELECTOR", 2);
        b = zk4Var3;
        c = new zk4[]{zk4Var, zk4Var2, zk4Var3};
    }

    public zk4() {
        throw null;
    }

    public static zk4 valueOf(String str) {
        return (zk4) Enum.valueOf(zk4.class, str);
    }

    public static zk4[] values() {
        return (zk4[]) c.clone();
    }
}
