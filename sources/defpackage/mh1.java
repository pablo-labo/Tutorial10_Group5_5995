package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class mh1 {
    public static final mh1 V;
    public static final /* synthetic */ mh1[] W;
    public static final mh1 a;
    public static final mh1 b;
    public static final mh1 c;
    public static final mh1 d;
    public static final mh1 e;
    public static final mh1 f;

    /* JADX INFO: Fake field, exist only in values array */
    mh1 EF1;

    static {
        mh1 mh1Var = new mh1("CLEAR", 0);
        mh1 mh1Var2 = new mh1("SRC", 1);
        mh1 mh1Var3 = new mh1("DST", 2);
        mh1 mh1Var4 = new mh1("SRC_OVER", 3);
        mh1 mh1Var5 = new mh1("DST_OVER", 4);
        mh1 mh1Var6 = new mh1("SRC_IN", 5);
        mh1 mh1Var7 = new mh1("DST_IN", 6);
        mh1 mh1Var8 = new mh1("SRC_OUT", 7);
        mh1 mh1Var9 = new mh1("DST_OUT", 8);
        mh1 mh1Var10 = new mh1("SRC_ATOP", 9);
        a = mh1Var10;
        mh1 mh1Var11 = new mh1("DST_ATOP", 10);
        mh1 mh1Var12 = new mh1("XOR", 11);
        mh1 mh1Var13 = new mh1("PLUS", 12);
        b = mh1Var13;
        mh1 mh1Var14 = new mh1("MODULATE", 13);
        c = mh1Var14;
        mh1 mh1Var15 = new mh1("SCREEN", 14);
        d = mh1Var15;
        mh1 mh1Var16 = new mh1("OVERLAY", 15);
        e = mh1Var16;
        mh1 mh1Var17 = new mh1("DARKEN", 16);
        f = mh1Var17;
        mh1 mh1Var18 = new mh1("LIGHTEN", 17);
        V = mh1Var18;
        W = new mh1[]{mh1Var, mh1Var2, mh1Var3, mh1Var4, mh1Var5, mh1Var6, mh1Var7, mh1Var8, mh1Var9, mh1Var10, mh1Var11, mh1Var12, mh1Var13, mh1Var14, mh1Var15, mh1Var16, mh1Var17, mh1Var18, new mh1("COLOR_DODGE", 18), new mh1("COLOR_BURN", 19), new mh1("HARD_LIGHT", 20), new mh1("SOFT_LIGHT", 21), new mh1("DIFFERENCE", 22), new mh1("EXCLUSION", 23), new mh1("MULTIPLY", 24), new mh1("HUE", 25), new mh1("SATURATION", 26), new mh1("COLOR", 27), new mh1("LUMINOSITY", 28)};
    }

    public mh1() {
        throw null;
    }

    public static mh1 valueOf(String str) {
        return (mh1) Enum.valueOf(mh1.class, str);
    }

    public static mh1[] values() {
        return (mh1[]) W.clone();
    }
}
