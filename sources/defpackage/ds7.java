package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ds7 {
    public static final ds7 V;
    public static final ds7 W;
    public static final ds7 X;
    public static final ds7 Y;
    public static final ds7 Z;
    public static final ds7 a;
    public static final ds7 a0;
    public static final ds7 b;
    public static final /* synthetic */ ds7[] b0;
    public static final ds7 c;
    public static final ds7 d;
    public static final ds7 e;
    public static final ds7 f;

    static {
        ds7 ds7Var = new ds7("JANUARY", 0);
        a = ds7Var;
        ds7 ds7Var2 = new ds7("FEBRUARY", 1);
        b = ds7Var2;
        ds7 ds7Var3 = new ds7("MARCH", 2);
        c = ds7Var3;
        ds7 ds7Var4 = new ds7("APRIL", 3);
        d = ds7Var4;
        ds7 ds7Var5 = new ds7("MAY", 4);
        e = ds7Var5;
        ds7 ds7Var6 = new ds7("JUNE", 5);
        f = ds7Var6;
        ds7 ds7Var7 = new ds7("JULY", 6);
        V = ds7Var7;
        ds7 ds7Var8 = new ds7("AUGUST", 7);
        W = ds7Var8;
        ds7 ds7Var9 = new ds7("SEPTEMBER", 8);
        X = ds7Var9;
        ds7 ds7Var10 = new ds7("OCTOBER", 9);
        Y = ds7Var10;
        ds7 ds7Var11 = new ds7("NOVEMBER", 10);
        Z = ds7Var11;
        ds7 ds7Var12 = new ds7("DECEMBER", 11);
        a0 = ds7Var12;
        b0 = new ds7[]{ds7Var, ds7Var2, ds7Var3, ds7Var4, ds7Var5, ds7Var6, ds7Var7, ds7Var8, ds7Var9, ds7Var10, ds7Var11, ds7Var12};
    }

    public ds7() {
        throw null;
    }

    public static ds7 valueOf(String str) {
        return (ds7) Enum.valueOf(ds7.class, str);
    }

    public static ds7[] values() {
        return (ds7[]) b0.clone();
    }
}
