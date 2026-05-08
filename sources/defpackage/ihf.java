package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ihf {
    public static final ihf a;
    public static final ihf b;
    public static final /* synthetic */ ihf[] c;

    static {
        ihf ihfVar = new ihf("Filled", 0);
        a = ihfVar;
        ihf ihfVar2 = new ihf("Outlined", 1);
        b = ihfVar2;
        c = new ihf[]{ihfVar, ihfVar2};
    }

    public ihf() {
        throw null;
    }

    public static ihf valueOf(String str) {
        return (ihf) Enum.valueOf(ihf.class, str);
    }

    public static ihf[] values() {
        return (ihf[]) c.clone();
    }
}
