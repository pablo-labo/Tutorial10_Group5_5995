package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ip4 {
    public static final ip4 a;
    public static final ip4 b;
    public static final ip4 c;
    public static final ip4 d;
    public static final /* synthetic */ ip4[] e;

    static {
        ip4 ip4Var = new ip4("kCGPathElementAddCurveToPoint", 0);
        a = ip4Var;
        ip4 ip4Var2 = new ip4("kCGPathElementAddQuadCurveToPoint", 1);
        ip4 ip4Var3 = new ip4("kCGPathElementMoveToPoint", 2);
        b = ip4Var3;
        ip4 ip4Var4 = new ip4("kCGPathElementAddLineToPoint", 3);
        c = ip4Var4;
        ip4 ip4Var5 = new ip4("kCGPathElementCloseSubpath", 4);
        d = ip4Var5;
        e = new ip4[]{ip4Var, ip4Var2, ip4Var3, ip4Var4, ip4Var5};
    }

    public ip4() {
        throw null;
    }

    public static ip4 valueOf(String str) {
        return (ip4) Enum.valueOf(ip4.class, str);
    }

    public static ip4[] values() {
        return (ip4[]) e.clone();
    }
}
