package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class au6 {
    public static final au6 a;
    public static final /* synthetic */ au6[] b;

    /* JADX INFO: Fake field, exist only in values array */
    au6 EF0;

    static {
        au6 au6Var = new au6("Sm", 0);
        au6 au6Var2 = new au6("Md", 1);
        a = au6Var2;
        b = new au6[]{au6Var, au6Var2};
    }

    public au6() {
        throw null;
    }

    public static au6 valueOf(String str) {
        return (au6) Enum.valueOf(au6.class, str);
    }

    public static au6[] values() {
        return (au6[]) b.clone();
    }
}
