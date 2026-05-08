package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class wu6 {
    public static final wu6 a;
    public static final /* synthetic */ wu6[] b;

    static {
        wu6 wu6Var = new wu6("SINGLE", 0);
        a = wu6Var;
        b = new wu6[]{wu6Var, new wu6("MULTIPLE", 1)};
    }

    public wu6() {
        throw null;
    }

    public static wu6 valueOf(String str) {
        return (wu6) Enum.valueOf(wu6.class, str);
    }

    public static wu6[] values() {
        return (wu6[]) b.clone();
    }
}
