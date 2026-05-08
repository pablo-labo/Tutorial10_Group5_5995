package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class yi5 {
    public static final yi5 a;
    public static final /* synthetic */ yi5[] b;

    /* JADX INFO: Fake field, exist only in values array */
    yi5 EF0;

    static {
        yi5 yi5Var = new yi5("Center", 0);
        yi5 yi5Var2 = new yi5("Start", 1);
        a = yi5Var2;
        b = new yi5[]{yi5Var, yi5Var2, new yi5("End", 2)};
    }

    public yi5() {
        throw null;
    }

    public static yi5 valueOf(String str) {
        return (yi5) Enum.valueOf(yi5.class, str);
    }

    public static yi5[] values() {
        return (yi5[]) b.clone();
    }
}
