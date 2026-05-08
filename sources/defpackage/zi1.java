package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class zi1 {
    public static final zi1 a;
    public static final /* synthetic */ zi1[] b;
    public static final /* synthetic */ wv4 c;

    static {
        zi1 zi1Var = new zi1("BORDER_RADIUS", 0);
        a = zi1Var;
        zi1[] zi1VarArr = {zi1Var, new zi1("BORDER_TOP_LEFT_RADIUS", 1), new zi1("BORDER_TOP_RIGHT_RADIUS", 2), new zi1("BORDER_BOTTOM_RIGHT_RADIUS", 3), new zi1("BORDER_BOTTOM_LEFT_RADIUS", 4), new zi1("BORDER_TOP_START_RADIUS", 5), new zi1("BORDER_TOP_END_RADIUS", 6), new zi1("BORDER_BOTTOM_START_RADIUS", 7), new zi1("BORDER_BOTTOM_END_RADIUS", 8), new zi1("BORDER_END_END_RADIUS", 9), new zi1("BORDER_END_START_RADIUS", 10), new zi1("BORDER_START_END_RADIUS", 11), new zi1("BORDER_START_START_RADIUS", 12)};
        b = zi1VarArr;
        c = new wv4(zi1VarArr);
    }

    public zi1() {
        throw null;
    }

    public static zi1 valueOf(String str) {
        return (zi1) Enum.valueOf(zi1.class, str);
    }

    public static zi1[] values() {
        return (zi1[]) b.clone();
    }
}
