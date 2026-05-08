package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class wm8 {
    public static final wm8 a;
    public static final /* synthetic */ wm8[] b;

    static {
        wm8 wm8Var = new wm8("Horizontal", 0);
        a = wm8Var;
        b = new wm8[]{wm8Var, new wm8("Vertical", 1)};
    }

    public wm8() {
        throw null;
    }

    public static wm8 valueOf(String str) {
        return (wm8) Enum.valueOf(wm8.class, str);
    }

    public static wm8[] values() {
        return (wm8[]) b.clone();
    }
}
