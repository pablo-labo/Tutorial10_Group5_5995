package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class zz8 {
    public static final zz8 a;
    public static final zz8 b;
    public static final zz8 c;
    public static final /* synthetic */ zz8[] d;

    static {
        zz8 zz8Var = new zz8("REFRESH", 0);
        a = zz8Var;
        zz8 zz8Var2 = new zz8("PREPEND", 1);
        b = zz8Var2;
        zz8 zz8Var3 = new zz8("APPEND", 2);
        c = zz8Var3;
        d = new zz8[]{zz8Var, zz8Var2, zz8Var3};
    }

    public zz8() {
        throw null;
    }

    public static zz8 valueOf(String str) {
        return (zz8) Enum.valueOf(zz8.class, str);
    }

    public static zz8[] values() {
        return (zz8[]) d.clone();
    }
}
