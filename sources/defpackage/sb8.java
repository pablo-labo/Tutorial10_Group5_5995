package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class sb8 {
    public static final sb8 V;
    public static final sb8 W;
    public static final sb8 X;
    public static final sb8 Y;
    public static final /* synthetic */ sb8[] Z;
    public static final sb8 a;
    public static final sb8 b;
    public static final sb8 c;
    public static final sb8 d;
    public static final sb8 e;
    public static final sb8 f;

    static {
        sb8 sb8Var = new sb8("BEGIN_ARRAY", 0);
        a = sb8Var;
        sb8 sb8Var2 = new sb8("END_ARRAY", 1);
        b = sb8Var2;
        sb8 sb8Var3 = new sb8("BEGIN_OBJECT", 2);
        c = sb8Var3;
        sb8 sb8Var4 = new sb8("END_OBJECT", 3);
        d = sb8Var4;
        sb8 sb8Var5 = new sb8("NAME", 4);
        e = sb8Var5;
        sb8 sb8Var6 = new sb8("STRING", 5);
        f = sb8Var6;
        sb8 sb8Var7 = new sb8("NUMBER", 6);
        V = sb8Var7;
        sb8 sb8Var8 = new sb8("BOOLEAN", 7);
        W = sb8Var8;
        sb8 sb8Var9 = new sb8("NULL", 8);
        X = sb8Var9;
        sb8 sb8Var10 = new sb8("END_DOCUMENT", 9);
        Y = sb8Var10;
        Z = new sb8[]{sb8Var, sb8Var2, sb8Var3, sb8Var4, sb8Var5, sb8Var6, sb8Var7, sb8Var8, sb8Var9, sb8Var10};
    }

    public sb8() {
        throw null;
    }

    public static sb8 valueOf(String str) {
        return (sb8) Enum.valueOf(sb8.class, str);
    }

    public static sb8[] values() {
        return (sb8[]) Z.clone();
    }
}
