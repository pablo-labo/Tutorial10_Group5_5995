package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class l79 {
    public static final l79 a;
    public static final /* synthetic */ l79[] b;
    public final int minRequiredSdkVersion = 19;

    static {
        l79 l79Var = new l79();
        a = l79Var;
        b = new l79[]{l79Var};
    }

    public static l79 valueOf(String str) {
        return (l79) Enum.valueOf(l79.class, str);
    }

    public static l79[] values() {
        return (l79[]) b.clone();
    }
}
