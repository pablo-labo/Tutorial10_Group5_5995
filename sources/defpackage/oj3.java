package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class oj3 {
    public static final oj3 a;
    public static final oj3 b;
    public static final oj3 c;
    public static final /* synthetic */ oj3[] d;

    static {
        oj3 oj3Var = new oj3("PREFER_ARGB_8888", 0);
        a = oj3Var;
        oj3 oj3Var2 = new oj3("PREFER_RGB_565", 1);
        b = oj3Var2;
        d = new oj3[]{oj3Var, oj3Var2};
        c = oj3Var;
    }

    public oj3() {
        throw null;
    }

    public static oj3 valueOf(String str) {
        return (oj3) Enum.valueOf(oj3.class, str);
    }

    public static oj3[] values() {
        return (oj3[]) d.clone();
    }
}
