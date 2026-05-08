package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class hj8 {
    public static final hj8 a;
    public static final hj8 b;
    public static final /* synthetic */ hj8[] c;

    static {
        hj8 hj8Var = new hj8("NORMAL", 0);
        a = hj8Var;
        hj8 hj8Var2 = new hj8("MULTIPLY", 1);
        b = hj8Var2;
        c = new hj8[]{hj8Var, hj8Var2, new hj8("SCREEN", 2), new hj8("OVERLAY", 3), new hj8("DARKEN", 4), new hj8("LIGHTEN", 5), new hj8("COLOR_DODGE", 6), new hj8("COLOR_BURN", 7), new hj8("HARD_LIGHT", 8), new hj8("SOFT_LIGHT", 9), new hj8("DIFFERENCE", 10), new hj8("EXCLUSION", 11), new hj8("HUE", 12), new hj8("SATURATION", 13), new hj8("COLOR", 14), new hj8("LUMINOSITY", 15), new hj8("ADD", 16), new hj8("HARD_MIX", 17)};
    }

    public hj8() {
        throw null;
    }

    public static hj8 valueOf(String str) {
        return (hj8) Enum.valueOf(hj8.class, str);
    }

    public static hj8[] values() {
        return (hj8[]) c.clone();
    }
}
